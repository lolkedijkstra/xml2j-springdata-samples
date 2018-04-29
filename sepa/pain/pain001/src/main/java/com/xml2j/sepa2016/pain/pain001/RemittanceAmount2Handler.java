package com.xml2j.sepa2016.pain.pain001;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: PAIN001 
  Generation date: Sun Apr 29 21:09:41 CEST 2018 
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
 * RemittanceAmount2 handler class.
 *
 * @see RemittanceAmount2
 */
public class RemittanceAmount2Handler extends XMLFragmentHandler<RemittanceAmount2> {
	/**
	 * Proxy for RemittanceAmount2Handler.
	 */
	static class Proxy extends HandlerProxy<RemittanceAmount2> {
		/**
		 * Allocator for RemittanceAmount2Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<RemittanceAmount2> {			
			public XMLFragmentHandler<RemittanceAmount2> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new RemittanceAmount2Handler(
					task
					, reader
					, handler
					, elementName
					, RemittanceAmount2.getAllocator()
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
	
	/** Data setter class for AdjstmntAmtAndRsn element. */
	private class AdjstmntAmtAndRsnSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AdjstmntAmtAndRsnSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAdjstmntAmtAndRsn((DocumentAdjustment1) data);	
		}
	}	
	/** Data setter class for CdtNoteAmt element. */
	private class CdtNoteAmtSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public CdtNoteAmtSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setCdtNoteAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for DscntApldAmt element. */
	private class DscntApldAmtSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DscntApldAmtSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDscntApldAmt((DiscountAmountAndType1) data);	
		}
	}	
	/** Data setter class for DuePyblAmt element. */
	private class DuePyblAmtSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public DuePyblAmtSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setDuePyblAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for RmtdAmt element. */
	private class RmtdAmtSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RmtdAmtSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRmtdAmt((ActiveOrHistoricCurrencyAndAmount) data);	
		}
	}	
	/** Data setter class for TaxAmt element. */
	private class TaxAmtSetter implements DataSetter {
		/** data target. */
		private RemittanceAmount2Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TaxAmtSetter(RemittanceAmount2Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTaxAmt((TaxAmountAndType1) data);	
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
	public RemittanceAmount2Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, RemittanceAmount2.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new DocumentAdjustment1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DocumentAdjustment1Handler
				, "AdjstmntAmtAndRsn" // XML element name
				, doLink("AdjstmntAmtAndRsn") // linking to parent
					? new AdjstmntAmtAndRsnSetter(this) // ON
					: null // OFF
				, doProcess("AdjstmntAmtAndRsn")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "CdtNoteAmt" // XML element name
				, doLink("CdtNoteAmt") // linking to parent
					? new CdtNoteAmtSetter(this) // ON
					: null // OFF
				, doProcess("CdtNoteAmt")) // processing active or not
				);
  
		registerHandler(
			new DiscountAmountAndType1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of DiscountAmountAndType1Handler
				, "DscntApldAmt" // XML element name
				, doLink("DscntApldAmt") // linking to parent
					? new DscntApldAmtSetter(this) // ON
					: null // OFF
				, doProcess("DscntApldAmt")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "DuePyblAmt" // XML element name
				, doLink("DuePyblAmt") // linking to parent
					? new DuePyblAmtSetter(this) // ON
					: null // OFF
				, doProcess("DuePyblAmt")) // processing active or not
				);
  
		registerHandler(
			new ActiveOrHistoricCurrencyAndAmountHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of ActiveOrHistoricCurrencyAndAmountHandler
				, "RmtdAmt" // XML element name
				, doLink("RmtdAmt") // linking to parent
					? new RmtdAmtSetter(this) // ON
					: null // OFF
				, doProcess("RmtdAmt")) // processing active or not
				);
  
		registerHandler(
			new TaxAmountAndType1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of TaxAmountAndType1Handler
				, "TaxAmt" // XML element name
				, doLink("TaxAmt") // linking to parent
					? new TaxAmtSetter(this) // ON
					: null // OFF
				, doProcess("TaxAmt")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public RemittanceAmount2 getData() {
		return (RemittanceAmount2)super.getData();
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
