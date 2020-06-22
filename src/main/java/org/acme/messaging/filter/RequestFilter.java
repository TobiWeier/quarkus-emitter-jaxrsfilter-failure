package org.acme.messaging.filter;

import java.io.IOException;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import org.acme.messaging.controller.MessageSender;

@MessageHeader
@Provider
public class RequestFilter implements ContainerRequestFilter {
    
    private static final String X_MSG = "x-message";
    
    @Inject
    MessageSender controller;

    @Override
    public void filter(ContainerRequestContext crc) throws IOException {
        String msg = crc.getHeaderString(X_MSG);
        if (msg != null) {
            controller.send(msg);
        }
    }
    
}
