package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the "INTEGRA_SAP_RENTAS" database table.
 * 
 */
@Entity
@Table(name="\"INTEGRA_SAP_RENTAS\"")
@NamedQuery(name="IntegraSapRenta.findAll", query="SELECT i FROM IntegraSapRenta i")
public class IntegraSapRenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cant_procesos")
	private Integer cantProcesos;

	private String client;

	@Temporal(TemporalType.DATE)
	@Column(name="fec_act")
	private Date fecAct;

	@Column(name="fec_creacion")
	private Timestamp fecCreacion;

	@Column(name="fec_modifica")
	private Timestamp fecModifica;

	@Column(name="id_estado")
	private Integer idEstado;

	private BigDecimal ingmen;

	private String mensaje;

	private String moneda;

	private String partner;

	private BigDecimal periodo;

	private BigDecimal promimp;

	private BigDecimal promren;

	private BigDecimal rentaimp1;

	private BigDecimal rentaimp2;

	private BigDecimal rentaimp3;

	private BigDecimal rentaimp4;

	private BigDecimal rentaimp5;

	private BigDecimal rentaimp6;

	private String tiping;

	private Integer tipsem;

	private String tramoafa;

	@Column(name="usu_act")
	private String usuAct;

	public IntegraSapRenta() {
	}

	public Integer getCantProcesos() {
		return this.cantProcesos;
	}

	public void setCantProcesos(Integer cantProcesos) {
		this.cantProcesos = cantProcesos;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Date getFecAct() {
		return this.fecAct;
	}

	public void setFecAct(Date fecAct) {
		this.fecAct = fecAct;
	}

	public Timestamp getFecCreacion() {
		return this.fecCreacion;
	}

	public void setFecCreacion(Timestamp fecCreacion) {
		this.fecCreacion = fecCreacion;
	}

	public Timestamp getFecModifica() {
		return this.fecModifica;
	}

	public void setFecModifica(Timestamp fecModifica) {
		this.fecModifica = fecModifica;
	}

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public BigDecimal getIngmen() {
		return this.ingmen;
	}

	public void setIngmen(BigDecimal ingmen) {
		this.ingmen = ingmen;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMoneda() {
		return this.moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public BigDecimal getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(BigDecimal periodo) {
		this.periodo = periodo;
	}

	public BigDecimal getPromimp() {
		return this.promimp;
	}

	public void setPromimp(BigDecimal promimp) {
		this.promimp = promimp;
	}

	public BigDecimal getPromren() {
		return this.promren;
	}

	public void setPromren(BigDecimal promren) {
		this.promren = promren;
	}

	public BigDecimal getRentaimp1() {
		return this.rentaimp1;
	}

	public void setRentaimp1(BigDecimal rentaimp1) {
		this.rentaimp1 = rentaimp1;
	}

	public BigDecimal getRentaimp2() {
		return this.rentaimp2;
	}

	public void setRentaimp2(BigDecimal rentaimp2) {
		this.rentaimp2 = rentaimp2;
	}

	public BigDecimal getRentaimp3() {
		return this.rentaimp3;
	}

	public void setRentaimp3(BigDecimal rentaimp3) {
		this.rentaimp3 = rentaimp3;
	}

	public BigDecimal getRentaimp4() {
		return this.rentaimp4;
	}

	public void setRentaimp4(BigDecimal rentaimp4) {
		this.rentaimp4 = rentaimp4;
	}

	public BigDecimal getRentaimp5() {
		return this.rentaimp5;
	}

	public void setRentaimp5(BigDecimal rentaimp5) {
		this.rentaimp5 = rentaimp5;
	}

	public BigDecimal getRentaimp6() {
		return this.rentaimp6;
	}

	public void setRentaimp6(BigDecimal rentaimp6) {
		this.rentaimp6 = rentaimp6;
	}

	public String getTiping() {
		return this.tiping;
	}

	public void setTiping(String tiping) {
		this.tiping = tiping;
	}

	public Integer getTipsem() {
		return this.tipsem;
	}

	public void setTipsem(Integer tipsem) {
		this.tipsem = tipsem;
	}

	public String getTramoafa() {
		return this.tramoafa;
	}

	public void setTramoafa(String tramoafa) {
		this.tramoafa = tramoafa;
	}

	public String getUsuAct() {
		return this.usuAct;
	}

	public void setUsuAct(String usuAct) {
		this.usuAct = usuAct;
	}

}