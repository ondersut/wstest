package com.akademiservices.ws.kd;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akademiservices.utils.Utils;

import GetSalesByDateRange.GetSalesByDateRangeRequest;
//import GetSalesByDateRange.GetSalesByDateRangeResponse;

@RestController
public class KdController {
	
	private static final Logger log = LoggerFactory.getLogger(KdController.class);
    
	Utils utils = new Utils();
	
	

	@PostMapping("/api/1.0/gittiGidiyor/getSalesByDateRange")
	public String gittiGidiyorGetSalesByDateRange2 (@RequestBody GetSalesByDateRangeRequest body) {
		String response=null;
		  Object[] returnValue = new Object[2];
		  String payload = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sale=\"http://sale.individual.ws.listingapi.gg.com\">\r\n"
				+ "   <soapenv:Header/>\r\n"
				+ "   <soapenv:Body>\r\n"
				+ "      <sale:getSalesByDateRange>\r\n"
				+ "         <apiKey>"+body.getApiKey()+"</apiKey>\r\n"
				+ "         <sign>"+body.getSign()+"</sign>\r\n"
				+ "         <time>"+body.getTime()+"</time>\r\n"
				+ "         <withData>"+body.getWithData()+"</withData>\r\n"
				+ "         <byStatus>"+body.getByStatus()+"</byStatus>\r\n"
				+ "         <byUser>"+body.getByUser()+"</byUser>\r\n"
				+ "         <orderBy>"+body.getOrderBy()+"</orderBy>\r\n"
				+ "         <orderType>"+body.getOrderType()+"</orderType>\r\n"
				+ "         <startDate>"+body.getStartDate()+"</startDate>\r\n"
				+ "         <endDate>"+body.getEndDate()+"</endDate>\r\n"
				+ "         <pageNumber>"+body.getPageNumber()+"</pageNumber>\r\n"
				+ "         <pageSize>"+body.getPageSize()+"</pageSize>\r\n"
				+ "         <lang>"+body.getLang()+"</lang>\r\n"
				+ "      </sale:getSalesByDateRange>\r\n"
				+ "   </soapenv:Body>\r\n"
				+ "</soapenv:Envelope>";
	//	log.info(payload);
		try {
			returnValue =utils.sendHttpRequest("http://dev.gittigidiyor.com:8080/listingapi/ws/IndividualSaleService", "POST", "KahveDunyasi", "EAYwgBPQWPUfXT6nZjDkm5zAS2BceMch", payload, "text/xml", "http://sale.individual.ws.listingapi.gg.com/IndividualSaleService/getSalesByDateRangeRequest");
			log.info((String) returnValue[1]);
			JSONObject json = XML.toJSONObject((String) returnValue[1]);   
	        String jsonString = json.toString(4);  
	        System.out.println(jsonString);  
	        response =jsonString;
	}catch (JSONException e) {  
	// TODO: handle exception  
	System.out.println(e.toString());  
	}  
		 catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}
	
	
}
