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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * BranchData2 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class BranchData2 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for BranchData2.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public BranchData2(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type BranchData2.
	 */
	static class Allocator implements TypeAllocator<BranchData2> {
		/**
		 * method for getting a new instance of type BranchData2.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public BranchData2 newInstance(String elementName, ComplexDataType parent) {
			return new BranchData2(elementName, parent);
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
	
  	
  
	/** element item for Id element. 
	 *  @serial
	 */	
	private String m_id = null;
	
	/** element item for Nm element. 
	 *  @serial
	 */	
	private String m_nm = null;
	
	/** element item for PstlAdr element. 
	 *  @serial
	 */	
	private PostalAddress6 m_pstlAdr = null;
	
	/**
	 * Get the embedded Id element.
	 * @return the item.
	 */
	public String getId() {
		return m_id;
	}
		
	/**
	 * This method sets (overwrites) the element Id.
	 * @param data the item that needs to be added.
	 */
	void setId(String data) {
		m_id = data;
	}
		
	/**
	 * Get the embedded Nm element.
	 * @return the item.
	 */
	public String getNm() {
		return m_nm;
	}
		
	/**
	 * This method sets (overwrites) the element Nm.
	 * @param data the item that needs to be added.
	 */
	void setNm(String data) {
		m_nm = data;
	}
		
	/**
	 * Get the embedded PstlAdr element.
	 * @return the item.
	 */
	public PostalAddress6 getPstlAdr() {
		return m_pstlAdr;
	}
		
	/**
	 * This method sets (overwrites) the element PstlAdr.
	 * @param data the item that needs to be added.
	 */
	void setPstlAdr(PostalAddress6 data) {
		m_pstlAdr = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	BranchData2 t = (BranchData2)that;
	 
		if (!Compare.equals(m_id, t.m_id))
			return false;
		
		if (!Compare.equals(m_nm, t.m_nm))
			return false;
		
		if (!Compare.equals(m_pstlAdr, t.m_pstlAdr))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from BranchData2.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_id != null) {
			out.print("\n<Id>");
			out.print(m_id);
			out.print("</Id>\n");
		}
		
		if (m_nm != null) {
			out.print("\n<Nm>");
			out.print(m_nm);
			out.print("</Nm>\n");
		}
		
		if (m_pstlAdr != null) {
			m_pstlAdr.print(out);
		}	
		
	}
}
