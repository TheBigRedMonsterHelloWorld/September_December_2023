package com.automation_sep01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Code {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // Ctrl+Shift+O
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver(); // Ctrl+Shift+O
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver(); // Ctrl+Shift+O
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com/");
		driver2.quit();
		
	}
}
