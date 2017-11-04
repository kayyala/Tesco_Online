package TescoGroceries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class RegisterPage extends BasePage {


    public void Enterfields() {
        new Select(driver.findElement(By.xpath(".//*[@id='title']"))).selectByIndex(3);
        driver.findElement(By.xpath(".//*[@id='first-name']")).sendKeys("apple");

        driver.findElement(By.xpath(".//*[@id='last-name']")).sendKeys("fruits");
        driver.findElement(By.xpath(".//*[@id='phone-number']")).sendKeys("07581143055");
        driver.findElement(By.xpath(".//*[@id='postcode']")).sendKeys("Tw3 2pf");
        driver.findElement(By.xpath(".//*[@id='address-field-set']/div/button")).click();
        new Select(driver.findElement(By.xpath(".//*[@id='address-dropdown']"))).selectByIndex(15);
        driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(randomEmail(15));
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Apple123/");
    }
     public AccountVFPage Creat(){
         driver.findElement(By.xpath(".//*[@id='register-form']/button")).click();
        return new AccountVFPage();
    }
}
