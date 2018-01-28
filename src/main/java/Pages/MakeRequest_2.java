package Pages;

import Steps.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeRequest_2 extends BaseClass {

    @FindBy(xpath = "//h2[@ng-bind='prodTitle']")
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
        (new WebDriverWait(driver, 20))
                .until(ExpectedConditions.visibilityOf(title));
        this.driver = driver;
    }


    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия Страхователя":
                fillField(insuredSurname, value);
                Assert.assertEquals("Ivanov", insuredSurname.getAttribute("value"));
                break;
            case "Имя Страхователя":
                fillField(insuredName, value);
                Assert.assertEquals("Ivan", insuredName.getAttribute("value"));
                break;
            case "Дата рождения Страхователя":
                fillField(insuredBirthDate, value);
                Assert.assertEquals("10.04.1990", insuredBirthDate.getAttribute("value"));
                break;
            case "Фамилия":
                fillField(surname, value);
                Assert.assertEquals("Иванов", surname.getAttribute("value"));
                break;
            case "Имя":
                fillField(name, value);
                Assert.assertEquals("Иван", name.getAttribute("value"));
                break;
            case "Отчество":
                fillField(middlename, value);
                Assert.assertEquals("Иванович", middlename.getAttribute("value"));
                break;
            case "Дата рождения":
                fillField(birthDate, value);
                Assert.assertEquals("12.04.1990", birthDate.getAttribute("value"));
                break;
            case "Пол":
                female.click();
                break;
            case "Серия паспорта":
                fillField(passportSeries, value);
                Assert.assertEquals("0000", passportSeries.getAttribute("value"));
                break;
            case "Номер паспорта":
                fillField(passportNumber, value);
                Assert.assertEquals("000000", passportNumber.getAttribute("value"));
                break;
            case "Дата выдачи":
                fillField(issueDate, value);
                Assert.assertEquals("15.01.2015", issueDate.getAttribute("value"));
                break;
            case "Место выдачи":
                fillField(issuePlace, value);
                Assert.assertEquals("ппро", issuePlace.getAttribute("value"));
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

    public void setFemale(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", female);
        female.click();
    }
    public void setContinueButton (){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", continueButton);
        continueButton.click();

    }
    public void setError(){
        Assert.assertTrue(error.getText().contains("Заполнены не все обязательные поля"));
    }



}
