package ai.oc.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.oc.testbase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// object repository
	@FindBy(xpath ="//a[text()=\"MacBook\"]")
	private WebElement btn_mackbook;
	@FindBy(xpath ="//input[@name=\"quantity\"]")
	private WebElement txtbox_quantity;
	@FindBy(xpath="//button[@id=\"button-cart\"]")
	private WebElement btn_addtocart;
	@FindBy(xpath= "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement msg_success;
	@FindBy(xpath="(//i[@class=\"fa fa-shopping-cart\"])[1]")
	private WebElement btn_shoopingcart;
	
	
	// action methods 
	public void clickonMackbook()
	{
		btn_mackbook.click();
	}
	
	public void clickonTextBox()
	{
		txtbox_quantity.click();
	}
	
	public void clearTextBox()
	{
		txtbox_quantity.clear();
	}
	
	public void enterInTextBox(String quntity)
	{
		txtbox_quantity.sendKeys( quntity);
	}
	
	public void clickonAddtoCart()
	{
		btn_addtocart.click();
	}
	 
   public String  getSuccessMessage()
   {
	 String msg=  msg_success.getText();
	   return msg;
   }
	
   public void clickonShoppingCartButton()
   {
	   btn_shoopingcart.click();
   }
	

}
