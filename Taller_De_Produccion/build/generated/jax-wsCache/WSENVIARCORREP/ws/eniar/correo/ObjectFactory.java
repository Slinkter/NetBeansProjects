
package ws.eniar.correo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.eniar.correo package. 
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

    private final static QName _IMPRIMIRFECHAHORAResponse_QNAME = new QName("http://CORREO.ENIAR.WS/", "IMPRIMIRFECHAHORAResponse");
    private final static QName _IMPRIMIRFECHAHORA_QNAME = new QName("http://CORREO.ENIAR.WS/", "IMPRIMIRFECHAHORA");
    private final static QName _Enviarcorreodeconfirmacion_QNAME = new QName("http://CORREO.ENIAR.WS/", "enviarcorreodeconfirmacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.eniar.correo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IMPRIMIRFECHAHORA }
     * 
     */
    public IMPRIMIRFECHAHORA createIMPRIMIRFECHAHORA() {
        return new IMPRIMIRFECHAHORA();
    }

    /**
     * Create an instance of {@link IMPRIMIRFECHAHORAResponse }
     * 
     */
    public IMPRIMIRFECHAHORAResponse createIMPRIMIRFECHAHORAResponse() {
        return new IMPRIMIRFECHAHORAResponse();
    }

    /**
     * Create an instance of {@link Enviarcorreodeconfirmacion }
     * 
     */
    public Enviarcorreodeconfirmacion createEnviarcorreodeconfirmacion() {
        return new Enviarcorreodeconfirmacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMPRIMIRFECHAHORAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CORREO.ENIAR.WS/", name = "IMPRIMIRFECHAHORAResponse")
    public JAXBElement<IMPRIMIRFECHAHORAResponse> createIMPRIMIRFECHAHORAResponse(IMPRIMIRFECHAHORAResponse value) {
        return new JAXBElement<IMPRIMIRFECHAHORAResponse>(_IMPRIMIRFECHAHORAResponse_QNAME, IMPRIMIRFECHAHORAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IMPRIMIRFECHAHORA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CORREO.ENIAR.WS/", name = "IMPRIMIRFECHAHORA")
    public JAXBElement<IMPRIMIRFECHAHORA> createIMPRIMIRFECHAHORA(IMPRIMIRFECHAHORA value) {
        return new JAXBElement<IMPRIMIRFECHAHORA>(_IMPRIMIRFECHAHORA_QNAME, IMPRIMIRFECHAHORA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Enviarcorreodeconfirmacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CORREO.ENIAR.WS/", name = "enviarcorreodeconfirmacion")
    public JAXBElement<Enviarcorreodeconfirmacion> createEnviarcorreodeconfirmacion(Enviarcorreodeconfirmacion value) {
        return new JAXBElement<Enviarcorreodeconfirmacion>(_Enviarcorreodeconfirmacion_QNAME, Enviarcorreodeconfirmacion.class, null, value);
    }

}
