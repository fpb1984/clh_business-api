package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ZBPT_AFA_RECON" database table.
 * 
 */
@Entity
@Table(name="\"ZBPT_AFA_RECON\"")
@NamedQuery(name="ZbptAfaRecon.findAll", query="SELECT z FROM ZbptAfaRecon z")
public class ZbptAfaRecon implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="\"BENEFICIARIO\"")
	private String beneficiario;

	@Column(name="\"CAUSANTE\"")
	private String causante;

	@Column(name="\"EMPRESA\"")
	private String empresa;

	@Column(name="\"ESTADO_BENEF\"")
	private String estadoBenef;

	@Column(name="\"FECHA_EXT\"")
	private String fechaExt;

	@Column(name="\"FECHA_FIN\"")
	private String fechaFin;

	@Column(name="\"FECHA_INICIO\"")
	private String fechaInicio;

	@Column(name="\"FECHA_REC\"")
	private String fechaRec;

	@Column(name="\"TIPOBENEFICIARIO\"")
	private String tipobeneficiario;

	@Column(name="\"TIPOBENEFICIO\"")
	private String tipobeneficio;

	@Column(name="\"TIPOCAUSANTE\"")
	private String tipocausante;

	public ZbptAfaRecon() {
	}

	public String getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public String getCausante() {
		return this.causante;
	}

	public void setCausante(String causante) {
		this.causante = causante;
	}

	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEstadoBenef() {
		return this.estadoBenef;
	}

	public void setEstadoBenef(String estadoBenef) {
		this.estadoBenef = estadoBenef;
	}

	public String getFechaExt() {
		return this.fechaExt;
	}

	public void setFechaExt(String fechaExt) {
		this.fechaExt = fechaExt;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaRec() {
		return this.fechaRec;
	}

	public void setFechaRec(String fechaRec) {
		this.fechaRec = fechaRec;
	}

	public String getTipobeneficiario() {
		return this.tipobeneficiario;
	}

	public void setTipobeneficiario(String tipobeneficiario) {
		this.tipobeneficiario = tipobeneficiario;
	}

	public String getTipobeneficio() {
		return this.tipobeneficio;
	}

	public void setTipobeneficio(String tipobeneficio) {
		this.tipobeneficio = tipobeneficio;
	}

	public String getTipocausante() {
		return this.tipocausante;
	}

	public void setTipocausante(String tipocausante) {
		this.tipocausante = tipocausante;
	}

}