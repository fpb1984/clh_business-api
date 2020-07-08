package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "BUT050" database table.
 * 
 */
@Entity
@Table(name="\"BUT050\"")
@NamedQuery(name="But050.findAll", query="SELECT b FROM But050 b")
public class But050 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"DATE_TO\"")
	private String dateTo;

	@Column(name="\"PARTNER1\"")
	private String partner1;

	@Column(name="\"PARTNER2\"")
	private String partner2;

	@Id
	@Column(name="\"RELTYP\"")
	private String reltyp;

	public But050() {
	}

	public String getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getPartner1() {
		return this.partner1;
	}

	public void setPartner1(String partner1) {
		this.partner1 = partner1;
	}

	public String getPartner2() {
		return this.partner2;
	}

	public void setPartner2(String partner2) {
		this.partner2 = partner2;
	}

	public String getReltyp() {
		return this.reltyp;
	}

	public void setReltyp(String reltyp) {
		this.reltyp = reltyp;
	}

}