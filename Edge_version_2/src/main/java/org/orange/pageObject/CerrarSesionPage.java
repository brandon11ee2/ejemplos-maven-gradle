package org.orange.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CerrarSesionPage extends PageObject {

    private final By logoImagen = By.xpath("//li[@class='oxd-userdropdown']//i");
    private final By btnCerrarSesion = By.xpath("//a[text()='Logout']/parent::li");

    public By getLogoImagen() {return logoImagen;}
    public By getBtnCerrarSesion(){return btnCerrarSesion;}
}
