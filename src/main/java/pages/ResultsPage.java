package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultsPage extends BasePage {
    @FindBy(xpath = "//a[contains(text(),' Fara Sistem de Operare')]")
    WebElement noOperatingSystem;
    @FindBy(css = ".action.clear.filter-clear")
    WebElement deleteFilters;
    @FindBy(xpath = "(//li[@class='item'])[4]")
    WebElement priceRange;
    @FindBy(xpath = "(//span[@class='count'])[1]")
    WebElement laptopBrand;
    @FindBy(xpath = "(//span[@class='count'])[4]")
    WebElement usage;
    @FindBy(css = ".item > .product-item-info")
    List<WebElement> productsList;

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickNoOperatingSystemOption() {
        noOperatingSystem.click();
    }

    public boolean isDeleteFiltersButtonDisplayed() {
        return deleteFilters.isDisplayed();
    }

    public void printDeleteFiltersButtonColor() {
        System.out.println(deleteFilters.getCssValue("background"));
    }

    public String getDeleteFiltersButtonColor() {
        return deleteFilters.getCssValue("background");
    }

    public void clickPriceRangeOptionBox() {
        priceRange.click();
    }

    public void clickLaptopBrandOptionBox() {
        laptopBrand.click();
    }

    public void clickLaptopUsageOptionBox() {
        usage.click();
    }

    public int getNumberOfDisplayedProducts() {
        return productsList.size();
    }
}
