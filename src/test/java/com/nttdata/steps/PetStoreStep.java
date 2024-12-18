package com.nttdata.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import jdk.jfr.ContentType;
import org.junit.Assert;

public class PetStoreStep {
    Response response;
    private String URL_BASE;

    public void definirURL(String url) {
        URL_BASE = url;
    }


    public void validacionRespuesta(int statusCode) {
        Assert.assertEquals("Validación de respuesta", 200, response.statusCode());
    }

    public void crearOrder(String idOrder, String idMascota, String cantidad) {
        String body = "{\n" +
                "  \"id\": \"" + idOrder + "\",\n" +
                "  \"petId\": \"" + idMascota + "\",\n" +
                "  \"quantity\": \"" + cantidad + "\",\n" +
                "  \"shipDate\": \"2024-12-18T01:38:41.872Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";

        System.out.println(body);//Imprimir el cuerpo del request a enviar


        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                .header("Content-Type", "application/json")
                .body(body)
                .log().all()
                .post("store/order")
                .then()
                .log().all()
                .extract().response();
    }

    public void consultarOrder(String idOrder) {
        response = RestAssured
                .given()
                .baseUri(URL_BASE)
                //.pathParams()
                //.queryParams()
                //.log().all()
                .get("store/order/"+ idOrder)
                .then()
                .log().all()
                .extract().response();
    }

    public void validariDMascota(String idMascota) {
        Assert.assertEquals("Validación de idMascota", "50", idMascota);
    }
}
