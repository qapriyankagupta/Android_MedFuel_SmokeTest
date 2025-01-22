import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import java.net.URL
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

// Set BrowserStack credentials and capabilities
String username = 'priyankagupta_iUw5sH'  // Replace with your BrowserStack username
String accessKey = 'ZAxusWg8EGssgRzYHBER'  // Replace with your BrowserStack access key
String appUrl = 'bs://2d5de8eacfd8254cd2521c0cc5973bcde7975313'  // Replace with your App ID from BrowserStack

// Desired capabilities for BrowserStack Android device
DesiredCapabilities caps = new DesiredCapabilities()
caps.setCapability('browserstack.user', username)
caps.setCapability('browserstack.key', accessKey)
caps.setCapability('app', appUrl)  // App URL from BrowserStack

// Specify the device you want to test on
caps.setCapability('device', 'Samsung Galaxy S22 Ultra')  // Example device
caps.setCapability('os_version', '12.0')  // Example Android OS version

// Additional capabilities (optional)
caps.setCapability('project', 'Katalon-BrowserStack Integration')
caps.setCapability('build', '1.0')
caps.setCapability('name', 'Katalon Test on BrowserStack')

// Set BrowserStack WebDriver URL
URL browserStackURL = new URL("https://hub-cloud.browserstack.com/wd/hub")

// Initialize RemoteWebDriver with BrowserStack URL and desired capabilities
RemoteWebDriver driver = new RemoteWebDriver(browserStackURL, caps)

// Now, you can use the driver to interact with the mobile app
Mobile.startApplication(driver)  // Start the app using RemoteWebDriver

// Example steps in the app (update with correct test steps)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - BEGIN JOURNEY'), 0)

// Login Screen: Enter Email
Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Email Address'), 'pgupta@birdzi.com')
Mobile.delay(2)

// Login Screen: Enter Password
Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password'), 'Shiv123!@#')
Mobile.delay(2)

// Tap SignIn button to Login
Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN IN'))
Mobile.delay(2)

// After the test, make sure to close the app and clean up
Mobile.closeApplication()
driver.quit()  // Close the Remote WebDriver session
