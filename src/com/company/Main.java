package com.company;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        String theAtlantic = "http://www.theatlantic.com/magazine/archive/1945/07/as-we-may-think/303881/";

        FirstClass myHTTP = new FirstClass(theAtlantic);

        myHTTP.uriDescription();
    }

}
