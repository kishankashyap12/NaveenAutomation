package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AddProductInCartPageObject;
import Resources.BaseClass;

public class VerifyAddProductInCart extends BaseClass {
	
	@Test
	public void addproduct() throws InterruptedException {
		AddProductInCartPageObject apo = new AddProductInCartPageObject(driver);
	
		apo.SearchPro().sendKeys("Samsung");
		apo.Searchbtn().click();
		apo.Addtocartbtn().click();
		apo.SearchPro().clear();
		apo.SearchPro().sendKeys("Iphone");
		apo.Searchbtn().click();
		apo.Addtocartbtn1().click();
		Thread.sleep(2000);
	//	apo.Cart().click();
		
	}
	
	}


