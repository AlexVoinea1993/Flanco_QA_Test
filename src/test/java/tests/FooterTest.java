package tests;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.FooterPage;
import pages.HomePage;
import utils.Errors;

public class FooterTest extends BaseTest {

    @Test
    public void FooterPageTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickClosePopUpNotification();
        FooterPage footerPage = new FooterPage(driver);
        footerPage.scrollDownPage();
        Assertions.assertTrue(footerPage.isBrandFacebookSocialLogoDisplayed(),
                Errors.BRAND_SOCIAL_FACEBOOK_ACCOUNT_ICON_NOT_DISPLAYED);
        Assertions.assertTrue(footerPage.isBrandTwitterSocialLogoDisplayed(),
                Errors.BRAND_SOCIAL_TWITTER_ACCOUNT_ICON_NOT_DISPLAYED);
        Assertions.assertTrue(footerPage.isBrandInstagramSocialLogoDisplayed(),
                Errors.BRAND_SOCIAL_INSTAGRAM_ACCOUNT_ICON_NOT_DISPLAYED);
        Assertions.assertTrue(footerPage.isBrandYouTubeSocialLogoDisplayed(),
                Errors.BRAND_SOCIAL_YOUTUBE_ACCOUNT_ICON_NOT_DISPLAYED);
        Assertions.assertTrue(footerPage.isBrandLinkedInSocialLogoDisplayed(),
                Errors.BRAND_SOCIAL_LINKEDIN_ACCOUNT_ICON_NOT_DISPLAYED);
        Assertions.assertEquals(footerPage.getNumberOfDisplayedSocialIcons(), 5);
    }
}
