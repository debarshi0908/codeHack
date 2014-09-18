package edu.ue.webservices;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;

import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.ridepad.entity.User;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

@Path("/hello")
public class HelloWorld {

		@Context
		UriInfo uriInfo;


		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public String sayHello(){
		
			
			return "Hello World";
		}
		
		@GET
		@Produces(MediaType.TEXT_XML)
		public String sayXML(){
			String ret =  "<?xml version=\"1.0\"?>" + "<hello> Hello World" + "</hello>";
			return ret;
		}
		
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String sayHTML(){
			return  "<html> " + "<title>" + "Hello Jersey" + "</title>"
					+ "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
		}
		
		@Path("newloc")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String newLoc(@DefaultValue("0") @QueryParam("id") String id, @DefaultValue("0") @QueryParam("loc") String loc){
			User user = new User();
			user.setEmail("aziz.nanthaa@gmail.com");
			user.setFname("aziz");
			user.setLname("nantha");
			user.setMobileno("2053945254");
			user.setPassword("123456");
			
			EntityManager em = null;
			String msg = "";
			msg = id + "::"+loc;
			try{
				em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
				em.getTransaction().begin();
				em.persist(user);
				em.getTransaction().commit();
				System.out.println("Commit");
			}catch(Exception err){
				if(err.getMessage().contains("Duplicate")){
					msg = "The entered e-mail is existed";
				}
				System.out.println(err.getMessage());
			}finally{
				em.close();
			}
			
			return msg;
		}
		
		@Path("getloc")
		@GET
		@Produces(MediaType.TEXT_HTML)
		public String getLoc(@DefaultValue("0") @QueryParam("id") String id, @DefaultValue("0") @QueryParam("lat") String lat,  @DefaultValue("0") @QueryParam("lon") String lon){
			return id + "::" + lat + "::"+ lon;
		}
		

	
}
