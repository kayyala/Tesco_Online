package TescoGroceries;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class BasePage {
   public static WebDriver driver;

    @BeforeClass
    public void openBrowser() throws IOException {
        System.out.println("opening browser");
        Properties prop = new Properties();
        FileInputStream fileInputStreamfs = new FileInputStream("C:\\Users\\Sudhakar\\IdeaProjects\\Tesco_Online\\src\\main\\resources\\config.properties");
        prop.load(fileInputStreamfs);
        String url = prop.getProperty("url");
        String browser = prop.getProperty("browser");
        System.out.print("browser: " + browser);
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudhakar\\SeleniumDriver\\SeleniumDriver\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "C:\\Program Files\\SeleniumDrivers\\IEDriver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.get(url);
    }
    public String randomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        String emaill = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        emaill = temp.substring(0, temp.length() - 9) + "@gmail.com";
        return emaill;}

    public void closeBrowser()

    {
        driver.quit();
    }

}
