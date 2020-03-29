package org.server;

import io.undertow.Undertow;
import org.server.configuration.ServerConfiguration;
import org.server.router.MainRouter;

public final class Server {

    private Server() {}

    public static void startServer(ServerConfiguration config) {
        Undertow.builder()
                .addHttpListener(config.port, config.host)
                .setHandler(MainRouter.create())
                .setBufferSize(config.bufferSize)
                .setIoThreads(config.ioThreads)
                .setWorkerThreads(config.workerThreads)
                .build()
                .start();
    }

}
