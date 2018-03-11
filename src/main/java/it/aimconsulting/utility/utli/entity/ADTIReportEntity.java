package it.aimconsulting.utility.utli.entity;

import javax.persistence.Entity;

/**
 * Report servizio ADTI. In base al servizio richiesto l'elemento
 * contiene dati di conservatoria o di catasto
 *  
 * 
 * @version $Revision$ $Date$
 */

@Entity
@SuppressWarnings("serial")
public class ADTIReportEntity extends it.aimconsulting.servizi.schema.general.Modulo 
implements java.io.Serializable
{

	

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _idReport.
     */
    private java.lang.String _idReport;

    /**
     * Field _score.
     */
    private java.lang.String _score;

    /**
     * Costo del servizio sostenuto presso il sito dell'agenzia
     * delle entrate
     */
    private float _costoIspezione;

    /**
     * keeps track of state for field: _costoIspezione
     */
    private boolean _has_costoIspezione;

    /**
     * Field _time.
     */
    private it.aimconsulting.servizi.schema.general.Time _time;

    /**
     * informazioni della richiesta del servizio.
     *  E'
     *  obbligatorio specificare almeno il comune o la
     * conservatoria
     *  
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.InfoRichiesta _infoRichiesta;

    /**
     * elemento root del modulo visura Catastale
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "X" (indagine conclusa con esito Incerto, cioe' non sono
     * state recuperate informazioni, 
     *  ma in base alla tipologia di servizio e' come aver ottenuto
     * un esito positivo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.VisuraCatastale _visuraCatastale;

    /**
     * elemento root del modulo ispezioni in conservatoria
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.IspezioneConservatoria _ispezioneConservatoria;

    /**
     * elemento root del modulo lista Soggetti
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio.
     *  Descrizione dell'evento che ha dato valore all'esito.
     *  - Stato. Assume i seguenti valori: 
     *  "C" Elaborazione completata con successo, 
     *  "E" Errore Elaborazione.
     *  
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.ListaSoggetti _listaSoggetti;

    /**
     * Riepilogo dei Fogli Catastali 
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.ElencofogliCatastali _elencofogliCatastali;

    /**
     * Nel caso di servizi multipli (esempio Catasto + Tavolare)
     * viene riportato
     *  il dettaglio delle singole richieste
     *  
     */
    private it.aimconsulting.servizi.schema.visuraCatasto.DettaglioIspezioni _dettaglioIspezioni;


      //----------------/
     //- Constructors -/
    //----------------/




      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteCostoIspezione(
    ) {
        this._has_costoIspezione= false;
    }

    /**
     * Returns the value of field 'costoIspezione'. The field
     * 'costoIspezione' has the following description: Costo del
     * servizio sostenuto presso il sito dell'agenzia delle entrate
     * 
     * @return the value of field 'CostoIspezione'.
     */
    public float getCostoIspezione(
    ) {
        return this._costoIspezione;
    }

    /**
     * Returns the value of field 'dettaglioIspezioni'. The field
     * 'dettaglioIspezioni' has the following description: Nel caso
     * di servizi multipli (esempio Catasto + Tavolare) viene
     * riportato
     *  il dettaglio delle singole richieste
     *  
     * 
     * @return the value of field 'DettaglioIspezioni'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.DettaglioIspezioni getDettaglioIspezioni(
    ) {
        return this._dettaglioIspezioni;
    }

    /**
     * Returns the value of field 'elencofogliCatastali'. The field
     * 'elencofogliCatastali' has the following description:
     * Riepilogo dei Fogli Catastali 
     * 
     * @return the value of field 'ElencofogliCatastali'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.ElencofogliCatastali getElencofogliCatastali(
    ) {
        return this._elencofogliCatastali;
    }

    /**
     * Returns the value of field 'idReport'.
     * 
     * @return the value of field 'IdReport'.
     */
    public java.lang.String getIdReport(
    ) {
        return this._idReport;
    }

    /**
     * Returns the value of field 'infoRichiesta'. The field
     * 'infoRichiesta' has the following description: informazioni
     * della richiesta del servizio.
     *  E'
     *  obbligatorio specificare almeno il comune o la
     * conservatoria
     *  
     * 
     * @return the value of field 'InfoRichiesta'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.InfoRichiesta getInfoRichiesta(
    ) {
        return this._infoRichiesta;
    }

    /**
     * Returns the value of field 'ispezioneConservatoria'. The
     * field 'ispezioneConservatoria' has the following
     * description: elemento root del modulo ispezioni in
     * conservatoria
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     * 
     * @return the value of field 'IspezioneConservatoria'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.IspezioneConservatoria getIspezioneConservatoria(
    ) {
        return this._ispezioneConservatoria;
    }

    /**
     * Returns the value of field 'listaSoggetti'. The field
     * 'listaSoggetti' has the following description: elemento root
     * del modulo lista Soggetti
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio.
     *  Descrizione dell'evento che ha dato valore all'esito.
     *  - Stato. Assume i seguenti valori: 
     *  "C" Elaborazione completata con successo, 
     *  "E" Errore Elaborazione.
     *  
     * 
     * @return the value of field 'ListaSoggetti'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.ListaSoggetti getListaSoggetti(
    ) {
        return this._listaSoggetti;
    }

    /**
     * Returns the value of field 'score'.
     * 
     * @return the value of field 'Score'.
     */
    public java.lang.String getScore(
    ) {
        return this._score;
    }

    /**
     * Returns the value of field 'time'.
     * 
     * @return the value of field 'Time'.
     */
    public it.aimconsulting.servizi.schema.general.Time getTime(
    ) {
        return this._time;
    }

    /**
     * Returns the value of field 'visuraCatastale'. The field
     * 'visuraCatastale' has the following description: elemento
     * root del modulo visura Catastale
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "X" (indagine conclusa con esito Incerto, cioe' non sono
     * state recuperate informazioni, 
     *  ma in base alla tipologia di servizio e' come aver ottenuto
     * un esito positivo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     * 
     * @return the value of field 'VisuraCatastale'.
     */
    public it.aimconsulting.servizi.schema.visuraCatasto.VisuraCatastale getVisuraCatastale(
    ) {
        return this._visuraCatastale;
    }

    /**
     * Method hasCostoIspezione.
     * 
     * @return true if at least one CostoIspezione has been added
     */
    public boolean hasCostoIspezione(
    ) {
        return this._has_costoIspezione;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'costoIspezione'. The field
     * 'costoIspezione' has the following description: Costo del
     * servizio sostenuto presso il sito dell'agenzia delle entrate
     * 
     * @param costoIspezione the value of field 'costoIspezione'.
     */
    public void setCostoIspezione(
            final float costoIspezione) {
        this._costoIspezione = costoIspezione;
        this._has_costoIspezione = true;
    }

    /**
     * Sets the value of field 'dettaglioIspezioni'. The field
     * 'dettaglioIspezioni' has the following description: Nel caso
     * di servizi multipli (esempio Catasto + Tavolare) viene
     * riportato
     *  il dettaglio delle singole richieste
     *  
     * 
     * @param dettaglioIspezioni the value of field
     * 'dettaglioIspezioni'.
     */
    public void setDettaglioIspezioni(
            final it.aimconsulting.servizi.schema.visuraCatasto.DettaglioIspezioni dettaglioIspezioni) {
        this._dettaglioIspezioni = dettaglioIspezioni;
    }

    /**
     * Sets the value of field 'elencofogliCatastali'. The field
     * 'elencofogliCatastali' has the following description:
     * Riepilogo dei Fogli Catastali 
     * 
     * @param elencofogliCatastali the value of field
     * 'elencofogliCatastali'.
     */
    public void setElencofogliCatastali(
            final it.aimconsulting.servizi.schema.visuraCatasto.ElencofogliCatastali elencofogliCatastali) {
        this._elencofogliCatastali = elencofogliCatastali;
    }

    /**
     * Sets the value of field 'idReport'.
     * 
     * @param idReport the value of field 'idReport'.
     */
    public void setIdReport(
            final java.lang.String idReport) {
        this._idReport = idReport;
    }

    /**
     * Sets the value of field 'infoRichiesta'. The field
     * 'infoRichiesta' has the following description: informazioni
     * della richiesta del servizio.
     *  E'
     *  obbligatorio specificare almeno il comune o la
     * conservatoria
     *  
     * 
     * @param infoRichiesta the value of field 'infoRichiesta'.
     */
    public void setInfoRichiesta(
            final it.aimconsulting.servizi.schema.visuraCatasto.InfoRichiesta infoRichiesta) {
        this._infoRichiesta = infoRichiesta;
    }

    /**
     * Sets the value of field 'ispezioneConservatoria'. The field
     * 'ispezioneConservatoria' has the following description:
     * elemento root del modulo ispezioni in conservatoria
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     * 
     * @param ispezioneConservatoria the value of field
     * 'ispezioneConservatoria'.
     */
    public void setIspezioneConservatoria(
            final it.aimconsulting.servizi.schema.visuraCatasto.IspezioneConservatoria ispezioneConservatoria) {
        this._ispezioneConservatoria = ispezioneConservatoria;
    }

    /**
     * Sets the value of field 'listaSoggetti'. The field
     * 'listaSoggetti' has the following description: elemento root
     * del modulo lista Soggetti
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio.
     *  Descrizione dell'evento che ha dato valore all'esito.
     *  - Stato. Assume i seguenti valori: 
     *  "C" Elaborazione completata con successo, 
     *  "E" Errore Elaborazione.
     *  
     * 
     * @param listaSoggetti the value of field 'listaSoggetti'.
     */
    public void setListaSoggetti(
            final it.aimconsulting.servizi.schema.visuraCatasto.ListaSoggetti listaSoggetti) {
        this._listaSoggetti = listaSoggetti;
    }

    /**
     * Sets the value of field 'score'.
     * 
     * @param score the value of field 'score'.
     */
    public void setScore(
            final java.lang.String score) {
        this._score = score;
    }

    /**
     * Sets the value of field 'time'.
     * 
     * @param time the value of field 'time'.
     */
    public void setTime(
            final it.aimconsulting.servizi.schema.general.Time time) {
        this._time = time;
    }

    /**
     * Sets the value of field 'visuraCatastale'. The field
     * 'visuraCatastale' has the following description: elemento
     * root del modulo visura Catastale
     *  Eredita gli attributi dei tipo modulo:
     *  - Esito. Assume i seguenti valori: 
     *  "P" (indagine conclusa con esito Positivo), 
     *  "N" (indagine conclusa con esito Negativo), 
     *  "X" (indagine conclusa con esito Incerto, cioe' non sono
     * state recuperate informazioni, 
     *  ma in base alla tipologia di servizio e' come aver ottenuto
     * un esito positivo), 
     *  "E" (indagine conclusa in errore)
     *  - Messaggio. Descrizione dell'evento che ha dato valore
     * all'esito.
     *  - Stato. Assume i seguenti valori: "C" Elaborazione
     * completata con successo, "E" Errore Elaborazione.
     *  - il tag tipoVisura assume valori S o I, se visura per
     * Soggetto o visura per Immobile
     *  
     * 
     * @param visuraCatastale the value of field 'visuraCatastale'.
     */
    public void setVisuraCatastale(
            final it.aimconsulting.servizi.schema.visuraCatasto.VisuraCatastale visuraCatastale) {
        this._visuraCatastale = visuraCatastale;
    }

    /**
     * Method unmarshalADTIReport.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * it.aimconsulting.servizi.schema.ADTI.ADTIReport
     */
    public static it.aimconsulting.servizi.schema.ADTI.ADTIReport unmarshalADTIReport(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (it.aimconsulting.servizi.schema.ADTI.ADTIReport) org.exolab.castor.xml.Unmarshaller.unmarshal(it.aimconsulting.servizi.schema.ADTI.ADTIReport.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}

