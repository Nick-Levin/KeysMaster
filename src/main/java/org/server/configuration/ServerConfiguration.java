package org.server.configuration;

public enum ServerConfiguration {

    KEYS_MASTER_MAIN(),
    KEYS_MASTER_TEST();

    public int port;
    public String host;
    public int ioThreads;
    public int workerThreads;
    public int bufferSize;

    ServerConfiguration() {

    }

}
