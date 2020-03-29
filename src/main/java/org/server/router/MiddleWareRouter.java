package org.server.router;

import io.undertow.server.RoutingHandler;

public class MiddleWareRouter {

    private MiddleWareRouter(){}

    public static RoutingHandler create() {
        return new RoutingHandler();
    }

}
