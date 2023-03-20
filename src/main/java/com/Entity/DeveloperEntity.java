package com.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
public class DeveloperEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer developerId;
	String developerName;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "developerproject", joinColumns = { @JoinColumn(name = "developerId") }, inverseJoinColumns = {
			@JoinColumn(name = "projectId") })

	Set<ProjectEntity> project;

	public Integer getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public Set<ProjectEntity> getProject() {
		return project;
	}

	public void setProject(Set<ProjectEntity> project) {
		this.project = project;
	}

	

}
