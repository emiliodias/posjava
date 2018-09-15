
package br.com.unitri.posjava.contatosw.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.unitri.posjava.contatosw.ws package. 
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

    private final static QName _ListaContatosResponse_QNAME = new QName("http://ws.contatosw.posjava.unitri.com.br/", "listaContatosResponse");
    private final static QName _ListaContatos_QNAME = new QName("http://ws.contatosw.posjava.unitri.com.br/", "listaContatos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.unitri.posjava.contatosw.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaContatosResponse }
     * 
     */
    public ListaContatosResponse createListaContatosResponse() {
        return new ListaContatosResponse();
    }

    /**
     * Create an instance of {@link ListaContatos }
     * 
     */
    public ListaContatos createListaContatos() {
        return new ListaContatos();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaContatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.contatosw.posjava.unitri.com.br/", name = "listaContatosResponse")
    public JAXBElement<ListaContatosResponse> createListaContatosResponse(ListaContatosResponse value) {
        return new JAXBElement<ListaContatosResponse>(_ListaContatosResponse_QNAME, ListaContatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaContatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.contatosw.posjava.unitri.com.br/", name = "listaContatos")
    public JAXBElement<ListaContatos> createListaContatos(ListaContatos value) {
        return new JAXBElement<ListaContatos>(_ListaContatos_QNAME, ListaContatos.class, null, value);
    }

}
