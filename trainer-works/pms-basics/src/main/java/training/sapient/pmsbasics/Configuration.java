package training.sapient.pmsbasics;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// this prefix is taken from application.properties -> now bootstrap.properties

@ConfigurationProperties(prefix="pms-product-service")

@org.springframework.context.annotation.Configuration
public class Configuration {

	private int port; 
	private String ipAddress;
	
	
	public Configuration() {}
	public Configuration(int port, String ipAddress) {
		super();
		this.port = port;
		this.ipAddress = ipAddress;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	} 
	
	
	
	
	
}
