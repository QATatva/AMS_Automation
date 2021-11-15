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

WebUI.switchToFrame(findTestObject('User Module/Storage/Add Storage Location/Manage Storage Iframe'), 10)

WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Add Button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('User Module/Storage/Add Storage Location/Storage Name Textbox'), 10)

'Enter text on the Storage name '
WebUI.sendKeys(findTestObject('User Module/Storage/Add Storage Location/Storage Name Textbox'), findTestData('Data Files/Manage Storage/Add Storage data').getValue(
        1, 1))

'Click on the Site picklist arrow icon '
WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Site Picklist arrow'))

WebUI.delay(5)

'Select text from the Site picklist'
String site = findTestData('Data Files/Manage Storage/Add Storage data').getValue(2, 1)

System.out.println(site)

WebUI.delay(5)

String xpath1 = ('//ul[@id="ui-id-1"]//*[text()="' + site) + '"]'

TestObject SITE = new TestObject('objectName')

SITE.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(SITE, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

'Click on the Building Name picklist arrow icon '
WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Building Name Picklist Arrow'))

WebUI.delay(5)

'Select text from the Building Name picklist'
String building = findTestData('Data Files/Manage Storage/Add Storage data').getValue(3, 1)

System.out.println(building)

WebUI.delay(5)

String xpath2 = ('//ul[@id="ui-id-6"]//*[text()="' + building) + '"]'

TestObject BUILDING = new TestObject('objectName')

BUILDING.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(BUILDING, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

'Click on the Notification name picklist arrow icon '
WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Notification Name Picklist arrow'))

WebUI.delay(5)

'Select text from the Notification Name picklist'
String notification = findTestData('Data Files/Manage Storage/Add Storage data').getValue(4, 1)

System.out.println(notification)

WebUI.delay(5)

String xpath3 = ('//ul[@id="ui-id-8"]//*[text()="' + notification) + '"]'

TestObject NOTIFICATION = new TestObject('objectName')

NOTIFICATION.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(NOTIFICATION, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

'Click on the Type picklist arrow icon '
WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Type Picklist arrow'))

WebUI.delay(5)

'Select text from the Type picklist'
String Type = findTestData('Data Files/Manage Storage/Add Storage data').getValue(5, 1)

System.out.println(Type)

WebUI.delay(5)

String xpath4 = ('//ul[@id="ui-id-18"]//*[text()="' + Type) + '"]'

TestObject TYPE = new TestObject('objectName')

TYPE.addProperty('xpath', ConditionType.EQUALS, xpath4)

WebUI.click(TYPE, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath4)

WebUI.sendKeys(findTestObject('User Module/Storage/Add Storage Location/Room Textbox'), findTestData('Manage Storage/Add Storage data').getValue(
        6, 1))

WebUI.click(findTestObject('User Module/Storage/Add Storage Location/Save button'))

printf('New Storage Location Added Successfully.')

