package org.mk.Monoliticproject.serviceImpl;

import org.mk.Monoliticproject.Entity.Project;
import org.mk.Monoliticproject.repository.ProjectRepository;
import org.mk.Monoliticproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class projectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		Project saveProject=projectRepository.save(project);
		return saveProject;
	}

	@Override
	public Project getProjectByCode(long projectCode) {
		Project foundProject=projectRepository.findByProjectCode(projectCode);
		return foundProject;
	}

}
