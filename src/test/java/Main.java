import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Main {
    public static void main (String args[])
    {
        System.out.println("\n >>> Nikhil");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://testleaf.herokuapp.com/");

        /*Action Class*/
        Actions act = new Actions(Driver);
        act.moveToElement(Driver.findElement(By.linkText("Edit")));
        WebElement drp = Driver.findElement(By.ByXPath"//input[@id=\"email"]"));
        act.build().perform();

        WebElement drp = Driver.findElement(By.xpath("//img[@alt='ListBox']"));
        drp.click();
        /*Select class*/
        Select sel = new Select(Driver.findElement(By.id("dropdown1")));
        sel.selectByIndex(1);

        List<WebElement> option = sel.getOptions();
        for (WebElement ele : option) {
            System.out.println(ele.getText());
        }


       // Driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("youtube"+Keys.ENTER);
        //Driver.findElement(By.xpath("//div[@class=\"TbwUpd NJjxre\"]")).click();
        //Driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Selenium"+Keys.ENTER);

    }
}
