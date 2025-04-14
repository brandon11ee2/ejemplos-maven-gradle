package org.orange.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.orange.pageObject.Validaciones;

public class ValidacionSteps {
    @Page
    Validaciones validacionesPage;

    @Step("Validar titulo de inicio sesion")
    public void validacionSesion(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateSesion()
                ).isDisplayed()
        );

    }

    @Step("Validar Recruitmen")
    public void validacionRecruitment(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateRecruiment()
                ).isDisplayed()
        );
    }

}
