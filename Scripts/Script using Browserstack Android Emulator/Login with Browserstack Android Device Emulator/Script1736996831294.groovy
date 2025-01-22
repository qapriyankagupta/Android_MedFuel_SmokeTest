import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.DesiredCapabilities

// Set the DesiredCapabilities for BrowserStack
DesiredCapabilities caps = new DesiredCapabilities()
caps.setCapability('browserstack.user', 'priyankagupta_iUw5sH')  // Replace with your BrowserStack username
caps.setCapability('browserstack.key', 'ZAxusWg8EGssgRzYHBER')  // Replace with your BrowserStack access key

// Set the path to your uploaded app (App ID from BrowserStack)
caps.setCapability('app', 'bs://2d5de8eacfd8254cd2521c0cc5973bcde7975313')  // Replace with the actual App ID from BrowserStack

// Set the device and OS version for testing
caps.setCapability('device', 'Samsung Galaxy S22 Ultra')  // Example device, replace with your preferred device
caps.setCapability('os_version', '12.0')  // Example Android OS version, adjust as necessary

// Set additional info for project, build, and test name (optional)
caps.setCapability('project', 'Katalon-BrowserStack Integration')
caps.setCapability('build', '1.0')
caps.setCapability('name', 'Katalon Test on BrowserStack')

// Set WebDriver URL for BrowserStack
String browserStackURL = 'http://hub.browserstack.com/wd/hub'

// Start the application on the BrowserStack device
Mobile.startApplication(browserStackURL, caps)

// Walkthrough Screens
Mobile.swipe(0, 0, 0, 0)

// Walkthrough Screens
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

// Walkthrough Screens
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

// Walkthrough Screens
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

