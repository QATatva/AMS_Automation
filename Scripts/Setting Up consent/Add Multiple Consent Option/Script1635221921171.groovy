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

'Click on the More button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/More button'))

'click on the consent option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Consent option picklist arrow'))

'Select text from the Consent Option from the picklist'
String conOpt2 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 2)

System.out.println(conOpt2)

WebUI.delay(5)

String xpath9 = ('//ul[@id="ui-id-1"]//*[text()="' + conOpt2) + '"]'

TestObject Option2 = new TestObject('objectName')

WebUI.delay(2)

Option2.addProperty('xpath', ConditionType.EQUALS, xpath9)

WebUI.click(Option2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath9)

'click on the mandatory option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_mandatory option picklist arrow'))

'Select text from the mandatory Option from the picklist'
String mandopt2 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(2, 2)

System.out.println(mandopt2)

WebUI.delay(5)

String xpath4 = ('//ul[@id="ui-id-9"]//*[text()="' + mandopt2) + '"]'

TestObject Mandatory2 = new TestObject('objectName')

WebUI.delay(2)

Mandatory2.addProperty('xpath', ConditionType.EQUALS, xpath4)

WebUI.click(Mandatory2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath4)

'click on the required consent setting picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Required Consent Setting arrow'))

'Select text from the mandatory Option from the picklist'
String setopt2 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(3, 2)

System.out.println(setopt2)

WebUI.delay(5)

String xpath5 = ('//ul[@id="ui-id-12"]//*[text()="' + setopt2) + '"]'

TestObject setting2 = new TestObject('objectName')

WebUI.delay(2)

setting2.addProperty('xpath', ConditionType.EQUALS, xpath5)

WebUI.click(setting2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath5)

'click on the Save button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Save Button'))

WebUI.delay(5)

'Click on the Workflow Menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Workflow button'))

'Click on the Project active status button from the workflow menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/td_project active status'))

'Click on the More button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/More button'))

'click on the consent option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Consent option picklist arrow'))

'Select text from the Consent Option from the picklist'
String consopt3 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 3)

System.out.println(consopt3)

WebUI.delay(5)

String xpath6 = ('//ul[@id="ui-id-1"]//*[text()="' + consopt3) + '"]'

TestObject Option3 = new TestObject('objectName')

WebUI.delay(2)

Option3.addProperty('xpath', ConditionType.EQUALS, xpath6)

WebUI.click(Option3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath6)

'click on the mandatory option picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_mandatory option picklist arrow'))

'Select text from the mandatory Option from the picklist'
String mandopt3 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(2, 3)

System.out.println(mandopt3)

WebUI.delay(5)

String xpath7 = ('//ul[@id="ui-id-9"]//*[text()="' + mandopt3) + '"]'

TestObject Mandatory3 = new TestObject('objectName')

WebUI.delay(2)

Mandatory3.addProperty('xpath', ConditionType.EQUALS, xpath7)

WebUI.click(Mandatory3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath7)

'click on the required consent setting picklist arrow'
WebUI.click(findTestObject('Consent Options/Add Consent Option/icon_Required Consent Setting arrow'))

'Select text from the mandatory Option from the picklist'
String setopt3 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(3, 3)

System.out.println(setopt3)

WebUI.delay(5)

String xpath8 = ('//ul[@id="ui-id-12"]//*[text()="' + setopt3) + '"]'

TestObject setting3 = new TestObject('objectName')

WebUI.delay(2)

setting3.addProperty('xpath', ConditionType.EQUALS, xpath8)

WebUI.click(setting3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath8)

'click on the Save button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Save Button'))

WebUI.delay(5)

'Click on the Workflow Menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/Workflow button'))

'Click on the Project active status button from the workflow menu'
WebUI.click(findTestObject('Consent Options/Add Consent Option/td_project active status'))

'Click on the Save and Close button'
WebUI.click(findTestObject('Consent Options/Add Consent Option/SaveClose button'))

