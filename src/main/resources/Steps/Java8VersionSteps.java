package Steps;

import io.cucumber.java;
import io.cucumber.java8.PendingException;

public class Java8VersionSteps implements En {
    public Java8VersionSteps() {

        And("^I enter java (\\d+)$", (Integer arg0) -> {
            throw new PendingException();
        });

        Given("^Start Java (\\d+) (\\d+)$", (Integer arg0, Integer arg1) -> {
        });
    }
}
