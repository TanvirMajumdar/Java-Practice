package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.Employee_DAO;
import model.EmployeeEntity;

public class CreatingEmployee implements Employee_DAO{
	
	public void creatingEmployee() {
	     EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("Jpa_Project");  
	     EntityManager em=emfactory.createEntityManager();  
	     em.getTransaction().begin();  


	     EmployeeEntity employee = new EmployeeEntity(); 
	     employee.setEmail( "mk@gmai.com");
	     employee.setFirstName( "Alex" );
	     employee.setLastName("Mick");
	    // employee.setEmployeeNumber(2300);
	     employee.setOfficeCode("1");

	     em.persist(employee);
	     em.getTransaction().commit();
	     em.close();
	     emfactory.close( );  

	}

	@Override
	public void findingEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletingEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatingEmployee() {
		// TODO Auto-generated method stub
		
	}



}
