//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.15 a las 01:11:02 PM ART 
//


package cl.clh.tramos.soap.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.clh.tramos.soap.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginLoginUsuario_QNAME = new QName("http://ws.siagf.paperless.cl", "LoginUsuario");
    private final static QName _LoginClaveUsuario_QNAME = new QName("http://ws.siagf.paperless.cl", "ClaveUsuario");
    private final static QName _LoginResponseReturn_QNAME = new QName("http://ws.siagf.paperless.cl", "return");
    private final static QName _ConsultaCausanteToken_QNAME = new QName("http://ws.siagf.paperless.cl", "Token");
    private final static QName _ConsultaCausanteRutCausante_QNAME = new QName("http://ws.siagf.paperless.cl", "RutCausante");
    private final static QName _ActualizarCausanteXmlDetalle_QNAME = new QName("http://ws.siagf.paperless.cl", "XmlDetalle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.clh.tramos.soap.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ConsultaCausante }
     * 
     */
    public ConsultaCausante createConsultaCausante() {
        return new ConsultaCausante();
    }

    /**
     * Create an instance of {@link ConsultaCausanteResponse }
     * 
     */
    public ConsultaCausanteResponse createConsultaCausanteResponse() {
        return new ConsultaCausanteResponse();
    }

    /**
     * Create an instance of {@link ActualizarCausante }
     * 
     */
    public ActualizarCausante createActualizarCausante() {
        return new ActualizarCausante();
    }

    /**
     * Create an instance of {@link ActualizarCausanteResponse }
     * 
     */
    public ActualizarCausanteResponse createActualizarCausanteResponse() {
        return new ActualizarCausanteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "LoginUsuario", scope = Login.class)
    public JAXBElement<String> createLoginLoginUsuario(String value) {
        return new JAXBElement<String>(_LoginLoginUsuario_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "ClaveUsuario", scope = Login.class)
    public JAXBElement<String> createLoginClaveUsuario(String value) {
        return new JAXBElement<String>(_LoginClaveUsuario_QNAME, String.class, Login.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "return", scope = LoginResponse.class)
    public JAXBElement<String> createLoginResponseReturn(String value) {
        return new JAXBElement<String>(_LoginResponseReturn_QNAME, String.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "Token", scope = ConsultaCausante.class)
    public JAXBElement<String> createConsultaCausanteToken(String value) {
        return new JAXBElement<String>(_ConsultaCausanteToken_QNAME, String.class, ConsultaCausante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "RutCausante", scope = ConsultaCausante.class)
    public JAXBElement<String> createConsultaCausanteRutCausante(String value) {
        return new JAXBElement<String>(_ConsultaCausanteRutCausante_QNAME, String.class, ConsultaCausante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "return", scope = ConsultaCausanteResponse.class)
    public JAXBElement<String> createConsultaCausanteResponseReturn(String value) {
        return new JAXBElement<String>(_LoginResponseReturn_QNAME, String.class, ConsultaCausanteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "Token", scope = ActualizarCausante.class)
    public JAXBElement<String> createActualizarCausanteToken(String value) {
        return new JAXBElement<String>(_ConsultaCausanteToken_QNAME, String.class, ActualizarCausante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "XmlDetalle", scope = ActualizarCausante.class)
    public JAXBElement<String> createActualizarCausanteXmlDetalle(String value) {
        return new JAXBElement<String>(_ActualizarCausanteXmlDetalle_QNAME, String.class, ActualizarCausante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.siagf.paperless.cl", name = "return", scope = ActualizarCausanteResponse.class)
    public JAXBElement<String> createActualizarCausanteResponseReturn(String value) {
        return new JAXBElement<String>(_LoginResponseReturn_QNAME, String.class, ActualizarCausanteResponse.class, value);
    }

}
