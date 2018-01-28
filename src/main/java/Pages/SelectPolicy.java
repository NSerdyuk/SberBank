package Pages;

import Steps.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPolicy extends BaseClass {

    @FindBy(xpath = "//div[contains(text(),'Минимальная')]")
    WebElement minimum;

    @FindBy(xpath = "//span[contains(text(),'Оформить')]")
    WebElement button;

    public void setMinimum(){
        try {
            Thread.sleep(3000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", minimum);
        minimum.click();

        }    catch (InterruptedException c) {
        c.printStackTrace();
    }
    }

    public void setButton(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
        button.click();
    }

    public SelectPolicy(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**Конструктор
     */

    public void issueApplicationConstructor(){
        this.setMinimum();
        this.setButton();
    }
}