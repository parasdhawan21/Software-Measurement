package org.web.app.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.web.app.models.DescriptiveStatisticsModel;
import org.web.app.service.StatisticsService;

	@Path("/statistics")
	public class DescriptiveStatisticsResource {
		
		StatisticsService statsService;
		DescriptiveStatisticsModel statsModel=new DescriptiveStatisticsModel();
		 
		
		@GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getIt() {
	        return "Application is running!";
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

