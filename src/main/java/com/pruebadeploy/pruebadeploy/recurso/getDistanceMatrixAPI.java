package com.pruebadeploy.pruebadeploy.recurso;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class getDistanceMatrixAPI {

	
	  private static final String
	  API_KEY="AIzaSyAZXwHEMaYaB_NjWkS5qCwPHtIexc9IBv0"; 
	  
	  public static int getData(String origen, String destino) throws IOException, InterruptedException {
	  
	  String url="https://maps.googleapis.com/maps/api/distancematrix/json?destinations="+destino+"&origins="+origen+"&key="+API_KEY;
	  HttpRequest solicitud = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
	  HttpClient cliente = HttpClient.newBuilder().build();
	  String respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString()).body();	  
	  ObjectMapper mapper = new JsonMapper();
	  JsonNode json =mapper.readTree(respuesta);
	  JsonNode jsondistance = json.findPath("distance");
	  JsonNode fielddistanceKm = jsondistance.findPath("value");
	  int distanceint = fielddistanceKm.asInt();
	  
	  return distanceint;
	 }

}