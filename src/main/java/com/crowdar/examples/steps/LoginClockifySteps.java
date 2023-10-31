package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;

public class LoginClockifySteps extends PageSteps {

    @Given("el usuario ingreso a la app correctamente")
    public void el_usuario_ingreso_a_la_app_correctamente() {
        LoginService.isViewLoaded();
    }

    @When("el usuario ingresa su (.*), (.*)")
    public void el_usuario_ingresa_su_email_password(String email, String password) {
        LoginService.logIn(email, password);
    }

    @Then("el usuario se a logeado correctamente con su (.*)")
    public void el_usuario_se_ha_logeado_correctamente_con_su(String email) {
        LoginService.validarEmail(email);
    }

    @Then("obtengo el pass")
    public void obtengo_el_pass(){
        LoginService.obtengoElPass();
    }


}
