
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String  webTitle = driver.getTitle();
        String  webUrl = driver.getCurrentUrl();
        System.out.println(webTitle);
        System.out.println(webUrl);


        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().deleteAllCookies();

        // Set Chrome window size
        //driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        // Enter Firstname
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        // Set Lastname
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Wood");
        // Select Gender
        driver.findElement(By.id("sex-0")).click();
        // Select Experience
        driver.findElement(By.id("exp-4")).click();
        // Enter Date

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020", Keys.ENTER);
        // Select Profession
        driver.findElement(By.id("profession-1")).click();
        // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();

        // Select Continent
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        // Select Command
        WebElement dropdown2 = driver.findElement(By.id("selenium_commands"));
        dropdown2.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

        // Scroll Vertical
        //JavascriptExecutor js;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        driver.findElement(By.id("submit")).click();
       // driver.quit();
    }
}
