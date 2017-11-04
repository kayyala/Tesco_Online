package TescoGroceries;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class AccountVFPage extends BasePage {
    public void CheckingAC() {
        String actual_account = BasePage.driver.findElement(By.xpath(".//*[@id='app']/div[2]/div/div/div/div/div[1]/span[2]/h1")).getText();
        String expect_account = "Welcome to Tesco";
        Assert.assertEquals(actual_account, expect_account);
        System.out.println("New user as been created account sucesfully---" + expect_account);
    }
    public void Logout(){
        BasePage.driver.findElement(By.xpath(".//*[@id='app']/div[1]/div[1]/div/div/ul/li[4]/a/span")).click();
        BasePage.driver.findElement(By.xpath(".//*[@id='remember2']")).click();
        BasePage.driver.findElement(By.xpath(".//*[@id='signoutDetails']/xhtml:p[3]/xhtml:input")).click();
        BasePage.driver.close();
        System.out.println(" this account is logout++++++ ");

    }
}
