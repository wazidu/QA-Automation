/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSS_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Wazid Ullah Murad
 */
public class Css_Xpath1 {
    
    public static void main(String[] args) {
        WebDriver driver =Base.getDriver();
        driver.get("http://automationpractice.com/index.php");
        //xpath
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        //full xpath
        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();

    }
    
}
