package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductInCartPageObject {
   public WebDriver driver;
   
	public AddProductInCartPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	private By Searchproduct = By.xpath("//input[@name='search']");
	private By Searchbutton = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By Addtocart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
	private By Addtocart1 = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
	private By cart = By.xpath("//div[@id='cart']");
	
	public WebElement SearchPro() {
		return driver.findElement(Searchproduct);
	}
	public WebElement Searchbtn() {
		return driver.findElement(Searchbutton);
	}
	public WebElement Addtocartbtn() {
		return driver.findElement(Addtocart);
	}
	public WebElement Addtocartbtn1() {
		return driver.findElement(Addtocart1);
	}
	public WebElement Cart() {
		return driver.findElement(cart);
	}
	
	}
