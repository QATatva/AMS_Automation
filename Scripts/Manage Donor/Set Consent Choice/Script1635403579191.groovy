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

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Manage Donors/Consent Form/Update choice 1 picklist arrow'))

String choice1 = findTestData('Data Files/Manage Donor/Add Consent Choice').getValue(1, 1)

String xpath1 = ('//ul[@id="ui-id-1"]//*[text()="' + choice1) + '"]'

TestObject CHOICE1 = new TestObject('objectName')

CHOICE1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(CHOICE1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

WebUI.click(findTestObject('Manage Donors/Consent Form/Update choice 2 picklist arrow'))

String choice2 = findTestData('Data Files/Manage Donor/Add Consent Choice').getValue(1, 2)

String xpath2 = ('//ul[@id="ui-id-5"]//*[text()="' + choice2) + '"]'

TestObject CHOICE2 = new TestObject('objectName')

CHOICE2.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(CHOICE2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.click(findTestObject('Manage Donors/Consent Form/Update choice 3 picklist arrow'))

String choice3 = findTestData('Data Files/Manage Donor/Add Consent Choice').getValue(1, 3)

String xpath3 = ('//ul[@id="ui-id-9"]//*[text()="' + choice3) + '"]'

TestObject CHOICE3 = new TestObject('objectName')

CHOICE3.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(CHOICE3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

WebUI.click(findTestObject('Manage Donors/Consent Form/Continue button'))


