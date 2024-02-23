package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void homePageVerificationTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickClosePopUpNotification();
        homePage.inputSearchBar();
    }
}