package com.poc.formats;

import java.util.List;

public interface DataFormat {

	public List<Element> getElements();
	public void appendElement(final Element element);
	public void addElementAt(final Element element, final int index);
	
}
