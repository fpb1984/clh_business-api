package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "PROPUESTAS_CAB_LOG" database table.
 * 
 */
@Entity
@Table(name="\"PROPUESTAS_CAB_LOG\"")
@NamedQuery(name="PropuestasCabLog.findAll", query="SELECT p FROM PropuestasCabLog p")
public class PropuestasCabLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cant_reg_act")
	private Integer cantRegAct;

	@Column(name="cant_reg_nuevo")
	private Integer cantRegNuevo;

	@Column(name="cant_reg_proce")
	private Integer cantRegProce;

	@Column(name="detalle_mensaje")
	private String detalleMensaje;

	@Column(name="fec_fin")
	private Timestamp fecFin;

	@Column(name="fec_inicio")
	private Timestamp fecInicio;

	@Column(name="id_estado_proceso")
	private Integer idEstadoProceso;

	@Id
	@Column(name="id_proceso")
	private Integer idProceso;

	public PropuestasCabLog() {
	}

	public Integer getCantRegAct() {
		return this.cantRegAct;
	}

	public void setCantRegAct(Integer cantRegAct) {
		this.cantRegAct = cantRegAct;
	}

	public Integer getCantRegNuevo() {
		return this.cantRegNuevo;
	}

	public void setCantRegNuevo(Integer cantRegNuevo) {
		this.cantRegNuevo = cantRegNuevo;
	}

	public Integer getCantRegProce() {
		return this.cantRegProce;
	}

	public void setCantRegProce(Integer cantRegProce) {
		this.cantRegProce = cantRegProce;
	}

	public String getDetalleMensaje() {
		return this.detalleMensaje;
	}

	public void setDetalleMensaje(String detalleMensaje) {
		this.detalleMensaje = detalleMensaje;
	}

	public Timestamp getFecFin() {
		return this.fecFin;
	}

	public void setFecFin(Timestamp fecFin) {
		this.fecFin = fecFin;
	}

	public Timestamp getFecInicio() {
		return this.fecInicio;
	}

	public void setFecInicio(Timestamp fecInicio) {
		this.fecInicio = fecInicio;
	}

	public Integer getIdEstadoProceso() {
		return this.idEstadoProceso;
	}

	public void setIdEstadoProceso(Integer idEstadoProceso) {
		this.idEstadoProceso = idEstadoProceso;
	}

	public Integer getIdProceso() {
		return this.idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

}