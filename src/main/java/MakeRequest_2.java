import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeRequest_2 extends BaseClass {

    @FindBy(className = "l-header-title ng-binding")
    WebElement title;

    @FindBy(name = "insured0_surname")
    WebElement insuredSurname;

    @FindBy(name = "insured0_name")
    WebElement insuredName;

    @FindBy(name = "insured0_birthDate")
    WebElement insuredBirthDate;

    @FindBy(name = "surname")
    WebElement surname;

    @FindBy(name = "name")
    WebElement name;

    @FindBy(name = "middlename")
    WebElement middlename;

    @FindBy(name = "birthDate")
    WebElement birthDate;

    @FindBy(name = "female")
    WebElement female;

    @FindBy(name = "passport_series")
    WebElement passportSeries;

    @FindBy(name = "passport_number")
    WebElement passportNumber;

    @FindBy(name = "issueDate")
    WebElement issueDate;

    @FindBy(name = "issuePlace")
    WebElement issuePlace;

    @FindBy(className = "b-continue-btn")
    WebElement continueButton;

    @FindBy(xpath = "//div[@ng-show='tryNext && myForm.$invalid']")
    WebElement error;


    public MakeRequest_2(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия Страхователя":
                fillField(insuredSurname, value);
                break;
            case "Имя Страхователя":
                fillField(insuredName, value);
                break;
            case "Дата рождения Страхователя":
                fillField(insuredBirthDate, value);
                break;
            case "Фамилия":
                fillField(surname, value);
                break;
            case "Имя":
                fillField(name, value);
                break;
            case "Отчество":
                fillField(middlename, value);
                break;
            case "Дата рождения":
                fillField(birthDate, value);
                break;
            case "Пол":
                female.click();
                break;
            case "Серия паспорта":
                fillField(passportSeries, value);
                break;
            case "Номер паспорта":
                fillField(passportNumber, value);
                break;
            case "Дата выдачи":
                fillField(issueDate, value);
                break;
            case "Место выдачи":
                fillField(issuePlace, value);
                break;

        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия Страхователя":
                return insuredSurname.getAttribute("value");
            case "Имя Страхователя":
                return insuredName.getAttribute("value");
            case "Дата рождения Страхователя":
                return insuredBirthDate.getAttribute("value");
            case "Фамилия":
                return surname.getAttribute("value");
            case "Имя":
                return name.getAttribute("value");
            case "Отчество":
                return middlename.getAttribute("value");
            case "Дата рождения":
                return birthDate.getAttribute("value");
            case "Серия паспорта":
                return passportSeries.getAttribute("value");
            case "Номер паспорта":
                return passportNumber.getAttribute("value");
            case "Дата выдачи":
                return issueDate.getAttribute("value");
            case "Место выдачи":
                return issuePlace.getAttribute("value");
        }
        throw new AssertionError("Заполнены не все обязательные поля");
    }
    public void setContinueButton (){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", continueButton);
        continueButton.click();

    }
    public void setError(){
        Assert.assertTrue(error.getText().contains("Заполнены не все обязательные поля"));
    }

}