package amazontest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class AmazonTest extends Utility {
    String baseUrl = "https://www.amazon.co.uk/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test

    public void DellLaptop() {
        clickOnElement(By.id("sp-cc-accept"));
        //    2. Type "Dell Laptop" in the search box and press enter or click on search Button .
        sendTextToElement(By.id("twotabsearchtextbox"), "Dell Laptop");
        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
//3. Click on the checkbox brand Dell on the left side.
        clickOnElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/span[1]/div[1]/div[1]/div[3]/ul[1]/span[1]/span[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]"));

//            4. Verify that the  30(May be different) products are displayed on the page.
        Assert.assertEquals("No Product displayed", "1-24 of over 6,000 results for",
                getTextFromElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/span[1]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[1]")));

//            5. Print all product names in the console.
        List<WebElement> items = driver.findElements(By.xpath(("//a[@class ='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")));
        System.out.println("Items" + items.size());

        for (WebElement link : items) {
            System.out.println(link.getText());

        }

//6. Click on the product name 'Newest Inspiron 15 3000 Business Laptop, 15.6" FHD Display, 12th Gen Intel Core i7-1255U, Windows 11 Pro, 32GB DDR4 RAM, 1TB PCIe SSD, WiFi 6, SD Card Reader, Long Battery Life
        clickOnElement(By.xpath("//span[contains(text(),'Newest Inspiron 15 3000 Business Laptop, 15.6\" FHD')]"));
//7. Verify the Product name 'Newest Inspiron 15 3000 Business Laptop, 15.6" FHD Display, 12th Gen Intel Core i7-1255U, Windows 11 Pro, 32GB DDR4 RAM, 1TB
        Assert.assertEquals("Incorrect item ", "Dell Newest Inspiron 15 3000 Business Laptop, 15.6\" FHD Display, 12th Gen Intel Core i7-1255U, Windows 11 Pro, 32GB DDR4 RAM, 1TB PCIe SSD, WiFi 6, SD Card Reader, Long Battery Life", getTextFromElement(By.xpath("//span[@id='productTitle']")));


        tearDown();
//
    }
}



