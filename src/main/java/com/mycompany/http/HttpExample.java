//package com.mycompany.http;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//import java.net.http.HttpResponse;
//
//public class HttpExample {
//    public static void main(String[] args) {
////        HttpClient httpClient = HttpClients.createDefault();
////        HttpClient httpClient = HttpClient.newHttpClient();
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpGet httpGet = new HttpGet("http://yandex.ru");
////       HttpResponse httpResponse = httpClient.execute(httpGet);
//        HttpResponse httpResponse = null;
//        try {
//            httpResponse = (HttpResponse) httpClient.execute(httpGet);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        String body = EntityUtils.toString(httpResponse.getEntity());
//        Object body = httpResponse.body();
//        System.out.println(body.toString());
//    }
//}
