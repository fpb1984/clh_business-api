package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "SERVICES_COD_ORIGEN" database table.
 * 
 */
@Entity
@Table(name="\"SERVICES_COD_ORIGEN\"")
@NamedQuery(name="ServicesCodOrigen.findAll", query="SELECT s FROM ServicesCodOrigen s")
public class ServicesCodOrigen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cod_origen")
	private Integer codOrigen;

	private String descripcion;

	public ServicesCodOrigen() {
	}

	public Integer getCodOrigen() {
		return this.codOrigen;
	}

	public void setCodOrigen(Integer codOrigen) {
		this.codOrigen = codOrigen;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}