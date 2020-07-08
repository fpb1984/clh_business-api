package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the corporaciones_excluir database table.
 * 
 */
@Entity
@Table(name="corporaciones_excluir")
@NamedQuery(name="CorporacionesExcluir.findAll", query="SELECT c FROM CorporacionesExcluir c")
public class CorporacionesExcluir implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String rut;

	public CorporacionesExcluir() {
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

}