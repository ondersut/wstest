package com.akademiservices.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.akademiservices.ws.kd.KdController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import GetSalesByDateRange.GetSalesByDateRangeResponse;
import GetSalesByDateRange.Error;


public class Utils {
	
    private GetSalesByDateRangeResponse response;
    
	private static final Logger log = LoggerFactory.getLogger(Utils.class);

	public Object[] sendHttpRequest(String URL, String httpMethod, String username, String password, String body,
                                    String contentType, String soapAction) throws MalformedURLException, IOException {
        URL = URL.replace(" ", "%20");
        URL url = new URL(URL);
        //System.out.println("Body:" + body + "\nSoapAction:" + soapAction);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        if (conn == null) {
            return new Object[2];
        }

        if (soapAction != null) { 
            /*System.out.println("Soap Action !!!!");*/
            conn.setRequestProperty("SOAPAction", soapAction);
        }

        if (contentType != null) {
            conn.setRequestProperty("Content-Type", contentType);
        }
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setUseCaches(false);
       // conn.setFollowRedirects(false);
        conn.setAllowUserInteraction(false);
        conn.setRequestMethod(httpMethod);
        conn.setReadTimeout(240000);
        conn.setConnectTimeout(240000);

        if (username != null) {
            String userpass = username + ":" + password;
            String encoding = Base64.getEncoder().encodeToString((userpass).getBytes("utf-8"));
            conn.setRequestProperty("Authorization", "Basic " + encoding);
        }

        if (body != null) {
            OutputStream out = conn.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(out, "utf-8");
            writer.write(body);
            writer.close();
            out.close();
          //  System.out.println("Request Payload;\n" + body);
        }

        InputStream in;
        if (conn.getResponseCode() > 399) {
            in = conn.getErrorStream();
        } else {
            in = conn.getInputStream();
        }

        //Handling for gzip. Response could be compressed in different other compression-algo, based on server setting
        in = "gzip".equals(conn.getHeaderField("Content-Encoding")) ? new java.util.zip.GZIPInputStream(in) : in;

        InputStreamReader iReader = new InputStreamReader(in, "utf-8");
        BufferedReader bReader = new BufferedReader(iReader);
        StringBuffer buffer = new StringBuffer();
        String line;
        while ((line = bReader.readLine()) != null) {
            buffer.append(line + "\n");
        }

        String response = new String(buffer);
        Object[] returnValue = new Object[2];
        returnValue[0] = conn.getResponseCode();
        returnValue[1] = response;
        
        System.out.println("Http Connection is done. Destination URL is:" + URL + "\nConnection Status: " + conn.getResponseCode() + ";" + "\tConnection Response: " + conn.getResponseMessage());
        if (conn.getResponseCode() > 399) {
            System.out.println("Response:" + response);
        }
        
        iReader.close();
        bReader.close();
        in.close();
        conn.disconnect();

        return returnValue;
    }

    public GetSalesByDateRangeResponse deserializeGetSalesByDateRange(String serviceResponse) {
    	GetSalesByDateRangeResponse response = new GetSalesByDateRangeResponse();

        try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(new InputSource(new StringReader(serviceResponse)));
			doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("env:Body");
	         Node nNode = nList.item(0);
	         Node nNode2 = nNode.getFirstChild();
	         Node nNode3 = nNode2.getFirstChild();
	         Element eElement = (Element) nNode3;
	         response.setNextPageAvailable(getXmlString(eElement, "nextPageAvailable"));
	         response.setResponseTime(getXmlString(eElement, "responseTime"));
	         response.setAckCode(getXmlString(eElement, "ackCode"));
	         if(getXmlString(eElement, "ackCode").equals("failure")) {
		   
	         }
	         
	         
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	
    	return response;
    }
    
    public void errorAssigner(GetSalesByDateRangeResponse response,Element eElement) {
    	Error error = new Error();
    	error.setErrorId(getXmlString(eElement, "errorId"));
    	error.setErrorCode(getXmlString(eElement, "errorCode"));
    	error.setMessage(getXmlString(eElement, "message"));
    	error.setViewMessage(getXmlString(eElement, "viewMessage"));
    }
    
    
    public String getXmlString(Element eElement,String tagName) {
    	return eElement
                .getElementsByTagName(tagName)
                .item(0)
                .getTextContent();
    }
}


