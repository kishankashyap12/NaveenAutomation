package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonMethod {
	
	public static void forloop(List<WebElement> elements,String x) {
		for(WebElement z:elements) {
			if(z.getText().equalsIgnoreCase(x)) {
				z.click();
				break;
			}
		}
	}

}
