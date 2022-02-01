import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.sahibinden.com");
        String  webTitle = driver.getTitle();
        String  webUrl = driver.getCurrentUrl();
        System.out.println(webTitle);
        System.out.println(webUrl);
        driver.quit();
    }
}
