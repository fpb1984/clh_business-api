package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "ZLMT_VALCUOSIL" database table.
 * 
 */
@Entity
@Table(name="\"ZLMT_VALCUOSIL\"")
@NamedQuery(name="ZlmtValcuosil.findAll", query="SELECT z FROM ZlmtValcuosil z")
public class ZlmtValcuosil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="mon_apo_caj")
	private BigDecimal monApoCaj;

	@Column(name="mon_apo_ins")
	private BigDecimal monApoIns;

	@Column(name="mon_apo_sal")
	private BigDecimal monApoSal;

	@Column(name="mon_seg_ces")
	private BigDecimal monSegCes;

	@Column(name="mon_sub_pag")
	private BigDecimal monSubPag;

	@Column(name="o_id_lm")
	private String oIdLm;

	@Column(name="o_tip_emi")
	private String oTipEmi;

	@Column(name="per_ren")
	private String perRen;
	@Id
	@Column(name="rut_tra")
	private String rutTra;

	public ZlmtValcuosil() {
	}

	public BigDecimal getMonApoCaj() {
		return this.monApoCaj;
	}

	public void setMonApoCaj(BigDecimal monApoCaj) {
		this.monApoCaj = monApoCaj;
	}

	public BigDecimal getMonApoIns() {
		return this.monApoIns;
	}

	public void setMonApoIns(BigDecimal monApoIns) {
		this.monApoIns = monApoIns;
	}

	public BigDecimal getMonApoSal() {
		return this.monApoSal;
	}

	public void setMonApoSal(BigDecimal monApoSal) {
		this.monApoSal = monApoSal;
	}

	public BigDecimal getMonSegCes() {
		return this.monSegCes;
	}

	public void setMonSegCes(BigDecimal monSegCes) {
		this.monSegCes = monSegCes;
	}

	public BigDecimal getMonSubPag() {
		return this.monSubPag;
	}

	public void setMonSubPag(BigDecimal monSubPag) {
		this.monSubPag = monSubPag;
	}

	public String getOIdLm() {
		return this.oIdLm;
	}

	public void setOIdLm(String oIdLm) {
		this.oIdLm = oIdLm;
	}

	public String getOTipEmi() {
		return this.oTipEmi;
	}

	public void setOTipEmi(String oTipEmi) {
		this.oTipEmi = oTipEmi;
	}

	public String getPerRen() {
		return this.perRen;
	}

	public void setPerRen(String perRen) {
		this.perRen = perRen;
	}

	public String getRutTra() {
		return this.rutTra;
	}

	public void setRutTra(String rutTra) {
		this.rutTra = rutTra;
	}

}