package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Factory extends Browser implements IperformPage,Login {

    Factory() {
        super(launch);
    }

    @FindBy (id="UserName")
    static WebElement elmntUsernmae;

    @FindBy (how = How.XPATH, using = "//input[@id ='UserPwd']")
    static WebElement elmntPassword;

    @FindBy (id ="btnSubmmit")
    static WebElement btnLogin;

    @Override
    public void login() {
        PageFactory.initElements(launch,this);
        elmntUsernmae.sendKeys("subin.archunan@provana.com");
        elmntPassword.sendKeys("763nibus");
        btnLogin.click();
    }

    @FindBy(how = How.XPATH,using = "//a[@class='dis-inline-block']")
    static WebElement uploadbt;
    @Override
    public void uploadwindow() {
        PageFactory.initElements(launch,this);
        uploadbt.click();

    }


}
