package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.orange.steps.*;

public class OrangehrmStepDefenitions {
    @Steps
    IniciosesionStep iniciosesionStep;
    @Steps
    ValidacionSteps validacionSteps;

    @Steps
    RecruitmentSteps recruitmentSteps;
    @Steps
    IngresarDatosStep ingresarDatosStep;
    @Steps
    CerrarSesionStep cerrarSesionStep;


    @Dado("que el usuario ingresa a la página web e inicia sesión correctamente")
    public void queElUsuarioIngreseALaPaginaWeb() {
        iniciosesionStep.open();
    }

    @Cuando("accede a la sección de perfil y registra su información personal incluyendo nombre, dirección y número de teléfono")
    public void ingreseLasCredencialesDeInicioDeSesionCorrectamente() {
        iniciosesionStep.enterCredentials();
        validacionSteps.validacionSesion();
        recruitmentSteps.abrirRecruitmentPage();

    }

    @Entonces("los cambios se guardarán correctamente")
    public void losCambiosSeGuardaran() {
        validacionSteps.validacionRecruitment();
        ingresarDatosStep.ingresarDatosPrincipales();
        ingresarDatosStep.ingresarDatosPrincipales();
        ingresarDatosStep.ingresarInformacionSecundaria();
        ingresarDatosStep.guardarCambios();
        cerrarSesionStep.cerrarSesion();
    }
}
