package com.sillycat.springbootcxf.endpoint;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.developer.ArrayOfString;
import com.intuit.developer.TroubleshootWebServiceFSSoap;
import com.sillycat.springbootcxf.service.HelloService;

@Service
public class TroubleshootWebServiceFSSoapEndpoint implements TroubleshootWebServiceFSSoap {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HelloService helloService;

	@Override
	public String serverVersion() {
		LOGGER.info("enter method server version");
		return "1.0";
	}

	@Override
	public String clientVersion(String strVersion) {
		LOGGER.info("enter method client version");
		return null;
	}

	@Override
	public ArrayOfString authenticate(String strUserName, String strPassword) {
		LOGGER.info("enter method authenticate, strUserName:" + strUserName + " strPassword:" + strPassword);
		ArrayOfString arrayOfString = new ArrayOfString();
		arrayOfString.getString().add(UUID.randomUUID().toString());
		arrayOfString.getString().add("NONE");
		helloService.sayHello("YiYi Kang");
		return arrayOfString;
	}

	@Override
	public String connectionError(String ticket, String hresult, String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendRequestXML(String ticket, String strHCPResponse, String strCompanyFileName, String qbXMLCountry,
			int qbXMLMajorVers, int qbXMLMinorVers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int receiveResponseXML(String ticket, String response, String hresult, String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getLastError(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeConnection(String ticket) {
		// TODO Auto-generated method stub
		return null;
	}

}
