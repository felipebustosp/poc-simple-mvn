package com.poc.formats.sample;

import java.util.ArrayList;
import java.util.List;

import com.poc.formats.DataFormat;
import com.poc.formats.Element;
import com.poc.formats.ElementType;
import com.poc.formats.sample.elements.SampleHeaderElement;

public class SampleFormat implements DataFormat {

	private Element header = new SampleHeaderElement(ElementType.HEADER, "HEADER01");
	private List <Element> elements;
	
	public SampleFormat() {
		elements = new ArrayList<Element>();
		elements.add(header);
	}
	
	@Override
	public List<Element> getElements() {
		return elements;
	}

	@Override
	public void appendElement(Element element) {
		elements.add(element);
	}

	@Override
	public void addElementAt(Element element, int index) {
		elements.add(index, element);
	}

}
