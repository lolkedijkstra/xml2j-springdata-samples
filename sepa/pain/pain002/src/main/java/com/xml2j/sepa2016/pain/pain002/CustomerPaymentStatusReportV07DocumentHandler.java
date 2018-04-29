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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * CustomerPaymentStatusReportV07Document handler class.
 *
 * @see CustomerPaymentStatusReportV07Document
 */
public class CustomerPaymentStatusReportV07DocumentHandler extends XMLFragmentHandler<CustomerPaymentStatusReportV07Document> {
	/**
	 * Proxy for CustomerPaymentStatusReportV07DocumentHandler.
	 */
	static class Proxy extends HandlerProxy<CustomerPaymentStatusReportV07Document> {
		/**
		 * Allocator for CustomerPaymentStatusReportV07DocumentHandler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<CustomerPaymentStatusReportV07Document> {			
			public XMLFragmentHandler<CustomerPaymentStatusReportV07Document> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new CustomerPaymentStatusReportV07DocumentHandler(
					task
					, reader
					, handler
					, elementName
					, CustomerPaymentStatusReportV07Document.getAllocator()
					, setter
					, doProcess);
			}
		}
		
		/**
		 * Constructor for Proxy.
		 *
		 * @param task the XML parser task
		 * @param reader the XML reader
		 * @param parentH the parent XML handler class
		 * @param elementName the name of the XML Element (tag).
		 * @param pSetter the setter for the parent data
		 * @param doProcess indicates whether processing is active for this handler instance
		 */
		public Proxy(ParserTask task, XMLReader reader, XMLFragmentHandler<?> parentH, String elementName,
				DataSetter pSetter, boolean doProcess) {
			super(task, reader, parentH, elementName, pSetter, new Allocator(), doProcess);
		}
	}
	
	/** Data setter class for CstmrPmtStsRpt element. */
	private class CstmrPmtStsRptSetter implements DataSetter {
		/** data target. */
		private CustomerPaymentStatusReportV07DocumentHandler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CstmrPmtStsRptSetter(CustomerPaymentStatusReportV07DocumentHandler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCstmrPmtStsRpt((CustomerPaymentStatusReportV07) data);	
		}
	}


	/**
	 * Constructor for handler class.
	 *
	 * @param reader the XML reader
	 * @param parentH the parent XML handler class
	 * @param elementName the name of the XML Element (tag)
	 * @param allocator the allocator for the data type
	 * @param pSetter the setter for the parent data
	 * @param doProcess indicates whether processing is active for this handler instance
	 */
	public CustomerPaymentStatusReportV07DocumentHandler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, CustomerPaymentStatusReportV07Document.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new CustomerPaymentStatusReportV07Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of CustomerPaymentStatusReportV07Handler
				, "CstmrPmtStsRpt" // XML element name
				, doLink("CstmrPmtStsRpt") // linking to parent
					? new CstmrPmtStsRptSetter(this) // ON
					: null // OFF
				, doProcess("CstmrPmtStsRpt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public CustomerPaymentStatusReportV07Document getData() {
		return (CustomerPaymentStatusReportV07Document)super.getData();
	}




	/**
	 * This method is called by the XML parser on an end of element event.
	 *
	 * If the localName == 'the name of the element that this handler handles' control is
	 * passed back to the parent handler (future events go there) and the data of
	 * the children of this handler is attached to the data associated to this handler.	
	 * 
	 * The data that is collected is connected to the parent data only if a parentDataSetter
	 * if found (getParentDataSetter()).
	 *
	 * If processing is enabled for a handler, the processor is called.
	 */
	@Override
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
