package com.munimjee.controllers.requestbeans;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.munimjee.models.registration.*;
@XmlRootElement (name ="modules")
@XmlAccessorType(XmlAccessType.NONE)
public class ModuleRequest {
@XmlElement
private List<ModelModules> modules = null;

public List<ModelModules> getModules() {
	return modules;
}

public void setModules(List<ModelModules> modules) {
	this.modules = modules;
}

}
