package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "BUT000" database table.
 * 
 */
@Entity
@Table(name="\"BUT000\"")
@NamedQuery(name="But000.findAll", query="SELECT b FROM But000 b")
public class But000 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String bpext;

	@Column(name="\"IND_SECTOR\"")
	private String indSector;

	@Column(name="\"NAME_FIRST\"")
	private String nameFirst;

	@Column(name="\"NAME_LAST\"")
	private String nameLast;

	@Column(name="\"NAME_LST2\"")
	private String nameLst2;

	@Column(name="\"PARTNER\"")
	private String partner;

	public But000() {
	}

	public String getBpext() {
		return this.bpext;
	}

	public void setBpext(String bpext) {
		this.bpext = bpext;
	}

	public String getIndSector() {
		return this.indSector;
	}

	public void setIndSector(String indSector) {
		this.indSector = indSector;
	}

	public String getNameFirst() {
		return this.nameFirst;
	}

	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}

	public String getNameLast() {
		return this.nameLast;
	}

	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

	public String getNameLst2() {
		return this.nameLst2;
	}

	public void setNameLst2(String nameLst2) {
		this.nameLst2 = nameLst2;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

}