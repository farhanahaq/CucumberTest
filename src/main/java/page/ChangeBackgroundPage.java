package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeBackgroundPage {
	
	WebDriver driver;
	
	public ChangeBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//element library
	@FindBy(how = How.XPATH, using = "//button[contains (text(), 'Set SkyBlue Background')]") WebElement SkyBlueBackground_Locator;
	
	@FindBy(how = How.XPATH, using = "//button[contains (text(), 'Set White Background')]") WebElement WhiteBackground_Locator;

	@FindBy(how = How.XPATH, using = "//body[@style = 'background-color: skyblue;']") WebElement SkyBlueValidator;
	
	public void SetSkyBlueButton() {
		try{
			waitForChangeColorButton(driver, 3, SkyBlueBackground_Locator);
			System.out.println("Set SkyBlue Background BUTTON is visible");			
			
			
		}catch(NoSuchElementException e) {
			System.out.println("Set SKyBlue Button is not present");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void SkyBlueButton_Click() {
		SkyBlueBackground_Locator.click();
		
	}
	
	public void validateSkyblueBackground() {
		
		try{
			waitForChangeColorButton(driver, 3, SkyBlueValidator);
			System.out.println("Background is BLLUE");			
			
			
		}catch(NoSuchElementException e) {
			System.out.println("Background is NOT blue");
			e.printStackTrace();
		}
	}
	
	private void waitForChangeColorButton(WebDriver driverButton, int timeInSeconds, WebElement ColorButton_Locator) {
		WebDriverWait letsWait = new WebDriverWait(driver, timeInSeconds);
		letsWait.until(ExpectedConditions.visibilityOf(ColorButton_Locator));
	}
	
	
	
	
	
	
	
	

}
