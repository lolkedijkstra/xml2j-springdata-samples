package com.xml2j.sepa2016.pain.pain013;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN013 
  Generation date: Sun Apr 29 21:09:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * OrganisationIdentification8 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class OrganisationIdentification8 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for OrganisationIdentification8.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public OrganisationIdentification8(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type OrganisationIdentification8.
	 */
	static class Allocator implements TypeAllocator<OrganisationIdentification8> {
		/**
		 * method for getting a new instance of type OrganisationIdentification8.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public OrganisationIdentification8 newInstance(String elementName, ComplexDataType parent) {
			return new OrganisationIdentification8(elementName, parent);
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
	
  	
  
	/** element item for AnyBIC element. 
	 *  @serial
	 */	
	private String m_anyBIC = null;
	
	/** list of Othr element. 
	 *  @serial
	 */	
	private List<GenericOrganisationIdentification1> m_othrList = new ArrayList<GenericOrganisationIdentification1>();
	
	/**
	 * Get the embedded AnyBIC element.
	 * @return the item.
	 */
	public String getAnyBIC() {
		return m_anyBIC;
	}
		
	/**
	 * This method sets (overwrites) the element AnyBIC.
	 * @param data the item that needs to be added.
	 */
	void setAnyBIC(String data) {
		m_anyBIC = data;
	}
		
	/**
	 * Get the embedded list of Othr elements.
	 * @return list of items.
	 */
	public List<GenericOrganisationIdentification1> getOthrs() {
		return m_othrList;
	}
		
	/**
	 * This method adds data to the list of Othr.
	 * @param data the item that needs to be added.
	 */
	void setOthr(GenericOrganisationIdentification1 data) {
		m_othrList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	OrganisationIdentification8 t = (OrganisationIdentification8)that;
	 
		if (!Compare.equals(m_anyBIC, t.m_anyBIC))
			return false;
		
		if (!Compare.equals(m_othrList, t.m_othrList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from OrganisationIdentification8.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_anyBIC != null) {
			out.print("\n<AnyBIC>");
			out.print(m_anyBIC);
			out.print("</AnyBIC>\n");
		}
		
		if (m_othrList != null) {
			for(GenericOrganisationIdentification1 l_Othr : m_othrList) {
				l_Othr.print(out);
			}
		}	
		
	}
}
