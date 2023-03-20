package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity,Integer>{

}
