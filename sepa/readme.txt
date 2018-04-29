UPDATE: separate versions for 2009 and 2012 versions of SEPA

conf:	
	directory contains ldx-g configuration files
	these files are used to configure what to generate and the packages to generate the code into
	
input: 	
	directory contains XML input samples

pacs, pain, pmnt: 
	output directories created by the ldx-g
		- source code is generated here
		- output from the build process (javadoc, class files, jar files)
	
prop:	
	contains the runtime property files
	- for illustration purposes 2 prop files are given:
	-- pain001a.txt: is correctly configured for processing large pain001 files
	-- pain001b.txt: is deliberately incorrectly configured such that all transactions are kept in memory (parent container) for a very large input file this causes the system to run out of memory

pain001.jar: the executable file
	use: 
		java -jar pain001.jar input/pain.001.big.xml prop/pain001a.prop [optional: schema]
	
	or with console output:	
		java -jar pain001p.jar input/pain.001.big.xml prop/pain001a.prop [optional: schema]
		
	addionally the -Xms java parameter can be used to allocate an increased heap size:	
		java -Xms1024m -jar pain001.jar input/pain.001.big.xml prop/pain001a.prop [optional: schema]
		(but of course this is not always practical)
	
	the tool jconsole can be used to monitor memory consumption by the application:
		http://docs.oracle.com/javase/6/docs/technotes/tools/share/jconsole.html
	notice the flat memory usage of the reader component in conjunction with pain001a	
	
	
	
	



