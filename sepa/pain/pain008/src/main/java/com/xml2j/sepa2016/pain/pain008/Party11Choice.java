package com.xml2j.sepa2016.pain.pain008;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN008 
  Generation date: Sun Apr 29 21:09:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * Party11Choice data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class Party11Choice extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for Party11Choice.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public Party11Choice(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type Party11Choice.
	 */
	static class Allocator implements TypeAllocator<Party11Choice> {
		/**
		 * method for getting a new instance of type Party11Choice.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public Party11Choice newInstance(String elementName, ComplexDataType parent) {
			return new Party11Choice(elementName, parent);
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
	
  	
  
	/** element item for OrgId element. 
	 *  @serial
	 */	
	private OrganisationIdentification8 m_orgId = null;
	
	/** element item for PrvtId element. 
	 *  @serial
	 */	
	private PersonIdentification5 m_prvtId = null;
	
	/**
	 * Get the embedded OrgId element.
	 * @return the item.
	 */
	public OrganisationIdentification8 getOrgId() {
		return m_orgId;
	}
		
	/**
	 * This method sets (overwrites) the element OrgId.
	 * @param data the item that needs to be added.
	 */
	void setOrgId(OrganisationIdentification8 data) {
		m_orgId = data;
	}
		
	/**
	 * Get the embedded PrvtId element.
	 * @return the item.
	 */
	public PersonIdentification5 getPrvtId() {
		return m_prvtId;
	}
		
	/**
	 * This method sets (overwrites) the element PrvtId.
	 * @param data the item that needs to be added.
	 */
	void setPrvtId(PersonIdentification5 data) {
		m_prvtId = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	Party11Choice t = (Party11Choice)that;
	 
		if (!Compare.equals(m_orgId, t.m_orgId))
			return false;
		
		if (!Compare.equals(m_prvtId, t.m_prvtId))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from Party11Choice.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_orgId != null) {
			m_orgId.print(out);
		}	
		
		if (m_prvtId != null) {
			m_prvtId.print(out);
		}	
		
	}
}
