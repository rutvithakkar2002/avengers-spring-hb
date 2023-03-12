package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.UserEntity;

@Repository   //to make singletone object of UserRepository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {// This jpa repository is for userentity table and primary key datatype is Integer now UserRepository is dao and it have all methods for run the query... To use the methods we have to make @Repository annotation that is used for making singletone object of UserEntity

	
	
}
