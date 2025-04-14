package org.saucedemo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;
import org.saucedemo.pageObject.InicioSesionPage;

public class InicioSesionStep {
    @Page
    private InicioSesionPage sesionPage;

    @Step("Abrir navegor")
    public void open(){
        sesionPage.openUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Step("Ingresar credenciales")
    public void enterCredentials(){
        sesionPage.getDriver().findElement(sesionPage.getTxtUsername()).sendKeys("Admin");
        sesionPage.getDriver().findElement(sesionPage.getTxtPassw()).sendKeys("admin123");
        sesionPage.getDriver().findElement(sesionPage.getBtnLogin()).click();
    }
}

