package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_SAP" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_SAP\"")
@NamedQuery(name="EstadoCodSap.findAll", query="SELECT e FROM EstadoCodSap e")
public class EstadoCodSap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod_estado_sap")
	private Integer codEstadoSap;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodSap() {
	}

	public Integer getCodEstadoSap() {
		return this.codEstadoSap;
	}

	public void setCodEstadoSap(Integer codEstadoSap) {
		this.codEstadoSap = codEstadoSap;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}