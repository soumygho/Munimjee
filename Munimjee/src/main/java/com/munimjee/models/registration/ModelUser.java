package com.munimjee.models.registration;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.munimjee.models.Model;
@Entity
@Table(name="user")
public class ModelUser implements java.io.Serializable,Model{
	@Id
	@Column(name="nmUserSeq",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userSequence = 0;
	@Column(name="szUserId",nullable=false)
	private String userId = "";
	@Column(name="szPassword",nullable=false)
	private String password = "";
	@Column(name="szEmailId",nullable=false,unique=true)
	private String emailId = "";
	@Column(name="szFirstName",nullable=false)
	private String firstName = "";
	@Column(name="szLastName",nullable=false)
	private String lastName ="";
	@Column(name="nmMobileNo",nullable=false)
	private int mobileNo = 0;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="user")
	private Set<ModelUserSession> userSessions = new HashSet<ModelUserSession>(0);
	@OneToMany(fetch=FetchType.LAZY,mappedBy="user")
	private Set<ModelOrganizationUserRole> userRoles = new HashSet<ModelOrganizationUserRole>(0);
	public int getUserSequence() {
		return userSequence;
	}
	public void setUserSequence(int userSequence) {
		this.userSequence = userSequence;
	}
	public Set<ModelUserSession> getUserSessions() {
		return userSessions;
	}
	public void setUserSessions(Set<ModelUserSession> userSessions) {
		this.userSessions = userSessions;
	}
	public Set<ModelOrganizationUserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<ModelOrganizationUserRole> userRoles) {
		this.userRoles = userRoles;
	}
	public int getUserSequesnce() {
		return userSequence;
	}
	public void setUserSequesnce(int userSequesnce) {
		this.userSequence = userSequesnce;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
