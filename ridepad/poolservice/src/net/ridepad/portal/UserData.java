package net.ridepad.portal;

import java.util.Hashtable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class UserData {

		public List getAllUsers(){
			
			EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			List list = em.createQuery("SELECT u from User u").getResultList();
			return list;
		}
		
		public List getAllLocations(){
			
			EntityManager em = Persistence.createEntityManagerFactory("poolservices").createEntityManager();
			List list = em.createQuery("SELECT u from Location u").getResultList();
			return list;
		}
}
