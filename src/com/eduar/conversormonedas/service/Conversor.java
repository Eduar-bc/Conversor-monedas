package com.eduar.conversormonedas.service;

import com.eduar.conversormonedas.model.RespuestaConversion;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private static final String API_KEY = "";

    public static void convertir(String base, String destino, double cantidad){
        if (API_KEY == null || API_KEY.isBlank()) {
            throw new IllegalStateException("API_KEY no configurada. Por favor agrega tu clave en la variable API_KEY.");
        }
        String urlStr = "https://v6.exchangerate-api.com/v6/"+ API_KEY +"/pair/"+base+"/"+destino+"/"+cantidad;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlStr))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new GsonBuilder().create();
            RespuestaConversion respuestaConversion = gson.fromJson(response.body(), RespuestaConversion.class);
            System.out.println(respuestaConversion);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Ocurrió un error al obtener la tasa de conversión.", e);
        }
    }
}

