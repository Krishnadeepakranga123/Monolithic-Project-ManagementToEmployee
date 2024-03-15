package org.mk.Monoliticproject.service;

import org.mk.Monoliticproject.Entity.Employee;
import org.mk.Monoliticproject.payload.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto saveEmployee(Employee employee);
	public EmployeeDto getEmployeeById(long id);
	

}
