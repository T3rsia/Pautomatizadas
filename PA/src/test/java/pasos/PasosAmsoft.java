package pasos;

import acciones.AccionContactoAmsoft;
import acciones.AcionSitioAmsoft;
import io.cucumber.java.en.Given;

public class PasosAmsoft {
	
	AcionSitioAmsoft acionsitioamsoft=new AcionSitioAmsoft();
	AccionContactoAmsoft accioncontactoamsoft=new AccionContactoAmsoft();
	
	@Given("ingreso a www.amsoft.cl")
	public void ingreso_a_www_amsoft_cl() {
		
	acionsitioamsoft.ingamsoft();
	}

	@Given("ingreso a opcion de contacto")
	public void ingreso_a_opcion_de_contacto() {
		acionsitioamsoft.contacto();
	    
	}

	@Given("completo formulario")
	public void completo_formulario() {
		accioncontactoamsoft.cnombre();
		accioncontactoamsoft.capellido();
		accioncontactoamsoft.ccorreo();
		accioncontactoamsoft.ctelefono();
		accioncontactoamsoft.cmensaje();
		
	}

	@Given("presiono boton enviar")
	public void presiono_boton_enviar() {
	    accioncontactoamsoft.cbenviar();
	}
	
	

}
