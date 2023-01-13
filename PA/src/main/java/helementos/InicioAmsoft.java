package helementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InicioAmsoft {
	@FindBy(how = How.XPATH, using = "//*[@id=\"page\"]/div[1]/section[1]/div/div[3]/div/div/div/div/a/span/span")
	public WebElement bcontacto;
	

}
