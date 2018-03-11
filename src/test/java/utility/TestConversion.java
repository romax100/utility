package utility;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import it.aimconsulting.utility.utli.ConvertXML2ADTI;

public class TestConversion {

	@Test
	public void testConvertFromFile() {
		String file = "/xml/CRLGDU40S09E041G-2.xml";
		ConvertXML2ADTI convert =  new ConvertXML2ADTI();
		try {
			convert.convertFromFile(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
