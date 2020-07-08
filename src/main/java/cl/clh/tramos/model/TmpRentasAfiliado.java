package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "TMP_RENTAS_AFILIADO" database table.
 * 
 */
@Entity
@Table(name="\"TMP_RENTAS_AFILIADO\"")
@NamedQuery(name="TmpRentasAfiliado.findAll", query="SELECT t FROM TmpRentasAfiliado t")
public class TmpRentasAfiliado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"PARTNER\"")
	private String partner;

	@Column(name="\"REM1\"")
	private BigDecimal rem1;

	@Column(name="\"REM2\"")
	private BigDecimal rem2;

	@Column(name="\"REM3\"")
	private BigDecimal rem3;

	@Column(name="\"REM4\"")
	private BigDecimal rem4;

	@Column(name="\"REM5\"")
	private BigDecimal rem5;

	@Column(name="\"REM6\"")
	private BigDecimal rem6;
	@Id
	@Column(name="\"RUT_AFILIADO\"")
	private String rutAfiliado;

	public TmpRentasAfiliado() {
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public BigDecimal getRem1() {
		return this.rem1;
	}

	public void setRem1(BigDecimal rem1) {
		this.rem1 = rem1;
	}

	public BigDecimal getRem2() {
		return this.rem2;
	}

	public void setRem2(BigDecimal rem2) {
		this.rem2 = rem2;
	}

	public BigDecimal getRem3() {
		return this.rem3;
	}

	public void setRem3(BigDecimal rem3) {
		this.rem3 = rem3;
	}

	public BigDecimal getRem4() {
		return this.rem4;
	}

	public void setRem4(BigDecimal rem4) {
		this.rem4 = rem4;
	}

	public BigDecimal getRem5() {
		return this.rem5;
	}

	public void setRem5(BigDecimal rem5) {
		this.rem5 = rem5;
	}

	public BigDecimal getRem6() {
		return this.rem6;
	}

	public void setRem6(BigDecimal rem6) {
		this.rem6 = rem6;
	}

	public String getRutAfiliado() {
		return this.rutAfiliado;
	}

	public void setRutAfiliado(String rutAfiliado) {
		this.rutAfiliado = rutAfiliado;
	}

}