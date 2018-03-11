package it.aimconsulting.utility.utli;

import java.io.StringReader;
import org.exolab.castor.xml.Unmarshaller;

import it.aimconsulting.servizi.schema.ADTI.ADTIReport;
import it.aimconsulting.servizi.schema.ADTI.RispostaADTI;

public class LogicaRichiesta {

	public void invocaBilancio(String codFis,String userName, String password) throws Exception {
		InvokeService invoke = new InvokeService();
		String res = invoke.invokeBilancioCatastale(codFis, userName, password);
		
		StringReader reader = new StringReader(res);
		//ADTIReport adtiReport = (ADTIReport) jaxbUnmarshaller.unmarshal(reader);
		RispostaADTI responseAdti = (RispostaADTI) Unmarshaller.unmarshal(RispostaADTI.class, reader);
		String numreport = responseAdti.getIdReport();
		boolean risposto = false;
		@SuppressWarnings("unused")
		int numreq = 0;
		ConvertXML2ADTI convert =  new ConvertXML2ADTI();
		ADTIReport report =  null;
		while(!risposto) {
			numreq++;
			String response = invoke.getReport(numreport,userName, password);
			report = convert.convert(response);
			if(report.getEsito()!=null)
				break;
			Thread.sleep(10000);
				
		}
		System.out.println(report);
	}
		
	
}
