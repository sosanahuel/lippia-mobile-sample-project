package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeClockifySteps {
    @And("el usuario setea una hora (.*) (.*)")
    public void el_usuario_setea_una_hora(String hora, String minutos) {
        HomeService.clickAddTime();
        HomeService.addTime(hora, minutos);


    }

    @And("el ususario agrega al proyecto (.*) y descripcion (.*)")
    public void el_usuario_agrega_al_proyecto_project(String project, String texto) {
        HomeService.clickAddProject(project);
        HomeService.addDescription(texto);
    }

    @And("el usuario guarda el time entry")
    public void el_usuario_guarda_el_time_entry() {
        HomeService.saveTimeEntry();
    }

    @Then("el usuario verifica su proyecto (.*) guardado")
    public void el_usuario_verifica_su_proyecto_guardado(String texto) {
        HomeService.validarSave(texto);
    }

}
