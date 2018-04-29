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
 * OriginalPaymentInstruction16 handler class.
 *
 * @see OriginalPaymentInstruction16
 */
public class OriginalPaymentInstruction16Handler extends XMLFragmentHandler<OriginalPaymentInstruction16> {
	/**
	 * Proxy for OriginalPaymentInstruction16Handler.
	 */
	static class Proxy extends HandlerProxy<OriginalPaymentInstruction16> {
		/**
		 * Allocator for OriginalPaymentInstruction16Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<OriginalPaymentInstruction16> {			
			public XMLFragmentHandler<OriginalPaymentInstruction16> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new OriginalPaymentInstruction16Handler(
					task
					, reader
					, handler
					, elementName
					, OriginalPaymentInstruction16.getAllocator()
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
	
	/** Data setter class for RvslRsnInf element. */
	private class RvslRsnInfSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction16Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public RvslRsnInfSetter(OriginalPaymentInstruction16Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setRvslRsnInf((PaymentReversalReason7) data);	
		}
	}	
	/** Data setter class for TxInf element. */
	private class TxInfSetter implements DataSetter {
		/** data target. */
		private OriginalPaymentInstruction16Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public TxInfSetter(OriginalPaymentInstruction16Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setTxInf((PaymentTransaction64) data);	
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
	public OriginalPaymentInstruction16Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, OriginalPaymentInstruction16.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new PaymentReversalReason7Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentReversalReason7Handler
				, "RvslRsnInf" // XML element name
				, doLink("RvslRsnInf") // linking to parent
					? new RvslRsnInfSetter(this) // ON
					: null // OFF
				, doProcess("RvslRsnInf")) // processing active or not
				);
  
		registerHandler(
			new PaymentTransaction64Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PaymentTransaction64Handler
				, "TxInf" // XML element name
				, doLink("TxInf") // linking to parent
					? new TxInfSetter(this) // ON
					: null // OFF
				, doProcess("TxInf")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public OriginalPaymentInstruction16 getData() {
		return (OriginalPaymentInstruction16)super.getData();
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
		if (localName.equals("BtchBookg")) {
			getData().setBtchBookg(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlCtrlSum")) {
			getData().setOrgnlCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlNbOfTxs")) {
			getData().setOrgnlNbOfTxs(getValue());
			getContents().reset();
		} else if (localName.equals("OrgnlPmtInfId")) {
			getData().setOrgnlPmtInfId(getValue());
			getContents().reset();
		} else if (localName.equals("PmtInfRvsl")) {
			getData().setPmtInfRvsl(getValue());
			getContents().reset();
		} else if (localName.equals("RvslPmtInfId")) {
			getData().setRvslPmtInfId(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
