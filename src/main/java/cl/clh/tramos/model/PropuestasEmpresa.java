package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the "PROPUESTAS_EMPRESAS" database table.
 * 
 */
@Entity
@Table(name="\"PROPUESTAS_EMPRESAS\"")
@NamedQuery(name="PropuestasEmpresa.findAll", query="SELECT p FROM PropuestasEmpresa p")
public class PropuestasEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cant_registros_actualizados")
	private Integer cantRegistrosActualizados;

	@Column(name="cant_registros_pendientes")
	private Integer cantRegistrosPendientes;

	@Column(name="cant_registros_totales")
	private Integer cantRegistrosTotales;

	@Column(name="fec_proceso")
	private Timestamp fecProceso;

	@Id
	@Column(name="id_proceso")
	private Integer idProceso;

	@Column(name="rut_empresa")
	private String rutEmpresa;

	@Column(name="ruta_archivo")
	private String rutaArchivo;

	public PropuestasEmpresa() {
	}

	public Integer getCantRegistrosActualizados() {
		return this.cantRegistrosActualizados;
	}

	public void setCantRegistrosActualizados(Integer cantRegistrosActualizados) {
		this.cantRegistrosActualizados = cantRegistrosActualizados;
	}

	public Integer getCantRegistrosPendientes() {
		return this.cantRegistrosPendientes;
	}

	public void setCantRegistrosPendientes(Integer cantRegistrosPendientes) {
		this.cantRegistrosPendientes = cantRegistrosPendientes;
	}

	public Integer getCantRegistrosTotales() {
		return this.cantRegistrosTotales;
	}

	public void setCantRegistrosTotales(Integer cantRegistrosTotales) {
		this.cantRegistrosTotales = cantRegistrosTotales;
	}

	public Timestamp getFecProceso() {
		return this.fecProceso;
	}

	public void setFecProceso(Timestamp fecProceso) {
		this.fecProceso = fecProceso;
	}

	public Integer getIdProceso() {
		return this.idProceso;
	}

	public void setIdProceso(Integer idProceso) {
		this.idProceso = idProceso;
	}

	public String getRutEmpresa() {
		return this.rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getRutaArchivo() {
		return this.rutaArchivo;
	}

	public void setRutaArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

}