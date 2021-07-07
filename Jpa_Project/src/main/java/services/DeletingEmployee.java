package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.Employee_DAO;
import model.EmployeeEntity;

public class DeletingEmployee implements Employee_DAO{
	
	public void deletingEmployee() {
		
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Jpa_Project" );
        EntityManager entitymanager = emfactory.createEntityManager( );
        entitymanager.getTransaction( ).begin( );
          
        EmployeeEntity employee = entitymanager.find( EmployeeEntity.class, 151 );
        entitymanager.remove( employee );
        entitymanager.getTransaction( ).commit( );

        entitymanager.close( );
        emfactory.close( );
	}

	@Override
	public void findingEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatingEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatingEmployee() {
		// TODO Auto-generated method stub
		
	}

}
