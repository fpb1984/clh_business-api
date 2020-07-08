package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "Dfkkbptaxnum" database table.
 * 
 */
@Entity
@Table(name="\"Dfkkbptaxnum\"")
@NamedQuery(name="Dfkkbptaxnum.findAll", query="SELECT d FROM Dfkkbptaxnum d")
public class Dfkkbptaxnum implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"PARTNER\"")
	private String partner;

	@Id
	private String taxnum;

	public Dfkkbptaxnum() {
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getTaxnum() {
		return this.taxnum;
	}

	public void setTaxnum(String taxnum) {
		this.taxnum = taxnum;
	}

}