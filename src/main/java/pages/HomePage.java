package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Sunt de acord')]")
    WebElement closePopUp;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickClosePopUpNotification() {
        closePopUp.click();
    }

    public void inputSearchBar() {
        driver.findElement(By.cssSelector("#searchingfield")).sendKeys("laptop", Keys.ENTER);
    }
}
