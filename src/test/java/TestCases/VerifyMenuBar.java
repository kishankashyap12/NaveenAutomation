package TestCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.MenuBarPageObject;
import Resources.BaseClass;

public class VerifyMenuBar extends BaseClass {
	
	@Test
	public void MenuBar() {
	MenuBarPageObject mpo = new MenuBarPageObject(driver);

	Actions a = new Actions(driver);
	
	//Desktop
	a.moveToElement(mpo.Desktop()).perform();
	mpo.ShowAll().click();
	
	//Laptop
	a.moveToElement(mpo.Laptop()).perform();
	mpo.ShowAllLap().click();
	
	//Component
	a.moveToElement(mpo.Component()).perform();
	mpo.ShowAllComponent().click();
	
	//MP3
	a.moveToElement(mpo.MP3()).perform();
	mpo.ShowAllMP3().click();
}

}
