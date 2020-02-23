import java.net.MalformedURLException;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.steps.Steps;

public class concatenate extends Steps {

	iosBase object = new iosBase();

	@Given("Open the app")
	public void openApp() throws MalformedURLException {

		iosBase.capabilities().launchApp();

	}

}
