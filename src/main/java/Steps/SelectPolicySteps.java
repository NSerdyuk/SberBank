package Steps;

import Pages.SelectPolicy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.allure.annotations.Step;

public class SelectPolicySteps extends BaseClass {

    public SelectPolicySteps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Выбрана минимальная сумма страховой защиты")
    public void stepMinimum(){
        new SelectPolicy(driver).setMinimum();
    }

    @Step("Выполнено нажатие кнопки 'Оформить'")
    public void stepButton(){
        new SelectPolicy(driver).setButton();
    }

}
