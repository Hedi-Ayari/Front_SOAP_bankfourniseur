
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _VerserResponse_QNAME = new QName("http://service/", "verserResponse");
    private final static QName _RetirerResponse_QNAME = new QName("http://service/", "retirerResponse");
    private final static QName _Retirer_QNAME = new QName("http://service/", "retirer");
    private final static QName _GetCurrentSoldeResponse_QNAME = new QName("http://service/", "getCurrentSoldeResponse");
    private final static QName _ConversionResponse_QNAME = new QName("http://service/", "conversionResponse");
    private final static QName _Conversion_QNAME = new QName("http://service/", "conversion");
    private final static QName _Verser_QNAME = new QName("http://service/", "verser");
    private final static QName _GetCurrentSolde_QNAME = new QName("http://service/", "getCurrentSolde");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetCurrentSoldeResponse }
     * 
     */
    public GetCurrentSoldeResponse createGetCurrentSoldeResponse() {
        return new GetCurrentSoldeResponse();
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link VerserResponse }
     * 
     */
    public VerserResponse createVerserResponse() {
        return new VerserResponse();
    }

    /**
     * Create an instance of {@link GetCurrentSolde }
     * 
     */
    public GetCurrentSolde createGetCurrentSolde() {
        return new GetCurrentSolde();
    }

    /**
     * Create an instance of {@link Verser }
     * 
     */
    public Verser createVerser() {
        return new Verser();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verserResponse")
    public JAXBElement<VerserResponse> createVerserResponse(VerserResponse value) {
        return new JAXBElement<VerserResponse>(_VerserResponse_QNAME, VerserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCurrentSoldeResponse")
    public JAXBElement<GetCurrentSoldeResponse> createGetCurrentSoldeResponse(GetCurrentSoldeResponse value) {
        return new JAXBElement<GetCurrentSoldeResponse>(_GetCurrentSoldeResponse_QNAME, GetCurrentSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<ConversionResponse>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<Conversion>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "verser")
    public JAXBElement<Verser> createVerser(Verser value) {
        return new JAXBElement<Verser>(_Verser_QNAME, Verser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCurrentSolde")
    public JAXBElement<GetCurrentSolde> createGetCurrentSolde(GetCurrentSolde value) {
        return new JAXBElement<GetCurrentSolde>(_GetCurrentSolde_QNAME, GetCurrentSolde.class, null, value);
    }

}
