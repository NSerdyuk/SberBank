import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

public class MainPage extends BaseClass{




    @FindBy(xpath = "//a[@aria-label='Раздел Застраховать себя  и имущество']")
    WebElement insurenceMenu;


    @FindBy(xpath = "//a[@href='/ru/person/bank_inshure/insuranceprogram/life/travel']")
    WebElement insurenceForTravel;

    @FindBy(className = "sbrf-rich-outer")
    WebElement title;

    @FindBy (xpath = "//img[@src='/portalserver/content/atom/contentRepository/content/person/travel/banner-zashita-traveler.jpg?id=f6c836e1-5c5c-4367-b0d0-bbfb96be9c53']")
    WebElement issueOnline;





    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setInsurenceMenu(){
        insurenceMenu.click();
    }
    public void setInsurenceMenu1(){
        insurenceMenu.click();
    }

    public void setInsurenceForTravel(){
        insurenceForTravel.click();
    }

    public void setTitle(){
        Assert.assertTrue(title.getText().contains("Страхование путешественников"));
    }

    public void setIssueOnline() {
        try {
        Set<String> windowHandles = driver.getWindowHandles();
        issueOnline.click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(windowHandles);
        driver.switchTo().window(newTab.get(1));
                Thread.sleep(5000);
        }    catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    /**Конструктор
     */
    public void mainPageConstructor(){
        this.setInsurenceMenu();
        this.setInsurenceMenu1();
        this.setInsurenceForTravel();
        this.setTitle();
        this.setIssueOnline();
    }

}
