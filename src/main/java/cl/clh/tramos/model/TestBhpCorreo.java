package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the test_bhp_correo database table.
 * 
 */
@Entity
@Table(name="test_bhp_correo")
@NamedQuery(name="TestBhpCorreo.findAll", query="SELECT t FROM TestBhpCorreo t")
public class TestBhpCorreo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String email;

	public TestBhpCorreo() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}