package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the temporal_empresas_nombre database table.
 * 
 */
@Entity
@Table(name="temporal_empresas_nombre")
@NamedQuery(name="TemporalEmpresasNombre.findAll", query="SELECT t FROM TemporalEmpresasNombre t")
public class TemporalEmpresasNombre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"BPEXT\"")
	private String bpext;

	@Column(name="\"NAME_ORG1\"")
	private String nameOrg1;

	@Column(name="\"PARTNER\"")
	private String partner;

	public TemporalEmpresasNombre() {
	}

	public String getBpext() {
		return this.bpext;
	}

	public void setBpext(String bpext) {
		this.bpext = bpext;
	}

	public String getNameOrg1() {
		return this.nameOrg1;
	}

	public void setNameOrg1(String nameOrg1) {
		this.nameOrg1 = nameOrg1;
	}

	public String getPartner() {
		return this.partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

}