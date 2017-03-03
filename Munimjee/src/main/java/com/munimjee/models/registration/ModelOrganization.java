package com.munimjee.models.registration;

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
@Table(name="organization")
public class ModelOrganization implements java.io.Serializable,Model{
	@Id
	@Column(name="nmOrganizationId",unique = true,nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int organizationID = 0;
	@Column(name="szOrganizationName",nullable = false)
	private String organizationName = null;
	@Temporal(TemporalType.DATE)
	@Column(name="dtRegistration",nullable=false)
	private Date dateOfRegistration = null;
	@Column(name="flgOrganizationValidated",nullable = false)
	private String validOrganizationFlag = null;
	@Column(name="flgIsOrganizationMunimjee",nullable = false)
	private String isOrganizationMunimjeeFlag = null;
	@Column(name="Organization_Types_nmOrganizationTypeId",nullable = false,insertable=false,updatable=false)
	private int organizationTypeid = 0;
	/*@Column(name="Registration_Package_nmPackageId",nullable = false)
	private int packageId = 0;*/
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Organization_Types_nmOrganizationTypeId",referencedColumnName="nmOrganizationTypeId",nullable=false)
	private ModelOrganizationType organizationType;
	public int getOrganizationTypeid() {
		return organizationTypeid;
	}
	public void setOrganizationTypeid(int organizationTypeid) {
		this.organizationTypeid = organizationTypeid;
	}
	public int getOrganizationID() {
		return organizationID;
	}
	public void setOrganizationID(int organizationID) {
		this.organizationID = organizationID;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getValidOrganizationFlag() {
		return validOrganizationFlag;
	}
	public void setValidOrganizationFlag(String validOrganizationFlag) {
		this.validOrganizationFlag = validOrganizationFlag;
	}
	public String getIsOrganizationMunimjeeFlag() {
		return isOrganizationMunimjeeFlag;
	}
	public void setIsOrganizationMunimjeeFlag(String isOrganizationMunimjeeFlag) {
		this.isOrganizationMunimjeeFlag = isOrganizationMunimjeeFlag;
	}
	public ModelOrganizationType getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(ModelOrganizationType organizationType) {
		this.organizationType = organizationType;
	}
/*	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}*/
	
	
}
