package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "ZAFT_AFA" database table.
 * 
 */
@Entity
@Table(name="\"ZAFT_AFA\"")
@NamedQuery(name="ZaftAfa.findAll", query="SELECT z FROM ZaftAfa z")
public class ZaftAfa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ESTADO\"")
	private String estado;

	@Column(name="\"ID_BENEF\"")
	private String idBenef;

	@Column(name="\"ID_CAU\"")
	private String idCau;
	@Id
	@Column(name="\"ID_EMPLE\"")
	private String idEmple;

	@Column(name="\"ID_TRAMO\"")
	private String idTramo;

	@Column(name="\"MANDT\"")
	private String mandt;

	@Column(name="\"MONTO\"")
	private BigDecimal monto;

	@Column(name="\"P_MES\"")
	private String pMes;

	@Column(name="\"P_PERIODO\"")
	private String pPeriodo;

	@Column(name="\"POSICION_AFA\"")
	private String posicionAfa;

	@Column(name="\"TIPO_CAUSANTE\"")
	private String tipoCausante;

	public ZaftAfa() {
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdBenef() {
		return this.idBenef;
	}

	public void setIdBenef(String idBenef) {
		this.idBenef = idBenef;
	}

	public String getIdCau() {
		return this.idCau;
	}

	public void setIdCau(String idCau) {
		this.idCau = idCau;
	}

	public String getIdEmple() {
		return this.idEmple;
	}

	public void setIdEmple(String idEmple) {
		this.idEmple = idEmple;
	}

	public String getIdTramo() {
		return this.idTramo;
	}

	public void setIdTramo(String idTramo) {
		this.idTramo = idTramo;
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

	public String getPMes() {
		return this.pMes;
	}

	public void setPMes(String pMes) {
		this.pMes = pMes;
	}

	public String getPPeriodo() {
		return this.pPeriodo;
	}

	public void setPPeriodo(String pPeriodo) {
		this.pPeriodo = pPeriodo;
	}

	public String getPosicionAfa() {
		return this.posicionAfa;
	}

	public void setPosicionAfa(String posicionAfa) {
		this.posicionAfa = posicionAfa;
	}

	public String getTipoCausante() {
		return this.tipoCausante;
	}

	public void setTipoCausante(String tipoCausante) {
		this.tipoCausante = tipoCausante;
	}

}