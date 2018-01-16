import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeRequest extends BaseClass {

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


    public MakeRequest(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setInsuredSurname(String insuredSurname1){
        insuredSurname.sendKeys(insuredSurname1);

    }

    public void setInsuredName(String insuredName1){
        insuredName.sendKeys(insuredName1);
    }

    public void setInsuredBirthDate(String insuredBirthDate1){
        insuredBirthDate.sendKeys(insuredBirthDate1);
    }

    public void setSurname(String surname1){
        surname.sendKeys(surname1);
    }

    public void setName (String name1){
        name.sendKeys(name1);
    }

    public  void setMiddlename (String middlename1){
        middlename.sendKeys(middlename1);

    }

    public void setBirthDate(String birthDate1){
        birthDate.sendKeys(birthDate1);
    }

    public void setFemale(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", female);
        female.click();
    }

    public void setPassportSeries (String passportSeries1){
        passportSeries.sendKeys(passportSeries1);
    }

    public void setPassportNumber (String passportNumber1){
        passportNumber.sendKeys(passportNumber1);
    }

    public void setIssueDate (String issueDate1){
        issueDate.sendKeys(issueDate1);
    }

    public void setIssuePlace(String issuePlace1){
        issuePlace.sendKeys(issuePlace1);
    }

    public void setContinueButton (){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", continueButton);
        continueButton.click();

    }
    public void setError(){
        Assert.assertTrue(error.getText().contains("Заполнены не все обязательные поля"));
    }


    /** Конструктор
     * @param insuredSurname1
     * @param insuredName1
     * @param insuredBirthDate1
     * @param surname1
     * @param name1
     * @param middlename1
     * @param birthDate1
     * @param passportSeries1
     * @param passportNumber1
     * @param issueDate1
     * @param issuePlace1
     */
    public void makeRequestConstructor(String insuredSurname1, String insuredName1, String  insuredBirthDate1,
         String surname1, String name1, String middlename1, String birthDate1, String passportSeries1,String passportNumber1,
         String issueDate1,String issuePlace1){
        this.setInsuredSurname(insuredSurname1);
        this.setInsuredName(insuredName1);
        this.setInsuredBirthDate(insuredBirthDate1);
        this.setSurname(surname1);
        this.setName(name1);
        this.setMiddlename(middlename1);
        this.setBirthDate(birthDate1);
        this.setFemale();
        this.setPassportSeries(passportSeries1);
        this.setPassportNumber(passportNumber1);
        this.setIssueDate(issueDate1);
        this.setIssuePlace(issuePlace1);
        this.setContinueButton();
        this.setError();


    }



}
