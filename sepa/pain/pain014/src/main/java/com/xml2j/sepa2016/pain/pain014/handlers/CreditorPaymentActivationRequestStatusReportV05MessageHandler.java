package com.xml2j.sepa2016.pain.pain014.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN014 
  Generation date: Sun Apr 29 21:09:44 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.sepa2016.pain.pain014.CreditorPaymentActivationRequestStatusReportV05Document;
import com.xml2j.sepa2016.pain.pain014.CreditorPaymentActivationRequestStatusReportV05DocumentHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class CreditorPaymentActivationRequestStatusReportV05MessageHandler extends
		XMLMessageHandler<CreditorPaymentActivationRequestStatusReportV05Document> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "Document";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public CreditorPaymentActivationRequestStatusReportV05MessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new CreditorPaymentActivationRequestStatusReportV05DocumentHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, CreditorPaymentActivationRequestStatusReportV05Document.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

