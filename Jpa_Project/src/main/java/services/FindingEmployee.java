package services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.Employee_DAO;
import model.EmployeeEntity;

public class FindingEmployee implements Employee_DAO{
	
	public void findingEmployee() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Jpa_Project" );
        EntityManager entitymanager = emfactory.createEntityManager();
        EmployeeEntity employee = entitymanager.find(EmployeeEntity.class,1);

        System.out.println("employee ID = " + employee.getEmployeeNumber());
        System.out.println("employee FIRST NAME = " + employee.getFirstName());
        System.out.println("employee LAST NAME = " + employee.getLastName());
        System.out.println("employee EMAIL = " + employee.getEmail());
        System.out.println("employee OfficeCode = " + employee.getOfficeCode());

	}

	@Override
	public void creatingEmployee() {
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
