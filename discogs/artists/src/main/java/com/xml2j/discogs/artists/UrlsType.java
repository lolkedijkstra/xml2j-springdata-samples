package com.xml2j.discogs.artists;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: ARTISTS 
  Generation date: Sun Apr 29 15:17:38 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * UrlsType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class UrlsType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 12345678L;

	/**
	 * Constructor for UrlsType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public UrlsType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type UrlsType.
	 */
	static class Allocator implements TypeAllocator<UrlsType> {
		/**
		 * method for getting a new instance of type UrlsType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public UrlsType newInstance(String elementName, ComplexDataType parent) {
			return new UrlsType(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  	
  
	/** list of url element. 
	 *  @serial
	 */	
	private StringList m_urlList = new StringList("url");
		
	/**
	 * Get the embedded list of Url elements.
	 * @return list of items.
	 */
	public StringList getUrls() {
		return m_urlList;
	}
		
	/**
	 * This method adds data to the list of Url.
	 * @param data the item that needs to be added.
	 */
	void setUrl(String data) {
		m_urlList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	UrlsType t = (UrlsType)that;
	 
		if (!Compare.equals(m_urlList, t.m_urlList))
			return false;
		
		return true;
	}	

  
  
}
