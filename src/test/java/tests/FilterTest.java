package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.ResultsPage;
import utils.Constants;
import utils.Errors;

public class FilterTest extends BaseTest {

    @Test
    public void resultsPageVerificationTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickClosePopUpNotification();
        homePage.inputSearchBar();
        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.clickNoOperatingSystemOption();
        Assertions.assertTrue(resultsPage.isDeleteFiltersButtonDisplayed(), Errors.DELETE_FILTERS_BUTTON_NOT_DISPLAYED);
        resultsPage.printDeleteFiltersButtonColor();
        Assertions.assertEquals(resultsPage.getDeleteFiltersButtonColor(), Constants.GREY_COLOR, Errors.DELETE_FILTERS_BUTTON_COLOR_NOT_DISPLAYED);
        resultsPage.clickPriceRangeOptionBox();
        resultsPage.clickLaptopBrandOptionBox();
        resultsPage.clickLaptopUsageOptionBox();
        Assertions.assertEquals(resultsPage.getNumberOfDisplayedProducts(), 5, Errors.CORRECT_NUMBER_OF_RESULTS_IS_NOT_DISPLAYED);
    }
}
