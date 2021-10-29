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

WebUI.switchToWindowIndex(2)

'Switch to iframe'
WebUI.switchToFrame(findTestObject('NewScript/Add_Participants/Iframe'), 10)

WebUI.delay(5)

'slect sample to spli'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Select_Sample'))

WebUI.delay(5)

'Click on option menu'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Add_Sample_Arrow'))

'Click on  Print Labels'
WebUI.click(findTestObject('NewScript/Split Samples/Spli_Samples_Icon(Dropdown)'))

WebUI.delay(10)

WebUI.switchToDefaultContent()

'Switch to window  to split samples'
WebUI.switchToWindowIndex(3)

WebUI.waitForPageLoad(20)

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('NewScript/Split Samples/Iframe'), 0)

'Sample Type'
WebUI.setText(findTestObject('NewScript/Add_Sample(Participants)/Txt_SampleType'), findTestData('New_Script/Add_Sample(Participants)').getValue(
        1, 1))

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Txt_SampleType_Arrow'))

WebUI.delay(5)

'Finding sample type from all value of dropdown '
String sample_TYpe = findTestData('New_Script/Add_Sample(Participants)').getValue(1, 1)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + sample_TYpe) + '"]'

TestObject sample = new TestObject('objectName')

sample.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.delay(10)

WebUI.click(sample, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

'Tissue Type'
WebUI.setText(findTestObject('NewScript/Add_Sample(Participants)/Txt_TissueSampletype'), findTestData('New_Script/Add_Sample(Participants)').getValue(
        2, 1))

WebUI.delay(5)

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Txt_Tissuetype_Arrow'))

String Tissue_TYpe = findTestData('New_Script/Add_Sample(Participants)').getValue(2, 1)

String xpath = ('//*[@id="ui-id-26"]//*[text()="' + Tissue_TYpe) + '"]'

TestObject type = new TestObject('objectName')

type.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.delay(5)

WebUI.click(type, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath)

'Sub Tissue Type'
WebUI.setText(findTestObject('NewScript/Add_Sample(Participants)/txt_Sub_Tisssuetype'), findTestData('New_Script/Add_Sample(Participants)').getValue(
        3, 1))

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Txt_Sub_Tissuetype_Arrow'))

WebUI.delay(5)

String subsample = findTestData('New_Script/Add_Sample(Participants)').getValue(3, 1)

String xpath2 = ('//*[@id="ui-id-59"]//*[text()="' + subsample) + '"]'

TestObject s_sample = new TestObject('objectName')

s_sample.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.delay(5)

WebUI.click(s_sample, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

System.out.println(xpath2)

'Quantity'
WebUI.setText(findTestObject('NewScript/Add_Sample(Participants)/Txt_Quantity'), findTestData('New_Script/Add_Sample(Participants)').getValue(
        4, 1))

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Btn_Add'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.switchToDefaultContent()

'click on spli samples'
WebUI.click(findTestObject('NewScript/Split Samples/Btn_Spilt _Samples'))

'select single sample to split'
WebUI.click(findTestObject('NewScript/Split Samples/Select_Sample'))

'click on close button'
WebUI.click(findTestObject('NewScript/Split Samples/Btn_Close'))

