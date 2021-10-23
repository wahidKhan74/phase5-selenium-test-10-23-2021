package com.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchValidationTest {

	public static void main(String[] args) {
		// step1: Formulate a test url
		String siteUrl = "https://www.amazon.in/";
		String driverPath ="drivers/chromedriver";
		
		// step2: Setting selenium system property
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// step3: Initiate selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		// step4: Lunch web browser
		driver.get(siteUrl);
		
		// step5: evaluate test
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 12 max pro");
		searchBox.submit();
		
		String expectedTitle = "Amazon.in : Iphone 12 max pro";
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}

		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);
		
		//step6: closed driver
		driver.close();

	}

}
