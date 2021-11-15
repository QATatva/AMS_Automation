import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.click(findTestObject('User Module/Demo_OR/Quick_Links_Icon'))
WebUI.switchToFrame(findTestObject('User Module/Studies/Create_New_Studies(Links)/Iframe'), 10)

WebUI.click(findTestObject('User Module/Studies/Create_New_Studies(Links)/Create_New_Studies'))

WebUI.delay(10)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.clearText(findTestObject('User Module/Studies/Txt_Project_Title'))

WebUI.sendKeys(findTestObject('User Module/Studies/Txt_Project_Title'), findTestData('Add Project/Add_Studies').getValue(
        1, 1))

WebUI.click(findTestObject('User Module/Studies/Project_Title'))

WebUI.delay(5)

//select value of the 'Therapeutic Area' from the 'Project_Data(1)' excel
String Project = findTestData('Add Project/Add_Studies').getValue(1, 1)

System.out.println(Project)

WebUI.delay(2)

String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Project) + '"]'

TestObject project2 = new TestObject('objectName')

project2.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(project2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.delay(5)

'Studies Title'
WebUI.sendKeys(findTestObject('User Module/Studies/Studies_Title'), findTestData('Add Project/Add_Studies').getValue(2, 
        1))

WebUI.delay(5)

'Status'
WebUI.sendKeys(findTestObject('User Module/Studies/Txt_Status'), findTestData('Add Project/Add_Studies').getValue(3, 1))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Studies/Status'))

WebUI.delay(5)

String Status = findTestData('Add Project/Add_Studies').getValue(3, 1)

System.out.println(Status)

WebUI.delay(2)

String xpath3 = ('//ul[@id="ui-id-1]//*[text()="' + Status) + '"]'

//String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Project) + '"]'
TestObject Stitle = new TestObject('objectName')

Stitle.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(Stitle, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Studies/Btn_save'))

