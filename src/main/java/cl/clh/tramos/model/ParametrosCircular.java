package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "PARAMETROS_CIRCULAR" database table.
 * 
 */
@Entity
@Table(name="\"PARAMETROS_CIRCULAR\"")
@NamedQuery(name="ParametrosCircular.findAll", query="SELECT p FROM ParametrosCircular p")
public class ParametrosCircular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="\"ID\"")
	private Integer id;

	@Column(name="\"CIRCULAR\"")
	private String circular;

	@Column(name="\"PERIODO_DESDE\"")
	private Integer periodoDesde;

	@Column(name="\"PERIODO_HASTA\"")
	private Integer periodoHasta;

	@Column(name="\"VALIDO\"")
	private Boolean valido;

	public ParametrosCircular() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCircular() {
		return this.circular;
	}

	public void setCircular(String circular) {
		this.circular = circular;
	}

	public Integer getPeriodoDesde() {
		return this.periodoDesde;
	}

	public void setPeriodoDesde(Integer periodoDesde) {
		this.periodoDesde = periodoDesde;
	}

	public Integer getPeriodoHasta() {
		return this.periodoHasta;
	}

	public void setPeriodoHasta(Integer periodoHasta) {
		this.periodoHasta = periodoHasta;
	}

	public Boolean getValido() {
		return this.valido;
	}

	public void setValido(Boolean valido) {
		this.valido = valido;
	}

}