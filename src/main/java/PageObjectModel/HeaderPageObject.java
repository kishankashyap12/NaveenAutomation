package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageObject {
	
	public HeaderPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebDriver driver;
	
	//Currency
		private By currency = By.xpath("//i[@class='fa fa-caret-down']");
		private By dropdown = By.xpath("//button[@class='currency-select btn btn-link btn-block']");
		
		public WebElement Currency() {
			return driver.findElement(currency);
		}
		public List<WebElement> DropDown(){
			return driver.findElements(dropdown);
		}
		//Contact Us
		private By contactus = By.xpath("//i[@class='fa fa-phone']");
		private By yourname  = By.xpath("//input[@name='name']");
		private By emailadd = By.xpath("//input[@name='email']");
		private By enquiry = By.xpath("//textarea[@name='enquiry']");
		private By submit = By.xpath("//input[@type='submit']");
		private By cntinue =By.xpath("//a[contains(text(),'Continue')]");
		
		public WebElement Contactus() {
			return driver.findElement(contactus);
		}
		public WebElement Yourname() {
			return driver.findElement(yourname);
		}
		public WebElement Emailadd() {
			return driver.findElement(emailadd);
		}
		public WebElement Enquiry() {
			return driver.findElement(enquiry);
		}
		public WebElement Submit() {
			return driver.findElement(submit);
		}
		public WebElement Continue() {
			return driver.findElement(cntinue);
		}
		
		//Wish List
		private By wishlist = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
		
		public WebElement WishList() {
			return driver.findElement(wishlist);
		}
		
		//Shopping Cart
		private By shoppingcart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");
		
		public WebElement ShoppingCart() {
			return driver.findElement(shoppingcart);
		}
		
		//CheckOut
		private By checkout = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");
		
		public WebElement CheckOut() {
			return driver.findElement(checkout);
		}

}
