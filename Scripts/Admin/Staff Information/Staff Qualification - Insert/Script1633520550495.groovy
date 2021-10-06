import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Admin/Staff Information/Edit Staff Information'), [:], FailureHandling.STOP_ON_FAILURE)


//Click on the Insert New (Blank Doc) Icon
WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/iFrame Staff Information'), 30)

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Qualification/Select New button'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Qualification/Staff Qualification picklist arrow'))

//select value
String OversightOfficer = findTestData('Data Files/Project_Data (1)').getValue(1, 1)

System.out.println(OversightOfficer)

WebUI.delay(2)

String xpath3 = ('//*[@id="ui-id-1"]//*[text()="' + OversightOfficer) + '"]'

TestObject project3 = new TestObject('objectName')

project3.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(project3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)
















