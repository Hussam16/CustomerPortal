package portal;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class My_MetersPage {
	static By MyMetersButton=By.xpath("//a[text()='Add New Meters']");
	static By ServiceType=By.id("ServiceType");
	static By Governorates=By.id("GovernorateId");
	static By Cities=By.id("CityId");
	static By Districts=By.id("DistrictId");
	static By Compounds=By.id("CompoundId");
	static By Unit_Number=By.name("UnitNumber");
	static By OwnerRadioButton=By.xpath("//input[@value='1']");
	static By Tenant =By.xpath("//input[@value='2']");
	static By SendRequestButton=By.id("submitRequest");
	

	static WebDriver driver=null;
	public My_MetersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public static void submitMeters() {
		WebElement button =driver.findElement(MyMetersButton);
		button.click(); 
		}
	
	public static void fillData() {

		Select serviceType = new Select(driver.findElement(ServiceType));
		serviceType.selectByIndex(1); // Electricty
		Select Governorate = new Select(driver.findElement(Governorates));
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(Governorates));
		//Governorate.selectByVisibleText("Cairo");
		Governorate.selectByIndex(26);// Cairo
		Select city = new Select(driver.findElement(Cities));
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(Cities));
		city.selectByIndex(1);
		
		
		

		
		
		
		
		
		
		

		

		
		
		
		
	}

	
	

}
