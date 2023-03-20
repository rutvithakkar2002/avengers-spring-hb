package com.controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.AddressEntity;
import com.Entity.EmployeeEntity;
import com.dao.AddressRepository;
import com.dao.EmployeeRepository;

@Controller
public class OneToOneController {

	@Autowired
	EmployeeRepository emprepo;

	@Autowired
	AddressRepository addrepo;

	@GetMapping("/newemp")
	public String newEmp() {
		return "NewEmp";
	}

	@PostMapping("/saveemp")
	public String saveEmp(EmployeeEntity empentity) {
		emprepo.save(empentity);
		return "NewEmp";
	}

	@GetMapping("loginemp")
	public String loginEmp() {
		return "LoginEmp";
	}

	@PostMapping("/loginemp")
	public String loginEmpauthenticate(EmployeeEntity empEntity, HttpSession session) {
		// ram
		empEntity = emprepo.findByName(empEntity.getName());
		System.out.println(empEntity);

		if (empEntity == null) {
			return "LoginEmp";
		} else {
			session.setAttribute("emp", empEntity);// id name
			return "Home";
		}
	}

	@PostMapping("/saveaddress")
	public String saveAddress(AddressEntity address, HttpSession sesssion) {
		EmployeeEntity empEntity = (EmployeeEntity) sesssion.getAttribute("emp");
		addrepo.save(address);//address save 
		// addressId
		// emp-> address
		empEntity.setAddress(address);
		
		emprepo.save(empEntity);//update addressId set 
		return "Home";
	}

}
