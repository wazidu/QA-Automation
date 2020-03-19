
package LoginTest;

import org.openqa.selenium.By;
import test.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Wazid Ullah Murad
 */
public class test {
    
    public static void main(String[] args) {
        
        //load driver:
        WebDriver driver=Base.getDriver();
        
        //login tp-link router page
        driver.get("http://192.168.0.1/");
        
        //login
        //find username
        WebElement e1=driver.findElement(By.id("userName"));
        //enter username
        e1.sendKeys("admin");
        WebElement e2=driver.findElement(By.id("pcPassword"));
        e2.sendKeys("admin");
        //click login
        WebElement e3=driver.findElement(By.className("loginBtn"));
        e3.click();
        
    }
    
}
