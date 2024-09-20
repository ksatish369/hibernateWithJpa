package com.te.ems.entity.app;

import com.te.ems.repository.EmployeeRepository;
import com.te.ems.repository.EmployeeRepositoryImpl;

public class TryingFetchingData {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		System.out.println(employeeRepository.readEmployee(1));
		
	}
}
