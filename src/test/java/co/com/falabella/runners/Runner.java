package co.com.falabella.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "co.com.falabella.stepDefinitions",
        tags = "@busquedaExitosa",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class Runner {

}
