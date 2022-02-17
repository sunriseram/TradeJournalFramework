package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SlackChannelpage {
	
	public SlackChannelpage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}	
		@FindBy(id = "username")
		public WebElement username;

		@FindBy(id = "password")
		public WebElement password;
		
		@FindBy(xpath="//button[@type='submit' and contains(text(),'Sign in')]")
		public WebElement SigninBtn;

		@FindBy(linkText = "Slack Channel")
		public WebElement slacktab;

		@FindBy(xpath="//img[contains(@src,'.svg')]")
		public WebElement SlackHome ;

		@FindBy(xpath = "//input[@id='email']")
		public WebElement slacksignin;

		@FindBy(xpath = "//p[contains(text(),'PrimeTech_2021_Summer_SDET_Bootcamp')]")
		public WebElement defaultslack;
	}


