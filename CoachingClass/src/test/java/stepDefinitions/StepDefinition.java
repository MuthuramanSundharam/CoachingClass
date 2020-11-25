package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.EnquiryPage;
import pageObjects.SubmissionPage;

public class StepDefinition {
		WebDriver driver;
		String htmlLocation;
		EnquiryPage ep;
		SubmissionPage sp;
		
		@Before
		public void start() {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			htmlLocation = "file:"+System.getProperty("user.dir")+"/Coaching_Class_Enquiry.html";
			ep = new EnquiryPage(driver);
			sp = new SubmissionPage(driver);
		}
		@Given("^user in the coaching class page$")
	    public void user_in_the_coaching_class_page() throws Throwable {
			driver.get(htmlLocation);
			
	    }

	    @When("^verify the title of the page$")
	    public void verify_the_title_of_the_page() throws Throwable {
	    	String s1 = driver.getTitle();
	    	String s2 = "Online Coaching Class Enquiry Form";
	    	Assert.assertTrue(s1.contains(s2));
	        String actual = ep.getTitle().getText();
	        String expected ="Shree Coaching Classes Enquiry";
	        Assert.assertTrue(actual.contains(expected));
	    }

	    @Then("^browser closes$")
	    public void browser_closes() throws Throwable {
	       driver.close();
	    }

	    @And("^verify the text on the page$")
	    public void verify_the_text_on_the_page() throws Throwable {
	    	String actual = ep.getText().getText();
	        String expected ="Tuition Enquiry Details Form";
	        Assert.assertTrue(actual.contains(expected));
	        Thread.sleep(500);
	    }

	    @And("^user enters first name$")
	    public void user_enters_first_name() throws Throwable {
	    	 Alert al = driver.switchTo().alert();
		        Thread.sleep(500);
		        al.accept();
	    	ep.getFirstname().sendKeys("sonu");
	        Thread.sleep(500);
	       
	    }

	    @And("^alert box displays for firstname$")
	    public void alert_box_displays_for_firstname() throws Throwable {
	        ep.getFirstname().click();
	        ep.getSubmitbtn().click();
	        Alert al = driver.switchTo().alert();
	        Thread.sleep(500);
	        al.accept();
	       
	    }

	    @And("^user enters last name$")
	    public void user_enters_last_name() throws Throwable {
	    	 Alert al = driver.switchTo().alert();
		        Thread.sleep(500);
		        al.accept();
	    	ep.getLastname().sendKeys("Jha");
	        Thread.sleep(500);
	    }

	    @And("^alert box displays for lastname$")
	    public void alert_box_displays_for_lastname() throws Throwable {
	        ep.getLastname().click();
	        ep.getSubmitbtn().click();
	        Alert al = driver.switchTo().alert();
	        Thread.sleep(500);
	        al.accept();
	        Thread.sleep(500);
	    }

	    @And("^user enters email detail$")
	    public void user_enters_email_detail() throws Throwable {
	        ep.getEmail().sendKeys("Sonukrj98@gmail.com");
	        Thread.sleep(2000);
	    }

	    @And("^user enters mobile detail$")
	    public void user_enters_mobile_detail() throws Throwable {
	        ep.getMobile().sendKeys("9731625874");
	    }

	    @And("^alert box display for mobile$")
	    public void alert_box_display_for_mobile_numeric_value() throws Throwable {
	        ep.getMobile().sendKeys("numbers");
	        ep.getSubmitbtn().click();
	        Alert al = driver.switchTo().alert();
	        Thread.sleep(500);
	        al.accept();
	        al.accept();
	        ep.getMobile().clear();
	        Thread.sleep(500);
	        Alert al2 = driver.switchTo().alert();
	        Thread.sleep(500);
	        al2.accept();
	        Alert al3 = driver.switchTo().alert();
	        Thread.sleep(500);
	        al3.accept();
	        Thread.sleep(500);
	    }

	    @And("^user select type of tution required$")
	    public void user_select_type_of_tution_required() throws Throwable {
	        Select s = new Select(ep.getTution());
	         s.selectByValue("senglish");
	        Thread.sleep(500);
	    }

	    @And("^user selects city$")
	    public void user_selects_city() throws Throwable {
	    	 Select s = new Select(ep.getCity());
		     s.selectByValue("pune");
		     Thread.sleep(500);
	    }

	    @And("^user selects mode of learning$")
	    public void user_selects_mode_of_learning() throws Throwable {
	    	 Select s = new Select(ep.getModeoflearning());
		     s.selectByValue("mercedes");
		     Thread.sleep(500);
	    }

	    @And("^user clicks on submit button$")
	    public void user_clicks_on_submit_button() throws Throwable {
	        ep.getSubmitbtn().click();
	    }

	    @And("^alert box for enquiry details$")
	    public void alert_box_for_enquiry_details() throws Throwable {
	    	ep.getEnquirydetails().click();
	    	ep.getSubmitbtn().click();
	    	Alert al = driver.switchTo().alert();
	    	Thread.sleep(500);
	    	al.accept();
	    	Thread.sleep(500);
	    }

	    @And("^user enters enquiry details$")
	    public void user_enters_enquiry_details() throws Throwable {
	        ep.getEnquirydetails().sendKeys("i am here for enquiry");
	        Thread.sleep(500);
	    }

	    @And("^user verifies thank youy for submission$")
	    public void user_verifies_thank_youy_for_submission() throws Throwable {
	        Alert al = driver.switchTo().alert();
	        Thread.sleep(500);
	        al.accept();
	        Thread.sleep(500);
	    }

	    @And("^user verifies after submission form$")
	    public void user_verifies_after_submission_form() throws Throwable {
	    	String actual = sp.text().getText();
	        String expected ="Our Counselor will contact you soon.";
	        Assert.assertTrue(actual.contains(expected));
	        Thread.sleep(500);
	    }
}
