package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "ZAFT_TRAMO" database table.
 * 
 */
@Entity
@Table(name="\"ZAFT_TRAMO\"")
@NamedQuery(name="ZaftTramo.findAll", query="SELECT z FROM ZaftTramo z")
public class ZaftTramo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"CIRCULAR\"")
	private String circular;

	@Column(name="\"CREADOR\"")
	private String creador;

	@Column(name="\"DESDE\"")
	private BigDecimal desde;

	@Column(name="\"FECHC\"")
	private String fechc;

	@Column(name="\"FECHF\"")
	private String fechf;

	@Column(name="\"FECHI\"")
	private String fechi;

	@Column(name="\"FLAG\"")
	private String flag;

	@Column(name="\"HASTA\"")
	private BigDecimal hasta;

	@Column(name="\"MANDT\"")
	private String mandt;

	@Column(name="\"MONTO\"")
	private BigDecimal monto;

	@Column(name="\"TRAMO\"")
	private String tramo;
	@Id
	@Column(name="\"WAERS\"")
	private String waers;

	public ZaftTramo() {
	}

	public String getCircular() {
		return this.circular;
	}

	public void setCircular(String circular) {
		this.circular = circular;
	}

	public String getCreador() {
		return this.creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public BigDecimal getDesde() {
		return this.desde;
	}

	public void setDesde(BigDecimal desde) {
		this.desde = desde;
	}

	public String getFechc() {
		return this.fechc;
	}

	public void setFechc(String fechc) {
		this.fechc = fechc;
	}

	public String getFechf() {
		return this.fechf;
	}

	public void setFechf(String fechf) {
		this.fechf = fechf;
	}

	public String getFechi() {
		return this.fechi;
	}

	public void setFechi(String fechi) {
		this.fechi = fechi;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public BigDecimal getHasta() {
		return this.hasta;
	}

	public void setHasta(BigDecimal hasta) {
		this.hasta = hasta;
	}

	public String getMandt() {
		return this.mandt;
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getTramo() {
		return this.tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

	public String getWaers() {
		return this.waers;
	}

	public void setWaers(String waers) {
		this.waers = waers;
	}

}