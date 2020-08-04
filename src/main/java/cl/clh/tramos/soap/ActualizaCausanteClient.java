package cl.clh.tramos.soap;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import cl.clh.tramos.soap.dto.ActualizarCausante;
import cl.clh.tramos.soap.dto.ActualizarCausanteResponse;
import cl.clh.tramos.soap.dto.Causante;
import cl.clh.tramos.soap.dto.ObjectFactory;
import cl.clh.tramos.soap.dto.Respuesta2;


public class ActualizaCausanteClient extends WebServiceGatewaySupport {
   
	public Respuesta2 modificarCausante(String token, String rut, BigDecimal ingPromedio, String periodo, int numTramo, int montoUnitarioBeneficio, Causante causante ){

		ObjectFactory fact = new ObjectFactory();   
		ActualizarCausante actualizarCausante = new ActualizarCausante();
		actualizarCausante.setToken(fact.createActualizarCausanteToken(token));
		
		
		
		String detalle = ("<?xml version=\"1.0\"?><ActualizacionCausante\n" + 
				"\n" + 
				"xmlns:ns1=\"http://siagf.paperless.cl/Siagf\" version=\"1.0\">\n" + 
				"\n" + 
				"        <FechaEmision>2019-06-05</FechaEmision>\n" + 
				"\n" + 
				"        <Tupla>\n" + 
				"\n" + 
				"            <RutCausante>" + causante.getRutCausante() + "</RutCausante>\n" + 
				"\n" + 
				"            <CodTipoCausante>" + causante.getCodTipoCausante() + "</CodTipoCausante>\n" + 
				"\n" + 
				"            <CodEntidadAdm>10106</CodEntidadAdm>\n" + 
				"\n" + 
				"            <FecRecCausante>" +causante.getFecRecCausante()+ "</FecRecCausante>\n" + 
				"\n" + 
				"            <RutBeneficiario>" + rut + "</RutBeneficiario>\n" + 
				"\n" + 
				"            <CodTipoBeneficio>" + causante.getCodTipoBeneficio() + "</CodTipoBeneficio>\n" + 
				"\n" + 
				"        </Tupla>\n" + 
				"\n" + 
				"        <Modificar>\n" + 
				"\n" + 
				"            <IngPromedio>" + Double.valueOf(ingPromedio.toString()).intValue() +"</IngPromedio>\n" + 
				"\n" + 
				"            <Tramos>\n" + 
				"\n" + 
				"                <Tramo>\n" + 
				"\n" + 
				"                    <Periodo>"+ periodo + "</Periodo>\n" + 
				"\n" + 
				"                    <NumTramo>" + numTramo + "</NumTramo>\n" + 
				"\n" + 
				"                    <IngPromedio>"+ Double.valueOf(ingPromedio.toString()).intValue()  + "</IngPromedio>\n" + 
				"\n" + 
				"                    <MontoUnitarioBeneficio>" + montoUnitarioBeneficio + "</MontoUnitarioBeneficio>\n" + 
				"\n" + 
				"                </Tramo>\n" + 
				"\n" + 
				"            </Tramos>\n" + 
				"\n" + 
				"\n" + 
				"        </Modificar></ActualizacionCausante>");
			byte[] iso88591Data = null;

			try {
				iso88591Data = detalle.getBytes("ISO-8859-1");
				actualizarCausante.setXmlDetalle(fact.createActualizarCausanteXmlDetalle(new String(iso88591Data)));
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	    Respuesta2 resp2 = new Respuesta2();
//	    
//	    String strXML =((ActualizarCausanteResponse)(getWebServiceTemplate().marshalSendAndReceive(actualizarCausante))).getReturn().getValue();
//
//		ret = strXML.substring(strXML.indexOf("<Mensaje>") + 9, strXML.indexOf("</Mensaje>"));
		
		try {

					String strXML =((ActualizarCausanteResponse)getWebServiceTemplate().marshalSendAndReceive(actualizarCausante)).getReturn().getValue();
					
					strXML= strXML.substring(strXML.indexOf("\n"), strXML.length());
					resp2.setCodigo(strXML.substring(strXML.indexOf("<Codigo>") + 8, strXML.indexOf("</Codigo>")));
					resp2.setMensaje(strXML.substring(strXML.indexOf("<Mensaje>") + 9, strXML.indexOf("</Mensaje>")));
					System.out.println(resp2.getMensaje());
					resp2.setNroDocumento((strXML.substring(strXML.indexOf("<NroDocumento>") + 14, strXML.indexOf("</NroDocumento>"))));
					resp2.setNroAtencion((strXML.substring(strXML.indexOf("<NroAtencion>") + 12, strXML.indexOf("</NroAtencion>"))));

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
   
		return resp2;
       
    }

}
