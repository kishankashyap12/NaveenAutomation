package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAndLoginPageObject {
	 
	public RegisterAndLoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebDriver driver;

	// Register
		private By account = By.xpath("//span[contains(text(),'My Account')]");
		private By register = By.xpath("//a[contains(text(),'Register')]");
		private By firstname = By.xpath("//input[@name='firstname']");
		private By lastname = By.xpath("//input[@name='lastname']");
		private By email = By.xpath("//input[@name='email']");
		private By telephone = By.xpath("//input[@name='telephone']");
		private By password = By.xpath("//input[@name='password']");
		private By cnfrmpassword = By.xpath("//input[@name='confirm']");
		private By agreecheckbox = By.xpath("//input[@name='agree']");
		private By continues = By.xpath("//input[@value='Continue']");
		private By finalcntinue = By.xpath("//a[contains(text(),'Continue')]");

		public WebElement Account() {
			return driver.findElement(account);
		}
		public WebElement Register() {
			return driver.findElement(register);
		}
		public WebElement Firstname() {
			return driver.findElement(firstname);
		}
		public WebElement Lastname() {
			return driver.findElement(lastname);
		}
		public WebElement Email() {
			return driver.findElement(email);
		}
		public WebElement Telephone() {
			return driver.findElement(telephone);
		}
		public WebElement Password() {
			return driver.findElement(password);
		}
		public WebElement Confirmpassword() {
			return driver.findElement(cnfrmpassword);
		}
		public WebElement Agreecheckbox() {
			return driver.findElement(agreecheckbox);
		}
		public WebElement Continues() {
			return driver.findElement(continues);
		}
		public WebElement Finalcntinue() {
			return driver.findElement(finalcntinue);
		}

		// Logout
		private By logout = By.xpath("//a[contains(text(),'Logout')]");

		public WebElement Logout() {
			return driver.findElement(logout);
		}

		// Login
		private By login1 = By.xpath("//a[contains(text(),'Login')]");
		private By email1 = By.xpath("//input[@name='email']");
		private By password1 = By.xpath("//input[@name='password']");
		private By aclogin1 = By.xpath("//input[@value='Login']");

		public WebElement Login1() {
			return driver.findElement(login1);
		}
		public WebElement Email1() {
			return driver.findElement(email1);
		}
		public WebElement Password1() {
			return driver.findElement(password1);
		}
		public WebElement AcLogin1() {
			return driver.findElement(aclogin1);
		}
}
