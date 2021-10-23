package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		// step1: Formulate a test url
		String siteUrl = "https://www.google.com/";
		String driverPath ="drivers/chromedriver";
		
		// step2: Setting selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step3: Initiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		// step4: Lunch web browser
		driver.get(siteUrl);
		
		// step5: Evaluate Test
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		System.out.println("Expected Title : "+expectedTitle);
		System.out.println("Actual Title : "+actualTitle);
		
		// step6: close driver
		driver.close();
	}

}
