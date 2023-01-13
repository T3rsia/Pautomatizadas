package helementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementosContacto {
	
	@FindBy(how = How.ID,using="form-field-nombre")
	public WebElement cnombre;
	
	@FindBy(how = How.ID,using="form-field-apellido")
	public WebElement capellido;
	
	@FindBy(how = How.ID,using="form-field-email")
	public WebElement ccorrero;
	
	@FindBy(how = How.ID,using="form-field-telefono")
	public WebElement ctelefono;
	
	@FindBy(how = How.ID,using="form-field-message")
	public WebElement cmensaje;
	
	@FindBy(how =How.XPATH,using="//*[@id=\"contacto\"]/div/div[8]/button/span/span[2]")
	
	public WebElement cbenviar;
}
