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

"click on search result"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Search_Result'))

WebUI.switchToWindowIndex(2)

"clear text code"
WebUI.clearText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Code'))

WebUI.delay(5)

"enter text code"
WebUI.setText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Code'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        1, 2))
WebUI.delay(5)

"clear description"
WebUI.clearText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Description'))
WebUI.delay(5)

"Eneter description"
WebUI.setText(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Txt_Description'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        2, 2))
WebUI.delay(5)

"Click on Save button"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Btn_save'))
WebUI.delay(5)

"click on save and close"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/btn_Save_and_Close'))
WebUI.delay(5)

