package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Browser
{

    public static WebDriver launch;

    Browser(WebDriver launch)
    {
        PageFactory.initElements(launch, this);
        this.launch = launch;
    }
    public static void browser(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\chromedriver.exe");
            launch = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\nikhil.venket\\IdeaProjects\\untitled\\Driver\\geckodriver1.exe");
            launch  = new FirefoxDriver();
        }
        System.out.println("open " +launch);
        launch.get("https://iperformqa.azurewebsites.net");
        launch.manage().window().maximize();

    }
}
