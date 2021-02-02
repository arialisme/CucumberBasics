package pages;

import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.support.How.NAME;

public class Login {

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;
    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void Login(String userNAme, String passWord)
    {
        txtUserName.sendKeys(userNAme);
        txtPassword.sendKeys(passWord);
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }
}
