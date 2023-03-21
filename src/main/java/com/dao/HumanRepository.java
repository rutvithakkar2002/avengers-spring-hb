package com.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.HumanEntity;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity,Integer>{

	
	
	
}
