package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Amazon {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mahin\\IdeaProjects\\selenium1\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("topbar-icons style-scope ytd-masthead")).sendKeys("Game of Thrones", Keys.ENTER);
        Thread.sleep(2000);

        driver.close();

    }
}
