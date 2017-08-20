package demoaut_package;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class elements 
{


	public static void main(String args[])
{
		
		//initialize webdriver
		System.setProperty("webdriver.gecko.driver", "/Users/renuka/Documents/selenium software/geckodriver");
		WebDriver driver = new FirefoxDriver(); 
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		driver.getCurrentUrl();
		
		//go to webpage
		String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);
		
		//enter user-id and password
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("userName")));
		driver.findElement(By.name("userName")).sendKeys ("sam123");
		driver.findElement(By.name("password")).sendKeys ("sam123"); // textbox
		driver.findElement(By.name("login")).click(); // clcik button
		
		// This is just a snippet of code to demonstrate radio button and is commented out.
		//***********
		/*List<WebElement> rb = driver.findElements(By.name("tripType"));	
		boolean bValue = false;
		bValue = rb.get(0).isSelected();
		if(bValue == true){
			// This will select Second radio button, if the first radio button is selected by default
			rb.get(1).click();
		}else{
			// If the first radio button is not selected by default, the first will be selected
			rb.get(0).click();
		} */
		//*****************
		
		
		driver.findElement(By.cssSelector("input[value='roundtrip']")).click(); // select roundtrip radiobutton
		
		//select number of passengers
		WebElement element1 = driver.findElement(By.name("passCount")); 
		Select pass = new Select(element1); // dropdown
		pass.selectByValue("2");
		
		//Arrival/Departure 
		WebElement element2 = driver.findElement(By.name("fromPort"));
		Select from = new Select(element2);
		from.selectByVisibleText("London");
		 
		Select month1 = new Select(driver.findElement(By.name("fromMonth")));
		month1.selectByIndex(11);
		Select day1 = new Select(driver.findElement(By.name("fromDay")));
		day1.selectByIndex(7);
		Select to = new Select(driver.findElement(By.name("toPort")));
		to.selectByVisibleText("London");
		Select month2 = new Select(driver.findElement(By.name("toMonth")));
		month2.selectByIndex(11);
		Select day2 = new Select(driver.findElement(By.name("toDay")));
		day2.selectByValue("10");
		
		//Select Preferences
		driver.findElement(By.cssSelector("input[value='Business']")).click();
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByVisibleText("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
		
		//Select Flight
		driver.findElement(By.cssSelector("input[name='outFlight'][value='Blue Skies Airlines$361$271$7:10']")).click();
		driver.findElement(By.cssSelector("input[name='inFlight'][value='Pangea Airlines$632$282$16:37']")).click();
		driver.findElement(By.cssSelector("input[name='reserveFlights']")).click();
		
		//Enter Passenger Details
		driver.findElement(By.cssSelector("input[name='passFirst0']")).sendKeys("renuka");
		driver.findElement(By.cssSelector("input[name='passLast0']")).sendKeys("padwal");
		driver.findElement(By.cssSelector("input[name='passFirst0']")).sendKeys("renuka");
		driver.findElement(By.cssSelector("input[name='passLast0']")).sendKeys("padwal");
		driver.findElement(By.name("passFirst1")).sendKeys("manish");
		driver.findElement(By.name("passLast1")).sendKeys("thorat");
		
		Select meal = new Select(driver.findElement(By.name("pass.0.meal")));
		meal.selectByVisibleText("Hindu");
		Select meal2 = new Select(driver.findElement(By.name("pass.1.meal")));
		meal2.selectByVisibleText("Hindu");
		Select creditype = new Select(driver.findElement(By.name("creditCard")));
		creditype.selectByVisibleText("Visa");
		driver.findElement(By.name("creditnumber")).sendKeys("1234");
		Select expiry = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		expiry.selectByVisibleText("01");
		Select year = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		year.selectByVisibleText("2000");
		driver.findElement(By.name("cc_frst_name")).sendKeys("renuka");
		driver.findElement(By.name("cc_mid_name")).sendKeys("manish");
		driver.findElement(By.name("cc_last_name")).sendKeys("thorat");	
		driver.findElement(By.name("billAddress1")).sendKeys("1933 forbs driver");
		driver.findElement(By.name("billCity")).sendKeys("washington");
		driver.findElement(By.name("billState")).sendKeys("pennsylvania");
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys("67163");	
		Select country = new Select(driver.findElement(By.name("billCountry")));
		country.selectByVisibleText("AUSTRIA");
		driver.findElement(By.name("delAddress1")).sendKeys("2288 okland");
		driver.findElement(By.name("delCity")).sendKeys("la");
		driver.findElement(By.name("delState")).sendKeys("nj");
		driver.findElement(By.name("delZip")).clear();
		driver.findElement(By.name("delZip")).sendKeys("77777");
		Select delcountry = new Select(driver.findElement(By.name("delCountry")));
		delcountry.selectByVisibleText("AUSTRIA");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.cssSelector("img[src='/images/forms/Logout.gif']")).click();
		

	}

}

