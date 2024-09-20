package com.te.ems.entity.app;

import java.time.LocalDate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.te.ems.entity.Employee;
import com.te.ems.repository.EmployeeRepository;
import com.te.ems.repository.EmployeeRepositoryImpl;

public class TryingSavingData {
	public static void main(String[] args) {
		Employee employee = Employee.builder().employeeDOB(LocalDate.of(1999, 01, 29)).employeeName("Satish").employeePh(8904410752l).build();
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
		employeeRepository.saveEmployee(employee);
	}
}
