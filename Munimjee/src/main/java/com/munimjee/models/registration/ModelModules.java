package com.munimjee.models.registration;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.munimjee.models.Model;
@Entity
@Table(name="modules")
@JsonPropertyOrder({"moduleId","moduleName"})
@XmlRootElement (name ="module")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder={"moduleId","moduleName"})
public class ModelModules implements Serializable,Model{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="nmModuleId",nullable=false,unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlElement
	private int moduleId = 0;
	@Column(name="szModuleName",nullable=false,unique=true)
	@XmlElement
	private String moduleName = null;
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	

}