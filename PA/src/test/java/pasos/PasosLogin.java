package pasos;

import acciones.AccionSelecCuenta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PasosLogin {
	AccionSelecCuenta accionseleccuenta=new AccionSelecCuenta();
	@Given("ingreso a www.gmail.com")
	public void ingreso_a_www_gmail_com() {
		accionseleccuenta.ingGmail();
	    
	}

	@Given("ingreso mi correo electronico")
	public void ingreso_mi_correo_electronico() {
		accionseleccuenta.ingCorreo();
	    
	}

	@When("presiono al boton siguiente")
	public void presiono_al_boton_siguiente() {
		accionseleccuenta.bSiguiente();
	   
	}

	@Then("muestra opcion de ingreso de contraseña")
	public void muestra_opcion_de_ingreso_de_contraseña() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}
	

}
