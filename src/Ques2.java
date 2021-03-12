import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques2{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("https://www.google.com/");

    }
}
