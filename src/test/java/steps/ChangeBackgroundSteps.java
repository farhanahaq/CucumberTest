package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ChangeBackgroundPage;
import util.BrowserFactory;

public class ChangeBackgroundSteps {
	WebDriver driver;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.launchBrowser();
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {

		ChangeBackgroundPage changeSkybluepage = PageFactory.initElements(driver, ChangeBackgroundPage.class);
		changeSkybluepage.SetSkyBlueButton();

	}

	@When("^I click on the button$")
	public void i_click_on_the_button() {

		ChangeBackgroundPage clickSkybluepage = PageFactory.initElements(driver, ChangeBackgroundPage.class);
		clickSkybluepage.SkyBlueButton_Click();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		ChangeBackgroundPage changeSkybluepage = PageFactory.initElements(driver, ChangeBackgroundPage.class);
		changeSkybluepage.validateSkyblueBackground();
	}

	// @Given("^Set White Background$")
	public void set_White_Background() {

	}

	// @When("^I click on the buttonwhite$")
	public void i_click_on_the_buttonwhite() {

		ChangeBackgroundPage clickSkybluepage = PageFactory.initElements(driver, ChangeBackgroundPage.class);
		clickSkybluepage.SkyBlueButton_Click();
	}

	// @Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {

	}

	@After
	public void endit() {
		BrowserFactory.tearDown();
	}

}
