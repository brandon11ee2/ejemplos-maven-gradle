package org.saucedemo.pageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsername = By.xpath("//input[@name='username']");
    private final By txtPassw = By.xpath("//input[@name='password']");
    private final By btnLogin = By.xpath("//button[@type='submit']");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassw() {
        return txtPassw;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
