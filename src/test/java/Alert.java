import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://tnpsc.gov.in/");
        Thread.sleep(4000);
        WebElement applyOnline = Driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        applyOnline.click();
        System.out.println(Driver.switchTo().alert().getText());
        Driver.switchTo().alert().accept();

    }

}
