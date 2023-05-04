package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.HeaderPageObject;
import Resources.BaseClass;
import Resources.CommonMethod;
import Resources.Constant;

public class VerifyHeader extends BaseClass {
	
	@Test
	public void Header() {
		HeaderPageObject hpo = new HeaderPageObject(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Currency
		hpo.Currency().click();
		CommonMethod.forloop(hpo.DropDown(), "$ US Dollar");
		
		// Contact Us
		hpo.Contactus().click();
		hpo.Yourname().sendKeys(Constant.yourname);
		hpo.Emailadd().sendKeys(Constant.email);
		hpo.Enquiry().sendKeys(Constant.enquiry);
		hpo.Submit().click();
		hpo.Continue().click();
		
		//Wish List
		hpo.WishList().click();
		
		//Shopping Cart
		hpo.ShoppingCart().click();
		
		//Checkout
		hpo.CheckOut().click();
		
	}

}
