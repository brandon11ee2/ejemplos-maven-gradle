package org.orange.steps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.orange.pageObject.RecruitmentPage;

public class RecruitmentSteps {

    @Page
    RecruitmentPage recruitmentPage;


    @Step("Abrir pagina para ingresar datos")
    public void abrirRecruitmentPage() {
        recruitmentPage.getDriver().findElement(recruitmentPage.getBtnRecruitment())
                .click();
        recruitmentPage.getDriver().findElement(recruitmentPage.getBtnAdd())
                .click();
    }

}
