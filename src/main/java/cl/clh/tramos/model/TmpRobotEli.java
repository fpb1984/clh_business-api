package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tmp_robot_eli database table.
 * 
 */
@Entity
@Table(name="tmp_robot_eli")
@NamedQuery(name="TmpRobotEli.findAll", query="SELECT t FROM TmpRobotEli t")
public class TmpRobotEli implements Serializable {
	private static final long serialVersionUID = 1L;

	private String estado;

	private Integer montobeneficio;

	@Column(name="nro_atencion")
	private Integer nroAtencion;

	private Integer periodo;

	@Column(name="renta_prom")
	private Integer rentaProm;
	@Id
	private String rutcausante;

	private Integer tramo;

	public TmpRobotEli() {
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getMontobeneficio() {
		return this.montobeneficio;
	}

	public void setMontobeneficio(Integer montobeneficio) {
		this.montobeneficio = montobeneficio;
	}

	public Integer getNroAtencion() {
		return this.nroAtencion;
	}

	public void setNroAtencion(Integer nroAtencion) {
		this.nroAtencion = nroAtencion;
	}

	public Integer getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getRentaProm() {
		return this.rentaProm;
	}

	public void setRentaProm(Integer rentaProm) {
		this.rentaProm = rentaProm;
	}

	public String getRutcausante() {
		return this.rutcausante;
	}

	public void setRutcausante(String rutcausante) {
		this.rutcausante = rutcausante;
	}

	public Integer getTramo() {
		return this.tramo;
	}

	public void setTramo(Integer tramo) {
		this.tramo = tramo;
	}

}