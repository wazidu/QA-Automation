
package selenium.automation;

import org.openqa.selenium.WebDriver;


public class Test1 {
    public static void main(String[] args) {
        WebDriver driver=Base.getDriver();
        driver.get("http://google.com");
    }
    
}
