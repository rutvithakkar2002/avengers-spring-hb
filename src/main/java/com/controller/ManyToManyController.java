package com.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.DeveloperEntity;
import com.Entity.DeveloperProjectEntity;

import com.Entity.ProjectEntity;
import com.dao.DeveloperProjectRepository;
import com.dao.DeveloperRepository;
import com.dao.ProjectRepository;

@Controller
public class ManyToManyController {

	@Autowired
	DeveloperRepository devrepo;

	@Autowired
	ProjectRepository prorepo;

	@Autowired
	DeveloperProjectRepository devprorepo;

	@GetMapping("/newDeveloper")
	public String newDeveloper() {
		return "NewDeveloper";
	}

	@PostMapping("/saveDeveloper")
	public String saveDeveloper(DeveloperEntity developer) {
		devrepo.save(developer);
		return "NewDeveloper";
	}

	@GetMapping("/developers")
	public String getAllDevelopers(Model model) {
		List<DeveloperEntity> developers = devrepo.findAll();
		model.addAttribute("developer", developers);
		return "ListDevelopers";
	}

	@GetMapping("/deletedeveloper/{developerId}")
	public String deletedeveloper(@PathVariable("developerId") Integer developerId) {
		devrepo.deleteById(developerId);
		return "redirect:/developers";
	}

	@GetMapping("/editdeveloper/{developerId}")
	public String editDeveloper(@PathVariable("developerId") Integer developerId, Model model) {
		Optional<DeveloperEntity> developer = devrepo.findById(developerId);
		if (developer.isPresent()) {
			DeveloperEntity developer1 = developer.get();
			model.addAttribute("developer1", developer1);
			return "EditDeveloper";
		}
		return "null";
	}

	@PostMapping("/updateDeveloper")
	public String updateDeveloper(DeveloperEntity developer) {
		System.out.println("hey");
		devrepo.save(developer);
		return "redirect:/developers";
	}

	// saveproject

	@GetMapping("/newproject")
	public String newProject() {
		return "NewProject";
	}

	@PostMapping("/saveProject")
	public String saveProject(ProjectEntity project) {
		prorepo.save(project);
		return "NewProject";
	}

	@GetMapping("/projects")
	public String getAllProjects(Model model) {
		List<ProjectEntity> projects = prorepo.findAll();
		model.addAttribute("projects", projects);
		return "ListProjects";
	}

	@GetMapping("/deleteproject/{projectId}")
	public String deleteProject(@PathVariable("projectId") Integer projectId) {
		prorepo.deleteById(projectId);
		return "redirect:/projects";
	}

	@GetMapping("/editproject/{projectId}")
	public String editProject(@PathVariable("projectId") Integer projectId, Model model) {
		Optional<ProjectEntity> project = prorepo.findById(projectId);
		if (project.isPresent()) {
			ProjectEntity project1 = project.get();
			model.addAttribute("project1", project1);
			return "EditProject";
		}
		return "null";
	}

	@PostMapping("/updateproject")
	public String updateproject(ProjectEntity project) {
		System.out.println("hey");
		prorepo.save(project);
		return "redirect:/projects";
	}

	// many to many

	@GetMapping("/addDevPro")
	public String addDevPro(Model model) {

		List<DeveloperEntity> developers = devrepo.findAll();
		List<ProjectEntity> projects = prorepo.findAll();

		model.addAttribute("developer", developers);
		model.addAttribute("project", projects);

		return "AddDeveloperProject";
	}

	@PostMapping("/savedeveloperproject")
	public String saveDeveloperProject(DeveloperProjectEntity developerproject) {

		System.out.println("Good morning");
		devprorepo.save(developerproject);
		System.out.println("hellooo");
		return "redirect:/developerpros";
	}

	@GetMapping("/developerpros")
	public String GetAlldeveloperpros(Model model) {
		List<DeveloperProjectEntity> developerpros = devprorepo.findAll();
		List<DeveloperEntity> developers=devrepo.findAll();
		List<ProjectEntity> projects=prorepo.findAll();
		
		model.addAttribute("developerpros", developerpros);
		model.addAttribute("developers", developers);
		model.addAttribute("projects", projects);
		return "ListAllDevPro";
	}

	@GetMapping("/deleteDeveloperPro/{devproId}")
	public String deleteDeveloperProjects(@PathVariable("devproId") Integer devproId)
	{
		devprorepo.deleteById(devproId);
		return "redirect:/developerpros";
	}
}
