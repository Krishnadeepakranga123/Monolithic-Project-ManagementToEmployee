package org.mk.Monoliticproject.repository;

import org.mk.Monoliticproject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
