package org.mk.Monoliticproject.repository;

import org.mk.Monoliticproject.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	public Project findByProjectCode(long employeeAssignedProject);

}
