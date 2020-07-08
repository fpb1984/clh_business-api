package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "CARGAS_CAB_LOG" database table.
 * 
 */
@Entity
@Table(name="\"CARGAS_CAB_LOG\"")
@NamedQuery(name="CargasCabLog.findAll", query="SELECT c FROM CargasCabLog c")
public class CargasCabLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cant_reg_act_mayores")
	private Integer cantRegActMayores;

	@Column(name="cant_reg_act_menores")
	private Integer cantRegActMenores;

	@Column(name="cant_reg_nuevo")
	private Integer cantRegNuevo;

	@Column(name="cant_reg_proce")
	private Integer cantRegProce;

	@Column(name="cant_reg_recha")
	private Integer cantRegRecha;

	@Column(name="cod_origen")
	private Integer codOrigen;

	@Column(name="detalle_mensaje")
	private String detalleMensaje;

	@Column(name="fec_fin")
	private Timestamp fecFin;

	@Column(name="fec_inicio")
	private Timestamp fecInicio;

	@Column(name="fec_soli_id")
	private Timestamp fecSoliId;

	@Column(name="id_estado_proceso")
	private Integer idEstadoProceso;

	@Column(name="id_modificacion")
	private String idModificacion;

	@Id
	@Column(name="id_proceso")
	private Integer idProceso;

	@Column(name="nombre_archivo")
	private String nombreArchivo;

	@Column(name="rut_emp")
	private String rutEmp;

	@Column(name="rut_usuario")
	private String rutUsuario;

	@Column(name="ruta_archivo")
	private String rutaArchivo;

	public CargasCabLog() {
	}

	public Integer getCantRegActMayores() {
		return this.cantRegActMayores;
	}

	public void setCantRegActMayores(Integer cantRegActMayores) {
		this.cantRegActMayores = cantRegActMayores;
	}

	public Integer getCantRegActMenores() {
		return this.cantRegActMenores;
	}

	public void setCantRegActMenores(Integer cantRegActMenores) {
		this.cantRegActMenores = cantRegActMenores;
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

	public Integer getCantRegRecha() {
		return this.cantRegRecha;
	}

	public void setCantRegRecha(Integer cantRegRecha) {
		this.cantRegRecha = cantRegRecha;
	}

	public Integer getCodOrigen() {
		return this.codOrigen;
	}

	public void setCodOrigen(Integer codOrigen) {
		this.codOrigen = codOrigen;
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

	public Timestamp getFecSoliId() {
		return this.fecSoliId;
	}

	public void setFecSoliId(Timestamp fecSoliId) {
		this.fecSoliId = fecSoliId;
	}

	public Integer getIdEstadoProceso() {
		return this.idEstadoProceso;
	}

	public void setIdEstadoProceso(Integer idEstadoProceso) {
		this.idEstadoProceso = idEstadoProceso;
	}

	public String getIdModificacion() {
		return this.idModificacion;
	}

	public void setIdModificacion(String idModificacion) {
		this.idModificacion = idModificacion;
	}

	public Integer getIdProceso() {
		return this.idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public String getNombreArchivo() {
		return this.nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getRutEmp() {
		return this.rutEmp;
	}

	public void setRutEmp(String rutEmp) {
		this.rutEmp = rutEmp;
	}

	public String getRutUsuario() {
		return this.rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}

	public String getRutaArchivo() {
		return this.rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

}