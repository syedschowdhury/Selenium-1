package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mahin\\IdeaProjects\\selenium1\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String mainUrl = "https://www.facebook.com/";
        String tagName = "";

        driver.get(mainUrl);
        driver.findElement(By.id("email")).sendKeys("mahin");
        driver.findElement(By.id("pass")).sendKeys("abcdjkkl",Keys.ENTER);
        System.out.println(tagName);
        Thread.sleep(5000);
        driver.close();


    }
}
