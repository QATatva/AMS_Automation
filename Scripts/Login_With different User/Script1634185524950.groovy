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

WebUI.openBrowser('')

WebUI.maximizeWindow()

'AMS Url'
WebUI.navigateToUrl('https://tst-ams-01.interactivesoftware.co.uk/')

'Log On Text Field'
WebUI.setText(findTestObject('Login Page/Txt Log On'), Username)

'Passowrd Text field'
WebUI.setText(findTestObject('Login Page/Txt_Password'), Password)

'Sign In Button'
WebUI.click(findTestObject('Login Page/Btn_Sign In'))

//WebUI.callTestCase(findTestCase('User_Mdule/Project/Select_Manage_Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

"Click on Project management Icon"
WebUI.click(findTestObject('User Module/Select_Project/Project_Management_Icon'))

WebUI.delay(5)

"Click on Manage Project Icon"
WebUI.click(findTestObject('User Module/Select_Project/Manage_Projects_Icon'))

WebUI.delay(10)


'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)



