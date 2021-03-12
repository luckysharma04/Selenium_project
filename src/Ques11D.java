import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11D {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();

        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        if(obj.getTitle().equals("Login - My Store"))

            System.out.println("Page Title is Matched");

        else

            System.out.println("Page Title is not Matched");
    }
}


