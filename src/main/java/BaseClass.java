import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BaseClass {
    public WebDriver driver;

    @org.junit.Before
    public void webDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Натали/IdeaProjects/Selenium_Sber/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        driver = new ChromeDriver(co);
        driver.get("http://www.sberbank.ru/ru/person");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void fillField(WebElement field, String value){
        field.clear();
        field.sendKeys(value);
    }

}

