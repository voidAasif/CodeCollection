package practice;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;

public class j031_basicEncryption {
    public static void main(String[] args) {
        //Encrypt;
        String plainText = "PASSWORD_OR_KEY";
        Encoder encode = Base64.getEncoder(); //encoder instance;
        String encryptText = encode.encodeToString(plainText.getBytes()); //convert text into bytes, encode bytes with Encoder;
        
        System.out.println("Encoding: ");
        System.out.println("plainText: " + plainText);
        System.out.println("encryptText: " + encryptText);

        System.out.format("\n\n");

        //Decrypt;
        Decoder decode = Base64.getDecoder(); //decoder instance;
        byte[] bytes = decode.decode(encryptText); //decode encrypted text, and set into byte array;

        System.out.println("Decoding: ");
        // System.out.println(String.valueOf(bytes)); //show internal representation of byte array;
        System.out.println("Plain Text: " + new String(bytes)); //convert byte array into readable format;
    }
}
