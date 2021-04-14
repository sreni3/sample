package com.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SRENIVASEN\\\\eclipse-workspace\\\\Day6\\\\driver\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.w3schools.com/html/html_tables.asp");
    WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
    List<WebElement> lstRows = table.findElements(By.tagName("tr"));
    for (int i = 0; i < 3 ; i++) {
    	WebElement threeRows = lstRows.get(i);
    	String name = threeRows.getText();
    	System.out.println(name);
	}    
}
}
