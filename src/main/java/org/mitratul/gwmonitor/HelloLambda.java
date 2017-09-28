package org.mitratul.gwmonitor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class HelloLambda implements RequestStreamHandler {

    @Override
    public void handleRequest (
            InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write("Hello ".getBytes());

        int letter;
        while ((letter = inputStream.read()) != -1) {
            outputStream.write(Character.toUpperCase(letter));
        }
    }
}
