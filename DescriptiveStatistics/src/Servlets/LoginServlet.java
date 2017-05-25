package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import ConsumingWebService.HTTPClientResource;
import Model.DescriptiveStatisticsModel;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

 
public void doGet(HttpServletRequest request, HttpServletResponse response) 
			           throws ServletException, java.io.IOException {

	//int size=Integer.parseInt(request.getParameter("dropdownNumbers"));
	
	try
	{	    
     HTTPClientResource clientResource=new HTTPClientResource(Integer.parseInt(request.getParameter("dropdownNumbers")));
     DescriptiveStatisticsModel model=clientResource.getStatisticsObject();
     
     Gson gson = new Gson();
     JsonObject myObj = new JsonObject();
     JsonElement modelObj = gson.toJsonTree(model);
     myObj.addProperty("success", true);
     myObj.add("stats", modelObj);
     
     System.out.println("Got it in Servlet "+model.getMean()); 
     System.out.println("Got it in Servlet "); 
     
     //double mean=model.getStandardDeviation();
     //int d=55;
     
     response.setContentType("json");  
     PrintWriter out=response.getWriter();
     out.println(myObj.toString());
     out.close();
     clientResource=null;
	            
	} 
		
		
	catch (Throwable theException) 	    
	{	
		System.out.println("My Exception"+request.getParameter("dropdownNumbers"));
		System.out.println(theException); 
	}
   }
}