package TescoGroceries;

import TescoGroceries.BasePage;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Sudhakar on 22/06/2017.
 */
public class PaymentPage extends BasePage {
    public void payment() throws InterruptedException {
        System.out.println("click on confirm payment button");
        driver.findElement(By.xpath(".//*[@id='cardName-0']")).sendKeys("mr sudhakar");
        driver.findElement(By.xpath(".//*[@id='cardNumber-0']")).sendKeys("1456987362546987");
        new Select(driver.findElement(By.xpath(".//*[@id='expireMonth-0']"))).selectByVisibleText("08");
        new Select(driver.findElement(By.xpath(".//*[@id='expireYear-0']"))).selectByValue("20");
        driver.findElement(By.xpath(".//*[@id='securityCode-0']")).sendKeys("299");
//        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath(".//*[@id='fOrder']/div[1][@class='checkoutHeader']/div/input"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(element);
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");// position mouse over scrollbar
        actions.click().perform();

        String actual_account = driver.findElement(By.xpath(".//*[@id='errorWrapper']/div/div/ul/li")).getText();
        String expect_account = "Sorry, there appears to be a problem with your card number, please check the details and try again.";
        Assert.assertEquals(actual_account, expect_account);
        System.out.println("New user as been created account sucesfully---  " + expect_account);
        driver.close();
    }

}
