import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SelectClass {


    public static void main(String[] args) throws Exception
    {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
        WebDriver kit = new ChromeDriver();


        kit.get("http://testleaf.herokuapp.com/");

        kit.manage().window().maximize();

        WebElement element = kit.findElement(By.xpath("//h5[text()='Drop down']"));
        element.click();

        WebElement dropdownByIndex = kit.findElement(By.xpath("//select[@id='dropdown1']"));
        Select selectIndex = new Select(dropdownByIndex);
        selectIndex.selectByIndex(0);
        selectIndex.selectByValue("1");
        selectIndex.selectByVisibleText("Selenium");
        Thread.sleep(3000);


//        WebElement dropdownByValue = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select selectValue = new Select(dropdownByValue);
//        selectValue.selectByValue("1");
//
//        WebElement dropdownByVisible = driver.findElement(By.xpath("//select[@id='dropdown1']"));
//        Select selectVisible = new Select(dropdownByVisible);
//        selectVisible.selectByVisibleText("Selenium");

        kit.close();

    }


}
