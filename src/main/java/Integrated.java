import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Integrated {
    public static void main(String[] args){

        //Setting web driver path//
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/home/knoldus/Documents/selenium/chromedriver_linux64/chromedriver");

        //Opening the Chrome//
        driver = new ChromeDriver();

        //Maximizing the Chrome window//
        driver.manage().window().maximize();

        //Putting wait to execute the code//
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Opening amazon website landing page//
        driver.get("https://www.amazon.com/");

        //Automating various fields of landing page//
        //Search bar and giving value "object" in it//
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Oneplus6T");

        //Search button click//
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

        //Click on first product comes in list//
        driver.findElement(By.xpath("//span[contains(text(),'OnePlus 8T | 5G Unlocked Android Smartphone | A Da')]")).click();

        //Adding to cart//
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();

        //Checkout//
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();

        //Login for checkout//
        //putting username//
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("sujeetsrivastava708@gmail.com");
        driver.findElement(By.cssSelector("#continue")).click();

        //Putting password//
        //driver.findElement(By.cssSelector("#ap_password")).sendKeys("securitypurpose");
        //driver.findElement(By.cssSelector("#signInSubmit")).click();

    }


}
