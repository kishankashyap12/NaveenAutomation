package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.RegisterAndLoginPageObject;
import Resources.BaseClass;
import Resources.Constant;

public class VerifyRegisterAndLogin extends BaseClass {
	
	@Test
	public void Register() {
		RegisterAndLoginPageObject rpo = new RegisterAndLoginPageObject(driver);
		
		//Register
		rpo.Account().click();
		rpo.Register().click();
		rpo.Firstname().sendKeys(Constant.firstname);
		rpo.Lastname().sendKeys(Constant.lastname);
		rpo.Email().sendKeys(Constant.email);
		rpo.Telephone().sendKeys(Constant.telephone);
		rpo.Password().sendKeys(Constant.password);
		rpo.Confirmpassword().sendKeys(Constant.cnfirmpassword);
		rpo.Agreecheckbox().click();
		rpo.Continues().click();
		rpo.Finalcntinue().click();
		
		//Logout
		rpo.Logout().click();
		
		//Login
		rpo.Login1().click();
		rpo.Email1().sendKeys(Constant.email);
		rpo.Password1().sendKeys(Constant.password);
		rpo.AcLogin1().click();
	
	}

}
