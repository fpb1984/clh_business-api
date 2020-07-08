package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "ZAPOT_RENTA" database table.
 * 
 */
@Entity
@Table(name="\"ZAPOT_RENTA\"")
@NamedQuery(name="ZapotRenta.findAll", query="SELECT z FROM ZapotRenta z")
public class ZapotRenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"PERIODO\"")
	private String periodo;

	@Column(name="\"RENTA_GRATIF\"")
	private BigDecimal rentaGratif;

	@Column(name="\"RENTA_REMUN\"")
	private BigDecimal rentaRemun;
	@Id
	@Column(name="\"RUT_AFILIADO\"")
	private String rutAfiliado;

	@Column(name="\"RUT_EMPRESA\"")
	private String rutEmpresa;

	@Column(name="\"TIP_PAGADOR\"")
	private Integer tipPagador;

	@Column(name="\"WAERS\"")
	private String waers;

	public ZapotRenta() {
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public BigDecimal getRentaGratif() {
		return this.rentaGratif;
	}

	public void setRentaGratif(BigDecimal rentaGratif) {
		this.rentaGratif = rentaGratif;
	}

	public BigDecimal getRentaRemun() {
		return this.rentaRemun;
	}

	public void setRentaRemun(BigDecimal rentaRemun) {
		this.rentaRemun = rentaRemun;
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

	public Integer getTipPagador() {
		return this.tipPagador;
	}

	public void setTipPagador(Integer tipPagador) {
		this.tipPagador = tipPagador;
	}

	public String getWaers() {
		return this.waers;
	}

	public void setWaers(String waers) {
		this.waers = waers;
	}

}