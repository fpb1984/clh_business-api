package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_CARGA" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_CARGA\"")
@NamedQuery(name="EstadoCodCarga.findAll", query="SELECT e FROM EstadoCodCarga e")
public class EstadoCodCarga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod_estado_carga")
	private Integer codEstadoCarga;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodCarga() {
	}

	public Integer getCodEstadoCarga() {
		return this.codEstadoCarga;
	}

	public void setCodEstadoCarga(Integer codEstadoCarga) {
		this.codEstadoCarga = codEstadoCarga;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}