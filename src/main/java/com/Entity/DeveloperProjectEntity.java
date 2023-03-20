package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "developerproject")
public class DeveloperProjectEntity {
	
	@Id
	@GeneratedValue
	Integer devproId;
	
	Integer developerId;
	Integer projectId;
	public Integer getDevproId() {
		return devproId;
	}
	public void setDevproId(Integer devproId) {
		this.devproId = devproId;
	}
	
	public Integer getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(Integer developerId) {
		this.developerId = developerId;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

}
