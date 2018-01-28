package Steps;

import Pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class MainPageSteps extends BaseClass{

    public MainPageSteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Выбран раздел 'Застраховать себя и имущество'")
    public void stepInsurenceMenu(){
        new MainPage(driver).setInsurenceMenu();
    }

    @Step("Выбран пункт меню 'Страхование путешественников'")
    public void  stepInsurenceForTravel(){
        new MainPage(driver).setInsurenceForTravel();
    }

    @Step("Выполнен переход на страницу 'Страхование путешественников'")
    public void stepTitle(){
        new MainPage(driver).setTitle();
    }

    @Step ("Выбран пункт меню 'Оформление онлайн'")
    public void stepIssueOnline(){
        new MainPage(driver).setIssueOnline();
    }





}
