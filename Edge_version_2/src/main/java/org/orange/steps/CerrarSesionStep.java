package org.orange.steps;


import net.thucydides.core.annotations.Step;
import org.orange.pageObject.CerrarSesionPage;

public class CerrarSesionStep {

    CerrarSesionPage cerrarSesionPage;
    @Step("Cerrar sesion")
    public void cerrarSesion() {
        cerrarSesionPage.getDriver().findElement(cerrarSesionPage.getLogoImagen()).click();
        cerrarSesionPage.getDriver().findElement(cerrarSesionPage.getBtnCerrarSesion()).click();

    }
}
