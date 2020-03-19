/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read;

import com.sun.org.apache.xerces.internal.impl.xs.ElementPSVImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author Wazid Ullah Murad
 */
public class textRead1 {
    public static void main(String[] args) {
        WebDriver driver=Base.getDriver();
        
        driver.get("https://mbsturadio.herokuapp.com/");
        
        WebElement radiotext=driver.findElement(By.className("header-area"));
        String s1=radiotext.getText();
        System.out.println(s1);
    }
    
}
