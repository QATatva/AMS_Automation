import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.switchToWindowIndex(1)

"Click on Show Filter Icon"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/ShowFilter_Icon'))

WebUI.delay(5)

"Click on Add Condition"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Add_Condition_Icon'))

WebUI.delay(5)

"Add Txt Coumn"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Txt_Coumn'))


WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Column_value'))

WebUI.delay(5)

"Click on Add Button"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Btn_Add'))

"Click on save and close"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Btn_Close'))

WebUI.delay(5)

"enter text to search"
WebUI.setText(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Txt_EqualTo'), findTestData('Consent_Maintenance/Add_Consent_Maintainance').getValue(
        1, 1))

String A_Result=WebUI.getAttribute(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Txt_EqualTo'), 'value')

println(A_Result)

"click on search icon"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Search_Icon'))

WebUI.delay(5)
"Click on count icon"
WebUI.click(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Count_Icon'))

String S_Result = WebUI.getText(findTestObject('Consent Maintenance/Search_Verify_Added_Consent/Search_Result'))

println(S_Result)

WebUI.delay(5)

"Verify search result with Actual Result"
WebUI.verifyMatch(S_Result, A_Result, false)

