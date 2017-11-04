package TescoGroceries;

import TescoGroceries.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Sudhakar on 27/06/2017.
 */
public class Fullbasketpage extends BasePage {
    public void Busketview() {
        System.out.println("THIS IS ETER BUSKET 111111111-------");
        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/button")).click();

        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/h3/span")).click();
        driver.findElement(By.xpath(".//*[@id='basket-472662364']/div[2]/div[3]/a[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='home_del']/a/span/span/span[1]")).click();
//        driver.findElement(By.xpath(".//*[@id='basket-472662364']/div[2]/div[3]/a[1]")).click();
        System.out.println("THIS IS AFTER -------");


    }

    public void checkingbasket() {
        System.out.println("THIS IS ETER BUSKET 22222222222-------");
        List<WebElement> basket = driver.findElements(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/form/div[2]"));
//     It's print a list of web element
        int total_list = basket.size();
        System.out.println("Total list of Besket item=== " + total_list);
        for (WebElement ele : basket) {
            String fullbasketlist = ele.getText();
            System.out.println("Total list of " + fullbasketlist);
        }
    }

    public void deleteing() {
        System.out.println("THIS IS ETER BUSKET 3333333-------");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 800)"); // if the element is on bottom.
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/form/div[2]/div[3]/div[2]/table/tbody[2]/tr[2]/td[5]/p/a/img")).click();
//        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/form/div[2]/div[3]/div[2]/table/tbody[1]/tr[3]/td[5]/p/a/img")).click();
//        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/form/div[2]/div[3]/div[2]/table/tbody[2]/tr[2]/td[5]/p/a/img")).click();
System.out.println("it's been delete second items from fullbaskets---");
    }
}
