
package br.com.unitri.posjava.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClienteWS", targetNamespace = "http://ws.posjava.unitri.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "salvar", targetNamespace = "http://ws.posjava.unitri.com.br/", className = "br.com.unitri.posjava.ws.Salvar")
    @ResponseWrapper(localName = "salvarResponse", targetNamespace = "http://ws.posjava.unitri.com.br/", className = "br.com.unitri.posjava.ws.SalvarResponse")
    public void salvar(
        @WebParam(name = "arg0", targetNamespace = "")
        Cliente arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.unitri.posjava.ws.Cliente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCliente", targetNamespace = "http://ws.posjava.unitri.com.br/", className = "br.com.unitri.posjava.ws.GetCliente")
    @ResponseWrapper(localName = "getClienteResponse", targetNamespace = "http://ws.posjava.unitri.com.br/", className = "br.com.unitri.posjava.ws.GetClienteResponse")
    public Cliente getCliente(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

}