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
 * RemittanceLocation4 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class RemittanceLocation4 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RemittanceLocation4.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RemittanceLocation4(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RemittanceLocation4.
	 */
	static class Allocator implements TypeAllocator<RemittanceLocation4> {
		/**
		 * method for getting a new instance of type RemittanceLocation4.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RemittanceLocation4 newInstance(String elementName, ComplexDataType parent) {
			return new RemittanceLocation4(elementName, parent);
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
	
  	
  
	/** element item for RmtId element. 
	 *  @serial
	 */	
	private String m_rmtId = null;
	
	/** list of RmtLctnDtls element. 
	 *  @serial
	 */	
	private List<RemittanceLocationDetails1> m_rmtLctnDtlsList = new ArrayList<RemittanceLocationDetails1>();
	
	/**
	 * Get the embedded RmtId element.
	 * @return the item.
	 */
	public String getRmtId() {
		return m_rmtId;
	}
		
	/**
	 * This method sets (overwrites) the element RmtId.
	 * @param data the item that needs to be added.
	 */
	void setRmtId(String data) {
		m_rmtId = data;
	}
		
	/**
	 * Get the embedded list of RmtLctnDtls elements.
	 * @return list of items.
	 */
	public List<RemittanceLocationDetails1> getRmtLctnDtlss() {
		return m_rmtLctnDtlsList;
	}
		
	/**
	 * This method adds data to the list of RmtLctnDtls.
	 * @param data the item that needs to be added.
	 */
	void setRmtLctnDtls(RemittanceLocationDetails1 data) {
		m_rmtLctnDtlsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	RemittanceLocation4 t = (RemittanceLocation4)that;
	 
		if (!Compare.equals(m_rmtId, t.m_rmtId))
			return false;
		
		if (!Compare.equals(m_rmtLctnDtlsList, t.m_rmtLctnDtlsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from RemittanceLocation4.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_rmtId != null) {
			out.print("\n<RmtId>");
			out.print(m_rmtId);
			out.print("</RmtId>\n");
		}
		
		if (m_rmtLctnDtlsList != null) {
			for(RemittanceLocationDetails1 l_RmtLctnDtls : m_rmtLctnDtlsList) {
				l_RmtLctnDtls.print(out);
			}
		}	
		
	}
}
