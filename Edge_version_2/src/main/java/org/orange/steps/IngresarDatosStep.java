package org.orange.steps;


import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import org.orange.pageObject.IngresarDatosPage;

public class IngresarDatosStep {

    @Page
    IngresarDatosPage ingresarDatosPage;

    @Step("ingresar datos principales")
    public void ingresarDatosPrincipales() {
            ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtFirtsName()).sendKeys("Jose");
            ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtMiddleName()).sendKeys("antonio");
            ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtLastName()).sendKeys("Rodriguez");
    }
    @Step("ingresar vacancy")
    public void ingresarVacancy(){
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getSelectVacancy()).click();
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getSelectVacancy()).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
    }

    @Step("ingresar informacion secundaria")
    public void ingresarInformacionSecundaria(){
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtEmail()).sendKeys("jose@gmail.com");
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtCelular()).sendKeys("1234567890");
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtKeywords()).sendKeys("Java");
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getTxtNotas()).sendKeys("Soy un qa con experiencia");
    }

    @Step("guardar cambios")
    public void guardarCambios() {
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getBtnData()).click();
        ingresarDatosPage.getDriver().findElement(ingresarDatosPage.getBtnSave()).click();
    }
}
