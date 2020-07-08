package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "ERRORES_LOG" database table.
 * 
 */
@Entity
@Table(name="\"ERRORES_LOG\"")
@NamedQuery(name="ErroresLog.findAll", query="SELECT e FROM ErroresLog e")
public class ErroresLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="descripcion_error")
	private String descripcionError;

	@Column(name="fec_captura")
	private Timestamp fecCaptura;

	@Id
	@Column(name="id_log")
	private Integer idLog;

	@Column(name="nombre_funcion")
	private String nombreFuncion;

	public ErroresLog() {
	}

	public String getDescripcionError() {
		return this.descripcionError;
	}

	public void setDescripcionError(String descripcionError) {
		this.descripcionError = descripcionError;
	}

	public Timestamp getFecCaptura() {
		return this.fecCaptura;
	}

	public void setFecCaptura(Timestamp fecCaptura) {
		this.fecCaptura = fecCaptura;
	}

	public Integer getIdLog() {
		return this.idLog;
	}

	public void setIdLog(Integer idLog) {
		this.idLog = idLog;
	}

	public String getNombreFuncion() {
		return this.nombreFuncion;
	}

	public void setNombreFuncion(String nombreFuncion) {
		this.nombreFuncion = nombreFuncion;
	}

}