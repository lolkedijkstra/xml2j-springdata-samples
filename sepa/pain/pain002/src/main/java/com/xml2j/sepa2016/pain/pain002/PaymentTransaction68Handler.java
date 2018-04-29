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
 * PaymentTransaction68 handler class.
 *
 * @see PaymentTransaction68
 */
public class PaymentTransaction68Handler extends XMLFragmentHandler<PaymentTransaction68> {
	/**
	 * Proxy for PaymentTransaction68Handler.
	 */
	static class Proxy extends HandlerProxy<PaymentTransaction68> {
		/**
		 * Allocator for PaymentTransaction68Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<PaymentTransaction68> {			
			public XMLFragmentHandler<PaymentTransaction68> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new PaymentTransaction68Handler(
					task
					, reader
					, handler
					, elementName
					, PaymentTransaction68.getAllocator()
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
	
	/** Data setter class for ChrgsInf element. */
	private class ChrgsInfSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction68Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public ChrgsInfSetter(PaymentTransaction68Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setChrgsInf((Charges2) data);	
		}
	}	
	/** Data setter class for OrgnlTxRef element. */
	private class OrgnlTxRefSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction68Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public OrgnlTxRefSetter(PaymentTransaction68Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setOrgnlTxRef((OriginalTransactionReference22) data);	
		}
	}	
	/** Data setter class for SplmtryData element. */
	private class SplmtryDataSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction68Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public SplmtryDataSetter(PaymentTransaction68Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setSplmtryData((SupplementaryData1) data);	
		}
	}	
	/** Data setter class for StsRsnInf element. */
	private class StsRsnInfSetter implements DataSetter {
		/** data target. */
		private PaymentTransaction68Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public StsRsnInfSetter(PaymentTransaction68Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setStsRsnInf((StatusReasonInformation9) data);	
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
	public PaymentTransaction68Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, PaymentTransaction68.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new Charges2Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Charges2Handler
				, "ChrgsInf" // XML element name
				, doLink("ChrgsInf") // linking to parent
					? new ChrgsInfSetter(this) // ON
					: null // OFF
				, doProcess("ChrgsInf")) // processing active or not
				);
  
		registerHandler(
			new OriginalTransactionReference22Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of OriginalTransactionReference22Handler
				, "OrgnlTxRef" // XML element name
				, doLink("OrgnlTxRef") // linking to parent
					? new OrgnlTxRefSetter(this) // ON
					: null // OFF
				, doProcess("OrgnlTxRef")) // processing active or not
				);
  
		registerHandler(
			new SupplementaryData1Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of SupplementaryData1Handler
				, "SplmtryData" // XML element name
				, doLink("SplmtryData") // linking to parent
					? new SplmtryDataSetter(this) // ON
					: null // OFF
				, doProcess("SplmtryData")) // processing active or not
				);
  
		registerHandler(
			new StatusReasonInformation9Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of StatusReasonInformation9Handler
				, "StsRsnInf" // XML element name
				, doLink("StsRsnInf") // linking to parent
					? new StsRsnInfSetter(this) // ON
					: null // OFF
				, doProcess("StsRsnInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public PaymentTransaction68 getData() {
		return (PaymentTransaction68)super.getData();
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
		
		// collect data from children..
		if (localName.equals("AccptncDtTm")) {
			getData().setAccptncDtTm(getValue());
			getContents().reset();
		} else if (localName.equals("AcctSvcrRef")) {
			getData().setAcctSvcrRef(getValue());
			getContents().reset();
		} else if (localName.equals("ClrSysRef")) {
			getData().setClrSysRef(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlEndToEndId")) {
			getData().setOrgnlEndToEndId(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlInstrId")) {
			getData().setOrgnlInstrId(getValue());
			getContents().reset();
		} else if (localName.equals("StsId")) {
			getData().setStsId(getValue());
			getContents().reset();
		} else if (localName.equals("TxSts")) {
			getData().setTxSts(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
