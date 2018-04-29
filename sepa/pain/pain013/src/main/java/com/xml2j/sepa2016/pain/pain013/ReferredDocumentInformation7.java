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
 * ReferredDocumentInformation7 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class ReferredDocumentInformation7 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for ReferredDocumentInformation7.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public ReferredDocumentInformation7(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type ReferredDocumentInformation7.
	 */
	static class Allocator implements TypeAllocator<ReferredDocumentInformation7> {
		/**
		 * method for getting a new instance of type ReferredDocumentInformation7.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public ReferredDocumentInformation7 newInstance(String elementName, ComplexDataType parent) {
			return new ReferredDocumentInformation7(elementName, parent);
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
	
  	
  
	/** element item for Tp element. 
	 *  @serial
	 */	
	private ReferredDocumentType4 m_tp = null;
	
	/** element item for Nb element. 
	 *  @serial
	 */	
	private String m_nb = null;
	
	/** element item for RltdDt element. 
	 *  @serial
	 */	
	private String m_rltdDt = null;
	
	/** list of LineDtls element. 
	 *  @serial
	 */	
	private List<DocumentLineInformation1> m_lineDtlsList = new ArrayList<DocumentLineInformation1>();
	
	/**
	 * Get the embedded Tp element.
	 * @return the item.
	 */
	public ReferredDocumentType4 getTp() {
		return m_tp;
	}
		
	/**
	 * This method sets (overwrites) the element Tp.
	 * @param data the item that needs to be added.
	 */
	void setTp(ReferredDocumentType4 data) {
		m_tp = data;
	}
		
	/**
	 * Get the embedded Nb element.
	 * @return the item.
	 */
	public String getNb() {
		return m_nb;
	}
		
	/**
	 * This method sets (overwrites) the element Nb.
	 * @param data the item that needs to be added.
	 */
	void setNb(String data) {
		m_nb = data;
	}
		
	/**
	 * Get the embedded RltdDt element.
	 * @return the item.
	 */
	public String getRltdDt() {
		return m_rltdDt;
	}
		
	/**
	 * This method sets (overwrites) the element RltdDt.
	 * @param data the item that needs to be added.
	 */
	void setRltdDt(String data) {
		m_rltdDt = data;
	}
		
	/**
	 * Get the embedded list of LineDtls elements.
	 * @return list of items.
	 */
	public List<DocumentLineInformation1> getLineDtlss() {
		return m_lineDtlsList;
	}
		
	/**
	 * This method adds data to the list of LineDtls.
	 * @param data the item that needs to be added.
	 */
	void setLineDtls(DocumentLineInformation1 data) {
		m_lineDtlsList.add(data);
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	ReferredDocumentInformation7 t = (ReferredDocumentInformation7)that;
	 
		if (!Compare.equals(m_tp, t.m_tp))
			return false;
		
		if (!Compare.equals(m_nb, t.m_nb))
			return false;
		
		if (!Compare.equals(m_rltdDt, t.m_rltdDt))
			return false;
		
		if (!Compare.equals(m_lineDtlsList, t.m_lineDtlsList))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from ReferredDocumentInformation7.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_tp != null) {
			m_tp.print(out);
		}	
		
		if (m_nb != null) {
			out.print("\n<Nb>");
			out.print(m_nb);
			out.print("</Nb>\n");
		}
		
		if (m_rltdDt != null) {
			out.print("\n<RltdDt>");
			out.print(m_rltdDt);
			out.print("</RltdDt>\n");
		}
		
		if (m_lineDtlsList != null) {
			for(DocumentLineInformation1 l_LineDtls : m_lineDtlsList) {
				l_LineDtls.print(out);
			}
		}	
		
	}
}
