import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main (String args[])
    {
        System.out.println("\n >>> Nikhil");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.google.com");


        Driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("youtube"+Keys.ENTER);
        Driver.findElement(By.xpath("//div[@class=\"TbwUpd NJjxre\"]")).click();
        Driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Selenium"+Keys.ENTER);

    }
}
