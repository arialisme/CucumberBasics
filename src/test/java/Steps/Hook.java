package Steps;

import Base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseUtil {
    //Una variable/propiedad de la clase Hook
    private BaseUtil base;

    //Inyeccion de dependencia
    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTEst() {

        System.out.println("Opening the browser : MOCK");
        //Passing a dummy WebDriver instance
        base.StepInfo = "FireforDriver";
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
