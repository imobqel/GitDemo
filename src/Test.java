import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Test extends iosBase {

	public static void main(String[] args) throws MalformedURLException {

		IOSDriver<IOSElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElementByAccessibilityId("Allow").click();

		System.out.print("A new change");

	}

}
