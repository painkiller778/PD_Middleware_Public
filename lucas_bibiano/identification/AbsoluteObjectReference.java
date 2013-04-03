package lucas_bibiano.identification;

public class AbsoluteObjectReference {
    
    //endpoint
    private String ip;
    private int port;
    
    private String protocol;
    
    private String objectID;
    private String invokerID;
    
    public AbsoluteObjectReference()
    {
	
    }
    
    public AbsoluteObjectReference(String ip, int port, String protocol, String objectID, String invokerID)
    {
	setIp(ip);
	setPort(port);
	setProtocol(protocol);
	setObjectID(objectID);
	setInvokerID(invokerID);
    }
    
    public String getIp() {
	return ip;
    }
    public void setIp(String ip) {
	this.ip = ip;
    }
    public int getPort() {
	return port;
    }
    public void setPort(int port) {
	this.port = port;
    }
    public String getProtocol() {
	return protocol;
    }
    public void setProtocol(String protocol) {
	this.protocol = protocol;
    }
    public String getObjectID() {
	return objectID;
    }
    public void setObjectID(String objectID) {
	this.objectID = objectID;
    }
    public String getInvokerID() {
	return invokerID;
    }
    public void setInvokerID(String invokerID) {
	this.invokerID = invokerID;
    }
    
}
