package com.exterro;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/customers")
public class HomeController {
	
	@GET
	  @Produces("text/html")
	  public Response getLocalCust() {
	 
	           String output = "I am from 'getLocalCust' method";
	           return Response.status(200).entity(output).build();
	  }	

	
	@GET
	  @Produces("/call")
	  public Response callMe() {
	 
	           String output = "I am from 'getLocalCust' method";
	           return Response.status(200).entity(output).build();
	           
	  }	
	
	 @Path("/login")
	    @POST
	    public Response addUser(@QueryParam("firstName") String firstName, @QueryParam("lastName") String lastName)
	    {
		 System.out.println("i am innnnnnn!!!!");
	        //vaildate first name
	        if(firstName == null || firstName.isEmpty())
	        {
	            return Response.ok().entity("First name is mandatory dude").build();
	        }
	        //vaildate last name
	        if(lastName == null || lastName.isEmpty())
	        {
	            return Response.ok().entity("Don't you have any last name? I will keep secret").build();
	        }
	        //Add user and return the response
	        return Response.ok().entity("User " + firstName + " added through JAX-RS JavaScript API").build();
	    }
	
	
	
}
