package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_FINAL" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_FINAL\"")
@NamedQuery(name="EstadoCodFinal.findAll", query="SELECT e FROM EstadoCodFinal e")
public class EstadoCodFinal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod_estado_final")
	private Integer codEstadoFinal;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodFinal() {
	}

	public Integer getCodEstadoFinal() {
		return this.codEstadoFinal;
	}

	public void setCodEstadoFinal(Integer codEstadoFinal) {
		this.codEstadoFinal = codEstadoFinal;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}