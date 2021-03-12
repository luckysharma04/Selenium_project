import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(new By.ByName("email_create")).sendKeys("abcd12@gmail.com");
        driver.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(new By.ByName("customer_firstname")).sendKeys("Lucky");
        driver.findElement(new By.ByName("customer_lastname")).sendKeys("Sharma");
    }
}
