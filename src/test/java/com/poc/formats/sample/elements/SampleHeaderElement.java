package com.poc.formats.sample.elements;

import com.poc.formats.Element;
import com.poc.formats.ElementType;

public class SampleHeaderElement implements Element {

	private static ElementType type;
	private Integer size;
	private String value;
	
	public SampleHeaderElement(ElementType type, String value) {
		SampleHeaderElement.type = type;
		this.value = value;
	}
	
	@Override
	public Object getType() {
		return type;
	}

	@Override
	public Integer getSize() {
		return size;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public Double getValueSize() {
		return new Double(value.length());
	}

}
