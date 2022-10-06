import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://iperformqa.azurewebsites.net");
        WebElement Username = Driver.findElement(By.xpath("//input[@id = 'UserName']"));
        Username.sendKeys("nikhil.venket@provana.com");
        WebElement Password = Driver.findElement(with(By.tagName("input")).below(Username));
        Password.sendKeys("123456");
        //WebElement Forget = Driver.findElement(with(By.tagName("MainNavHelp")).toRightOf());
        WebElement Forget = Driver.findElement(By.id("MainNavHelp"));
        Forget.click();
    }

}
