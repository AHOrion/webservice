package org.tempuri.OVCServWeb.OVCCallejero;

public class Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy implements org.tempuri.OVCServWeb.OVCCallejero.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap {
  private String _endpoint = null;
  private org.tempuri.OVCServWeb.OVCCallejero.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap = null;
  
  public Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy() {
    _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
  }
  
  public Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
  }
  
  private void _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy() {
    try {
      callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap = (new org.tempuri.OVCServWeb.OVCCallejero.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroLocator()).getCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap();
      if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap != null)
      ((javax.xml.rpc.Stub)callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OVCServWeb.OVCCallejero.Callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap getCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap() {
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap;
  }
  
  public es.meh.catastro.www.Consulta_DNP consulta_DNPRC(java.lang.String provincia, java.lang.String municipio, java.lang.String RC) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.consulta_DNPRC(provincia, municipio, RC);
  }
  
  public es.meh.catastro.www.Provincias obtenerProvincias() throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.obtenerProvincias();
  }
  
  public es.meh.catastro.www.Municipios obtenerMunicipios(java.lang.String provincia, java.lang.String municipio) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.obtenerMunicipios(provincia, municipio);
  }
  
  public es.meh.catastro.www.Callejero obtenerCallejero(java.lang.String provincia, java.lang.String municipio, java.lang.String tipoVia, java.lang.String nombreVia) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.obtenerCallejero(provincia, municipio, tipoVia, nombreVia);
  }
  
  public es.meh.catastro.www.Callejero obtenerNumerero(java.lang.String provincia, java.lang.String municipio, java.lang.String tipoVia, java.lang.String nomVia, java.lang.String numero) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.obtenerNumerero(provincia, municipio, tipoVia, nomVia, numero);
  }
  
  public es.meh.catastro.www.Consulta_DNP consulta_DNPLOC(java.lang.String provincia, java.lang.String municipio, java.lang.String sigla, java.lang.String calle, java.lang.String numero, java.lang.String bloque, java.lang.String escalera, java.lang.String planta, java.lang.String puerta) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.consulta_DNPLOC(provincia, municipio, sigla, calle, numero, bloque, escalera, planta, puerta);
  }
  
  public es.meh.catastro.www.Consulta_DNPPP consulta_DNPPP(java.lang.String provincia, java.lang.String municipio, java.lang.String poligono, java.lang.String parcela) throws java.rmi.RemoteException{
    if (callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap == null)
      _initCallejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoapProxy();
    return callejero_x0020_de_x0020_la_x0020_sede_x0020_electrónica_x0020_del_x0020_catastroSoap.consulta_DNPPP(provincia, municipio, poligono, parcela);
  }
  
  
}