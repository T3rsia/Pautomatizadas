package acciones;

import org.openqa.selenium.support.PageFactory;

import helementos.ElementosContacto;
import utilidades.SetUp;

public class AccionContactoAmsoft {
	ElementosContacto elementoscontacto=null;
	
	public AccionContactoAmsoft() { 
		elementoscontacto=new ElementosContacto();
		
		PageFactory.initElements(SetUp.getdriver(),elementoscontacto);
	}
	
	public void  cnombre() {
		elementoscontacto.cnombre.sendKeys("milena");	
	}
	
	public void  capellido() {
		elementoscontacto.capellido.sendKeys("ponce");	
	}
	
	public void  ccorreo() {
		elementoscontacto.ccorrero.sendKeys("milenaponceji@gmail.com");	
	}
	
	public void  cmensaje() {
		elementoscontacto.cmensaje.sendKeys("hola esto es una prueba automatizada 16/01/23");	
	}
	
	public void  ctelefono() {
		elementoscontacto.ctelefono.sendKeys("999999999");	
	}
	public void  cbenviar() {
		elementoscontacto.cbenviar.click();
	}
	

}
