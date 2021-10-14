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

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

"enter Project Name to search"
WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Studies').getValue(2, 1))

"Click on Search Icon"
WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

"Click on search result -Project Hyperlink"
WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

'Click on Add Icon'
WebUI.click(findTestObject('User Module/Studies/Study Team/Add_Study_Team/Study_Team_Icon'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('User Module/Project Team/Iframe'), 0)

"Click on Add studies Icon"
WebUI.click(findTestObject('User Module/Studies/Add_Studies/Add_Studies_Icon'))

WebUI.switchToWindowIndex(2)

WebUI.switchToDefaultContent()

"Click on the 'PStaff name' picklist Arrow"
WebUI.click(findTestObject('User Module/Studies/Study Team/Add_Study_Team/Staff_Name_Arrow'))

WebUI.delay(5)

//select value of the 'Project type' from the 'Project_Data(1)' excel
String prjType = findTestData('Add Project/Add_Study_Team').getValue(1, 1)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + prjType) + '"]'

TestObject project1 = new TestObject('objectName')

project1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(project1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

//Click on the 'Project type' picklist icon
'-----------------------------------------'
WebUI.click(findTestObject('User Module/Studies/Study Team/Add_Study_Team/Role_Arrow'))

WebUI.delay(5)

String Role = findTestData('Add Project/Add_Study_Team').getValue(3, 1)

String xpath2 = ('//*[@id="ui-id-8"]//*[text()="' + Role) + '"]'

TestObject value = new TestObject('objectName')

value.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(value, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.click(findTestObject('User Module/Studies/Add_Studies/Btn_save'))

'CHRONOLOGY DETAILS'
WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Chronology/Iframe'), 10)

'get Creation date'
String C_Date = WebUI.getAttribute(findTestObject('User Module/Studies/Study Team/Chronology/Creation_Date'), 'value')

println('Creation Date of Container type:' + C_Date)

WebUI.delay(5)

'Get Created By'
String C_By = WebUI.getAttribute(findTestObject('User Module/Studies/Study Team/Chronology/TXt_Created_By'), 'value')

println('created by:' + C_By)

WebUI.delay(5)

'Get chnaged date'
String Change_Date = WebUI.getAttribute(findTestObject('User Module/Studies/Study Team/Chronology/Changed_Date'), 'value')

println('changed Date:' + Change_Date)

WebUI.delay(5)

'Get Changed By'
String Chnaged_By = WebUI.getAttribute(findTestObject('User Module/Studies/Study Team/Chronology/Txt_Changed_By'), 'value')

println('Chnaged by:' + Chnaged_By)

WebUI.switchToDefaultContent()

WebUI.delay(10)

WebUI.click(findTestObject('User Module/Studies/Study Team/Add_Study_Team/Btn_More'))

