package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObject {
	public FooterPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebDriver driver;
	
	//Information
		private By aboutus = By.xpath("//a[contains(text(),'About Us')]");
		private By deliveryinfo = By.xpath("//a[contains(text(),'Delivery Information')]");
		private By privacypolicy = By.xpath("//a[contains(text(),'Privacy Policy')]");
		private By termcondition = By.xpath("//a[contains(text(),'Terms & Conditions')]");
		
		public WebElement AboutUs() {
			return driver.findElement(aboutus);
		}
		public WebElement DeliveryInfo() {
			return driver.findElement(deliveryinfo);
		}		
		public WebElement PrivacyPolicy() {
			return driver.findElement(privacypolicy);
		}
		public WebElement TermCondition() {
			return driver.findElement(termcondition);
		}
		
		//Customer Service
		private By contactus = By.xpath("//a[contains(text(),'Contact Us')]");
		private By returns = By.xpath("//a[contains(text(),'Returns')]");
		private By sitemap = By.xpath("//a[contains(text(),'Site Map')]");
		
		public WebElement ContactUs() {
			return driver.findElement(contactus);
		}
		public WebElement Returns() {
			return driver.findElement(returns);
		}
		public WebElement Sitemap() {
			return driver.findElement(sitemap);
		}
		//Extras
		private By brands = By.xpath("//a[contains(text(),'Brands')]");
		private By gift = By.xpath("//a[contains(text(),'Gift Certificates')]");
		private By affiliate = By.xpath("//a[contains(text(),'Affiliate')]");
		private By specials = By.xpath("//a[contains(text(),'Specials')]");
		
		public WebElement Brands() {
			return driver.findElement(brands);
		}
		public WebElement Gift() {
			return driver.findElement(gift);
		}
		public WebElement Affilate() {
			return driver.findElement(affiliate);
		}
		public WebElement Specials() {
			return driver.findElement(specials);
		}
		//My A/C
		private By orderhistory = By.xpath("//a[contains(text(),'Order History')]");
		private By news = By.xpath("//a[contains(text(),'Newsletter')]");
		
		public WebElement OrderHistory() {
			return driver.findElement(orderhistory);
		}
		
		public WebElement News() {
			return driver.findElement(news);
		}

}
