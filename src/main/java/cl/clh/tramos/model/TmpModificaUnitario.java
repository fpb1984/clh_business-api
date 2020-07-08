package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "TMP_MODIFICA_UNITARIO" database table.
 * 
 */
@Entity
@Table(name="\"TMP_MODIFICA_UNITARIO\"")
@NamedQuery(name="TmpModificaUnitario.findAll", query="SELECT t FROM TmpModificaUnitario t")
public class TmpModificaUnitario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="id_modifica")
	private String idModifica;

	@Column(name="num_meses")
	private BigDecimal numMeses;

	@Column(name="otra_rem")
	private BigDecimal otraRem;

	private BigDecimal pensiones;

	private Integer procesado;

	@Column(name="rem_emp")
	private BigDecimal remEmp;

	@Column(name="rentas_ind")
	private BigDecimal rentasInd;

	@Column(name="rut_afiliado")
	private String rutAfiliado;
	@Id
	@Column(name="rut_empresa")
	private String rutEmpresa;

	@Column(name="rut_usuario")
	private String rutUsuario;

	private BigDecimal subsidios;

	public TmpModificaUnitario() {
	}

	public String getIdModifica() {
		return this.idModifica;
	}

	public void setIdModifica(String idModifica) {
		this.idModifica = idModifica;
	}

	public BigDecimal getNumMeses() {
		return this.numMeses;
	}

	public void setNumMeses(BigDecimal numMeses) {
		this.numMeses = numMeses;
	}

	public BigDecimal getOtraRem() {
		return this.otraRem;
	}

	public void setOtraRem(BigDecimal otraRem) {
		this.otraRem = otraRem;
	}

	public BigDecimal getPensiones() {
		return this.pensiones;
	}

	public void setPensiones(BigDecimal pensiones) {
		this.pensiones = pensiones;
	}

	public Integer getProcesado() {
		return this.procesado;
	}

	public void setProcesado(Integer procesado) {
		this.procesado = procesado;
	}

	public BigDecimal getRemEmp() {
		return this.remEmp;
	}

	public void setRemEmp(BigDecimal remEmp) {
		this.remEmp = remEmp;
	}

	public BigDecimal getRentasInd() {
		return this.rentasInd;
	}

	public void setRentasInd(BigDecimal rentasInd) {
		this.rentasInd = rentasInd;
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

	public String getRutUsuario() {
		return this.rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}

	public BigDecimal getSubsidios() {
		return this.subsidios;
	}

	public void setSubsidios(BigDecimal subsidios) {
		this.subsidios = subsidios;
	}

}