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

WebUI.switchToWindowIndex(1)

"Click on Add Icon"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Add_Icon'))

WebUI.delay(5)

WebUI.switchToWindowIndex(2)

"enter text code"
WebUI.setText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Code'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        1, 1))

"Enter Description"
WebUI.setText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Description'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        2, 1))

"Click on Button save"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Btn_save'))

"Click on Workflow icon"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/WorkFlow_Icon'))

"click on Active Consent mainatinance"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Active_Consent_Maintenance'))

"click on saveand close button "
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/btn_Save_and_Close'))

