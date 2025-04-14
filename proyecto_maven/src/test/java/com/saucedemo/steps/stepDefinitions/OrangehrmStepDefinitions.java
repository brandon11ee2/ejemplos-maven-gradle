package com.saucedemo.steps.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.saucedemo.steps.InicioSesionStep;

public class OrangehrmStepDefinitions {
    @Steps
    InicioSesionStep iniciosesionStep;

    @Dado("que el usuario ingresa a la página web e inicia sesión correctamente")
    public void queElUsuarioIngreseALaPaginaWeb() {
        iniciosesionStep.open();
    }

    @Cuando("accede a la sección de perfil y registra su información personal incluyendo nombre, dirección y número de teléfono")
    public void ingreseLasCredencialesDeInicioDeSesionCorrectamente() {
        iniciosesionStep.enterCredentials();
    }

    @Entonces("los cambios se guardarán correctamente")
    public void losCambiosSeGuardaran() {
    }

}
