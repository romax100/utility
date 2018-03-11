package it.aimconsulting.utility.utli;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;

import it.aimconsulting.servizi.schema.ADTI.RetrieveADTIReport;
import it.aimconsulting.servizi.schema.ADTI.RichiestaADTI;
import it.aimconsulting.servizi.schema.general.SoggettoRichiesta;
import it.aimconsulting.servizi.schema.general.types.TipoSoggettoType;

public class InvokeService {
	
	public String invokeBilancioCatastale(String codFis,String userName, String password) throws MarshalException, ValidationException {
		
		RichiestaADTI ricADTI =  new RichiestaADTI();
		ricADTI.setUsername(userName);
		ricADTI.setPassword(password);
		ricADTI.setServizio("CAT2");
		ricADTI.setServizioBilancioCatastale(it.aimconsulting.servizi.schema.general.types.FlagType.SI);
		ricADTI.setServizioOmi(it.aimconsulting.servizi.schema.general.types.FlagType.SI);
		SoggettoRichiesta soggetto =  new SoggettoRichiesta();
		soggetto.setCodiceFiscale(codFis);
		soggetto.setTipo(TipoSoggettoType.F);
		ricADTI.setSoggettoRichiesta(soggetto);
		PostRequest post =  new PostRequest();
		StringWriter outputWriter = new StringWriter();

		Marshaller.marshal(ricADTI, outputWriter);
		String requestADTIStr = outputWriter.toString();
		System.out.println("Richiesta: "+requestADTIStr);
		List<NameValuePair> urlParameters = new ArrayList();
		urlParameters.add(new BasicNameValuePair(Costants.richiestaADTI, requestADTIStr));
		String res = post.postRequest(Costants.urlLocal, urlParameters);
		System.out.println("Response: "+res);
		return res;
		
	}

	
	public String getReport(String idReport,String userName, String password) throws MarshalException, ValidationException {
		RetrieveADTIReport retrieveReport =  new RetrieveADTIReport();
		retrieveReport.setPassword(password);
		retrieveReport.setUsername(userName);
		retrieveReport.setIdReport(idReport);
		StringWriter outputWriter = new StringWriter();
		Marshaller.marshal(retrieveReport, outputWriter);
		String retrieveReportStr = outputWriter.toString();
		PostRequest post =  new PostRequest();
		List<NameValuePair> urlParameters = new ArrayList();
		urlParameters.add(new BasicNameValuePair(Costants.richiestaReportADTI, retrieveReportStr));
		String res = post.postRequest(Costants.urlLocal, urlParameters);
		System.out.println("Response: "+res);
		return res;
	}
}
