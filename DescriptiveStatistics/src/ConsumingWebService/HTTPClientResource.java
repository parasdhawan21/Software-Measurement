package ConsumingWebService;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.*;


import com.google.gson.Gson;

import Model.DescriptiveStatisticsModel;

import java.io.*;


public class HTTPClientResource {
	  
	  private String url;
	  private HttpClient client ;
	  private DescriptiveStatisticsModel statisticsModel;
	  
	  /*public static void main(String[] args) {
		// Create an instance of HttpClient.
	    client = new HttpClient(); 
	    getRequest(5);   
	  }*/
	  
	  public HTTPClientResource(int size) {
		  url = "http://localhost/DescriptiveStatisticsWebServices/webapi/statistics";
		  client = new HttpClient(); 
		  getRequest(size);
		  client=null;
	  }
	  
	  public DescriptiveStatisticsModel getStatisticsObject() {
		  return this.statisticsModel;
	  }
	  
	  public  void setStatisticsObject(String response) {
		   statisticsModel=new DescriptiveStatisticsModel();
		   statisticsModel=(DescriptiveStatisticsModel) getObjectFromJson(response,DescriptiveStatisticsModel.class);
	  }
	 

	  public  String getJsonFromObject(Object new_object) {
		  Gson gson = new Gson();
		  return gson.toJson(new_object);
	  }
	  
	  public  Object getObjectFromJson(String new_jsonString, Class<?> new_class) {
		  Gson gson = new Gson();
		  return gson.fromJson(new_jsonString, new_class);
	  }	  



  private  void getRequest(int size) {
	  
	    // Create a method instance.
	    url=url+"/"+size;

	    GetMethod method = new GetMethod(url);
	    
	    // Provide custom retry handler is necessary
	    method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
	    		new DefaultHttpMethodRetryHandler(3, false));

	    try {

	      // Execute the method.
	      int statusCode = client.executeMethod(method);

	      if (statusCode != HttpStatus.SC_OK) {
	        System.err.println("Method failed: " + method.getStatusLine());
	      }
	      // Read the response body.
	      byte[] responseBody = method.getResponseBody();
	      
	      // Deal with the response.
	      // Use caution: ensure correct character encoding and is not binary data
	     
	      setStatisticsObject(new String(responseBody));

	    } catch (HttpException e) {

	      System.err.println("Fatal protocol violation: " + e.getMessage());
	      e.printStackTrace();

	    } catch (IOException e) {

	      System.err.println("Fatal transport error: " + e.getMessage());
	      e.printStackTrace();

	    } finally {

	      // Release the connection.
	      method.releaseConnection();
	    }  
  }
}
