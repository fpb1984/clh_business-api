package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the "BUT020" database table.
 * 
 */
@Entity
@Table(name="\"BUT020\"")
@NamedQuery(name="But020.findAll", query="SELECT b FROM But020 b")
public class But020 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"ADDR_VALID_TO\"")
	private BigDecimal addrValidTo;

	@Column(name="\"ADDRNUMBER\"")
	private String addrnumber;

	@Column(name="\"PARTNER\"")
	private String partner;

	public But020() {
	}

	public BigDecimal getAddrValidTo() {
		return this.addrValidTo;
	}

	public void setAddrValidTo(BigDecimal addrValidTo) {
		this.addrValidTo = addrValidTo;
	}

	public String getAddrnumber() {
		return this.addrnumber;
	}

	public void setAddrnumber(String addrnumber) {
		this.addrnumber = addrnumber;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

}