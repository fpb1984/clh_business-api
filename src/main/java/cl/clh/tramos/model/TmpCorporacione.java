package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tmp_corporaciones database table.
 * 
 */
@Entity
@Table(name="tmp_corporaciones")
@NamedQuery(name="TmpCorporacione.findAll", query="SELECT t FROM TmpCorporacione t")
public class TmpCorporacione implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer faena;
	@Id
	@Column(name="rut_empresa")
	private String rutEmpresa;

	@Column(name="rut_trabajador")
	private String rutTrabajador;

	public TmpCorporacione() {
	}

	public Integer getFaena() {
		return this.faena;
	}

	public void setFaena(Integer faena) {
		this.faena = faena;
	}

	public String getRutEmpresa() {
		return this.rutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}

	public String getRutTrabajador() {
		return this.rutTrabajador;
	}

	public void setRutTrabajador(String rutTrabajador) {
		this.rutTrabajador = rutTrabajador;
	}

}