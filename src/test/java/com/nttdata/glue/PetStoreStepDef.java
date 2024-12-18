package com.nttdata.glue;

import com.nttdata.steps.PetStoreStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class PetStoreStepDef {
    @Steps
    PetStoreStep tienda;


    @Given("la url es {string}")
    public void laUrlEs(String url) {
        tienda.definirURL(url);

        
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int statusCode) {
        tienda.validacionRespuesta(statusCode);

    }

    @When("creo el order con {} con {} con {}")
    public void creoElOrderConConCon(String idOrder, String idMascota, String cantidad) {
        tienda.crearOrder(idOrder, idMascota, cantidad);

    }

    @When("consulto el order con IDORDER {string}")
    public void consultoElOrderConIDORDER(String idOrder) {
        tienda.consultarOrder(idOrder);
    }

    @And("valido el id de la mascota sea {string};")
    public void validoElIdDeLaMascotaSea(String idMascota) {

        tienda.validariDMascota(idMascota);
    }
}
