package cl.clh.tramos.soap.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="respuesta", namespace="http://ws.siagf.paperless.cl")
@XmlType(name = "", propOrder = {
	    "codigo", "mensaje"})
public class Respuesta {

	String Codigo;

	String Mensaje;
	
	@XmlElement(name = "Codigo", namespace = "http://ws.siagf.paperless.cl", required = false)
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String Codigo) {
		this.Codigo = Codigo;
	}

	@XmlElement(name = "Mensaje", namespace = "http://ws.siagf.paperless.cl", required = false)
	public String getMensaje() {
		return Mensaje;
	}

	public void setMensaje(String Mensaje) {
		this.Mensaje = Mensaje;
	}
}
