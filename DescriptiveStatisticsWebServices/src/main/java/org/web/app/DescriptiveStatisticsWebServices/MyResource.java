package org.web.app.DescriptiveStatisticsWebServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.web.app.models.DescriptiveStatisticsModel;
import org.web.app.service.StatisticsService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	StatisticsService statsService;
	DescriptiveStatisticsModel statsModel=new DescriptiveStatisticsModel();
	 
	
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
	

	@GET
	@Path("/{N}")
	@Produces (MediaType.APPLICATION_JSON)
	public  DescriptiveStatisticsModel calculateStatistics(@PathParam("N")int size) {
		statsService=new StatisticsService(size);
		statsModel.setRandomNumbers(statsService.getRandomNumbers());
		statsModel.setMean(statsService.getMean());
		statsModel.setMeadian(statsService.getMeadian());
		statsModel.setMode(statsService.getMode());
		statsModel.setMax(statsService.getMax());
		statsModel.setMin(statsService.getMin());
		statsModel.setStandardDeviation(statsService.getSTD());
		return statsModel;
    }
}
