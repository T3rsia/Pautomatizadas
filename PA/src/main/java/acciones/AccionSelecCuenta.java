package acciones;

import org.openqa.selenium.devtools.v106.page.Page;
import org.openqa.selenium.support.PageFactory;

import helementos.SelecCuenta;
import utilidades.SetUp;

public class AccionSelecCuenta {
	SelecCuenta seleccuenta;
	
	public AccionSelecCuenta() {
		this.seleccuenta=new SelecCuenta();
		PageFactory.initElements(SetUp.getdriver(),seleccuenta);
	}
	
	public void ingCorreo() {
		seleccuenta.correo.sendKeys("milenaponceji@gmail.com");
	}
	
	public void ingGmail() {
		SetUp.getdriver().get("https://www.amsoft.cl/");
	}
	
	public void bSiguiente() {
		seleccuenta.siguiente.click();
	}
	

}
