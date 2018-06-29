import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"fw/mobile/hooks", "fw/mobile/steps"},
        tags = "@InstalAndSettingsApp, @login",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTest {
}
