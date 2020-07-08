package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tmp_usuarios_empresas database table.
 * 
 */
@Entity
@Table(name="tmp_usuarios_empresas")
@NamedQuery(name="TmpUsuariosEmpresa.findAll", query="SELECT t FROM TmpUsuariosEmpresa t")
public class TmpUsuariosEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"APELLIDOS_HABILITADOS\"")
	private String apellidosHabilitados;

	@Column(name="\"DV_EMPRESA\"")
	private String dvEmpresa;

	@Column(name="\"DV_HABILITADO\"")
	private String dvHabilitado;

	@Column(name="\"EMAIL_CONTACTO\"")
	private String emailContacto;

	private Integer id;

	@Column(name="\"NOMBRE_EMPRESA\"")
	private String nombreEmpresa;

	@Column(name="\"NOMBRE_HABILITADO\"")
	private String nombreHabilitado;

	@Column(name="rut_emp_comp")
	private String rutEmpComp;

	@Column(name="\"RUT_EMPRESA\"")
	private Integer rutEmpresa;

	@Column(name="\"RUT_HABILITADO\"")
	private Integer rutHabilitado;
	@Id
	@Column(name="rut_usu_comp")
	private String rutUsuComp;

	public TmpUsuariosEmpresa() {
	}

	public String getApellidosHabilitados() {
		return this.apellidosHabilitados;
	}

	public void setApellidosHabilitados(String apellidosHabilitados) {
		this.apellidosHabilitados = apellidosHabilitados;
	}

	public String getDvEmpresa() {
		return this.dvEmpresa;
	}

	public void setDvEmpresa(String dvEmpresa) {
		this.dvEmpresa = dvEmpresa;
	}

	public String getDvHabilitado() {
		return this.dvHabilitado;
	}

	public void setDvHabilitado(String dvHabilitado) {
		this.dvHabilitado = dvHabilitado;
	}

	public String getEmailContacto() {
		return this.emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreHabilitado() {
		return this.nombreHabilitado;
	}

	public void setNombreHabilitado(String nombreHabilitado) {
		this.nombreHabilitado = nombreHabilitado;
	}

	public String getRutEmpComp() {
		return this.rutEmpComp;
	}

	public void setRutEmpComp(String rutEmpComp) {
		this.rutEmpComp = rutEmpComp;
	}

	public Integer getRutEmpresa() {
		return this.rutEmpresa;
	}

	public void setRutEmpresa(Integer rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public Integer getRutHabilitado() {
		return this.rutHabilitado;
	}

	public void setRutHabilitado(Integer rutHabilitado) {
		this.rutHabilitado = rutHabilitado;
	}

	public String getRutUsuComp() {
		return this.rutUsuComp;
	}

	public void setRutUsuComp(String rutUsuComp) {
		this.rutUsuComp = rutUsuComp;
	}

}