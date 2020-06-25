//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.06.26 um 12:04:43 AM CEST 
//


package com.wetter_service.java;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wetter_service.java package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wetter_service.java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCountryRequest }
     * 
     */
    public GetCountryRequest createGetCountryRequest() {
        return new GetCountryRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link GetForecastRequest }
     * 
     */
    public GetForecastRequest createGetForecastRequest() {
        return new GetForecastRequest();
    }

    /**
     * Create an instance of {@link GetForecastResponse }
     * 
     */
    public GetForecastResponse createGetForecastResponse() {
        return new GetForecastResponse();
    }

    /**
     * Create an instance of {@link GetTemperaturRequest }
     * 
     */
    public GetTemperaturRequest createGetTemperaturRequest() {
        return new GetTemperaturRequest();
    }

    /**
     * Create an instance of {@link GetTemperaturResponse }
     * 
     */
    public GetTemperaturResponse createGetTemperaturResponse() {
        return new GetTemperaturResponse();
    }

    /**
     * Create an instance of {@link GetWindAndDirectionRequest }
     * 
     */
    public GetWindAndDirectionRequest createGetWindAndDirectionRequest() {
        return new GetWindAndDirectionRequest();
    }

    /**
     * Create an instance of {@link GetWindAndDirectionResponse }
     * 
     */
    public GetWindAndDirectionResponse createGetWindAndDirectionResponse() {
        return new GetWindAndDirectionResponse();
    }

    /**
     * Create an instance of {@link WindAndDirection }
     * 
     */
    public WindAndDirection createWindAndDirection() {
        return new WindAndDirection();
    }

}
