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

/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* Framework dependencies */
import com.xml2j.xml.core.DataSetter;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.XMLFragmentHandler;
import com.xml2j.xml.parser.ParserTask;


/**
 * GroupHeader55 handler class.
 *
 * @see GroupHeader55
 */
public class GroupHeader55Handler extends XMLFragmentHandler<GroupHeader55> {
	/**
	 * Proxy for GroupHeader55Handler.
	 */
	static class Proxy extends HandlerProxy<GroupHeader55> {
		/**
		 * Allocator for GroupHeader55Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator<GroupHeader55> {			
			public XMLFragmentHandler<GroupHeader55> create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler<?> handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new GroupHeader55Handler(
					task
					, reader
					, handler
					, elementName
					, GroupHeader55.getAllocator()
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
	
	/** Data setter class for Authstn element. */
	private class AuthstnSetter implements DataSetter {
		/** data target. */
		private GroupHeader55Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public AuthstnSetter(GroupHeader55Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setAuthstn((Authorisation1Choice) data);	
		}
	}	
	/** Data setter class for FwdgAgt element. */
	private class FwdgAgtSetter implements DataSetter {
		/** data target. */
		private GroupHeader55Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public FwdgAgtSetter(GroupHeader55Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setFwdgAgt((BranchAndFinancialInstitutionIdentification5) data);	
		}
	}	
	/** Data setter class for InitgPty element. */
	private class InitgPtySetter implements DataSetter {
		/** data target. */
		private GroupHeader55Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public InitgPtySetter(GroupHeader55Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().setInitgPty((PartyIdentification43) data);	
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
	public GroupHeader55Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler<?> parentH
			, String elementName
			, GroupHeader55.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);

		// code for linking children..
		registerHandler(
			new Authorisation1ChoiceHandler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of Authorisation1ChoiceHandler
				, "Authstn" // XML element name
				, doLink("Authstn") // linking to parent
					? new AuthstnSetter(this) // ON
					: null // OFF
				, doProcess("Authstn")) // processing active or not
				);
  
		registerHandler(
			new BranchAndFinancialInstitutionIdentification5Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of BranchAndFinancialInstitutionIdentification5Handler
				, "FwdgAgt" // XML element name
				, doLink("FwdgAgt") // linking to parent
					? new FwdgAgtSetter(this) // ON
					: null // OFF
				, doProcess("FwdgAgt")) // processing active or not
				);
  
		registerHandler(
			new PartyIdentification43Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of PartyIdentification43Handler
				, "InitgPty" // XML element name
				, doLink("InitgPty") // linking to parent
					? new InitgPtySetter(this) // ON
					: null // OFF
				, doProcess("InitgPty")) // processing active or not
				);
  	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public GroupHeader55 getData() {
		return (GroupHeader55)super.getData();
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
		if (localName.equals("CreDtTm")) {
			getData().setCreDtTm(getValue());
			getContents().reset();
		} else if (localName.equals("CtrlSum")) {
			getData().setCtrlSum(getValue());
			getContents().reset();
		} else if (localName.equals("MsgId")) {
			getData().setMsgId(getValue());
			getContents().reset();
		} else if (localName.equals("NbOfTxs")) {
			getData().setNbOfTxs(getValue());
			getContents().reset();
		} else if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		
	}	
}
