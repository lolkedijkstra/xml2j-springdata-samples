package com.xml2j.discogs.releases;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: RELEASES 
  Generation date: Sun Apr 29 13:26:11 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * IdentifiersType data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class IdentifiersType extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 12345678L;

	/**
	 * Constructor for IdentifiersType.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public IdentifiersType(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type IdentifiersType.
	 */
	static class Allocator implements TypeAllocator<IdentifiersType> {
		/**
		 * method for getting a new instance of type IdentifiersType.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public IdentifiersType newInstance(String elementName, ComplexDataType parent) {
			return new IdentifiersType(elementName, parent);
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
	
  	
  
	/** list of identifier element. 
	 *  @serial
	 */	
	private List<IdentifierType> m_identifierList = new ArrayList<IdentifierType>();
	
	/**
	 * Get the embedded list of Identifier elements.
	 * @return list of items.
	 */
	public List<IdentifierType> getIdentifiers() {
		return m_identifierList;
	}
		
	/**
	 * This method adds data to the list of Identifier.
	 * @param data the item that needs to be added.
	 */
	void setIdentifier(IdentifierType data) {
		m_identifierList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	IdentifiersType t = (IdentifiersType)that;
	 
		if (!Compare.equals(m_identifierList, t.m_identifierList))
			return false;
		
		return true;
	}	

  
  
}
