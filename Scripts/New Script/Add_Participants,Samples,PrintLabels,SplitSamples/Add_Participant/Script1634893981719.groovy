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

WebUI.switchToWindowIndex(1)

'click on Participants Icon'
WebUI.click(findTestObject('NewScript/Add_Participants/Participants_Icon'))

WebUI.switchToFrame(findTestObject('NewScript/Add_Participants/Iframe'), 10)

'Click on Add Icon'
WebUI.click(findTestObject('NewScript/Add_Participants/Add_Participants_Icon'))

'Select Add Participants from Dropdown value'
WebUI.click(findTestObject('NewScript/Add_Participants/Add_Participant(Dropdown_value)'))

WebUI.switchToWindowIndex(2)

'Slect donor to add with participants'
WebUI.click(findTestObject('NewScript/Add_Participants/Btn_Add_Selected_Donor'))

WebUI.delay(5)

'Enter Description from Dropdown'
WebUI.setText(findTestObject('NewScript/Add_Participants/Txt_Description'), findTestData('New_Script/Add_Participants').getValue(
        1, 1))

WebUI.delay(5)

'Click on dropdown Arrow'
WebUI.click(findTestObject('NewScript/Add_Participants/Description_Arrow'))
WebUI.delay(5)

'Get value from excel to match to dropdown value'
String Description = findTestData('New_Script/Add_Participants').getValue(1, 1)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + Description) + '"]'

WebUI.delay(5)


TestObject project1 = new TestObject('objectName')

project1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(project1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

'enter status from dropdown'
WebUI.setText(findTestObject('NewScript/Add_Participants/Txt_Status'), findTestData('New_Script/Add_Participants').getValue(
        2, 1))
WebUI.delay(5)

'Click on Status Arrow'
WebUI.click(findTestObject('NewScript/Add_Participants/Status_Arrow'))

WebUI.delay(5)

'Match value from excel to  dropdwon'
String status = findTestData('New_Script/Add_Participants').getValue(2, 1)

String xpath = ('//*[@id="ui-id-18"]//*[text()="' + status) + '"]'

TestObject s_status = new TestObject('objectName')

s_status.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(s_status, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath)

'Click on save and continue'
WebUI.click(findTestObject('NewScript/Add_Participants/Btn_Save_and_Continue'))

WebUI.delay(10)

