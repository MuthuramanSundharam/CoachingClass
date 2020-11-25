package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnquiryPage {
	WebDriver driver;
	
	public EnquiryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td/h3[1]/i/span")
	@CacheLookup
	WebElement title;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td/h3[2]/i/span/span")
	@CacheLookup
	WebElement text;
	
	@FindBy(id="fname")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(id="lname")
	@CacheLookup
	WebElement lastname;
	
	@FindBy(id="emails")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="mobile")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="D6")
	@CacheLookup
	WebElement tution;
	
	@FindBy(name="D5")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="D4")
	@CacheLookup
	WebElement modeoflearning;
	
	@FindBy(name="enqdetails")
	@CacheLookup
	WebElement enquirydetails;
	
	@FindBy(id="Submit1")
	@CacheLookup
	WebElement submitbtn;
	
	@FindBy(id="Submit2")
	@CacheLookup
	WebElement resetbtn;
	

	public WebElement getTitle() {
		return title;
	}

	

	public WebElement getText() {
		return text;
	}

	

	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}

	

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getMobile() {
		return mobile;
	}


	public WebElement getTution() {
		return tution;
	}

	

	public WebElement getCity() {
		return city;
	}

	

	public WebElement getModeoflearning() {
		return modeoflearning;
	}



	public WebElement getEnquirydetails() {
		return enquirydetails;
	}



	public WebElement getSubmitbtn() {
		return submitbtn;
	}



	public WebElement getResetbtn() {
		return resetbtn;
	}
	
}
