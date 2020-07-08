package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "PROPUESTAS_SIAGF" database table.
 * 
 */
@Entity
@Table(name="\"PROPUESTAS_SIAGF\"")
@NamedQuery(name="PropuestasSiagf.findAll", query="SELECT p FROM PropuestasSiagf p")
public class PropuestasSiagf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cod_estado_final")
	private Integer codEstadoFinal;

	@Column(name="cod_estado_sap")
	private Integer codEstadoSap;

	@Column(name="cod_estado_siagf")
	private Integer codEstadoSiagf;

	@Column(name="cod_estado_validado")
	private Integer codEstadoValidado;

	@Column(name="dec_jurada")
	private String decJurada;

	@Column(name="fec_cambio_estado")
	private Timestamp fecCambioEstado;

	@Column(name="fec_gener")
	private String fecGener;

	@Column(name="fec_modifica_sap")
	private Timestamp fecModificaSap;

	@Id
	@Column(name="fec_modifica_siagf")
	private Timestamp fecModificaSiagf;

	@Column(name="fec_modifica_validado")
	private Timestamp fecModificaValidado;

	private Integer mandt;

	@Column(name="mensaje_sap")
	private String mensajeSap;

	@Column(name="mensaje_siagf")
	private String mensajeSiagf;

	@Column(name="mensaje_validado")
	private String mensajeValidado;

	@Column(name="name_first")
	private String nameFirst;

	@Column(name="name_last")
	private String nameLast;

	@Column(name="name_lst2")
	private String nameLst2;

	@Column(name="num_meses")
	private Long numMeses;

	@Column(name="otra_rem")
	private BigDecimal otraRem;

	private String partner;

	private BigDecimal pensiones;

	private String periodo;

	@Column(name="q_intentos_sap")
	private Integer qIntentosSap;

	@Column(name="q_intentos_siagf")
	private Integer qIntentosSiagf;

	@Column(name="q_intentos_validado")
	private Integer qIntentosValidado;

	@Column(name="rem_emp")
	private BigDecimal remEmp;

	@Column(name="renta_prom")
	private BigDecimal rentaProm;

	@Column(name="rentas_ind")
	private BigDecimal rentasInd;

	@Column(name="rut_afiliado")
	private String rutAfiliado;

	@Column(name="rut_empresa")
	private String rutEmpresa;

	private BigDecimal subsidios;

	@Column(name="tiene_carga")
	private Integer tieneCarga;

	@Column(name="tot_ingresos")
	private BigDecimal totIngresos;

	private String tramo;

	private String usuario;

	private String waers;

	public PropuestasSiagf() {
	}

	public Integer getCodEstadoFinal() {
		return this.codEstadoFinal;
	}

	public void setCodEstadoFinal(Integer codEstadoFinal) {
		this.codEstadoFinal = codEstadoFinal;
	}

	public Integer getCodEstadoSap() {
		return this.codEstadoSap;
	}

	public void setCodEstadoSap(Integer codEstadoSap) {
		this.codEstadoSap = codEstadoSap;
	}

	public Integer getCodEstadoSiagf() {
		return this.codEstadoSiagf;
	}

	public void setCodEstadoSiagf(Integer codEstadoSiagf) {
		this.codEstadoSiagf = codEstadoSiagf;
	}

	public Integer getCodEstadoValidado() {
		return this.codEstadoValidado;
	}

	public void setCodEstadoValidado(Integer codEstadoValidado) {
		this.codEstadoValidado = codEstadoValidado;
	}

	public String getDecJurada() {
		return this.decJurada;
	}

	public void setDecJurada(String decJurada) {
		this.decJurada = decJurada;
	}

	public Timestamp getFecCambioEstado() {
		return this.fecCambioEstado;
	}

	public void setFecCambioEstado(Timestamp fecCambioEstado) {
		this.fecCambioEstado = fecCambioEstado;
	}

	public String getFecGener() {
		return this.fecGener;
	}

	public void setFecGener(String fecGener) {
		this.fecGener = fecGener;
	}

	public Timestamp getFecModificaSap() {
		return this.fecModificaSap;
	}

	public void setFecModificaSap(Timestamp fecModificaSap) {
		this.fecModificaSap = fecModificaSap;
	}

	public Timestamp getFecModificaSiagf() {
		return this.fecModificaSiagf;
	}

	public void setFecModificaSiagf(Timestamp fecModificaSiagf) {
		this.fecModificaSiagf = fecModificaSiagf;
	}

	public Timestamp getFecModificaValidado() {
		return this.fecModificaValidado;
	}

	public void setFecModificaValidado(Timestamp fecModificaValidado) {
		this.fecModificaValidado = fecModificaValidado;
	}

	public Integer getMandt() {
		return this.mandt;
	}

	public void setMandt(Integer mandt) {
		this.mandt = mandt;
	}

	public String getMensajeSap() {
		return this.mensajeSap;
	}

	public void setMensajeSap(String mensajeSap) {
		this.mensajeSap = mensajeSap;
	}

	public String getMensajeSiagf() {
		return this.mensajeSiagf;
	}

	public void setMensajeSiagf(String mensajeSiagf) {
		this.mensajeSiagf = mensajeSiagf;
	}

	public String getMensajeValidado() {
		return this.mensajeValidado;
	}

	public void setMensajeValidado(String mensajeValidado) {
		this.mensajeValidado = mensajeValidado;
	}

	public String getNameFirst() {
		return this.nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return this.nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public String getNameLst2() {
		return this.nameLst2;
	}

	public void setNameLst2(String nameLst2) {
		this.nameLst2 = nameLst2;
	}

	public Long getNumMeses() {
		return this.numMeses;
	}

	public void setNumMeses(Long numMeses) {
		this.numMeses = numMeses;
	}

	public BigDecimal getOtraRem() {
		return this.otraRem;
	}

	public void setOtraRem(BigDecimal otraRem) {
		this.otraRem = otraRem;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public BigDecimal getPensiones() {
		return this.pensiones;
	}

	public void setPensiones(BigDecimal pensiones) {
		this.pensiones = pensiones;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getQIntentosSap() {
		return this.qIntentosSap;
	}

	public void setQIntentosSap(Integer qIntentosSap) {
		this.qIntentosSap = qIntentosSap;
	}

	public Integer getQIntentosSiagf() {
		return this.qIntentosSiagf;
	}

	public void setQIntentosSiagf(Integer qIntentosSiagf) {
		this.qIntentosSiagf = qIntentosSiagf;
	}

	public Integer getQIntentosValidado() {
		return this.qIntentosValidado;
	}

	public void setQIntentosValidado(Integer qIntentosValidado) {
		this.qIntentosValidado = qIntentosValidado;
	}

	public BigDecimal getRemEmp() {
		return this.remEmp;
	}

	public void setRemEmp(BigDecimal remEmp) {
		this.remEmp = remEmp;
	}

	public BigDecimal getRentaProm() {
		return this.rentaProm;
	}

	public void setRentaProm(BigDecimal rentaProm) {
		this.rentaProm = rentaProm;
	}

	public BigDecimal getRentasInd() {
		return this.rentasInd;
	}

	public void setRentasInd(BigDecimal rentasInd) {
		this.rentasInd = rentasInd;
	}

	public String getRutAfiliado() {
		return this.rutAfiliado;
	}

	public void setRutAfiliado(String rutAfiliado) {
		this.rutAfiliado = rutAfiliado;
	}

	public String getRutEmpresa() {
		return this.rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public BigDecimal getSubsidios() {
		return this.subsidios;
	}

	public void setSubsidios(BigDecimal subsidios) {
		this.subsidios = subsidios;
	}

	public Integer getTieneCarga() {
		return this.tieneCarga;
	}

	public void setTieneCarga(Integer tieneCarga) {
		this.tieneCarga = tieneCarga;
	}

	public BigDecimal getTotIngresos() {
		return this.totIngresos;
	}

	public void setTotIngresos(BigDecimal totIngresos) {
		this.totIngresos = totIngresos;
	}

	public String getTramo() {
		return this.tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getWaers() {
		return this.waers;
	}

	public void setWaers(String waers) {
		this.waers = waers;
	}

}