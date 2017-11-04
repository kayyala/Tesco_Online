package TescoGroceries;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class HomePage extends BasePage {
    public boolean isUserOnTheHomePage() {
        return driver.findElement(By.id("")).isDisplayed();
    }


    public RegisterPage MyAccount() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println("its cliking register page*****");
        driver.findElement(By.xpath(".//*[@id='register-cta']/span")).click();
//        driver.findElement(By.xpath(".//*[@id='sign-in-tab']/ul/li[1]/a")).click();
//        driver.findElement(By.xpath(".//*[@id='register-cta']/span")).click();
        return new RegisterPage();
    }

    public void Login() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        System.out.println("its cliking login*****55555555");
        driver.findElement(By.xpath(".//*[@id='app']/div[1]/div[1]/div/div/div[2]/div")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("monkeyanimal@gmail.com");
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Monkey123/");
        driver.findElement(By.cssSelector(".ui-component__button")).click();


    }

    public AccountLogoutPage.CheckoutBasketpage groceriesshopping() {

        System.out.println("selecting grocery======");
//        driver.manage().window().maximize();

        driver.findElement(By.xpath("html/body/div[1]/div/div[2]/button")).click();
        System.out.println("after clicking cookies======");
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='navigation']/div[1]/ul/li[1]/div/div[1]/div/div[2]/div[1]/ul/li[2]/a/h3/span")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[6]/a")).click();
        System.out.println("Selecting two bolttls of aptamils");
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[6]/div/ul/li[6]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[6]/div/ul/li[6]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/div[3]/div[1]/div[2]/div[2]/div/ul/li[1]/div[1]/h2/a/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/fieldset/input[2]")).click();
        System.out.println("Selecting two toilet tissue111111111111");
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[9]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[9]/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[2]/div/div/ul/li[9]/div/ul/li[4]/div/ul/li[3]/a")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/div[3]/div[1]/div[2]/div[2]/div/ul/li[5]/div[1]/h2/a/span[2]")).click();
        driver.findElement(By.xpath("html/body/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/form/fieldset/input[2]")).click();

        return new AccountLogoutPage.CheckoutBasketpage();

    }
}




