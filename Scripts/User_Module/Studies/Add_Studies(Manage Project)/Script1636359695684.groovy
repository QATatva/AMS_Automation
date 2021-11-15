import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

"Search Project"
WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))
"Click on Search Icon"
WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)
"click on search Result"
WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

'Click on Studies Icon'
WebUI.click(findTestObject('User Module/Studies/Add_Studies/Studies_Icon'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('User Module/Project Team/Iframe'), 0)

"Click on Add icon"
WebUI.click(findTestObject('User Module/Studies/Add_Studies/Add_Studies_Icon'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

"Project Title from dropdown"
WebUI.clearText(findTestObject('User Module/Studies/Add_Studies/Txt_Project_Title'))

WebUI.sendKeys(findTestObject('User Module/Studies/Add_Studies/Txt_Project_Title'), findTestData('Add Project/Add_Studies').getValue(
        1, 1))

WebUI.click(findTestObject('User Module/Studies/Add_Studies/Project_Title'))

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

'Enter Studies Title'
WebUI.sendKeys(findTestObject('User Module/Studies/Add_Studies/Studies_Title'), findTestData('Add Project/Add_Studies').getValue(2, 
        1))

WebUI.delay(5)

'Status from dropdown'
WebUI.sendKeys(findTestObject('User Module/Studies/Add_Studies/Txt_Status'), findTestData('Add Project/Add_Studies').getValue(3, 1))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Studies/Add_Studies/Status'))

WebUI.delay(5)

String Status = findTestData('Add Project/Add_Studies').getValue(3, 1)

System.out.println(Status)

WebUI.delay(5)

String xpath3 = ('//*[@id="ui-id-20"]//*[text()="' + Status) + '"]'

//String xpath2 = ('//*[@id="ui-id-1"]//*[text()="' + Project) + '"]'
 

TestObject Stitle = new TestObject('objectName')

Stitle.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(Stitle, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

WebUI.delay(5)

"Save Button"
WebUI.click(findTestObject('User Module/Studies/Add_Studies/Btn_save'))

