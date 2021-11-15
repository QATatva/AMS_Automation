import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
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

WebUI.click(findTestObject('NewScript/Manage_Locations/WorkFlow_Icon'))

WebUI.click(findTestObject('NewScript/Manage_Locations/Manage_Storage_Location_Icon'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('NewScript/Manage_Locations/Add_New_Icon'))

WebUI.click(findTestObject('NewScript/Manage_Locations/Add_New_Option'))

WebUI.delay(5)

WebUI.switchToWindowIndex(3)

WebUI.delay(5)

WebUI.setText(findTestObject('NewScript/Manage_Locations/Txt_Type'), GlobalVariable.random)

WebUI.click(findTestObject('NewScript/Manage_Locations/Type_Arrow'))

'Select text from the Site picklist'
String Type = GlobalVariable.random

System.out.println(Type)

WebUI.delay(5)

String xpath1 = ('//ul[@id="ui-id-1"]//*[text()="' + Type) + '"]'

WebUI.delay(2)

TestObject SITE = new TestObject('objectName')

WebUI.delay(2)

SITE.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.delay(2)

WebUI.click(SITE, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

WebUI.delay(5)

//WebUI.click(findTestObject('NewScript/Manage_Locations/Txt_Type_Value'))
//
WebUI.delay(5)

WebUI.clearText(findTestObject('NewScript/Manage_Locations/Txt_Amount'))

WebUI.delay(5)

WebUI.setText(findTestObject('NewScript/Manage_Locations/Txt_Amount'), findTestData('Manage Storage/Adding_Location').getValue(
        2, 1))

WebUI.delay(10)

WebUI.click(findTestObject('NewScript/Manage_Locations/Txt_Amount_value'))

WebUI.setText(findTestObject('NewScript/Manage_Locations/Txt_Name'), findTestData('Manage Storage/Adding_Location').getValue(
        3, 1))

WebUI.click(findTestObject('NewScript/Manage_Locations/Btn_Create_and_Close'))

WebUI.switchToWindowIndex(2)

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Btn_Close'))

