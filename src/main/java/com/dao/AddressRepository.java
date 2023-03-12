package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity,Integer>{

}
