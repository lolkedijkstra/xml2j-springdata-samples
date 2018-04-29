package com.xml2j.discogs.artists.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: ARTISTS 
  Generation date: Sun Apr 29 15:17:38 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.discogs.artists.Artists;
import com.xml2j.discogs.artists.ArtistsHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ArtistsMessageHandler extends
		XMLMessageHandler<Artists> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "artists";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public ArtistsMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ArtistsHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, Artists.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

