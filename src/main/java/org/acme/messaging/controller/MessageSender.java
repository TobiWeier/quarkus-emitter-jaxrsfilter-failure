package org.acme.messaging.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Dependent
public class MessageSender {
    
    private static final Logger logger = Logger.getLogger(MessageSender.class.getSimpleName());
    
    @Inject
    @Channel("outtopic")      
    Emitter<String> emitter;
    
    public void send(String message) {
        emitter.send(message);
        logger.log(Level.INFO, "Message {0} sent", message);
    }
    
}
