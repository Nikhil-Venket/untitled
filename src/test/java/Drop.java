import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
    public static void main(String args[]) {
        System.out.println("\n >>> Nikhil");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://jqueryui.com/droppable/");
        Driver.switchTo().frame(0);
        WebElement new1 = Driver.findElement(By.id("draggable"));
        WebElement old = Driver.findElement(By.id("droppable"));
        Actions act = new Actions(Driver);
        act.dragAndDrop(new1,old).build().perform();


    }
}