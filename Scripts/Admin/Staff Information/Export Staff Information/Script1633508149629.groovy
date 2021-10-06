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

WebUI.callTestCase(findTestCase('Login/Login to AMS'), [:], FailureHandling.STOP_ON_FAILURE)

//Click on "Admin" FM Ribbon Menu Button
WebUI.click(findTestObject('Object Repository/Admin_OR/Admin Icon/a_Admin Icon'))

//Click on General Administration tab
WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/General Information icon/GeneralInfo Icon_OR'))

//Click on Staff Information tab
WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Staff Administrator Icon'))

//Click the grid export icon (floppy disc image) and select Export from the drop down list.
WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information iFrame/iFrame Staff'), 
    20)

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information iFrame/iFrame Staff'), 
    10)

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information iFrame/Export Icon'))

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information iFrame/Export Button'))
