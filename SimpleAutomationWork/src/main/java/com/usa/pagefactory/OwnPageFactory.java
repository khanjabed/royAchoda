package com.usa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.basepage.BasePage;

public class OwnPageFactory extends BasePage{
	
	public OwnPageFactory(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='button button--tertiary-dark account-link__text']")
	private WebElement ClickButton;

	public WebElement getClickButton() {
		return ClickButton;
	}
	
	@FindBy(xpath="//*[@name='signin_email']")
	private WebElement GetUName;

	public WebElement getGetUName() {
		return GetUName;
	}
	
	@FindBy (xpath="(//*[@class='form__input text-input js-check js-touched'])[2]")
	private WebElement Pswd;

	public WebElement getPswd() {
		return Pswd;
	}
	@FindBy(xpath="(//*[text()='Sign in'])[2]")
	private WebElement ClkSub;

	public WebElement getClkSub() {
		return ClkSub;
	}
	
	

}
