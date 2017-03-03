package com.munimjee.models.registration;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.munimjee.models.Model;

@Entity
@Table(name="User_Session")
public class ModelUserSession implements Serializable,Model{
	@Id
	@Column(name="nmUserSessionId",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userSessionId = 0;
	@Column(name="User_nmUserSeq",nullable=false,updatable=false,insertable=false)
	private int userId = 0;
	@Column(name="Organization_nmOrganizationId",nullable=false,updatable=false,insertable=false)
	private int organizationId = 0;
	@Temporal(TemporalType.DATE)
	@Column(name="dtLogin",nullable=false)
	private Date dtLogin;
	@Temporal(TemporalType.DATE)
	@Column(name="dtLogout",nullable=false)
	private Date dtlogout;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Organization_nmOrganizationId",referencedColumnName="nmOrganizationId")
	private ModelOrganization organization = null;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="User_nmUserSeq",referencedColumnName="nmUserSeq")
	private ModelUser user = null;
	public int getUserSessionId() {
		return userSessionId;
	}
	public void setUserSessionId(int userSessionId) {
		this.userSessionId = userSessionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	public Date getDtLogin() {
		return dtLogin;
	}
	public void setDtLogin(Date dtLogin) {
		this.dtLogin = dtLogin;
	}
	public Date getDtlogout() {
		return dtlogout;
	}
	public void setDtlogout(Date dtlogout) {
		this.dtlogout = dtlogout;
	}
	public ModelOrganization getOrganization() {
		return organization;
	}
	public void setOrganization(ModelOrganization organization) {
		this.organization = organization;
	}
	public ModelUser getUser() {
		return user;
	}
	public void setUser(ModelUser user) {
		this.user = user;
	}
	
	
}
