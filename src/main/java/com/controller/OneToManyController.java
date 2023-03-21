package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.Entity.HumanEntity;
import com.Entity.RoleEntity;
import com.dao.HumanRepository;
import com.dao.RoleRepository;

@Controller
public class OneToManyController {
	
	@Autowired
	RoleRepository rolerepo;
	
	@Autowired
	HumanRepository humanrepo;
	
	@GetMapping("newRole")
	public String newRole()
	{
		return "NewRole";
		
	}
	
	@PostMapping("saverole")
	public String saveRole(RoleEntity role)
	{
		rolerepo.save(role);
		return "NewRole";
	}
	
	@GetMapping("/getallroles")
	public String getAllRoles(Model model)
	{
		List<RoleEntity> roles=rolerepo.findAll();
		model.addAttribute("roles", roles);
		return "ListRoles";
	}
	
	@GetMapping("/newhuman")
	public String newUser(Model model)
	{
		List<RoleEntity> roles = rolerepo.findAll();
		model.addAttribute("roles", roles);
		return "NewHuman";
	}
	
	@PostMapping("/savehuman")
	public String saveHuman(HumanEntity human)
	{
	
		humanrepo.save(human);
		return "humans";
		
	}
	
	@GetMapping("/humans")  
	public String GetAllHumans(Model model) {
		List<HumanEntity> humans = humanrepo.findAll();
		model.addAttribute("humans", humans);
		return "ListHumans";
	}
	
	
	
}
