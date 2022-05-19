package com.ukg.java11features;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpClient.Redirect.NORMAL;
import static java.net.http.HttpClient.Version.HTTP_1_1;
import static java.time.Duration.ofSeconds;

class TodoServiceAsync {
    HttpClient httpClient;

    public TodoServiceAsync() {
        httpClient = HttpClient
                .newBuilder()
                .version(HTTP_1_1)
                .followRedirects(NORMAL)
                .connectTimeout(ofSeconds(20))
                .build();
    }

    public void getAllTodos() {
        var url = "https://jsonplaceholder.typicode.com/todos";
        var request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        //async pattern
//        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        var response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());
        httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(stringHttpResponse -> {
                    System.out.println("Todo Service Execution :  " + Thread.currentThread().getName());
                    return stringHttpResponse.body();
                })
                .thenAccept(System.out::println)
                .join();

    }
}

public class HTTClientAsyncApp {
    public static void main(String[] args) {
        var todoService = new TodoServiceAsync();
        System.out.println("To do Main App : " + Thread.currentThread().getName());
        todoService.getAllTodos();
    }
}
