package org.mk.Monoliticproject.serviceImpl;

import org.mk.Monoliticproject.Entity.Employee;
import org.mk.Monoliticproject.Entity.Project;
import org.mk.Monoliticproject.payload.EmployeeDto;
import org.mk.Monoliticproject.repository.EmployeeRepository;
import org.mk.Monoliticproject.repository.ProjectRepository;
import org.mk.Monoliticproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public EmployeeDto saveEmployee(Employee employee) {
		Employee savedEmployee=employeeRepository.save(employee);
		Project project=projectRepository.findByProjectCode(savedEmployee.getEmployeeAssignedProject());
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(savedEmployee.getId());
		employeeDto.setEmployeeName(savedEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(savedEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(savedEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		return employeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(long id) {
		
		Employee foundEmployee=employeeRepository.findById(id).get();
		Project project=projectRepository.findByProjectCode(foundEmployee.getEmployeeAssignedProject());
		EmployeeDto employeeDto=new EmployeeDto();
		employeeDto.setId(foundEmployee.getId());
		employeeDto.setEmployeeName(foundEmployee.getEmployeeName());
		employeeDto.setEmployeeEmail(foundEmployee.getEmployeeEmail());
		employeeDto.setEmployeeBaseLocation(foundEmployee.getEmployeeBaseLocation());
		employeeDto.setProjectCode(project.getProjectCode());
		employeeDto.setProjectName(project.getProjectName());
		
		return employeeDto;
	}

}
