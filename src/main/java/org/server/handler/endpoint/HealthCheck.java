package org.server.handler.endpoint;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class HealthCheck implements HttpHandler {

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseSender().send("{\"msg\":\"Alive\"}");
    }

}
