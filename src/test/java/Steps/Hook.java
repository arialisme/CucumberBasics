package Steps;
import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    //Una variable/propiedad de la clase Hook
    private BaseUtil base;

    //Inyeccion de dependencia
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTEst() {

        System.out.println("Opening the browser : Chrome");
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver","F:\\libs\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        base.Driver = new ChromeDriver();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}
