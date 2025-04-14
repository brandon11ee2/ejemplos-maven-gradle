package org.orange.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.orange.pageObject.InicioSesionPage;

public class IniciosesionStep {

    @Page
    private InicioSesionPage sesionPage;

    @Step("Abrir navegor")
    public void open()
    {
        sesionPage.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Step("Ingresar credenciales")
    public void enterCredentials(){
        sesionPage.getDriver().findElement(sesionPage.getTxtUsername()).sendKeys("Admin");
        sesionPage.getDriver().findElement(sesionPage.getTxtPassw()).sendKeys("admin123");
        sesionPage.getDriver().findElement(sesionPage.getBtnLogin()).click();
    }
}
