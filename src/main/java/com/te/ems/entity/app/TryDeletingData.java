package com.te.ems.entity.app;

import com.te.ems.repository.EmployeeRepository;
import com.te.ems.repository.EmployeeRepositoryImpl;

public class TryDeletingData {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		employeeRepository.deleteEmployee(1);
		
	}
}
