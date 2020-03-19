
package LoginTest;

import org.openqa.selenium.By;
import test.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Wazid Ullah Murad
 */
public class test1 {
    
    public static void main(String[] args) {
        
        //load driver:
        WebDriver driver=Base.getDriver();
        
        //login tp-link router page
        driver.get("http://automationpractice.com/index.php");
        
        //login
        //find login
        WebElement element=driver.findElement(By.className("login"));
        element.click();
        element=driver.findElement(By.id("email"));
        element.sendKeys("murad.mzs@gmail.com");
//        element=driver.findElement(By.id("passwd"));
//        element.sendKeys("984057");
        driver.findElement(By.id("passwd")).sendKeys("984057");
        element=driver.findElement(By.id("SubmitLogin"));
        element.click();
        



        
        
        
        
    }
    
}
