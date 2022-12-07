import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(glue = {"autotest"}, features = "src/test/resources/features/МВидеоТест.feature", tags = "@test_cucumber")

public  class RunCucumberTest {
}