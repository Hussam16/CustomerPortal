package portal;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcases {
	@BeforeTest(enabled = false)
	public static void setup() {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    CustomerLogin login=new CustomerLogin(driver);
		
	}
	
	




	@Test (enabled=false)//(priority = 3)
	public static void verifyHomePageLogo() {
		//String name="ahmed@elashmawy.com";
		String name="fo9zn3mgr@tmail.ws";
		//String password="Iskra@1234";
		String password="Asd123@@";
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    CustomerLogin login=new CustomerLogin(driver); 
	    login.getLogin();
	   login.signIn(name, password);
	   WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"right-panel\"]/div/div[1]/div[1]/a/img"));
	      try {
	            boolean imagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", ImageFile);

	            if (!imagePresent) {
	                System.out.println("Image is NOT Displayed");
	            }
	            else {
	                System.out.println("Image is Displayed");
	            }
	        }
	        catch (Exception ex) {
	            System.out.println("Unable to locate Element " + Arrays.toString(ex.getStackTrace()));
	        }
	      driver.close();
	  // Assert.assertTrue(true, message);
	   
		
	}
	     // Right username & Wrong Password
	     @Test (enabled=false)//(priority = 1)
	     public static void verifyErrorMessage() {
	 		String name="fo9zn3mgr@tmail.ws";
			//String password="Iskra@1234";
			String password="Asd123@";
			WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    CustomerLogin login=new CustomerLogin(driver); 
		    login.getLogin();
		    login.verifyRightUsername(name, password);
		    driver.close();
		    
	    	 }
	     // Right Password & Wrong Username
	     @Test (enabled=false)//(priority = 2) 
	     public static void verifyErrorMessage2() {
		 		String name="fo9zn3mgr@tmail.w";
				//String password="Iskra@1234";
				String password="Asd123@@";
				WebDriverManager.chromedriver().setup();
			    WebDriver driver=new ChromeDriver();
			    CustomerLogin login=new CustomerLogin(driver); 
			    login.getLogin();
			    login.verifyRightUsername(name, password);
			    driver.close();
	    	 
	     }

	     @Test(enabled=false)
	     public static void clickForgetPassword() {

				WebDriverManager.chromedriver().setup();
			    WebDriver driver=new ChromeDriver();
			    CustomerLogin login=new CustomerLogin(driver); 
			    String userEmail="hussamabdelfattah16@mail7.io";
			    login.clickForgetPassword(userEmail);
			    driver.close();
			
		}
 
	     @Test (enabled=false)
	     public static void verifyEmail() {
	 		WebDriverManager.chromedriver().setup();
		    WebDriver driver=new ChromeDriver();
		    Mailsac mailView=new Mailsac(driver);
		    String emailID="hussamabdelfattah16";
		    //String emailID1="hqhh063ql@disbox.org";
			mailView.getMail(emailID);
			//driver.close();

	     }
	     
	     @Test (priority = 1) // create meter request
	     public static void meterRequest() {
		 	String name="fhyde2bgx@disbox.net";
			String password="Asd123@@";
	 		WebDriverManager.chromedriver().setup();
	 		WebDriver driver=new ChromeDriver();
	 		CustomerLogin meterRequest= new  CustomerLogin(driver);
	 		My_MetersPage metersPage=new My_MetersPage(driver);
	 		meterRequest.getLogin();
	 		meterRequest.signIn(name, password);
	 		meterRequest.selectMeters();
	 		metersPage.submitMeters();
	 		metersPage.fillData();
	 		//driver.quit();
	 		
	 		
	 		


	     }
	     
	     
	     
	     
	     


}

