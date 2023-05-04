package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarPageObject {
	
	public MenuBarPageObject(WebDriver driver2) {
		this.driver= driver2;
	}
	public WebDriver driver;
	
	// Desktop
		private By desktop = By.xpath("//a[contains(text(),'Desktops')]");
		private By showall = By.xpath("//a[contains(text(),'Show All Desktops')]");

		public WebElement Desktop() {
			return driver.findElement(desktop);
		}
		public WebElement ShowAll() {
			return driver.findElement(showall);
		}

		// Laptop&Notebooks
		private By laptop = By.xpath("//a[contains(text(),'Laptops & Notebooks')]");
		private By showalllap = By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]");

		public WebElement Laptop() {
			return driver.findElement(laptop);
		}
		public WebElement ShowAllLap() {
			return driver.findElement(showalllap);
		}

		// Components
		private By component = By.linkText("Components");
		private By showallcomponent = By.linkText("Show All Components");

		public WebElement Component() {
			return driver.findElement(component);
		}
		public WebElement ShowAllComponent() {
			return driver.findElement(showallcomponent);
		}

		// MP2
		private By mp3 = By.linkText("MP3 Players");
		private By showallmp3 = By.linkText("Show All MP3 Players");

		public WebElement MP3() {
			return driver.findElement(mp3);
		}
		public WebElement ShowAllMP3() {
			return driver.findElement(showallmp3);
		}

}
