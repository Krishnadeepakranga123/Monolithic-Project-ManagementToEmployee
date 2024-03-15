package org.mk.Monoliticproject.Controller;

import org.mk.Monoliticproject.Entity.Project;
import org.mk.Monoliticproject.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	//save the project
	@PostMapping
	public Project createProject(@RequestBody Project project) {
		return projectService.saveProject(project);
	}
	
	@GetMapping("/{project_code}")
	public Project getProjectByCode(@PathVariable long project_code) {
		return projectService.getProjectByCode(project_code);
	}

}
