package pasos;

import acciones.AccionContactoAmsoft;
import acciones.AcionSitioAmsoft;
import io.cucumber.java.en.Given;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;
import utilidades.IntTeslink;

public class EnviarContacto {
	
	String java_Class=this.getClass().getSimpleName();
	String proyecto= "Proyecto de Pruebas automatizadas";
	String plan= "Plan de Pruebas";
	String build= "Versión 1.0 TAGM";
	String notas="";
	String resultado="";
	
 IntTeslink testlink = new IntTeslink();
	
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
		try {
			accioncontactoamsoft.cbenviar();
		    resultado=TestLinkAPIResults.TEST_PASSED;
		    notas="Caso OK";
		}catch(Exception e) {
			resultado=TestLinkAPIResults.TEST_FAILED;
			notas= "Caso NOK";
			
		} finally {
			try {
				testlink.resultado(proyecto, plan, java_Class, build, notas, resultado);
			} catch (TestLinkAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	    
        
	
	

}
