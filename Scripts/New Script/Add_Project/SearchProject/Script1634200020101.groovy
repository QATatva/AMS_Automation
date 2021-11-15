import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import io.cucumber.tagexpressions.TagExpressionParser.True as True
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.switchToWindowIndex(0)

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.delay(5)

String Pro_Name = WebUI.getAttribute(findTestObject('User Module/Filters/Txt_Contains'), 'value')

println(Pro_Name)

WebUI.delay(5)

WebUI.clearText(findTestObject('NewScript/Test/EqualTo_Txt'))

WebUI.click(findTestObject('NewScript/Test/SEarch_Arrow'))

WebUI.delay(5)

String Search = findTestData('Add Project/Search').getValue(1, 1)

String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Search) + '"]'

TestObject value = new TestObject('objectName')

value.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(value, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

WebUI.getText(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

String Project_title = WebUI.getText(findTestObject('User Module/Filters/Project_Title_Value'))

println(Project_title)

WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.verifyMatch(Pro_Name, Project_title, false)

WebUI.delay(5)

WebUI.switchToDefaultContent()

