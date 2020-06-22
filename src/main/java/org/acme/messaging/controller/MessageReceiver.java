package org.acme.messaging.controller;

import org.eclipse.microprofile.reactive.messaging.Incoming;

public class MessageReceiver {
    
    @Incoming("intopic")
    public void onMessage(String incomingMessage) {
    }
    
}
