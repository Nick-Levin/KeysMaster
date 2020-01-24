package org.util;

import java.util.Random;

public class PasswordGenerator {

    public static String symbols = "1a36fd5h1e6841t1za6dr1h43qy6FS>GFSJ:AGPKW#";
    public static Random random = new Random();

    public static String generatePassword(int length) {
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            stringBuilder.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        
        return stringBuilder.toString();
    }

}
