public class Sber_3  extends BaseClass{

    MainPage mainPage;
    SelectPolicy issueApplication;
    MakeRequest_2 makeRequest_2;

    @org.junit.Test
    public void Test() {

        mainPage= new MainPage(driver);
        mainPage.mainPageConstructor();

        issueApplication = new SelectPolicy(driver);
        issueApplication.issueApplicationConstructor();

        makeRequest_2 = new MakeRequest_2(driver);
        makeRequest_2.fillField("Фамилия Страхователя","Ivanov");
        makeRequest_2.fillField("Имя Страхователя","Ivan");
        makeRequest_2.fillField("Дата рождения Страхователя","10041190");
        makeRequest_2.fillField("Фамилия","Иванов");
        makeRequest_2.fillField("Имя","Иван");
        makeRequest_2.fillField("Отчество","Иванович");
        makeRequest_2.fillField("Дата рождения","12041990");
        makeRequest_2.fillField("Серия паспорта","0000");
        makeRequest_2.fillField("Номер паспорта","000000");
        makeRequest_2.fillField("Дата выдачи","15012015");
        makeRequest_2.fillField("Место выдачи","ппро");
        makeRequest_2.setContinueButton();
        makeRequest_2.setError();

        }}