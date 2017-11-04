import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Sudhakar on 12/06/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/Tesco-html-report",
        "json:target/Tesco.json"}
        , tags = {"@TescoDirectonlineshopping"}
)

public class RunTest {
}
