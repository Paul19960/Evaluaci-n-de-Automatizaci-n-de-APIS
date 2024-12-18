package com.nttdata.glue;

import com.nttdata.steps.TestStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TestStefDef {
    @Steps
    TestStep obj;
    @Given("prueba de assertion")
    public void pruebaDeAssertion() {
        //Assert.assertEquals("Validación de Respuestas: ","hola", "hola0");
        //Assert.assertTrue(true);
        obj.metodoPrueba();
    }

    @When("pruebo un servicio url {string}")
    public void prueboUnServicioUrl(String url) {

        obj.abrirPagina(url);
        System.out.println("Imprimir: " + url);
    }

    @When("inicio de sesion con {string} y {string}")
    public void inicioDeSesionConY(String usuario, String clave) {
        System.out.println("primer " + usuario);
        System.out.println("segundo " + clave);
    }
}
