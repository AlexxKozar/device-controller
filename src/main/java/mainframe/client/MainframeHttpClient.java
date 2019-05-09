package mainframe.client;

import mainframe.models.ToasterModel;

import java.net.*;
import java.net.http.*;

public class MainframeHttpClient {

    private HttpClient client;

    public MainframeHttpClient(){
        this.client = HttpClient.newHttpClient();
    }

    public ToasterModel addDevice(String url){
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
        this.client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
        return new ToasterModel();
    }

    public void sendGet(String url){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        this.client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
    }

    public void sendPost(String url){
    }

}
