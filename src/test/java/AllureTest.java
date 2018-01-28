import Steps.BaseClass;
import Steps.MainPageSteps;
import Steps.MakeRequest_2Steps;
import Steps.SelectPolicySteps;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.util.HashMap;

public class AllureTest extends BaseClass {

    MainPageSteps mainPageSteps;
    SelectPolicySteps selectPolicySteps;
    MakeRequest_2Steps makeRequest_2Steps;

    @Test
    @Title("Страхование")
     public void testInsurence(){

        mainPageSteps=new MainPageSteps(driver);
        selectPolicySteps = new SelectPolicySteps(driver);
        makeRequest_2Steps = new MakeRequest_2Steps(driver);

        HashMap<String,String> testDate = new HashMap<>();

        testDate.put("Фамилия Страхователя","Ivanov");
        testDate.put("Имя Страхователя","Ivan");
        testDate.put("Дата рождения Страхователя","10041990");
        testDate.put("Фамилия","Иванов");
        testDate.put("Имя","Иван");
        testDate.put("Отчество","Иванович");
        testDate.put("Дата рождения","12041990");
        testDate.put("Серия паспорта","0000");
        testDate.put("Номер паспорта","000000");
        testDate.put("Дата выдачи","15012015");
        testDate.put("Место выдачи","ппро");

        mainPageSteps.stepInsurenceMenu();
        mainPageSteps.stepInsurenceForTravel();
        mainPageSteps.stepTitle();
        mainPageSteps.stepIssueOnline();

        selectPolicySteps.stepMinimum();
        selectPolicySteps.stepButton();

        makeRequest_2Steps.stepfillFields(testDate);
        makeRequest_2Steps.stepFemale();
        makeRequest_2Steps.stepContinueButton();
        makeRequest_2Steps.stepError();

    }

}
