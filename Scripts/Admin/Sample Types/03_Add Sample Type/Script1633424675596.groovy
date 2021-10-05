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

//Log On to AMS with Admin role
WebUI.callTestCase(findTestCase('Login/Login to AMS'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(10)

//Click on "Admin" FM Ribbon Menu Button

WebUI.click(findTestObject('Admin_OR/Admin Icon/a_Admin Icon'))

//Click on Sample Types Card button

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Information icon/SampleInfo Icon_OR'))

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/SampleType Icon_OR/Sample Icon'))

//Click on the Insert New (Blank Doc) Icon

WebUI.switchToFrame(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/SampleType iFrame/iFrame Sampletype'), 0)

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/SampleType_Add_Button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/SampleType_inputText'), findTestData('Data Files/Sample Type').getValue(
        1, 1))

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/Input_SaveBtn'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/input_MoreBtn'))

WebUI.setText(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/SampleType_inputText'), findTestData('Data Files/Sample Type').getValue(
	1, 1))

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/SampleType_toggle'))

WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/Input_SaveBtn'))


//Click on Audit Navigation menu
WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/menu_AuditNav'))

WebUI.delay(20)


WebUI.click(findTestObject('Admin_OR/Sample Information_OR/Sample Type_OR/Sample Type Add/input_btnSaveClose'))




