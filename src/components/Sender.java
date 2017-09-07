package components;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rinat
 */
public class Sender {

    String url;
    String charset;
    String param1;
    String param2;

    public Sender(String url_address) {
        this.url = url_address;
        this.charset = "UTF-8";
        this.param1 = "dfdfdfdf";
        this.param2 = "dfdfdfdf";
    }

    public String getRequest() {
        try {
            //String query = String.format("param1=%s&param2=%s", URLEncoder.encode(param1, charset), URLEncoder.encode(param2, charset));
            //URLConnection connection = new URL(this.url + "?" + query).openConnection();
            HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
            //connection.setRequestProperty("Accept-Charset", charset);
            httpConnection.setRequestMethod("GET");
            httpConnection.setConnectTimeout(3000);
            httpConnection.setReadTimeout(5000);
            /*System.out.println(httpConnection.getResponseCode());
            System.out.println(httpConnection.getResponseMessage());
            System.out.println(httpConnection.getURL());*/

            String contentType = httpConnection.getHeaderField("Content-Type");
            String charset = null;

            /*httpConnection.getHeaderFields().entrySet().forEach((header) -> {
            System.out.println(header.getKey() + "=" + header.getValue());
            });*/
            if(contentType == "") {
                return "false";
            }
            for (String param : contentType.replace(" ", "").split(";")) {
                if (param.startsWith("charset=")) {
                    charset = param.split("=", 2)[1];
                    break;
                }
            }
            InputStream response = httpConnection.getInputStream();
            String data = "";
            if (charset != null) {

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(response, charset))) {
                    for (String line; (line = reader.readLine()) != null;) {
                        data += line;
                    }
                }
            } else {
                // It's likely binary content, use InputStream/OutputStream.
            }

            return data;
        } catch (SocketTimeoutException e) {
            return "error";
        } catch (IOException e) {
            return "error";
        } catch (java.lang.NullPointerException e) {
            //Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Ошибка при получении");
            return "error";
        }
    }
}
