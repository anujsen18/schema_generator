package com.cts.schemagen.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;

public class AttributeContainer {
	private List<AttributeClass> listcontainer = LazyList.decorate(new ArrayList<AttributeClass>(),FactoryUtils.instantiateFactory(AttributeClass.class));
public List<AttributeClass> getListcontainer() {
	return listcontainer;
}
public void setListcontainer(List<AttributeClass> listcontainer) {
	this.listcontainer = listcontainer;
}
}
