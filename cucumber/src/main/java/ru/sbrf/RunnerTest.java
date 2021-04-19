package ru.sbrf;


import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test")
public class RunnerTest {
}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/features",
//        glue = "ru.sbrf",
//        tags = "@all",
//        dryRun = false,
//        snippets = SnippetType.CAMELCASE
////        name = "^Успешное|Успешная.*"
//)
//public class RunnerTest {
//}