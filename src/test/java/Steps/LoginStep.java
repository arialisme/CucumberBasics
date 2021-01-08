package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class  LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate Login Page ");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        System.out.println("Click login button");
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see userform page");
    }


    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
        List<List<String>> data = table.cells();

        System.out.println("This Value is: " + data.get(0).get(0));
        System.out.println("This Value is: " + data.get(0).get(1));
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("UserName is " + username + " and password is " + password);
    }

}
