package com.Entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {
	@Id
	@GeneratedValue
	Integer roleId;

	String roleName;

	@OneToMany   //one role given to theso many humans
	Set<HumanEntity> humans;

	public Set<HumanEntity> getHumans() {
		return humans;
	}

	public void setHumans(Set<HumanEntity> humans) {
		this.humans = humans;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
