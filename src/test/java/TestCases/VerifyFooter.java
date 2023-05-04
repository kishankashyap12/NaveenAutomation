package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.FooterPageObject;
import Resources.BaseClass;

public class VerifyFooter extends BaseClass {

	@Test
	public void Footer() {
		FooterPageObject fpo = new FooterPageObject(driver);

		// Information
		fpo.AboutUs().click();
		fpo.DeliveryInfo().click();
		fpo.PrivacyPolicy().click();
		fpo.TermCondition().click();

		// Customer Service
		fpo.ContactUs().click();
		fpo.Returns().click();
		fpo.Sitemap().click();

		// Extras
		fpo.Brands().click();
		fpo.Gift().click();
		fpo.Affilate().click();
		fpo.Specials().click();

		// My A/C
		fpo.OrderHistory().click();
		fpo.News().click();

	}
}
