package PageFactory;

import java.lang.reflect.Executable;

public class MainFile extends Factory{

    public static void main(String args[])
    {
        MainFile file = new MainFile();
        Factory.browser("chrome");
        file.login();
        file.uploadwindow();

    }
}
