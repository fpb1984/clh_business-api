package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "HOMOLOGACION_TRAMO_SIAGF" database table.
 * 
 */
@Entity
@Table(name="\"HOMOLOGACION_TRAMO_SIAGF\"")
@NamedQuery(name="HomologacionTramoSiagf.findAll", query="SELECT h FROM HomologacionTramoSiagf h")
public class HomologacionTramoSiagf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numero_tramo")
	private String numeroTramo;

	private String tramo;

	public HomologacionTramoSiagf() {
	}

	public String getNumeroTramo() {
		return this.numeroTramo;
	}

	public void setNumeroTramo(String numeroTramo) {
		this.numeroTramo = numeroTramo;
	}

	public String getTramo() {
		return this.tramo;
	}

	public void setTramo(String tramo) {
		this.tramo = tramo;
	}

}