package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_SIAGF" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_SIAGF\"")
@NamedQuery(name="EstadoCodSiagf.findAll", query="SELECT e FROM EstadoCodSiagf e")
public class EstadoCodSiagf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod_estado_siagf")
	private Integer codEstadoSiagf;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodSiagf() {
	}

	public Integer getCodEstadoSiagf() {
		return this.codEstadoSiagf;
	}

	public void setCodEstadoSiagf(Integer codEstadoSiagf) {
		this.codEstadoSiagf = codEstadoSiagf;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}