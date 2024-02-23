package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FooterPage extends BasePage {
    @FindBy(css = ".socials-wrapper > div:nth-child(1)")
    WebElement facebookIcon;
    @FindBy(css = ".socials-wrapper > div:nth-child(2)")
    WebElement twitterIcon;
    @FindBy(css = ".socials-wrapper > div:nth-child(3)")
    WebElement instagramIcon;
    @FindBy(css = ".socials-wrapper > div:nth-child(4)")
    WebElement youTubeIcon;
    @FindBy(css = ".socials-wrapper > div:nth-child(5)")
    WebElement linkedInIcon;
    @FindBy(css = ".socials-wrapper > div")
    List<WebElement> socialIcons;

    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public boolean isBrandFacebookSocialLogoDisplayed() {
        return facebookIcon.isDisplayed();
    }

    public boolean isBrandTwitterSocialLogoDisplayed() {
        return twitterIcon.isDisplayed();
    }

    public boolean isBrandInstagramSocialLogoDisplayed() {
        return instagramIcon.isDisplayed();
    }

    public boolean isBrandYouTubeSocialLogoDisplayed() {
        return youTubeIcon.isDisplayed();
    }

    public boolean isBrandLinkedInSocialLogoDisplayed() {
        return linkedInIcon.isDisplayed();
    }

    public int getNumberOfDisplayedSocialIcons() {
        return socialIcons.size();
    }
}
