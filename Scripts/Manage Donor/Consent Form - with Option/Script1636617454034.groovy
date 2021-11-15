import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Manage Donors/Consent Form/Consent_Form_Icon'))

WebUI.switchToFrame(findTestObject('Manage Donors/Consent Form/Iframe_Add_Consent'), 10)

WebUI.click(findTestObject('Manage Donors/Consent Form/New_Informed_Consent'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('Manage Donors/Consent Form/Description picklist arrow'))

WebUI.delay(5)

String description = findTestData('Data Files/Manage Donor/Add Consent Form').getValue(1, 1)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + description) + '"]'

TestObject DESCRIPTION = new TestObject('objectName')

DESCRIPTION.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(DESCRIPTION, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

WebUI.click(findTestObject('Manage Donors/Consent Form/Status picklist arrow'))

WebUI.delay(5)

String status = findTestData('Data Files/Manage Donor/Add Consent Form').getValue(2, 1)

String xpath2 = ('//*[@id="ui-id-10"]//*[text()="' + status) + '"]'

TestObject STATUS = new TestObject('objectName')

STATUS.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(STATUS, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.click(findTestObject('Manage Donors/Consent Form/Save and close'))

