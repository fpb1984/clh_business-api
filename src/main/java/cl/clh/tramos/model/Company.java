package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the companys database table.
 * 
 */
@Entity
@Table(name="companys")
@NamedQuery(name="Company.findAll", query="SELECT c FROM Company c")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	@Column(name="razon_social")
	private String razonSocial;

	private String rut;

	private String telefono;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to UsersCompany
	@OneToMany(mappedBy="company")
	private List<UsersCompany> usersCompanys;

	public Company() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<UsersCompany> getUsersCompanys() {
		return this.usersCompanys;
	}

	public void setUsersCompanys(List<UsersCompany> usersCompanys) {
		this.usersCompanys = usersCompanys;
	}

	public UsersCompany addUsersCompany(UsersCompany usersCompany) {
		getUsersCompanys().add(usersCompany);
		usersCompany.setCompany(this);

		return usersCompany;
	}

	public UsersCompany removeUsersCompany(UsersCompany usersCompany) {
		getUsersCompanys().remove(usersCompany);
		usersCompany.setCompany(null);

		return usersCompany;
	}

}