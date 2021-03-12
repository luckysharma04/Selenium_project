import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ques11B {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        obj.findElement(new By.ByName("email_create")).sendKeys("abcd12@gmail.com");
        obj.findElement(new By.ByName("SubmitCreate")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement we=obj.findElement(new By.ById("id_gender1"));
        we.click();
        System.out.println("Mr is selected: "+we.isSelected());

    }
}
