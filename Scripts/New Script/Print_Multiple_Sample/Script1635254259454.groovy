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

'slect all  sample to print'
WebUI.click(findTestObject('NewScript/Print Label Sample/Select_All_Sample'))

WebUI.delay(5)

'Click on option menu'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Add_Sample_Arrow'))

'Click on  Print Labels'
WebUI.click(findTestObject('NewScript/Print Label Sample/Print_Lable_Icon'))

WebUI.delay(10)

'Switch to window  to print samples'
WebUI.switchToWindowIndex(3)

WebUI.switchToFrame(findTestObject('NewScript/Print Label Sample/Iframe'), 5)

' select Cateogary to print '
WebUI.setText(findTestObject('NewScript/Print Label Sample/Txt_Cateogary'), findTestData('New_Script/Print_Samples').getValue(
        1, 1))

WebUI.click(findTestObject('NewScript/Print Label Sample/Cateogary_Arrow'))

String cateogary = findTestData('New_Script/Print_Samples').getValue(1, 1)

String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + cateogary) + '"]'

TestObject cat = new TestObject('objectName')

cat.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.delay(5)

WebUI.click(cat, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

System.out.println(xpath2)

WebUI.delay(5)

'document Name'
WebUI.click(findTestObject('NewScript/Print Label Sample/Arrow_Document_Name'))

WebUI.delay(5)

'Select Doc from Dropdown'
String Doc_Name = findTestData('New_Script/Print_Samples').getValue(2, 1)

String xpath = ('//*[@id="ui-id-4"]//*[text()="' + Doc_Name) + '"]'

TestObject doc = new TestObject('objectName')

doc.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.delay(5)

WebUI.click(doc, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

System.out.println(xpath)

'Click on Print Preview  '
WebUI.click(findTestObject('NewScript/Print Label Sample/Print_Preview_Checkbox'))

WebUI.switchToDefaultContent()

WebUI.delay(5)

'Click on count'
WebUI.click(findTestObject('NewScript/Print Label Sample/Btn_Count'))

WebUI.acceptAlert()

'click on Finish'
WebUI.click(findTestObject('NewScript/Print Label Sample/Btn_Finish'))

