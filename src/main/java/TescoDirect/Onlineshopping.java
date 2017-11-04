package TescoDirect;

import TescoGroceries.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 18/07/2017.
 */
public class Onlineshopping extends BasePage {
    public void TescoDirects() {
        System.out.println("IT clicking into  ");
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[2]/div/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[2]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/h3/span")).click();
    }

    public void addingtobasket() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='catalogue-nav']/ul/li[4]/a")).click();
        System.out.println("THIS IS CHECK POINT...1''");

        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");// position mouse over scrollbar

         driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[14]/a/span")).click();
        System.out.println("THIS IS CHECK POINT...2''");
//        WebElement element = driver.findElement(By.xpath(".//*[@id='fOrder']/div[1][@class='checkoutHeader']/div/input"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();


//        driver.findElement(By.xpath(".//*[@id='main-menu']/div/ul/li[1]/a")).click();


        driver.findElement(By.xpath(".//*[@id='ssb_block_104']/div/div/div/div[2]/ul/li[1]/div/a")).click();
        System.out.println("THIS IS CHECK POINT...3''");

        driver.findElement(By.xpath(".//*[@id='pt-233-1172_233-1172']/div/div[2]/div[1]/div[1]/h3/div/a")).click();
        driver.findElement(By.xpath(".//*[@id='addToBasket-T00024abc5']")).click();
        driver.findElement(By.xpath(".//*[@id='continueCheckout']")).click();
        driver.findElement(By.xpath(".//*[@id='addToBasket-O0002494eb']")).click();
    }
//    public void peymentpage(){
//        driver.findElement(By.xpath(".//*[@id='nameoncard']")).sendKeys("mr monkey");
//        driver.findElement(By.xpath(".//*[@id='numberoncard']")).sendKeys("1456987654321456");
//
//        new Select(driver.findElement(By.xpath(".//*[@id='expireMonth-0']"))).selectByVisibleText("08");
//        new Select(driver.findElement(By.xpath(".//*[@id='expireYear-0']"))).selectByValue("20");
//        driver.findElement(By.xpath(".//*[@id='securityCode-0']")).sendKeys("299");
//        driver.findElement(By.xpath(".//*[@class='place-order']")).click();
//
//        String actual_account = driver.findElement(By.xpath(".//*[@id='errorWrapper']/div/div/ul/li")).getText();
//        String expect_account = "Sorry, the card details you have entered are incorrect. Please try again or use another card (0313). Please note, Tesco Direct does not accept VISA electron cards. Please use a different card.";
//        Assert.assertEquals(actual_account, expect_account);
//        System.out.println("New user as been created account sucesfully---  " + expect_account);
//        driver.close();
//    }

}
