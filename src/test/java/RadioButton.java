import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
            WebDriver kit = new ChromeDriver();


            kit.get("http://testleaf.herokuapp.com/");

            kit.manage().window().maximize();

            WebElement element = kit.findElement(By.xpath("//h5[text()='Checkbox']"));
            element.click();

            WebElement radioBtn = kit.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
            radioBtn.click();

            Thread.sleep(5);

            kit.close();



        }


    }

