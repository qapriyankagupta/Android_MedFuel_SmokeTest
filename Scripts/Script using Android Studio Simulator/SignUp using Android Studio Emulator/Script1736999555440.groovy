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
import javax.mail.*
import javax.mail.internet.*
import java.util.Properties as Properties

Mobile.startApplication('C:\\Users\\Priyanka\\Desktop\\Priyanka\\app-medfuel-debug.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout (1)'), 0)
Mobile.delay(5)

Mobile.swipe(50, 500, 540, 500)


Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

//Mobile.swipe(0, 0, 0, 0)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - BEGIN JOURNEY'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Dont have an Account Sign up now'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - AGREE'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - First Name'), 'Priyanka')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Last Name'), 'Testing Katalon')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Member ID'), 'STAGING')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - RxGRP'), 'Test')

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CONFIRM'), 0)

// Generate a random 8-digit number
//def randomNumber = (Math.random() * 100000000).toInteger()
// Create the dynamic email address in the format 'katalon25_<randomnumber>@birdzi.com'
//def dynamicEmail = "katalon25_" + randomNumber + "@birdzi.com"
// Use the generated dynamic email in the sendKeys method
//Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Email Address (1)'), dynamicEmail)
Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Email Address (1)'), 'katalontesting4@birdzi.com')

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText - Password (1)'), 'Shiv123!@#')

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Date of Birth'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - 8'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SIGN UP'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CREATE MY PROFILE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - -'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - DONE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - .9'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - DONE (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - - (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Active'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Womens Health'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Diabetes'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Heart Health'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Pregnancy  Maternity'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - CREATE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Due Date'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - 31'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - A1C Level'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 4'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Daily Tests (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - 0'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 5'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Skip for now (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Skip for now'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - FINISH'), 0)

Mobile.closeApplication()

