package ai.oc.testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ai.oc.testbase.TestBase;
import junit.framework.Assert;

 

public class HomepageTest  extends  TestBase{
	@Test(enabled=false)
	public void verifyAddtoCartScanario() throws InterruptedException
	{
		 
		String expected_op="Success: You have added MacBook to your shopping cart!";
		
		Thread.sleep(3000);
		JavascriptExecutor	 j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,500)");
		hp.clickonMackbook();
		j.executeScript("scroll(0,300)");
		hp.clickonTextBox();
		hp.clearTextBox();
		hp.enterInTextBox("2");
		hp.clickonAddtoCart();
		String actual_op=hp.getSuccessMessage();
		System.out.println(actual_op);
		 if(actual_op.equals(expected_op)) {
			 System.out.println("Test passed");
		 }
		 else {
			 System.out.println("Test failed");
		 }
	}

	@Test (enabled=false)
	public void verifyShoppingCartURL()
	{ 
		String expected_op="https://tutorialsninja.com/demo/index.php?route=checkout/cart";
		 hp.clickonShoppingCartButton();
		String actual_op = driver.getCurrentUrl();
		Assert.assertEquals(actual_op, expected_op);
	}
	
	@Test 
	public void verifyTotalPrice()
	{
		System.out.println("browser started ");
		String expected_op="";
		j = ((JavascriptExecutor)driver);
		j.executeScript("scroll(0,800)");
		String price =driver.findElement(By.xpath("(//p[ @class=\"price\"])[1]")).getText();
		System.out.println("product price = "+price);
	}
}
