package helementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelecCuenta {
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"identifierId\"]")
	public WebElement correo;
	@FindBy(how = How.XPATH,using = "//*[@id=\"identifierNext\"]/div/button/span")
	public WebElement siguiente;
	
}
