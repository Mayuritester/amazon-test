package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    public static void openBrowser (String baseURL){
        driver = new ChromeDriver();
        driver.get(baseURL);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().window().maximize();



    }

    public void teardown (){
        driver.quit();
    }
}
