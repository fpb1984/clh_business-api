package cl.clh.tramos.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ADRC" database table.
 * 
 */
@Entity
@Table(name="\"ADRC\"")
@NamedQuery(name="Adrc.findAll", query="SELECT a FROM Adrc a")
public class Adrc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"ADDRNUMBER\"")
	private String addrnumber;

	@Column(name="\"CITY_CODE\"")
	private String cityCode;

	@Column(name="\"CITY1\"")
	private String city1;

	@Column(name="\"CITY2\"")
	private String city2;

	@Id
	@Column(name="\"CITYP_CODE\"")
	private String citypCode;

	@Column(name="\"DATE_TO\"")
	private String dateTo;

	@Column(name="\"REGION\"")
	private String region;

	public Adrc() {
	}

	public String getAddrnumber() {
		return this.addrnumber;
	}

	public void setAddrnumber(String addrnumber) {
		this.addrnumber = addrnumber;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCity1() {
		return this.city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	public String getCity2() {
		return this.city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	public String getCitypCode() {
		return this.citypCode;
	}

	public void setCitypCode(String citypCode) {
		this.citypCode = citypCode;
	}

	public String getDateTo() {
		return this.dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}