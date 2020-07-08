package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_INTEGRA_SAP" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_INTEGRA_SAP\"")
@NamedQuery(name="EstadoIntegraSap.findAll", query="SELECT e FROM EstadoIntegraSap e")
public class EstadoIntegraSap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_estado")
	private Integer idEstado;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoIntegraSap() {
	}

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}