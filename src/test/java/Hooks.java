import TescoGroceries.BasePage;
import org.junit.After;
import cucumber.api.java.Before;

import java.io.IOException;

/**
 * Created by Sudhakar on 12/06/2017.
 */
public class Hooks extends BasePage {
    BasePage base= new BasePage();
    @Before
    public  void setUp() throws IOException {
        base.openBrowser();
    }
    @After
    public  void tearDown()

    {
        base.closeBrowser();
        driver.close();
    }
}
