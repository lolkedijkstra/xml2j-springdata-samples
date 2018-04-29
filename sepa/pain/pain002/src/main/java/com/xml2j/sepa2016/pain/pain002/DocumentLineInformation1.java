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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * DocumentLineInformation1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class DocumentLineInformation1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DocumentLineInformation1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public DocumentLineInformation1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type DocumentLineInformation1.
	 */
	static class Allocator implements TypeAllocator<DocumentLineInformation1> {
		/**
		 * method for getting a new instance of type DocumentLineInformation1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public DocumentLineInformation1 newInstance(String elementName, ComplexDataType parent) {
			return new DocumentLineInformation1(elementName, parent);
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
	
  	
  
	/** list of Id element. 
	 *  @serial
	 */	
	private List<DocumentLineIdentification1> m_idList = new ArrayList<DocumentLineIdentification1>();
	
	/** element item for Desc element. 
	 *  @serial
	 */	
	private String m_desc = null;
	
	/** element item for Amt element. 
	 *  @serial
	 */	
	private RemittanceAmount3 m_amt = null;
	
	/**
	 * Get the embedded list of Id elements.
	 * @return list of items.
	 */
	public List<DocumentLineIdentification1> getIds() {
		return m_idList;
	}
		
	/**
	 * This method adds data to the list of Id.
	 * @param data the item that needs to be added.
	 */
	void setId(DocumentLineIdentification1 data) {
		m_idList.add(data);
	}
		
	/**
	 * Get the embedded Desc element.
	 * @return the item.
	 */
	public String getDesc() {
		return m_desc;
	}
		
	/**
	 * This method sets (overwrites) the element Desc.
	 * @param data the item that needs to be added.
	 */
	void setDesc(String data) {
		m_desc = data;
	}
		
	/**
	 * Get the embedded Amt element.
	 * @return the item.
	 */
	public RemittanceAmount3 getAmt() {
		return m_amt;
	}
		
	/**
	 * This method sets (overwrites) the element Amt.
	 * @param data the item that needs to be added.
	 */
	void setAmt(RemittanceAmount3 data) {
		m_amt = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	DocumentLineInformation1 t = (DocumentLineInformation1)that;
	 
		if (!Compare.equals(m_idList, t.m_idList))
			return false;
		
		if (!Compare.equals(m_desc, t.m_desc))
			return false;
		
		if (!Compare.equals(m_amt, t.m_amt))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from DocumentLineInformation1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_idList != null) {
			for(DocumentLineIdentification1 l_Id : m_idList) {
				l_Id.print(out);
			}
		}	
		
		if (m_desc != null) {
			out.print("\n<Desc>");
			out.print(m_desc);
			out.print("</Desc>\n");
		}
		
		if (m_amt != null) {
			m_amt.print(out);
		}	
		
	}
}
