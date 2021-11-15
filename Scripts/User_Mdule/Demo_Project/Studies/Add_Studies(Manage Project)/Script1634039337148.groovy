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

WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

'Click on Add Icon'
WebUI.click(findTestObject('User Module/Studies/Studies_Icon'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('User Module/Project Team/Iframe'), 0)

WebUI.click(findTestObject('User Module/Studies/Add_Studies_Icon'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

//WebUI.clearText(findTestObject('User Module/Studies/Txt_Project_Title'))
//
//WebUI.sendKeys(findTestObject('User Module/Studies/Txt_Project_Title'), findTestData('Add Project/Add_Studies').getValue(
//        1, 1))
//
//WebUI.click(findTestObject('User Module/Studies/Project_Title'))
//
//WebUI.delay(5)
//
////select value of the 'Therapeutic Area' from the 'Project_Data(1)' excel
//String Project = findTestData('Add Project/Add_Studies').getValue(1, 1)
//
//System.out.println(Project)
//
//WebUI.delay(2)
//
//String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Project) + '"]'
//
//TestObject project2 = new TestObject('objectName')
//
//project2.addProperty('xpath', ConditionType.EQUALS, xpath2)
//
//WebUI.click(project2, FailureHandling.STOP_ON_FAILURE)
//
//System.out.println(xpath2)
//
//WebUI.delay(5)
//
//'Studies Title'
//WebUI.sendKeys(findTestObject('User Module/Studies/Studies_Title'), findTestData('Add Project/Add_Studies').getValue(2, 
//        1))
//
//WebUI.delay(5)
//
//'Status'
//WebUI.sendKeys(findTestObject('User Module/Studies/Txt_Status'), findTestData('Add Project/Add_Studies').getValue(3, 1))
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('User Module/Studies/Status'))
//
//WebUI.delay(5)
//
//String Status = findTestData('Add Project/Add_Studies').getValue(3, 1)
//
//System.out.println(Status)
//
//WebUI.delay(2)
//
//String xpath3 = ('//ul[@id="ui-id-1]//*[text()="' + Status) + '"]'
//
////String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Project) + '"]'
// 
//
//TestObject Stitle = new TestObject('objectName')
//
//Stitle.addProperty('xpath', ConditionType.EQUALS, xpath3)
//
//WebUI.click(Stitle, FailureHandling.STOP_ON_FAILURE)
//
//System.out.println(xpath3)
//
//WebUI.delay(5)
//
//WebUI.click(findTestObject('User Module/Studies/Btn_save'))
//
