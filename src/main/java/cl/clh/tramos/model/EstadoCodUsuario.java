package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ESTADO_COD_USUARIO" database table.
 * 
 */
@Entity
@Table(name="\"ESTADO_COD_USUARIO\"")
@NamedQuery(name="EstadoCodUsuario.findAll", query="SELECT e FROM EstadoCodUsuario e")
public class EstadoCodUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_estado_usuario")
	private Integer codEstadoUsuario;

	@Column(name="desc_estado")
	private String descEstado;

	public EstadoCodUsuario() {
	}

	public Integer getCodEstadoUsuario() {
		return this.codEstadoUsuario;
	}

	public void setCodEstadoUsuario(Integer codEstadoUsuario) {
		this.codEstadoUsuario = codEstadoUsuario;
	}

	public String getDescEstado() {
		return this.descEstado;
	}

	public void setDescEstado(String descEstado) {
		this.descEstado = descEstado;
	}

}