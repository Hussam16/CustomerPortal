package portal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CustomerLogin {
	static By userName=By.name("Email");
	static By password=By.name("Password");
	static By loginButton= By.xpath("//button[@type='submit']");
	static By forgetPassword=By.xpath("//strong[text()='support@eandpower.com']");
	static By link=By.xpath("//a[text()='Forget your password?']");
	static By email=By.name("Email");
	
	static WebDriver driver=null;
	
	CustomerLogin(WebDriver driver){
		this.driver=driver;
		}
	
	public static void getLogin() {
		driver.get("http://10.0.61.15:8060/Account/Login");
		//driver.get("https://phnc.eandpower.com:9002/");
		driver.manage().window().fullscreen();
		}
	
	
	public static void signIn(String name,String pass) {
		WebElement username =driver.findElement(userName);
		username.sendKeys(name);
		WebElement passwords=driver.findElement(password);
		passwords.sendKeys(pass);
		WebElement button =driver.findElement(loginButton);
		button.click();
		} 
	
	public static void verifyRightUsername(String userNum,String passwordNum) {
		WebElement username =driver.findElement(userName);
		username.sendKeys(userNum);
		WebElement passwords=driver.findElement(password);
		passwords.sendKeys(passwordNum);
		WebElement button =driver.findElement(loginButton);
		button.click();
		// This will capture error message
		String actual_msg=driver.findElement(By.xpath("//div[2]/form/div[1]/ul/li")).getText();
		    
		// Store message in variable
		String expect="username/password is not valid";
		                
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		 
		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		System.out.println(actual_msg);
		 
		
		
		
	}

	public static void clickForgetPassword(String emails) {
		driver.navigate().to("https://phnc.eandpower.com:9002/");
		WebElement button =driver.findElement(link);
		button.click();
		WebElement customerEmail =driver.findElement(email);
		customerEmail.sendKeys(emails);
		customerEmail.sendKeys(Keys.ENTER);

		
	}
	
	public static void selectMeters() {
		driver.navigate().to("http://10.0.61.15:8060/Meter");
		
	}
	
	
	
	
	
	

}
