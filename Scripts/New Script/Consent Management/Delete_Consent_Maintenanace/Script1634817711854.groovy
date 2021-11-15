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

//WebUI.callTestCase(findTestCase('Login Page/Admin_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('New Script/Consent Management/Select_Consent_Maintenance'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.callTestCase(findTestCase('New Script/Consent Management/Search_Verify_Added_Consent'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.switchToWindowIndex(1)

WebUI.clearText(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Txt_EqualTo'))

"Search edited Consent maintenance"
WebUI.setText(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Txt_EqualTo'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        1, 2))

"click on search icon"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Search_Icon'))

WebUI.delay(5)

"Click on search result "
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Search_Result'))

WebUI.switchToWindowIndex(2)

WebUI.delay(5)

"click on Delete icon"
WebUI.click(findTestObject('Consent Maintenance/Add_Consent_Maintenance/Btn_Delete'))

WebUI.acceptAlert()

