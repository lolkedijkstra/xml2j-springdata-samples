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

import com.xml2j.util.Compare;

import com.xml2j.xml.core.ComplexDataType;

import com.xml2j.xml.core.TypeAllocator;



/**
 * InstructionForCreditorAgent1 data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * 
 */
public class InstructionForCreditorAgent1 extends ComplexDataType {

	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for InstructionForCreditorAgent1.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public InstructionForCreditorAgent1(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type InstructionForCreditorAgent1.
	 */
	static class Allocator implements TypeAllocator<InstructionForCreditorAgent1> {
		/**
		 * method for getting a new instance of type InstructionForCreditorAgent1.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		public InstructionForCreditorAgent1 newInstance(String elementName, ComplexDataType parent) {
			return new InstructionForCreditorAgent1(elementName, parent);
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
	
  	
  
	/** element item for Cd element. 
	 *  @serial
	 */	
	private String m_cd = null;
	
	/** element item for InstrInf element. 
	 *  @serial
	 */	
	private String m_instrInf = null;
	
	/**
	 * Get the embedded Cd element.
	 * @return the item.
	 */
	public String getCd() {
		return m_cd;
	}
		
	/**
	 * This method sets (overwrites) the element Cd.
	 * @param data the item that needs to be added.
	 */
	void setCd(String data) {
		m_cd = data;
	}
		
	/**
	 * Get the embedded InstrInf element.
	 * @return the item.
	 */
	public String getInstrInf() {
		return m_instrInf;
	}
		
	/**
	 * This method sets (overwrites) the element InstrInf.
	 * @param data the item that needs to be added.
	 */
	void setInstrInf(String data) {
		m_instrInf = data;
	}
		
  
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 	InstructionForCreditorAgent1 t = (InstructionForCreditorAgent1)that;
	 
		if (!Compare.equals(m_cd, t.m_cd))
			return false;
		
		if (!Compare.equals(m_instrInf, t.m_instrInf))
			return false;
		
		return true;
	}	

  
  
  
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from InstructionForCreditorAgent1.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  
		if (m_cd != null) {
			out.print("\n<Cd>");
			out.print(m_cd);
			out.print("</Cd>\n");
		}
		
		if (m_instrInf != null) {
			out.print("\n<InstrInf>");
			out.print(m_instrInf);
			out.print("</InstrInf>\n");
		}
		
	}
}
