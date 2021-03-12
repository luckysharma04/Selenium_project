import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques4A {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe" );
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.tothenew.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("h-contact-us")).sendKeys(Keys.ENTER);

    }
}