package com.ait.phonebook;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewUserTests extends TestBase {

  @Test
  public void createNewUserPositiveTest() {
//    //a[contains(.,'LOGIN')]
    driver.findElement(By.xpath("//a[contains(.,'LOGIN')]")).click();
//    [placeholder='Email']
    driver.findElement(By.cssSelector("[placeholder='Email']")).click();
    driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
    driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("wladimir@gmail.com");
//    [name='registration']
    driver.findElement(By.cssSelector("[placeholder='Password']")).click();
    driver.findElement(By.cssSelector("[placeholder='Password']")).clear();
    driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("SS$ss$12");
//    registration
    driver.findElement(By.name("registration")).click();
//    //button[contains(.,'Sign Out')]
    Assert.assertTrue(isElementPresent(By.xpath("//button[contains(.,'Sign Out')]")));
  }
}
