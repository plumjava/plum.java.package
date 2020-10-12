/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plum.http;

import java.util.*;
import java.io.*;
import java.net.*;

/**
 *
 * @author thbogusz
 */
public class StaticHttp {

    public static URL HttpClient(String strUrl) throws Exception {
        URL url = null;
        try {
            url = new URL(strUrl);
        } catch (Exception e) {
            throw new Exception("Invalid URL");
        }

        return url;
    }

    public static BufferedReader openURL(String strUrl)
            throws Exception {

        HttpURLConnection server = null;
        URL url = HttpClient(strUrl);
        try {
            server = (HttpURLConnection) url.openConnection();
            server.setDoInput(true);
            server.setDoOutput(true);
            server.setRequestMethod("GET");
            server.setRequestProperty("Content-type",
                    "application/x-www-form-urlencoded");
            server.connect();
        } catch (Exception e) {
            throw new Exception("Connection failed");
        }

        BufferedReader s = null;
        try {
            s = new BufferedReader(
                    new InputStreamReader(
                            server.getInputStream()));

        } catch (Exception e) {
            throw new Exception("Unable to read input stream");
        }

        return s;
    }
}
