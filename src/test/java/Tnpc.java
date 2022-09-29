import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tnpc {

    public static void main(String args[]) {
        System.out.println("\n >>> Nikhil");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.tnpsc.gov.in/");
        WebElement al = Driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        al.click();
 //       Driver.switchTo().alert().dismiss();
        Driver.switchTo().alert().accept();


        WebElement la = Driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
    la.click();
    }
}
