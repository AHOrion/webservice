package controller;

public class AutenticacionControllerProxy implements controller.AutenticacionController {
  private String _endpoint = null;
  private controller.AutenticacionController autenticacionController = null;
  
  public AutenticacionControllerProxy() {
    _initAutenticacionControllerProxy();
  }
  
  public AutenticacionControllerProxy(String endpoint) {
    _endpoint = endpoint;
    _initAutenticacionControllerProxy();
  }
  
  private void _initAutenticacionControllerProxy() {
    try {
      autenticacionController = (new controller.AutenticacionControllerServiceLocator()).getAutenticacionController();
      if (autenticacionController != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)autenticacionController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)autenticacionController)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (autenticacionController != null)
      ((javax.xml.rpc.Stub)autenticacionController)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public controller.AutenticacionController getAutenticacionController() {
    if (autenticacionController == null)
      _initAutenticacionControllerProxy();
    return autenticacionController;
  }
  
  public boolean autenticarCliente(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException{
    if (autenticacionController == null)
      _initAutenticacionControllerProxy();
    return autenticacionController.autenticarCliente(usuario, password);
  }
  
  public javabeans.Cliente obtenerCliente(java.lang.String usuario, java.lang.String password) throws java.rmi.RemoteException{
    if (autenticacionController == null)
      _initAutenticacionControllerProxy();
    return autenticacionController.obtenerCliente(usuario, password);
  }
  
  
}