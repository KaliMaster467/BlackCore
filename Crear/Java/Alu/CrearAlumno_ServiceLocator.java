/**
 * CrearAlumno_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jan 15, 2016 (09:43:21 UTC) WSDL2Java emitter.
 */

package Alu;

public class CrearAlumno_ServiceLocator extends org.apache.axis.client.Service implements Alu.CrearAlumno_Service {

/**
 * gSOAP 2.8.36 generated service definition
 */

    public CrearAlumno_ServiceLocator() {
    }


    public CrearAlumno_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CrearAlumno_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CrearAlumno
    private java.lang.String CrearAlumno_address = "http://localhost/cgi-bin/CrearAlumno.cgi";

    public java.lang.String getCrearAlumnoAddress() {
        return CrearAlumno_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CrearAlumnoWSDDServiceName = "CrearAlumno";

    public java.lang.String getCrearAlumnoWSDDServiceName() {
        return CrearAlumnoWSDDServiceName;
    }

    public void setCrearAlumnoWSDDServiceName(java.lang.String name) {
        CrearAlumnoWSDDServiceName = name;
    }

    public Alu.CrearAlumnoPortType getCrearAlumno() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CrearAlumno_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCrearAlumno(endpoint);
    }

    public Alu.CrearAlumnoPortType getCrearAlumno(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Alu.CrearAlumno_BindingStub _stub = new Alu.CrearAlumno_BindingStub(portAddress, this);
            _stub.setPortName(getCrearAlumnoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCrearAlumnoEndpointAddress(java.lang.String address) {
        CrearAlumno_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Alu.CrearAlumnoPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                Alu.CrearAlumno_BindingStub _stub = new Alu.CrearAlumno_BindingStub(new java.net.URL(CrearAlumno_address), this);
                _stub.setPortName(getCrearAlumnoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CrearAlumno".equals(inputPortName)) {
            return getCrearAlumno();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:CrearAlumno", "CrearAlumno");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:CrearAlumno", "CrearAlumno"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CrearAlumno".equals(portName)) {
            setCrearAlumnoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
