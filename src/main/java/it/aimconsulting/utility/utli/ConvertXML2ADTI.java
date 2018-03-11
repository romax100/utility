package it.aimconsulting.utility.utli;


import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;



import org.apache.commons.io.IOUtils;
import org.exolab.castor.xml.Unmarshaller;

import it.aimconsulting.servizi.schema.ADTI.ADTIReport;



public class ConvertXML2ADTI {

	public ADTIReport convert(String input) throws Exception {
	try {

		
		//JAXBContext jaxbContext = JAXBContext.newInstance(ADTIReport.class);

		//Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		StringReader reader = new StringReader(input);
		//ADTIReport adtiReport = (ADTIReport) jaxbUnmarshaller.unmarshal(reader);
		ADTIReport adtiReport = (ADTIReport) Unmarshaller.unmarshal(ADTIReport.class, reader);
		System.out.println(adtiReport);
		return adtiReport;

	  } catch (Exception e) {
		e.printStackTrace();
		throw e;
	  }
	}
	
	public ADTIReport convertFromFile(String input) throws  Exception {
		InputStream in = this.getClass().getResourceAsStream(input);
		String result =IOUtils.toString(in,StandardCharsets.UTF_8.toString());
		return convert(result);
	}
	
	
	
}
