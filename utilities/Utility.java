package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();

    }

    public void sendTextToElement(By by, String text) {
       driver.findElement(by).sendKeys(text);


        }


    public void switchToAlert() {
        driver.switchTo().alert().accept();
    }

    public void selectValueFromDropDown(By by, String value) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);

    }

    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }
    public static Actions action;

    public void mouseHoverToElement(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(getWebElement(by)).build().perform();
    }

    public void mouseHoverToElementAndClick(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(getWebElement(by)).click().build().perform();

    }

   public void tearDown (){
        driver.quit();
    }

}

