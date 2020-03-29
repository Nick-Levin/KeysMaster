package org.server.router;

import io.undertow.server.RoutingHandler;
import io.undertow.util.Methods;
import org.server.handler.endpoint.HealthCheck;

public final class MainRouter {

    private MainRouter(){}

    public static RoutingHandler create() {
        return new RoutingHandler(true)
                .add(Methods.GET, "/health", new HealthCheck());
    }

}
