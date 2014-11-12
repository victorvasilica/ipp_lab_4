package com.company;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        FirstClass firstClass = new FirstClass();
        URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();

        System.out.println("testing the commit menu in IntellJ, let the fun begin");
    }

}
