package TescoDirect;

import TescoGroceries.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Sudhakar on 18/07/2017.
 */
public class HomeclearncePage extends BasePage  {

    public void TescoDirect (){
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[2]/div/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[2]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/h3/span")).click();

    }
public void Clearence() {
    driver.findElement(By.xpath(".//*[@id='ssb-header-links']/li[2]")).click();
    driver.findElement(By.xpath(".//*[@id='ssb_block_11']/div/div[1]/div[4]/a/div[2]")).click();
}
    public void listofhomeclearance(){

    List<WebElement> Homeclearances = driver.findElements(By.xpath(".//*[@id='listing']/div[2]/ul[2]"));
    int total_list = Homeclearances.size();
    System.out.println("total number***"+total_list);
    System.out.println("Total list of Homeclearnces  item===+++ " + total_list);
    for (WebElement GL : Homeclearances)
    {
        String Fullhomeclearence = GL.getText();
        System.out.println("Total list of &&&&-- " + Fullhomeclearence);
    }
}
}
