package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FirstClass {
    public URL url;

    public FirstClass(String url) {
        System.out.println("Class has been created: " + url);
        try {
            this.url = new URL(url);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public void uriDescription() {
        try {
            URLConnection connection = this.url.openConnection();
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = input.readLine()) != null) {
                //System.out.println(line);
            }
            input.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String description = "";
        description += "Protocol: " + this.url.getProtocol();
        description += "\nHost: "     + this.url.getHost();
        description += "\nPath: "     + this.url.getPath();

        System.out.println("URI Description:");
        System.out.println(description);
    }
}