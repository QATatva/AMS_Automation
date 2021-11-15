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

WebUI.click(findTestObject('Consent Options/Click_Consent_Nav_menu'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Consent Options/Add Consent Option/Add button iFrame'), 20)

'Click on the New button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/New Button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

'click on the consent option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Consent option picklist arrow'))

'Select text from the Consent Option from the picklist'
String conOpt1 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 1)

System.out.println(conOpt1)

WebUI.delay(5)

String xpath1 = ('//ul[@id="ui-id-1"]//*[text()="' + conOpt1) + '"]'

TestObject Option1 = new TestObject('objectName')

WebUI.delay(2)

Option1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(Option1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

'click on the mandatory option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_mandatory option picklist arrow'))

'Select text from the mandatory Option from the picklist'
String mandopt1 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(2, 1)

System.out.println(mandopt1)

WebUI.delay(5)

String xpath2 = ('//ul[@id="ui-id-13"]//*[text()="' + mandopt1) + '"]'

TestObject Mandatory1 = new TestObject('objectName')

WebUI.delay(2)

Mandatory1.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.delay(5)

WebUI.click(Mandatory1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

'click on the required consent setting picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Required Consent Setting arrow'))

'Select text from the mandatory Option from the picklist'
String setopt1 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(3, 1)

System.out.println(setopt1)

WebUI.delay(5)

String xpath3 = ('//ul[@id="ui-id-16"]//*[text()="' + setopt1) + '"]'

TestObject Setting1 = new TestObject('objectName')

WebUI.delay(2)

Setting1.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(Setting1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

'click on the Save button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Save Button'))

WebUI.delay(5)

'Click on the Workflow Menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Workflow button'))

'Click on the Project active status button from the workflow menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/td_project active status'))

