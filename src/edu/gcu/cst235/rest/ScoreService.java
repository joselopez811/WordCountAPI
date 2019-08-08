package edu.gcu.cst235.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import edu.gcu.cst235.rest.worker.Alice;

@ApplicationPath("/normal")
public class ScoreService extends Application { 
	
		  public Set<Class<?>> getClasses() { return new
		    HashSet<Class<?>>(Arrays.asList(ScoreService.class));
		  }
		  
	@POST
	@Path("/alice")
	@Produces("text/html")
	public Response search(@FormParam("searchword") String search) {
		String returnHTML = "<p>Your results for the word " + search + " are: ";
		returnHTML += Alice.searchAlice(search) + " times!";
		returnHTML += "<p><a href='/RestTutorial/alice.html'>Back to Alice</a>";
		return Response.ok(returnHTML).build();		
	}
	
	@GET 
	@Path("/hello/name")
	@Produces("text/plain")
	public String displayName() {
		return "Max";
	}
	
	@POST
	@Path("/hello/last")
	@Produces("text/plain")
	public String displayNameA() {
		return "Lopez";
	}
	
	@GET
	@Path("/hello/address")
	@Produces("text/plain")
	public String displayAddress() {
		return "4522 N 79th ave";
	}
}
