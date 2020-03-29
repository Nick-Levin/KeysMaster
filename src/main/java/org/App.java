package org;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class App {

    public static void main(String ...args) throws NoSuchAlgorithmException {

//        Server.startServer(ServerConfiguration.KEYS_MASTER_MAIN);

        final KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(4096);
        final KeyPair keyPair = generator.generateKeyPair();
        final Key pub = keyPair.getPublic();
        final Key pvt = keyPair.getPrivate();



    }

}
