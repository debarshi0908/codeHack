package net.ridepad.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;

import org.ridepad.entity.Address;
import org.ridepad.entity.Car;
import org.ridepad.entity.Group;
import org.ridepad.entity.Location;

import org.ridepad.entity.Reqtran;
import org.ridepad.entity.User;
import org.ridepad.ext.Item;
import org.ridepad.ext.Message;
import org.ridepad.ext.Messages;


@Path("/ridepad")
public class RIDEServicees {

	@Path("test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
	
		
		return "Server is running!!!";
	}
	
	@Path("getloc")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getLocation(@QueryParam("email") String email){
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		Location loc = em.find(Location.class, email);
		String lat = "null";
		String lon = "null";
		if(loc != null){
			lat = loc.getLat();
			lon = loc.getLong_();
		}
		
		return lat +"&"+ lon;
	}
	
	@Path("isUserExist")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String isUserExist(@QueryParam("email") String email){
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		User user = em.find(User.class, email);
		if(user == null){
			return "false";
		}
		return "true";
	}
	
	@Path("updateloc")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String setLocation(@QueryParam("email") String email,@QueryParam("lat") String lat, @QueryParam("lon") String lon){
		Date now = new Date();
		Timestamp tp = new Timestamp(now.getTime());
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		Location loc = em.find(Location.class, email);
		
		 /*     
        rp[1] = new RPPoint();
        rp[1].lat = 33.1213618;
        rp[1].lng = -87.5680106;
        
        rp[2] = new RPPoint();
        rp[2].lat = 33.2085132872266;
        rp[2].lng = -87.5529670715332;
        
        rp[3] = new RPPoint();
        rp[3].lat = 33.2364;
        rp[3].lng = -87.614482;
   */   
	
		
		if(loc != null){
			loc.setLat(lat);
			loc.setLong_(lon);	
			loc.setLasttime(tp);
			
		}else{
			loc = new Location();
			loc.setEmail(email);
			loc.setLat(lat);
			loc.setLong_(lon);
			loc.setLasttime(tp);
		}
		
		em.getTransaction().begin();
		em.persist(loc);
		em.getTransaction().commit();
		return "success";
		
	}
	
	@Path("login")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String login(@FormParam("email") String email, @FormParam("password") String password){
		
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		User user = em.find(User.class, email);
		//System.out.println("User--------"+user.getPassword());
		if(user != null && user.getPassword().equals(password)){
			return "true";
		}
		
		return "false";
	}
	
	@Path("calculator")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String calculate(@FormParam("miles") String miles, @FormParam("mpg") String mpg, @FormParam("price") String price){
		
		double tmiles = 0;
		double tmpg = 0;
		double tprice = 0;
		double total = 0;
		try{
			tmiles = Double.parseDouble(miles);
			tmpg = Double.parseDouble(mpg);
			tprice = Double.parseDouble(price);
			total  = (tmiles * tprice) / tmpg;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return Double.toString(total);
		
	}
	
	@Path("getinvitaion")
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public List<Item> acceptFriend(@QueryParam("myemail") String myemail){
		List reqs = new ArrayList();
		List<Item> ret2 = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		//Query query = em.createNativeQuery("SELECT userid FROM Groups g where g.friend = ?1 and status='invited'");
		
		Query query = em.createNativeQuery("SELECT concat(u.fname,'-',g.userid) as friends FROM Groups g, users u where g.userid=u.email and g.friend= ?1 and status='invited'");
		query.setParameter(1, myemail);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			item.setEntry((String)reqs.get(i));
			ret2.add(item);	
		}
		return ret2;
		
	}
	
	@Path("invite")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addFriends(@FormParam("myemail") String myemail, @FormParam("friendemail") String friendemail){
		String msgRet = "Sucessfull!";
		
		EntityManager em = null;
		Group group = new Group();
		group.setUserid(myemail);
		group.setFriend(friendemail);
		group.setStatus("invited");
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			Query q = em.createNativeQuery("SELECT email FROM users g where g.email = ?1");
			q.setParameter(1, friendemail);
			List list = q.getResultList();
			if(list == null || list.size() < 1){
				msgRet = "Fail";
			}else{
				em.getTransaction().begin();
				em.persist(group);
				em.getTransaction().commit();
			}
		
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;
	}
	
	@Path("acceptinvite")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String acceptFriends(@FormParam("myemail") String myemail, @FormParam("friendemail") String friendemail){
		String msgRet = "Sucessfull!";
		
		EntityManager em = null;
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			Query query = em.createNativeQuery("UPDATE groups set status = 'accepted' where userid= ?2 and friend= ?1 and status='invited'");
			query.setParameter(1, myemail);
			query.setParameter(2, friendemail);
			em.getTransaction().begin();
			query.executeUpdate();
			
			Group group = new Group();
			group.setUserid(myemail);
			group.setFriend(friendemail);
			group.setStatus("accepted");
			em.persist(group);
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;	
	}
	
	@Path("rejectinvite")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String rejectFriends(@FormParam("myemail") String myemail, @FormParam("friendemail") String friendemail){
		String msgRet = "Sucessfull!";
		
		EntityManager em = null;
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			Query query = em.createNativeQuery("UPDATE groups set status = 'rejected' where userid= ?2 and friend= ?1 and status='invited'");
			query.setParameter(1, myemail);
			query.setParameter(2, friendemail);
			em.getTransaction().begin();
			query.executeUpdate();
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;	
	}
	
	@Path("adduser")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addUser(@FormParam("email") String email, @FormParam("password") String password, @FormParam("name") String name, @FormParam("phone") String phone){
		EntityManager em = null;
		String ret = "Sucessfull!";
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);
		user.setFname(name);
		user.setLname("");
		user.setMobileno(phone);
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		}catch(Exception err){
			ret = "fail";
			err.printStackTrace();	
		}finally{
			em.close();
		}
		return ret;
		
	}
	
	@Path("addcar")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addCar(@FormParam("email") String email, @FormParam("cartype") String cartype, @FormParam("miles") String miles, @FormParam("model") String model, @FormParam("mpg") String mpg, @FormParam("mpg2") String mpg2, @FormParam("pricepg") String pricepg, @FormParam("year") String year){
		EntityManager em = null;
		String ret = "Sucessfull!";
		Car car = new Car();
		car.setCartype(cartype);
		car.setEmail(email);
		car.setMiles(miles);
		car.setModel(model);
		car.setMpg2(mpg2);
		car.setMpg(mpg);
		car.setPricepg(pricepg);
		car.setYear(year);
		
		//EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(car);
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		return ret;
	}
	
	@Path("getcarmake")
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Item> getCarMake(@QueryParam("year") String year){
		List reqs = new ArrayList();
		List<Item> ret2 = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		
		Query query = em.createNativeQuery("SELECT distinct carmake FROM Carmaster c where c.year= ?1");
		query.setParameter(1, year);
		
		reqs = query.getResultList();
		for(int i=0;i < reqs.size(); i++){
			Item item = new Item();
			item.setEntry((String) reqs.get(i));
			ret2.add(item);
		}
		return ret2;		
	}
	
	@Path("getcarmodel")
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Item> getCarModel(@QueryParam("carmake") String carmake){
		List reqs = new ArrayList();
		List<Item> ret2 = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		
		Query query = em.createNativeQuery("SELECT distinct carmodel FROM Carmaster c where c.carmake= ?1");
		query.setParameter(1, carmake);
		
		reqs = query.getResultList();
		for(int i=0;i < reqs.size(); i++){
			Item item = new Item();
			item.setEntry((String) reqs.get(i));
			ret2.add(item);
		}
		return ret2;		
		
	}
	
	
	@Path("getfriends")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Item> getFriends(@QueryParam("email") String email){
		
		List reqs = new ArrayList();
		List<Item> ret2 = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		
		//Query query = em.createNativeQuery("SELECT friend FROM Groups g where g.userid = ?1 and status='accepted'");
		
		Query query = em.createNativeQuery("select concat(u.fname,'-', g.friend) as friends from groups g, users u where g.friend = u.email and g.userid = ?1 and g.status = 'accepted'");
		query.setParameter(1, email);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			
			item.setEntry((String) reqs.get(i));
			
			
			ret2.add(item);
		
		}
		return ret2;
	}
	
	@Path("getfriendsmap")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Item> getFriendsMap(@QueryParam("email") String email){
		
		List reqs = new ArrayList();
		List<Item> ret2 = new ArrayList<Item>();
		
	//	String[] pair = getLatestReqeust(email);
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		//String loc = getLatestReqeust(email);
		//Query query = em.createNativeQuery("SELECT friend FROM Groups g where g.userid = ?1 and status='accepted'");
		
		//Query query = em.createNativeQuery("select concat(g.friend,'-',u.fname) as friends from groups g, users u where u.email=g.friend and g.userid = ?1 and g.status = 'accepted'");
		
		//Query query = em.createNativeQuery("select concat(g.friend,'-',u.fname) as friends from groups g, users u where u.email=g.friend and g.userid = ?1 and g.status = 'accepted' and g.friend in (select email2 from reqtrans where (email= ?1 or email2= ?1) and state='accept' and email2 is not NULL union select email from reqtrans where (email= ?1 or email2= ?1) and state='accept' and email2 is not NULL)");
		Query query = em.createNativeQuery("select concat(g.friend,'-',u.fname) as friends from groups g, users u where u.email=g.friend and g.userid = ?1 and g.status = 'accepted' and g.friend in (SELECT distinct email FROM reqtrans where state ='accept' and email2= ?1)");
		query.setParameter(1, email);
		//query.setParameter(2, loc);
		//query.setParameter(2, pair[0]);
		//query.setParameter(3, pair[1]);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			
			item.setEntry((String) reqs.get(i));
			
			
			ret2.add(item);
		
		}
		return ret2;
	}
	
	@Path("getlatestplace")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String getLatestReqeust(@FormParam("email") String email){
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		
		//Query query = em.createNativeQuery("SELECT friend FROM Groups g where g.userid = ?1 and status='accepted'");
		String ret = "";
		List reqs = new ArrayList();
		//Query query = em.createNativeQuery("select concat(date_format(timetx,'%m-%d-%Y %T:%f'),'#', participants) as pl from reqtrans where email= ?1 and (state='offer' or state ='request') order by timetx desc limit 1");
		Query query = em.createNativeQuery("select participants from reqtrans where (state='offer' or state='requtest') and email = ?1 order by timetx desc limit 1;");
		query.setParameter(1, email);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			ret = (String) reqs.get(i);
		}
		
		return ret.toString().trim();
	}
	
	@Path("getrequests")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public List<Item> getRequest(@QueryParam("myemail") String myemail){
		List<Item> ret = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		List reqs = new ArrayList();
		//Query query = em.createNativeQuery("select concat(email,'-',state,'-',participants) as ret from reqtrans where (state='request' or state='offer') and email in (select friend from groups where userid= ?1 and status='accepted' )");
		//Query query = em.createNativeQuery("select concat(fname,'-',state,'-',participants,'-',reqtrans.email) as ret from reqtrans, users where (state='request' or state='offer') and users.email = reqtrans.email and reqtrans.email <> ?1 and users.email in (select friend from groups where userid= ?1 and status='accepted')");
		Query query = em.createNativeQuery("select concat(fname,'-',state,'-',participants,'-',reqtrans.email) as ret from reqtrans, users where (state='request' or state='offer') and users.email = reqtrans.email and reqtrans.participants not in (select reqtrans.participants from reqtrans where reqtrans.email= ?1 and (state='accept' or state='reject')) and users.email in (select friend from groups where userid= ?1 and status='accepted')");
		query.setParameter(1, myemail);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			item.setEntry((String)reqs.get(i));
			ret.add(item);	
		}
		return ret;
	}
	
	@Path("accept")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String acceptOffer(@FormParam("myemail") String myemail, @FormParam("place") String place, @FormParam("email2") String email2)
	{
		String msgRet = "Sucessfull!";
		
		EntityManager em = null;
		Reqtran req = new Reqtran();
		req.setEmail(myemail);
		req.setState("accept");
		req.setParticipants(place);
		req.setEmail2(email2);
		
		Reqtran req2 = new Reqtran();
		req2.setEmail(email2);
		req2.setState("accept");
		req2.setParticipants(place);
		req2.setEmail2(myemail);
		deleteTrans(myemail,email2,place);
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			
			em.persist(req);
			em.persist(req2);
			em.getTransaction().commit();
			
		}catch(Exception err){
			err.printStackTrace();
			msgRet = "fail";
		}finally{
			em.close();
		}	
		
		return msgRet;
	}
	
	private void deleteOldOfferRequest(String email){
		EntityManager em = null;
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			Query query = em.createNativeQuery("delete from reqtrans where (state='offer' or state='request') and email= ?1");
			query.setParameter(1, email);
			em.getTransaction().begin();
			query.executeUpdate();
			
			query  = em.createNativeQuery("delete from reqtrans where (state='offer' or state='request') and email2= ?1");
			query.setParameter(1, email);	
			query.executeUpdate();
			
			
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
			
		}finally{
			em.close();
		}	
	}
	
	private void deleteTrans(String email, String email2,String participants){
		EntityManager em = null;
		
		
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			Query query = em.createNativeQuery("delete from reqtrans where state='accept' and email= ?1 and email2= ?2");
			query.setParameter(1, email);
			query.setParameter(2, email2);
			
			
			
			em.getTransaction().begin();
			query.executeUpdate();
			
			query  = em.createNativeQuery("delete from reqtrans where state='accept' and email= ?2 and email2= ?1");
			query.setParameter(1, email);
			query.setParameter(2, email2);
			
			query.executeUpdate();
			
			
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
			
		}finally{
			em.close();
		}	
		
	}
	
	
	@Path("reject")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String rejectOffer(@FormParam("myemail") String myemail, @FormParam("place") String place, @FormParam("email2") String email2)
	{
		String msgRet = "Sucessfull!";
		
		EntityManager em = null;
		Reqtran req = new Reqtran();
		req.setEmail(myemail);
		req.setState("reject");
		req.setParticipants(place);
		req.setEmail2(email2);
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(req);
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
			msgRet = "fail";
		}finally{
			em.close();
		}	
		
		return msgRet;
	}
	@Path("getaccepts")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public List<Item> getAccepts(@QueryParam("myemail") String myemail){
		List<Item> ret = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		List reqs = new ArrayList();
		Query query = em.createNativeQuery("select concat(email,'-',state,'-',participants) as ret from reqtrans where state='accept' and email in (select friend from groups where userid= ?1)");
		query.setParameter(1, myemail);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			item.setEntry((String)reqs.get(i));
			ret.add(item);	
		}
		return ret;
	}
	
	
	
	@Path("getoffers")
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public List<Item> getOffers(@QueryParam("myemail") String myemail){
		List<Item> ret = new ArrayList<Item>();
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		List reqs = new ArrayList();
		Query query = em.createNativeQuery("select concat(email,'-',state,'-',participants) as ret from reqtrans where state='offer' and email in (select friend from groups where userid= ?1)");
		query.setParameter(1, myemail);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			Item item = new Item();
			item.setEntry((String)reqs.get(i));
			ret.add(item);	
		}
		return ret;
	}
	
	@Path("addoffer")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addOffer(@FormParam("myemail") String myemail, @FormParam("place") String place){
		String msgRet = "Sucessfull!";
		 java.util.Date today = new java.util.Date();
		 Timestamp now = new Timestamp(today.getTime());
		
		deleteOldOfferRequest(myemail);
		
		Reqtran req = new Reqtran();
		req.setEmail(myemail);
		req.setParticipants(place);
		req.setState("offer");
		req.setTimetx(now);
	
		EntityManager em = null;
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(req);
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;
	}
	
	@Path("addrequest")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addRequeest(@FormParam("myemail") String myemail, @FormParam("place") String place){
		String msgRet = "Sucessfull!";
		 java.util.Date today = new java.util.Date();
		 Timestamp now = new Timestamp(today.getTime());
		
		deleteOldOfferRequest(myemail);
		 
		Reqtran req = new Reqtran();
		req.setEmail(myemail);
		req.setParticipants(place);
		req.setState("request");
		req.setTimetx(now);
	
		EntityManager em = null;
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(req);
			em.getTransaction().commit();
		}catch(Exception err){
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;
	}
	
	@Path("addaddress")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addAddress(@FormParam("email") String email, @FormParam("street1") String street1, @FormParam("street2") String street2, @FormParam("city") String city, @FormParam("state") String state, @FormParam("zipcode") String zipcode){
		
		System.out.println("Add address was called");
		String msgRet = "Sucessfull!";
		Address address = null;
	
		EntityManager em = null;
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			address = em.find(Address.class, email);
			if(address == null){
				address = new Address();
				address.setEmail(email);
				address.setStreet1(street1);
				address.setStreet2(street2);
				address.setCity(city);
				address.setState(state);
				address.setZipcode(zipcode);
			}else{
				address.setStreet1(street1);
				address.setStreet2(street2);
				address.setCity(city);
				address.setState(state);
				address.setZipcode(zipcode);
			}
			em.getTransaction().begin();
			em.persist(address);
			em.getTransaction().commit();
		}catch(Exception err){
			msgRet = "fail";
			err.printStackTrace();
		}finally{
			em.close();
		}
		
		return msgRet;
	}
	
	@Path("getaddress")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAddresses(@QueryParam("email") String email){
		String ret = "";
		EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
		List reqs = new ArrayList();
		Query query = em.createNativeQuery("select concat(street1, '@',city,'@',state,'@',zipcode) as ret  from address where email= ?1");
		query.setParameter(1, email);
		reqs = query.getResultList();
		for(int i=0; i < reqs.size();i++){
			
			ret = (String)reqs.get(i);
			
		}
		return ret;
	} 
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String register(@FormParam("email") String email, @FormParam("password") String passwd, @FormParam("fname") String fname, @FormParam("lname") String lname, @FormParam("telno") String telno){
		String msgRet = "Sucessfull!";
		
		User user = new User();
		user.setEmail(email);
		user.setFname(fname);
		user.setLname(lname);
		user.setMobileno(telno);
		user.setPassword(passwd);
		
		EntityManager em = null;
	
		
		try{
			em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			System.out.println("Commit");
		}catch(Exception err){
			if(err.getMessage().contains("Duplicate")){
				msgRet = "The entered e-mail is existed";
			}
			System.out.println(err.getMessage());
		}finally{
			em.close();
		}
		
		return msgRet;
	}
}
