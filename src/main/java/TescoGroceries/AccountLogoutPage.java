package TescoGroceries;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Sudhakar on 13/06/2017.
 */
public class AccountLogoutPage extends BasePage {
    public void logout() {
         BasePage.driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/a")).click();
        BasePage.driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/div/div[2]/div[1]/ul/li[3]/a/h3/span")).click();
        System.out.println(" account chacking is logout sucesfully---");
        String actual_account = BasePage.driver.findElement(By.xpath(".//*[@id='main']/div/div[2]/div/div/div[1]/h3/div/span/span[2]")).getText();
        String expect_account = "monkey animal";
        Assert.assertEquals(actual_account, expect_account);
        System.out.println("New user as been created account sucesfully---" + expect_account);
        BasePage.driver.findElement(By.xpath(".//*[@id='main']/div/div[1]/div[1]/div/div/div/div/ul/li[4]/a/span")).click();
        BasePage.driver.findElement(By.xpath(".//*[@id='signoutDetails']/xhtml:p[3]/xhtml:input")).click();
        BasePage.driver.close();
    }

    /**
     * Created by Sudhakar on 15/06/2017.
     */
    public static class CheckoutBasketpage extends BasePage {
        public PaymentPage viewfullBasket() {
            System.out.println("ITS CHECKING POINTS   111111111111  ###############");
            driver.findElement(By.xpath(".//*[@id='basket-472662364']/div[2]/div[3]/a[2]")).click();
            driver.findElement(By.xpath(".//*[@id='home_del']/a/span/span/span[1]")).click();
            return new PaymentPage();
        }

        public void reservetime() throws InterruptedException {
            System.out.println("ITS CHECKING POINTS##  22222 #############");
            driver.findElement(By.xpath(".//*[@id='notes-3']")).clear();

            driver.findElement(By.xpath(".//*[@id='notes-3']")).sendKeys("my address only%%%%%%%%");
            driver.findElement(By.xpath(".//*[@id='groceryBags-3-2']")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//table[@id='deliveryRangeGrid']//tbody//tr[11]//td[7]//div//label//span[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath(".//*[@id='basket-472662364']/div[2]/div[3]/a[2]")).click();
            System.out.println("clicking next o payment page  £££££££££££");
            //driver.findElement(By.xpath(".//*[@id='fOrderBottom']/div/div[2]/input[2]")).click();
            driver.findElement(By.xpath(".//*[@id='fOrder']/div[1]/div/input")).click();
            System.out.println("Booked a slot going t *********");


        }
    }
}
