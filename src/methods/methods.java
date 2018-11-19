package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

    WebDriver driver;
    public void open(String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\szsa\\Desktop\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public void click(By id) {
        driver.findElement(id).click();
    }

    public void type(By id, String text) {
        driver.findElement(id).sendKeys(text);
    }
}
