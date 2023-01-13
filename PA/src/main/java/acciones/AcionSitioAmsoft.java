package acciones;

import org.openqa.selenium.support.PageFactory;

import helementos.InicioAmsoft;
import utilidades.SetUp;

public class AcionSitioAmsoft {
	InicioAmsoft inicioamsoft=null;
	
	
	public AcionSitioAmsoft() {
		this.inicioamsoft=new InicioAmsoft();
		PageFactory.initElements(SetUp.getdriver(), inicioamsoft);
	}
		
	public void ingamsoft() {
		SetUp.getdriver().get("http://www.amsoft.cl");
	}
	public void contacto() {
		inicioamsoft.bcontacto.click();
		
	}

}
