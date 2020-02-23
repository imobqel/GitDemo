import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.*;
import io.appium.java_client.ios.IOSDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class iosBase {
	public static IOSDriver<IOSElement> capabilities() throws MalformedURLException {

		IOSDriver<IOSElement> driver;

		File appDir = new File("src");
		File app = new File(appDir, "waseet-classifieds-ios-app.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("no", true);
		capabilities.setCapability("newCommandTimeout", 100000);
		capabilities.setCapability("noRest", true);

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("–session-override", true);

		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

}