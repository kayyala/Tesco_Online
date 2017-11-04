import TescoDirect.HomeclearncePage;
import TescoDirect.Onlineshopping;
import TescoGroceries.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class MyStepdefs {
    HomePage home = new HomePage();
    RegisterPage register = new RegisterPage();
    AccountVFPage ACVF = new AccountVFPage();
    AccountLogoutPage aclogout = new AccountLogoutPage();
    AccountLogoutPage.CheckoutBasketpage checkoutpage = new AccountLogoutPage.CheckoutBasketpage();
    PaymentPage pay = new PaymentPage();
    Fullbasketpage basket = new Fullbasketpage();
    Groceryallpages GList = new Groceryallpages();
    HomeclearncePage homeclearnce = new HomeclearncePage();
    Onlineshopping onlineshopping = new Onlineshopping();

    @Given("^I am navigating to Tesco website$")
    public void IamnavigatingtoTescoebsite() throws Throwable {
        Assert.assertTrue(home.isUserOnTheHomePage());
    }

    @And("^I am going to Registration page$")
    public void iAmGoingToRegistrationPage() throws Throwable {
        home.MyAccount();
    }

    @When("^i enter new user details and findout address$")
    public void iEnterNewUserDetailsAndFindoutAddress() throws Throwable {
        register.Enterfields();
    }

    @And("^I create new user$")
    public void iCreateNewUser() throws Throwable {
        register.Creat();
    }

    @Then("^I verify account and signout successfully$")
    public void iVerifyAccountAndSignoutSuccessfully() throws Throwable {
        ACVF.CheckingAC();
        ACVF.Logout();
    }

    @And("^I enter Username and password$")
    public void iEnterUsernameAndPassword() throws Throwable {
        home.Login();
    }

    @Then("^I verify account and logoutnout successfully$")
    public void iVerifyAccountAndLogoutnoutSuccessfully() throws Throwable {
        aclogout.logout();
    }

    @Given("^I am going to groceries and baby milk$")
    public void iAmGoingToGroceriesAndBabyMilk() throws Throwable {
        home.Login();
        home.groceriesshopping();
    }

    @When("^I check my full basket and Book delivery slot$")
    public void iCheckMyFullBasketAndBookDeliverySlot() throws Throwable {
        checkoutpage.viewfullBasket();
    }

    @Then("^I reserved time and continue to ordersummry$")
    public void iReservedTimeAndContinueToOrdersummry() throws Throwable {
        checkoutpage.reservetime();
    }


    @And("^I enter my full card details and confirm payment$")
    public void iEnterMyFullCardDetailsAndConfirmPayment() throws Throwable {
        pay.payment();
    }

    @Given("^I am going view fullbasket$")
    public void iAmGoingViewFullbasket() throws Throwable {
        basket.Busketview();
    }

    @When("^I am checking howmany items in my baskets$")
    public void iAmCheckingHowmanyItemsInMyBaskets() throws Throwable {
        basket.checkingbasket();
    }

    @Then("^I am delete some items and update in my beskets$")
    public void iAmDeleteSomeItemsAndUpdateInMyBeskets() throws Throwable {
        basket.deleteing();
    }

    @When("^I click on grocerylist$")
    public void iClickOnGrocerylist() throws Throwable {
        GList.grocerylist();
    }

    @Then("^It will print all grocery list$")
    public void itWillPrintAllGroceryList() throws Throwable {
        GList.grocerieslistprint();
    }

    @When("^I am goto Tesco Direct page$")
    public void iAmGotoTescoDirectPage() throws Throwable {
        homeclearnce.TescoDirect();
    }

    @And("^I click on homeclearance$")
    public void iClickOnHomeclearance() throws Throwable {
        homeclearnce.Clearence();
    }

    @Then("^I print on all homeclearance page$")
    public void iPrintOnAllHomeclearancePage() throws Throwable {
        homeclearnce.listofhomeclearance();
    }

    @And("^I am one item adding to the basket$")
    public void iAmOneItemAddingToTheBasket() throws Throwable {
        onlineshopping.TescoDirects();
    }

    @Then("^I enter the card details$")
    public void iEnterTheCardDetails() throws Throwable {
        onlineshopping.addingtobasket();
    }

    @And("^I should see please use different card$")
    public void iShouldSeePleaseUseDifferentCard() throws Throwable {
        //onlineshopping.peymentpage();
    }
}
