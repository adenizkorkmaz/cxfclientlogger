package com.w3schools.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.2
 * 2015-09-22T16:08:02.063+03:00
 * Generated source version: 3.1.2
 * 
 */
@WebServiceClient(name = "TempConvert", 
                  wsdlLocation = "http://www.w3schools.com/webservices/tempconvert.asmx?WSDL",
                  targetNamespace = "http://www.w3schools.com/webservices/") 
public class TempConvert extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.w3schools.com/webservices/", "TempConvert");
    public final static QName TempConvertSoap = new QName("http://www.w3schools.com/webservices/", "TempConvertSoap");
    public final static QName TempConvertSoap12 = new QName("http://www.w3schools.com/webservices/", "TempConvertSoap12");
    public final static QName TempConvertHttpPost = new QName("http://www.w3schools.com/webservices/", "TempConvertHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://www.w3schools.com/webservices/tempconvert.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TempConvert.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://www.w3schools.com/webservices/tempconvert.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public TempConvert(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TempConvert(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TempConvert() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public TempConvert(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TempConvert(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TempConvert(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap() {
        return super.getPort(TempConvertSoap, TempConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap")
    public TempConvertSoap getTempConvertSoap(WebServiceFeature... features) {
        return super.getPort(TempConvertSoap, TempConvertSoap.class, features);
    }


    /**
     *
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap12")
    public TempConvertSoap getTempConvertSoap12() {
        return super.getPort(TempConvertSoap12, TempConvertSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertSoap
     */
    @WebEndpoint(name = "TempConvertSoap12")
    public TempConvertSoap getTempConvertSoap12(WebServiceFeature... features) {
        return super.getPort(TempConvertSoap12, TempConvertSoap.class, features);
    }


    /**
     *
     * @return
     *     returns TempConvertHttpPost
     */
    @WebEndpoint(name = "TempConvertHttpPost")
    public TempConvertHttpPost getTempConvertHttpPost() {
        return super.getPort(TempConvertHttpPost, TempConvertHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TempConvertHttpPost
     */
    @WebEndpoint(name = "TempConvertHttpPost")
    public TempConvertHttpPost getTempConvertHttpPost(WebServiceFeature... features) {
        return super.getPort(TempConvertHttpPost, TempConvertHttpPost.class, features);
    }

}
