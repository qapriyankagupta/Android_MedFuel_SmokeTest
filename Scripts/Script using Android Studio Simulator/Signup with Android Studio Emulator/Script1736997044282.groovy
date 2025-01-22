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

'Launch App\r\n'
Mobile.startApplication('C:\\Users\\Priyanka\\Desktop\\Priyanka\\app-medfuel-debug.apk', true)

'Walkthrough Screens'
Mobile.swipe(0, 0, 0, 0)

'Walkthrough Screens'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

'Walkthrough Screens'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

'Walkthrough Screens'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - BEGIN JOURNEY'), 0)

'Login Screen: Enter Email\r\n'
Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Email Address'), 'pgupta@birdzi.com')
Mobile.delay(2)

'Login Screen: Enter Password'
Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password'), 'Shiv123!@#')
Mobile.delay(2)

'Tap SignIn button to Login'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN IN'), 0)

'Tap SignIn button to Login'
Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN IN'), 0)
Mobile.delay(10)

Mobile.closeApplication()

