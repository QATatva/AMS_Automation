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

WebUI.switchToFrame(findTestObject('Manage Donors/iFrame Manage Donors'), 20)

WebUI.click(findTestObject('Manage Donors/Add new donor/Add button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

'Enter text on the First Name in the search field'
WebUI.sendKeys(findTestObject('Manage Donors/Add new donor/input_First name'), findTestData('Manage Donor/Add Donor').getValue(
        1, 1))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Manage Donors/Add new donor/input_surname'), findTestData('Manage Donor/Add Donor').getValue(
        2, 1))

WebUI.click(findTestObject('Manage Donors/Add new donor/insert search button'))

WebUI.switchToFrame(findTestObject('Manage Donors/Add new donor/iframe Insert Donor'), 10)

WebUI.click(findTestObject('Manage Donors/Add new donor/Insert button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Manage Donors/Add new donor/SaveContinue button'))

