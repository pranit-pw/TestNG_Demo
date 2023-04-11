package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
	
	@FindBy (xpath = "//input[@name=\\\"firstname\\\"]")
	private WebElement firstName ;
	
	public POMClass (WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
	
	public void EnterFirstName() {
		firstName.sendKeys("Pranit");
	}

}
