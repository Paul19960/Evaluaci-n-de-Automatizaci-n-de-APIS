package com.nttdata.steps;

public class TestStep {
    public void metodoPrueba() {
        System.out.println("Hola prueba desde Step");
    }

    public void abrirPagina(String url) {
        System.out.println("Imprimir desde abrirPagina STEP: " + url);
    }
}
