package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTestsSolution1 {

	public static void main(String[] args) {
		testForChrome();
		testForEdge();
		testForFirefox();

		//if you're using Mac
		//testForSafari();
	}

	public static void testForChrome(){
		WebDriver driver = BrowserFactory.getDriver("Chrome");
		driver.get("https://google.com");
		String titleFromGoogle = driver.getTitle();

		driver.get("https://etsy.com");
		String titleFromEtsy = driver.getTitle();

		driver.navigate().back();
		String titleFromGoogle2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		driver.navigate().forward();
		String titleFromEtsy2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);

		driver.quit();
	}

	public static void testForFirefox(){
		WebDriver driver = BrowserFactory.getDriver("Firefox");
		driver.get("https://google.com");
		String titleFromGoogle = driver.getTitle();

		driver.get("https://etsy.com");
		String titleFromEtsy = driver.getTitle();

		driver.navigate().back();
		String titleFromGoogle2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		driver.navigate().forward();
		String titleFromEtsy2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);

		driver.quit();
	}

	//if you're using Windows computer
	public static void testForEdge(){
		WebDriver driver = BrowserFactory.getDriver("Edge");
		driver.get("https://google.com");
		String titleFromGoogle = driver.getTitle();

		driver.get("https://etsy.com");
		String titleFromEtsy = driver.getTitle();

		driver.navigate().back();
		String titleFromGoogle2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		driver.navigate().forward();
		String titleFromEtsy2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);
	}

	//if you're using Mac computer
	public static void testForSafari(){
		WebDriver driver = BrowserFactory.getDriver("Safari");
		driver.get("https://google.com");
		String titleFromGoogle = driver.getTitle();

		driver.get("https://etsy.com");
		String titleFromEtsy = driver.getTitle();

		driver.navigate().back();
		String titleFromGoogle2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromGoogle,titleFromGoogle2);

		driver.navigate().forward();
		String titleFromEtsy2 = driver.getTitle();
		StringUtility.verifyEquals(titleFromEtsy,titleFromEtsy2);

		driver.quit();
	}
}
