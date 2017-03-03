package com.munimjee.models.registration;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.munimjee.models.Model;
@Entity
@Table(name="roles")
public class ModelRoles implements Serializable,Model{
	@Id
	@Column(name="nmUserRoleId",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userRoleId = 0;
	@Column(name="szUserRoleName",nullable=false)
	private String userRoleName = null;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="role")
	private ModelUserAccess userAccess = null; 
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRoleName() {
		return userRoleName;
	}
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	public ModelUserAccess getUserAccess() {
		return userAccess;
	}
	public void setUserAccess(ModelUserAccess userAccess) {
		this.userAccess = userAccess;
	}
	
	
}
