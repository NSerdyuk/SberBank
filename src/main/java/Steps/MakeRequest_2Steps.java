package Steps;

import Pages.MakeRequest_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

public class MakeRequest_2Steps extends BaseClass{

    public MakeRequest_2Steps(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Step("Поля {0} заполняются значением {1}")
    public void stepfillField(String fieldName, String value){
        new MakeRequest_2(driver).fillField(fieldName,value);
    }

    @Step("Заполняются поля:")
    public void stepfillFields(HashMap<String,String> fields){
        fields.forEach(this::stepfillField);
    }

    @Step("Выбран пол")
    public void stepFemale(){
        new MakeRequest_2(driver).setFemale();
    }

    @Step("Выполнено нажатие кнопки 'Продолжить'")
    public void stepContinueButton (){
        new MakeRequest_2(driver).setContinueButton();
    }

    @Step("Выполнена проверка наличия ошибки 'Заполнены не все обязательные поля'")
    public void stepError(){
        new MakeRequest_2(driver).setError();
    }





}
