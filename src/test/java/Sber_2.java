public class Sber_2 extends BaseClass{

    MainPage mainPage;
    SelectPolicy issueApplication;
    MakeRequest makeRequest;

    @org.junit.Test
    public void Test() {

        mainPage= new MainPage(driver);
        mainPage.mainPageConstructor();

        issueApplication = new SelectPolicy(driver);
        issueApplication.issueApplicationConstructor();

        makeRequest=new MakeRequest(driver);
        makeRequest.makeRequestConstructor("Ivanov", "Ivan","12031990","Сидоров",
                "Иван", "Иванович", "10041990","2365","987654","12102016","орп");

    }
}