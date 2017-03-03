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
@Table(name="Organization_Types")
public class ModelOrganizationType implements java.io.Serializable,Model{
	@Id
	@Column(name="nmOrganizationTypeId",unique = true,nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int organizationTypeId;
	@Column(name="szOrganizationType",unique = true)
	private String organizationType;
	@OneToMany(fetch=FetchType.LAZY,mappedBy="organizationType")
	private Set<ModelOrganization> organizations = new HashSet<ModelOrganization>(0);
	public int getOrganizationTypeId() {
		return organizationTypeId;
	}
	public void setOrganizationTypeId(int organizationTypeId) {
		this.organizationTypeId = organizationTypeId;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public Set<ModelOrganization> getOrganizations() {
		return organizations;
	}
	public void setOrganizations(Set<ModelOrganization> organizations) {
		this.organizations = organizations;
	}
	
}
