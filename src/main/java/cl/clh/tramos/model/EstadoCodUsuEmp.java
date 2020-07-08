package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_USU_EMP" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_USU_EMP\"")
@NamedQuery(name="EstadoCodUsuEmp.findAll", query="SELECT e FROM EstadoCodUsuEmp e")
public class EstadoCodUsuEmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cod_estado")
	private Integer codEstado;

	@Id
	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodUsuEmp() {
	}

	public Integer getCodEstado() {
		return this.codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}