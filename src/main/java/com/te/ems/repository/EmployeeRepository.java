package com.te.ems.repository;

import com.te.ems.entity.Employee;

public interface EmployeeRepository {
	int saveEmployee(Employee employee);

	Employee readEmployee(int id);

	int updateEmployee(int id, Employee employee);

	boolean deleteEmployee(int id);
}
