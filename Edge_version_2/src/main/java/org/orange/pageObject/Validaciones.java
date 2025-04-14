package org.orange.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Validaciones extends PageObject {

public final By validateSesion = By.xpath("//span[text()='Dashboard']");

    public By getValidateSesion() {
        return validateSesion;
    }

    public By getValidateRecruiment() {
        return validateRecruiment;
    }

    public final By validateRecruiment = By.xpath("//span[text()='Recruitment']");
}
