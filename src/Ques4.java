import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ques4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","F:\\geckodriver\\geckodriver.exe" );
        WebDriver obj = new FirefoxDriver();

        obj.get("https://www.tothenew.com/");
        obj.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).click();
        obj.findElement(By.xpath("/html/body/div/div/header[2]/div/div/div/nav/div[2]/ul/li[7]/a")).sendKeys(Keys.ENTER);

    }
}