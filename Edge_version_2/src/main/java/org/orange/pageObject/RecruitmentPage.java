package org.orange.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RecruitmentPage extends PageObject {

    private final By btnRecruitment = By.xpath("//span[text()='Recruitment']");
    private final By btnAdd = By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");


    public By getBtnRecruitment() {
        return btnRecruitment;
    }

    public By getBtnAdd() {
        return btnAdd;
    }


}
