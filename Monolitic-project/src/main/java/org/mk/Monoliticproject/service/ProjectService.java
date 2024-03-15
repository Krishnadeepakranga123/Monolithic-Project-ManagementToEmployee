package org.mk.Monoliticproject.service;

import org.mk.Monoliticproject.Entity.Project;

public interface ProjectService {
	
	public Project saveProject(Project project);
	public Project getProjectByCode(long projectCode);

}
