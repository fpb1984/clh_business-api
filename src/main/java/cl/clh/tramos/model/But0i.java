package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "BUT0IS" database table.
 * 
 */
@Entity
@Table(name="\"BUT0IS\"")
@NamedQuery(name="But0i.findAll", query="SELECT b FROM But0i b")
public class But0i implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="\"IND_SECTOR\"")
	private String indSector;

	@Column(name="\"PARTNER\"")
	private String partner;

	public But0i() {
	}

	public String getIndSector() {
		return this.indSector;
	}

	public void setIndSector(String indSector) {
		this.indSector = indSector;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

}