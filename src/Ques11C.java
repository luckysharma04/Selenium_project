import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques11C {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Thread.sleep(5000);
        if (obj.getPageSource().contains("Create an account")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }
}