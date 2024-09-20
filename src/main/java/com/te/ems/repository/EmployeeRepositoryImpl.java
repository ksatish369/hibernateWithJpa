package com.te.ems.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.ems.entity.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	@Override
	public int saveEmployee(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee.getEmployeeId();
	}

	@Override
	public Employee readEmployee(int id) {
		entityManager.getReference(Employee.class, id);//preffered
		return entityManager.find(Employee.class, id);
	}

	@Override
	public int updateEmployee(int id, Employee employee) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employeeFromDatabase=entityManager.getReference(Employee.class, 1);
		employeeFromDatabase.setEmployeeDOB(employee.getEmployeeDOB());
		employeeFromDatabase.setEmployeeName(employee.getEmployeeName());
		employeeFromDatabase.setEmployeePh(employee.getEmployeePh());
		entityManager.persist(employeeFromDatabase);
		entityTransaction.begin();
		entityTransaction.commit();
	
		
		return employeeFromDatabase.getEmployeeId();
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employeeFromDatabase=entityManager.getReference(Employee.class, 1);
		entityTransaction.begin();
		entityManager.remove(employeeFromDatabase);
		entityTransaction.commit();
		if(entityManager.find(Employee.class, 1)==null)
			return true;
		return false;
	}

}
