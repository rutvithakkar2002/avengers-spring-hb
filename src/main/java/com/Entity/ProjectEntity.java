package com.Entity;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class ProjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer projectId;

	String projectname;
	String technologyname;

	// @JoinColumn(table = "developer_project",@JoinColumn="projectId") //table=""
	// that is 3rd table name
	@ManyToMany(mappedBy = "project")
	Set<DeveloperEntity> developers;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getTechnologyname() {
		return technologyname;
	}

	public void setTechnologyname(String technologyname) {
		this.technologyname = technologyname;
	}

	public Set<DeveloperEntity> getDevelopers() {
		return developers;
	}

	public void setDevelopers(Set<DeveloperEntity> developers) {
		this.developers = developers;
	}

}
