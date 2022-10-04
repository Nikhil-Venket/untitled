import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementsWeb {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        ChromeOptions op= new ChromeOptions();
        op.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver Driver = new ChromeDriver(op);
        Driver.manage().window().maximize();
        Driver.get("https://tnpsc.gov.in/");
        WebElement elmnt=Driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input[1]"));
//        System.out.println(elmnt.isEnabled());
        System.out.println(elmnt.isDisplayed());
        System.out.println(elmnt.isSelected());

    }
}
