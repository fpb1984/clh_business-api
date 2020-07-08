package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "DATOS_XML_SIAGF2" database table.
 * 
 */
@Entity
@Table(name="\"DATOS_XML_SIAGF2\"")
@NamedQuery(name="DatosXmlSiagf2.findAll", query="SELECT d FROM DatosXmlSiagf2 d")
public class DatosXmlSiagf2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String acteco;

	@Column(name="cod_estado_siagf")
	private Integer codEstadoSiagf;

	private String codentidadadm;

	private String codtipobeneficio;

	private String codtipocausante;

	private String comunabeneficiario;

	private String comunacausante;

	private String comunaempleador;

	private String fechaemision;

	private String fecpagobeneficio;

	private String fecreccausante;

	private String ingpromedio;

	private String montounitariobeneficio;

	private String nombrebeneficiario;

	private String numtramo;

	private String periodo;

	private String regionbeneficiario;

	private String regioncausante;

	private String regionempleador;

	private String rutbeneficiario;

	private String rutcausante;

	private String tipobeneficiario;

	private String tramoasigfam;

	@Id
	@Column(name="ws_codigo")
	private String wsCodigo;

	@Column(name="ws_mensaje")
	private String wsMensaje;

	@Column(name="ws_nroatencion")
	private String wsNroatencion;

	@Column(name="ws_nrodocumento")
	private String wsNrodocumento;

	public DatosXmlSiagf2() {
	}

	public String getActeco() {
		return this.acteco;
	}

	public void setActeco(String acteco) {
		this.acteco = acteco;
	}

	public Integer getCodEstadoSiagf() {
		return this.codEstadoSiagf;
	}

	public void setCodEstadoSiagf(Integer codEstadoSiagf) {
		this.codEstadoSiagf = codEstadoSiagf;
	}

	public String getCodentidadadm() {
		return this.codentidadadm;
	}

	public void setCodentidadadm(String codentidadadm) {
		this.codentidadadm = codentidadadm;
	}

	public String getCodtipobeneficio() {
		return this.codtipobeneficio;
	}

	public void setCodtipobeneficio(String codtipobeneficio) {
		this.codtipobeneficio = codtipobeneficio;
	}

	public String getCodtipocausante() {
		return this.codtipocausante;
	}

	public void setCodtipocausante(String codtipocausante) {
		this.codtipocausante = codtipocausante;
	}

	public String getComunabeneficiario() {
		return this.comunabeneficiario;
	}

	public void setComunabeneficiario(String comunabeneficiario) {
		this.comunabeneficiario = comunabeneficiario;
	}

	public String getComunacausante() {
		return this.comunacausante;
	}

	public void setComunacausante(String comunacausante) {
		this.comunacausante = comunacausante;
	}

	public String getComunaempleador() {
		return this.comunaempleador;
	}

	public void setComunaempleador(String comunaempleador) {
		this.comunaempleador = comunaempleador;
	}

	public String getFechaemision() {
		return this.fechaemision;
	}

	public void setFechaemision(String fechaemision) {
		this.fechaemision = fechaemision;
	}

	public String getFecpagobeneficio() {
		return this.fecpagobeneficio;
	}

	public void setFecpagobeneficio(String fecpagobeneficio) {
		this.fecpagobeneficio = fecpagobeneficio;
	}

	public String getFecreccausante() {
		return this.fecreccausante;
	}

	public void setFecreccausante(String fecreccausante) {
		this.fecreccausante = fecreccausante;
	}

	public String getIngpromedio() {
		return this.ingpromedio;
	}

	public void setIngpromedio(String ingpromedio) {
		this.ingpromedio = ingpromedio;
	}

	public String getMontounitariobeneficio() {
		return this.montounitariobeneficio;
	}

	public void setMontounitariobeneficio(String montounitariobeneficio) {
		this.montounitariobeneficio = montounitariobeneficio;
	}

	public String getNombrebeneficiario() {
		return this.nombrebeneficiario;
	}

	public void setNombrebeneficiario(String nombrebeneficiario) {
		this.nombrebeneficiario = nombrebeneficiario;
	}

	public String getNumtramo() {
		return this.numtramo;
	}

	public void setNumtramo(String numtramo) {
		this.numtramo = numtramo;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getRegionbeneficiario() {
		return this.regionbeneficiario;
	}

	public void setRegionbeneficiario(String regionbeneficiario) {
		this.regionbeneficiario = regionbeneficiario;
	}

	public String getRegioncausante() {
		return this.regioncausante;
	}

	public void setRegioncausante(String regioncausante) {
		this.regioncausante = regioncausante;
	}

	public String getRegionempleador() {
		return this.regionempleador;
	}

	public void setRegionempleador(String regionempleador) {
		this.regionempleador = regionempleador;
	}

	public String getRutbeneficiario() {
		return this.rutbeneficiario;
	}

	public void setRutbeneficiario(String rutbeneficiario) {
		this.rutbeneficiario = rutbeneficiario;
	}

	public String getRutcausante() {
		return this.rutcausante;
	}

	public void setRutcausante(String rutcausante) {
		this.rutcausante = rutcausante;
	}

	public String getTipobeneficiario() {
		return this.tipobeneficiario;
	}

	public void setTipobeneficiario(String tipobeneficiario) {
		this.tipobeneficiario = tipobeneficiario;
	}

	public String getTramoasigfam() {
		return this.tramoasigfam;
	}

	public void setTramoasigfam(String tramoasigfam) {
		this.tramoasigfam = tramoasigfam;
	}

	public String getWsCodigo() {
		return this.wsCodigo;
	}

	public void setWsCodigo(String wsCodigo) {
		this.wsCodigo = wsCodigo;
	}

	public String getWsMensaje() {
		return this.wsMensaje;
	}

	public void setWsMensaje(String wsMensaje) {
		this.wsMensaje = wsMensaje;
	}

	public String getWsNroatencion() {
		return this.wsNroatencion;
	}

	public void setWsNroatencion(String wsNroatencion) {
		this.wsNroatencion = wsNroatencion;
	}

	public String getWsNrodocumento() {
		return this.wsNrodocumento;
	}

	public void setWsNrodocumento(String wsNrodocumento) {
		this.wsNrodocumento = wsNrodocumento;
	}

}