package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "TMP_PROPUESTAS" database table.
 * 
 */
@Entity
@Table(name="\"TMP_PROPUESTAS\"")
@NamedQuery(name="TmpPropuesta.findAll", query="SELECT t FROM TmpPropuesta t")
public class TmpPropuesta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="dec_jurada")
	private String decJurada;

	@Column(name="fec_gener")
	private String fecGener;

	private Integer mandt;

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

	@Column(name="rem_emp")
	private BigDecimal remEmp;

	@Column(name="renta_prom")
	private BigDecimal rentaProm;

	@Column(name="rentas_ind")
	private BigDecimal rentasInd;
	@Id
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

	public TmpPropuesta() {
	}

	public String getDecJurada() {
		return this.decJurada;
	}

	public void setDecJurada(String decJurada) {
		this.decJurada = decJurada;
	}

	public String getFecGener() {
		return this.fecGener;
	}

	public void setFecGener(String fecGener) {
		this.fecGener = fecGener;
	}

	public Integer getMandt() {
		return this.mandt;
	}

	public void setMandt(Integer mandt) {
		this.mandt = mandt;
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