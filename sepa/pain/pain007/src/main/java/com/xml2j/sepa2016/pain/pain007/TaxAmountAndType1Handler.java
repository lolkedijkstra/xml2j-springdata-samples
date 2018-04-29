package com.xml2j.sepa2016.pain.pain007;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN007 
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
 * TaxAmountAndType1 handler class.
 *
 * @see TaxAmountAndType1
 */
public class TaxAmountAndType1Handler extends XMLFragmentHandler<TaxAmountAndType1> {
	/**
	 * Proxy for TaxAmountAndType1Handler.
	 */
	static class Proxy extends HandlerProxy<TaxAmountAndType1> {
		/**
		 * Allocator for TaxAmountAndType1Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<TaxAmountAndType1> {			
			public XMLFragmentHandler<TaxAmountAndType1> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new TaxAmountAndType1Handler(
					task
					, reader
					, handler
					, elementName
					, TaxAmountAndType1.getAllocator()
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
	
	/** Data setter class for Amt element. */
	private class AmtSetter implements DataSetter {
		/** data target. */
		private TaxAmountAndType1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AmtSetter(TaxAmountAndType1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for Tp element. */
	private class TpSetter implements DataSetter {
		/** data target. */
		private TaxAmountAndType1Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TpSetter(TaxAmountAndType1Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTp((TaxAmountType1Choice) data);	
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
	public TaxAmountAndType1Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, TaxAmountAndType1.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "Amt" // XML element name
				, doLink("Amt") // linking to parent
					? new AmtSetter(this) // ON
					: null // OFF
				, doProcess("Amt")) // processing active or not
				);
  
		registerHandler(
			new TaxAmountType1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxAmountType1ChoiceHandler
				, "Tp" // XML element name
				, doLink("Tp") // linking to parent
					? new TpSetter(this) // ON
					: null // OFF
				, doProcess("Tp")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public TaxAmountAndType1 getData() {
		return (TaxAmountAndType1)super.getData();
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
