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

import java.util.List;
import java.util.ArrayList;

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * RegulatoryReporting3 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class RegulatoryReporting3 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for RegulatoryReporting3.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public RegulatoryReporting3(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type RegulatoryReporting3.
	 */
	static class Allocator implements TypeAllocator<RegulatoryReporting3> {
		/**
		 * method for getting a new instance of type RegulatoryReporting3.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public RegulatoryReporting3 newInstance(String elementName, ComplexDataType parent) {
			return new RegulatoryReporting3(elementName, parent);
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
	
  	
  
	/** element item for DbtCdtRptgInd element. 
	 *  @serial
	 */	
	private String m_dbtCdtRptgInd = null;
	
	/** element item for Authrty element. 
	 *  @serial
	 */	
	private RegulatoryAuthority2 m_authrty = null;
	
	/** list of Dtls element. 
	 *  @serial
	 */	
	private List<StructuredRegulatoryReporting3> m_dtlsList = new ArrayList<StructuredRegulatoryReporting3>();
	
	/**
	 * Get the embedded DbtCdtRptgInd element.
	 * @return the item.
	 */
	public String getDbtCdtRptgInd() {
		return m_dbtCdtRptgInd;
	}
		
	/**
	 * This method sets (overwrites) the element DbtCdtRptgInd.
	 * @param data the item that needs to be added.
	 */
	void setDbtCdtRptgInd(String data) {
		m_dbtCdtRptgInd = data;
	}
		
	/**
	 * Get the embedded Authrty element.
	 * @return the item.
	 */
	public RegulatoryAuthority2 getAuthrty() {
		return m_authrty;
	}
		
	/**
	 * This method sets (overwrites) the element Authrty.
	 * @param data the item that needs to be added.
	 */
	void setAuthrty(RegulatoryAuthority2 data) {
		m_authrty = data;
	}
		
	/**
	 * Get the embedded list of Dtls elements.
	 * @return list of items.
	 */
	public List<StructuredRegulatoryReporting3> getDtlss() {
		return m_dtlsList;
	}
		
	/**
	 * This method adds data to the list of Dtls.
	 * @param data the item that needs to be added.
	 */
	void setDtls(StructuredRegulatoryReporting3 data) {
		m_dtlsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	RegulatoryReporting3 t = (RegulatoryReporting3)that;
	 
		if (!Compare.equals(m_dbtCdtRptgInd, t.m_dbtCdtRptgInd))
			return false;
		
		if (!Compare.equals(m_authrty, t.m_authrty))
			return false;
		
		if (!Compare.equals(m_dtlsList, t.m_dtlsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from RegulatoryReporting3.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_dbtCdtRptgInd != null) {
			out.print("\n<DbtCdtRptgInd>");
			out.print(m_dbtCdtRptgInd);
			out.print("</DbtCdtRptgInd>\n");
		}
		
		if (m_authrty != null) {
			m_authrty.print(out);
		}	
		
		if (m_dtlsList != null) {
			for(StructuredRegulatoryReporting3 l_Dtls : m_dtlsList) {
				l_Dtls.print(out);
			}
		}	
		
	}
}
