import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver kit = new ChromeDriver();
        kit.get("https://iperformqa.azurewebsites.net");
        WebElement Username = kit.findElement(By.xpath("//input[@id ='UserName']"));
        Username.sendKeys("nikhil.venket@provana.com");
        WebElement Password = kit.findElement(with(By.tagName("input")).below(Username));
        Password.sendKeys("12345678");
        WebElement Signin = kit.findElement(with (By.id("btnSubmmit")).below(Password));
        Signin.click();
//        Actions ref = new Actions(kit);
//        ref.moveToElement(Username);
//
//        //kit.navigate().refresh();
//       // Thread.sleep(3000);
//       // Username.click();
//        ref.click(Username);
////        Username.sendKeys(Keys.CONTROL);
//        Username.sendKeys("aasddfghhjj");
//        Username.sendKeys(Keys.DELETE);
//        Username.clear();
//        Password.sendKeys(Keys.CONTROL+ "a" +Keys.BACK_SPACE);
//        Password.clear();


        WebElement Password1 = kit.findElement(By.xpath("//input[@id ='UserPwd']"));
        Password1.sendKeys("763nibus");
        WebElement Username1 = kit.findElement(with(By.tagName("input")).above(Password1));
        Username1.sendKeys("subin.archunan@provana.com");
        //WebElement Forget = Driver.findElement(with(By.id("MainNavHelp")).below(Password));
        //WebElement Forget = Driver.findElement(By.id("MainNavHelp"));
        //Forget.click();
        kit.quit();


    }

}
