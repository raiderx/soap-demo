
package org.soapdemo.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soapdemo.client.generated package. 
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

    private final static QName _GetAllAirportsResponse_QNAME = new QName("http://server.soapdemo.org/", "getAllAirportsResponse");
    private final static QName _GetAllAircrafts_QNAME = new QName("http://server.soapdemo.org/", "getAllAircrafts");
    private final static QName _GetAllAircraftsResponse_QNAME = new QName("http://server.soapdemo.org/", "getAllAircraftsResponse");
    private final static QName _GetAllAirports_QNAME = new QName("http://server.soapdemo.org/", "getAllAirports");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soapdemo.client.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link GetAllAirportsResponse }
     * 
     */
    public GetAllAirportsResponse createGetAllAirportsResponse() {
        return new GetAllAirportsResponse();
    }

    /**
     * Create an instance of {@link GetAllAircrafts }
     * 
     */
    public GetAllAircrafts createGetAllAircrafts() {
        return new GetAllAircrafts();
    }

    /**
     * Create an instance of {@link GetAllAircraftsResponse }
     * 
     */
    public GetAllAircraftsResponse createGetAllAircraftsResponse() {
        return new GetAllAircraftsResponse();
    }

    /**
     * Create an instance of {@link Aircraft }
     * 
     */
    public Aircraft createAircraft() {
        return new Aircraft();
    }

    /**
     * Create an instance of {@link GetAllAirports }
     * 
     */
    public GetAllAirports createGetAllAirports() {
        return new GetAllAirports();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAirportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapdemo.org/", name = "getAllAirportsResponse")
    public JAXBElement<GetAllAirportsResponse> createGetAllAirportsResponse(GetAllAirportsResponse value) {
        return new JAXBElement<GetAllAirportsResponse>(_GetAllAirportsResponse_QNAME, GetAllAirportsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAircrafts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapdemo.org/", name = "getAllAircrafts")
    public JAXBElement<GetAllAircrafts> createGetAllAircrafts(GetAllAircrafts value) {
        return new JAXBElement<GetAllAircrafts>(_GetAllAircrafts_QNAME, GetAllAircrafts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAircraftsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapdemo.org/", name = "getAllAircraftsResponse")
    public JAXBElement<GetAllAircraftsResponse> createGetAllAircraftsResponse(GetAllAircraftsResponse value) {
        return new JAXBElement<GetAllAircraftsResponse>(_GetAllAircraftsResponse_QNAME, GetAllAircraftsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAirports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.soapdemo.org/", name = "getAllAirports")
    public JAXBElement<GetAllAirports> createGetAllAirports(GetAllAirports value) {
        return new JAXBElement<GetAllAirports>(_GetAllAirports_QNAME, GetAllAirports.class, null, value);
    }

}
