package portal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Mailsac {

    static WebDriver driver=null;
	static By username= By.name("username");
	static By Password=By.xpath("//input[@autocomplete='password']");
	static By loginButton= By.xpath("//a[@onclick='goToInbox();']");
	static By requstedEmail= By.xpath("//li[@id='public_5f0316dfb39fbd001754ad06']"); // select 2nd item
	//li[@id='public_5ef66767985dc80017a2a8b5']    (//div[contains(@class, 'mail-col mail-col-1')])[2]
	static By hereLink=By.partialLinkText("ere");
	static By newPassword= By.name("NewPassword");
	static By confirmPassword=By.name("ConfirmPassword");

    
    Mailsac(WebDriver driver){
		this.driver=driver;
		}
    
	public static void getMail(String name) {
		
		driver.get("https://console.mail7.io/admin/inbox/inbox?username=hussamabdelfattah16");
		/*WebElement username1 =driver.findElement(username);
		username1.sendKeys(name);
		//WebElement passwords=driver.findElement(Password);
		//passwords.sendKeys(pass);
		WebElement button =driver.findElement(loginButton);
		button.click();*/WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement forgetEmail=driver.findElement(requstedEmail);
		forgetEmail.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		//WebElement pageTitle1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class, 'mail-col mail-col-1')])[2]")));
		//WebElement forgetLink=driver.findElement(hereLink);
		//System.out.println(pageTitle1.getText());
		//WebElement HereLink=driver.findElement(hereLink);
		//HereLink.click();
		driver.navigate().to("https://phnc.eandpower.com:9002/Account/ResetPassword?userId=6a3c8bc6-0a7f-41af-b40b-fa4125807ada&code=CfDJ8I2wRpqhdKVLqHTkxmJDfHvetapm6werhjAf%2fmNrTnoidB1onxYpN3FR%2buceUQcAgaQS%2bA8DUtm5ZyNXFyVu9tN70l4P3SixPc7yeB%2fswqrHdqd9GfWW3PN3NsiHu1SwS9yzzzSiZyyT%2bPj8k0sZVDhPOJQNx6v%2bk1cQ9olFkyLqOXJpl%2fSSngN2vnMooVv7n34f9C2GznXvn94ail5kEvIs3U0EwuRjIJ0FSjJFb9sH");
		
		//System.out.println(HereLink.getAttribute("href"));
		//HereLink.getAttribute("href");
		//driver.findElement(By.xpath("//div[@id='testId']/a")).getAttribute("href");
		//find all anchor tags in the page
		/*List<WebElement> refList = driver.findElements(By.tagName("iframe"));

		   //iterate over web elements and use the getAttribute method to 
		   //find the hypertext reference's value.

		    for(WebElement we : refList) {
		        System.out.println(we.getAttribute("href"));
		    }*/
	
		 
		 
		// driver.switchTo().defaultContent(); // you are now outside both frames
		// driver.switchTo().frame("vuknwbfyyuuwqr2v");
		 // now continue step 6
		// driver.findElement(By.xpath("//a[text()='here']")).click();
		
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(size);
	//	WebElement parentOfIframe = driver.findElement(By.xpath("/html"));
     //   List<WebElement> framesToSelect= parentOfIframe.findElements(By.tagName("iframe"));

      //  driver.switchTo().frame(framesToSelect.get(0));  //If your required frame is at first position
		
		//driver.switchTo().frame("aswift6cr0jt19h0brq19w_0");
		//System.out.println("Switching to the frame");
		WebElement newpassword=driver.findElement(newPassword);
		newpassword.sendKeys("Asd123@@");
		WebElement confirmPassword1=driver.findElement(confirmPassword);
		confirmPassword1.sendKeys("Asd123@@");
		confirmPassword1.sendKeys(Keys.ENTER);
		
        
		
		


		
	}
	

    

}
