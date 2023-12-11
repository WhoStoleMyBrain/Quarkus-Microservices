package org.agoncal.quarkus.microservices.book;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "number.proxy")
@Path("/api/numbers")
public interface NumberProxy {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public IsbnThirteen generateIsbnNumbers();


}

