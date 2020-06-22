package org.acme.messaging.boundary;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.acme.messaging.filter.MessageHeader;

@ApplicationScoped
@Path("/foo")
public class SenderResource {

    @MessageHeader
    @GET
    public Response sendTopic() {
        return Response.ok().build();
    }
    
}