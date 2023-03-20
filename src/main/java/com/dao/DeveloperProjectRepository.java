package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.DeveloperProjectEntity;

@Repository
public interface DeveloperProjectRepository extends JpaRepository<DeveloperProjectEntity, Integer> {

}
