package Steps;

import Base.BaseUtil;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class LoginStep extends BaseUtil {
    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate Login Page ");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        base.Driver.findElement(By.name("Login")).submit();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {

      Assert.assertEquals("Its not displayed", base.Driver.findElement(By.id("Initial")).isDisplayed(), true);
    }

    @DataTableType
    public User authorEntry(Map<String, String> entry) {
        return new User(
                entry.get("username"),
                entry.get("password")
        );
    }

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(List<User> users) {

        for (User user : users
        ) {
            base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
            base.Driver.findElement(By.name("Password")).sendKeys(user.password);
        }

    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        System.out.println("UserName is " + username + " and password is " + password);
    }


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password) {
        System.out.println("UserName is :  " + username);
        System.out.println("Password is :  " + password);
    }

    @ParameterType("[^\"]*")
    public String getEmail(String username) {
        return username.concat("@ea.com");
    }

    @And("I enter the users email address as Email: {getEmail}")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(String email) {
        System.out.println("The Email Addres is " + email);
    }

    @ParameterType("\\d+")
    public int salaryTransform(String salary) {
        return salary.length();
    }

    @And("I verify the count of my salary digits for Rs {salaryTransform}")
    public void iVerifyTheCountOfMySalaryDigitsForRs(int salary) {
        System.out.println("My Salary digits count is : " + salary);
    }
}


