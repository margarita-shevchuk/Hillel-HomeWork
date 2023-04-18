import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Rozetka {
    public static void main(String[] args) {
   //     System.setProperty("webdriver.chrome.driver","chromedriver" );
        WebDriverManager.chromedriver().arch64().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement inputField = driver.findElement(By.name("search"));
        inputField.sendKeys("Acer Aspire", Keys.ENTER);
        WebElement findButton = driver.findElement(By.xpath("//button[contains(text(), 'Знайти')]"));
        findButton.click();
        WebElement openPage = driver.findElement(By.xpath("(//div[@class = 'goods-tile ng-star-inserted'])[3]"));
        openPage.click();
        WebElement buyButton = driver.findElement(By.xpath("//rz-product-buy-btn/app-buy-button"));
        buyButton.click();
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продовжити покупки')]"));
        continueButton.click();
        WebElement inputFieldNextStep = driver.findElement(By.name("search"));
        inputFieldNextStep.sendKeys("FREGGIA", Keys.ENTER);
        WebElement findButtonNextStep = driver.findElement(By.xpath("//button[contains(text(), 'Знайти')]"));
        findButtonNextStep.click();
        WebElement openPageStepSecond = driver.findElement(By.xpath("(//div[@class='goods-tile ng-star-inserted'])[3]"));
        openPageStepSecond.click();
        WebElement chooseBuy = driver.findElement(By.xpath("//rz-product-buy-btn/app-buy-button"));
        chooseBuy.click();


    }
}
