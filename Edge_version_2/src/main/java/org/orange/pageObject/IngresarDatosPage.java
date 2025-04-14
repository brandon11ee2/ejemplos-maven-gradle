package org.orange.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class IngresarDatosPage extends PageObject {
    private final By txtFirtsName = By.xpath("//input[@name='firstName']");
    private final By txtMiddleName = By.xpath("//input[@name='middleName']");
    private final By txtLastName = By.xpath("//input[@name='lastName']");
    private final By SelectVacancy = By.xpath("///div[@class='oxd-select-wrapper']//div[@class='oxd-select-text oxd-select-text--active']//i");
    private final By txtEmail = By.xpath("//label[text()='Email']//parent::div//following-sibling::div//input");
    private final By txtCelular = By.xpath("//label[text()='Contact Number']//parent::div//following-sibling::div//input");
    private final By txtKeywords = By.xpath("//label[text()='Keywords']//parent::div//following-sibling::div//input");
    private final By txtNotas = By.xpath("//label[text()='Notes']//parent::div//following-sibling::div//textarea");
    private final By btnData = By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
    private final By btnSave = By.xpath("//button[text()=' Save ']//parent::button");

    public By getTxtFirtsName() {
        return txtFirtsName;
    }
    public By getTxtMiddleName() {return txtMiddleName;}
    public By getTxtLastName() {
        return txtLastName;
    }

    public By getSelectVacancy() {
        return SelectVacancy;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtCelular() {
        return txtCelular;
    }
    public By getTxtKeywords() {return txtKeywords;}
    public By getTxtNotas() {return txtNotas;}
    public By getBtnData() {return btnData;}
    public By getBtnSave() {return btnSave;}
}
