
package br.com.unitri.posjava.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.unitri.posjava.ws package. 
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

    private final static QName _Salvar_QNAME = new QName("http://ws.posjava.unitri.com.br/", "salvar");
    private final static QName _GetCliente_QNAME = new QName("http://ws.posjava.unitri.com.br/", "getCliente");
    private final static QName _GetClienteResponse_QNAME = new QName("http://ws.posjava.unitri.com.br/", "getClienteResponse");
    private final static QName _SalvarResponse_QNAME = new QName("http://ws.posjava.unitri.com.br/", "salvarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.unitri.posjava.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetClienteResponse }
     * 
     */
    public GetClienteResponse createGetClienteResponse() {
        return new GetClienteResponse();
    }

    /**
     * Create an instance of {@link SalvarResponse }
     * 
     */
    public SalvarResponse createSalvarResponse() {
        return new SalvarResponse();
    }

    /**
     * Create an instance of {@link GetCliente }
     * 
     */
    public GetCliente createGetCliente() {
        return new GetCliente();
    }

    /**
     * Create an instance of {@link Salvar }
     * 
     */
    public Salvar createSalvar() {
        return new Salvar();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salvar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.posjava.unitri.com.br/", name = "salvar")
    public JAXBElement<Salvar> createSalvar(Salvar value) {
        return new JAXBElement<Salvar>(_Salvar_QNAME, Salvar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.posjava.unitri.com.br/", name = "getCliente")
    public JAXBElement<GetCliente> createGetCliente(GetCliente value) {
        return new JAXBElement<GetCliente>(_GetCliente_QNAME, GetCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.posjava.unitri.com.br/", name = "getClienteResponse")
    public JAXBElement<GetClienteResponse> createGetClienteResponse(GetClienteResponse value) {
        return new JAXBElement<GetClienteResponse>(_GetClienteResponse_QNAME, GetClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.posjava.unitri.com.br/", name = "salvarResponse")
    public JAXBElement<SalvarResponse> createSalvarResponse(SalvarResponse value) {
        return new JAXBElement<SalvarResponse>(_SalvarResponse_QNAME, SalvarResponse.class, null, value);
    }

}
