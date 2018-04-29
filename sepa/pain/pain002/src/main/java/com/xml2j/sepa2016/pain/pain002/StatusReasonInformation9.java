package com.xml2j.sepa2016.pain.pain002;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN002 
  Generation date: Sun Apr 29 21:09:42 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import com.xml2j.util.Printer;

import com.xml2j.util.StringList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * StatusReasonInformation9 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class StatusReasonInformation9 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for StatusReasonInformation9.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public StatusReasonInformation9(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type StatusReasonInformation9.
	 */
	static class Allocator implements TypeAllocator<StatusReasonInformation9> {
		/**
		 * method for getting a new instance of type StatusReasonInformation9.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public StatusReasonInformation9 newInstance(String elementName, ComplexDataType parent) {
			return new StatusReasonInformation9(elementName, parent);
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
	
  	
  
	/** element item for Orgtr element. 
	 *  @serial
	 */	
	private PartyIdentification43 m_orgtr = null;
	
	/** element item for Rsn element. 
	 *  @serial
	 */	
	private StatusReason6Choice m_rsn = null;
	
	/** list of AddtlInf element. 
	 *  @serial
	 */	
	private StringList m_addtlInfList = new StringList("AddtlInf");
	
	/**
	 * Get the embedded Orgtr element.
	 * @return the item.
	 */
	public PartyIdentification43 getOrgtr() {
		return m_orgtr;
	}
		
	/**
	 * This method sets (overwrites) the element Orgtr.
	 * @param data the item that needs to be added.
	 */
	void setOrgtr(PartyIdentification43 data) {
		m_orgtr = data;
	}
		
	/**
	 * Get the embedded Rsn element.
	 * @return the item.
	 */
	public StatusReason6Choice getRsn() {
		return m_rsn;
	}
		
	/**
	 * This method sets (overwrites) the element Rsn.
	 * @param data the item that needs to be added.
	 */
	void setRsn(StatusReason6Choice data) {
		m_rsn = data;
	}
			
	/**
	 * Get the embedded list of AddtlInf elements.
	 * @return list of items.
	 */
	public StringList getAddtlInfs() {
		return m_addtlInfList;
	}
		
	/**
	 * This method adds data to the list of AddtlInf.
	 * @param data the item that needs to be added.
	 */
	void setAddtlInf(String data) {
		m_addtlInfList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	StatusReasonInformation9 t = (StatusReasonInformation9)that;
	 
		if (!Compare.equals(m_orgtr, t.m_orgtr))
			return false;
		
		if (!Compare.equals(m_rsn, t.m_rsn))
			return false;
		
		if (!Compare.equals(m_addtlInfList, t.m_addtlInfList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from StatusReasonInformation9.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_orgtr != null) {
			m_orgtr.print(out);
		}	
		
		if (m_rsn != null) {
			m_rsn.print(out);
		}	
		
		if (m_addtlInfList != null) {
			m_addtlInfList.print(out);
		}	
		
	}
}
