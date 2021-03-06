package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class FinomGrouppage {
	
	public FinomGrouppage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit' and contains(text(),'Sign in')]")
	public WebElement SigninBtn;	
	
	public WebElement Finomgroup;
	
	@FindBy(linkText="Finom Group")
	public WebElement Finomtab;	
	
}
