package org.selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SUDHAKAR K\\eclipse-workspace\\Selenium3\\Drivers\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("u");
		//
	}

}
