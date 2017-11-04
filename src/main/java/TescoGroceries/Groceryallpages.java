package TescoGroceries;

import TescoGroceries.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 17/07/2017.
 */
public class Groceryallpages extends BasePage {
    public void grocerylist() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/button")).click();
        System.out.println("after clicking cookies======");
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/h3/span")).click();
    }

    public void grocerieslistprint() {


        List<WebElement> Grocerylist = driver.findElements(By.xpath(".//*[@class='navigation clearfix Groceries']"));

        int total_list = Grocerylist.size();
        System.out.println("total number***"+Grocerylist.size());

        System.out.println("Total list of grocery  item===+++ " + total_list);
        for (WebElement GL : Grocerylist)

        {
            String fullGROCCERYlist = GL.getText();
            System.out.println("Total list of**** " + fullGROCCERYlist);
        }
    }
}