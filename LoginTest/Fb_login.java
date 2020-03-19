/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Wazid Ullah Murad
 */
public class Fb_login {
    
    public static void main(String[] args) {
        WebDriver driver=Base.getDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.findElement(By.id("email")).sendKeys("wazidullah.murad");
        driver.findElement(By.id("pass")).sendKeys("zeroxmuradbrofacebook");
        driver.findElement(By.id("loginbutton")).click();
    }
    
}
