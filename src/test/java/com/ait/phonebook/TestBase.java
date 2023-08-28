package com.ait.phonebook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  WebDriver driver;

  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://telranedu.web.app");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  public boolean isHomeComponentPresent() {
    return !driver.findElements(By.xpath("//div[2]/div/div")).isEmpty();
  }

  public boolean isElementPresent(By locator) {
    return !driver.findElements(locator).isEmpty();
  }

  public boolean isElementPresent2(By locator) {
    try {
      driver.findElements(locator);
      return true;
    } catch (Exception e) {
      System.err.print(e);
      return false;
    }
  }

  @AfterMethod(enabled = false)
  public void tearDown() {
    driver.quit();
  }
}
