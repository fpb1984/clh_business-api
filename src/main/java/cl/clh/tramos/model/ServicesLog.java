package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "SERVICES_LOG" database table.
 * 
 */
@Entity
@Table(name="\"SERVICES_LOG\"")
@NamedQuery(name="ServicesLog.findAll", query="SELECT s FROM ServicesLog s")
public class ServicesLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cod_estado")
	private Integer codEstado;

	@Column(name="cod_origen")
	private Integer codOrigen;

	@Column(name="fec_log")
	private Timestamp fecLog;

	@Id
	private Integer id;

	private String message;

	private String partner2;

	private BigDecimal periodo2;

	private Integer tipsem2;

	public ServicesLog() {
	}

	public Integer getCodEstado() {
		return this.codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	public Integer getCodOrigen() {
		return this.codOrigen;
	}

	public void setCodOrigen(Integer codOrigen) {
		this.codOrigen = codOrigen;
	}

	public Timestamp getFecLog() {
		return this.fecLog;
	}

	public void setFecLog(Timestamp fecLog) {
		this.fecLog = fecLog;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPartner2() {
		return this.partner2;
	}

	public void setPartner2(String partner2) {
		this.partner2 = partner2;
	}

	public BigDecimal getPeriodo2() {
		return this.periodo2;
	}

	public void setPeriodo2(BigDecimal periodo2) {
		this.periodo2 = periodo2;
	}

	public Integer getTipsem2() {
		return this.tipsem2;
	}

	public void setTipsem2(Integer tipsem2) {
		this.tipsem2 = tipsem2;
	}

}