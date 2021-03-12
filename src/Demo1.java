import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "F:\\geckodriver\\geckodriver.exe");
        WebDriver obj = new FirefoxDriver();
        obj.get("https://www.google.com/");

    }
}

