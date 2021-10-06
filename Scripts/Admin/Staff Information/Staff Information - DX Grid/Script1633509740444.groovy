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


//Login to AMS
WebUI.callTestCase(findTestCase('Login/Login to AMS'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

//Click on "Admin" FM Ribbon Menu Button
WebUI.click(findTestObject('Admin_OR/Admin Icon/a_Admin Icon'))

//Click on General Administration tab

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/General Information icon/GeneralInfo Icon_OR'))

//Click on Staff Information tab

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Staff Administrator Icon'))

WebUI.delay(10)

//Conduct a search using positive values
WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Staff Search iframe'), 30)

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Show Filter'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Staff Full Name'), findTestData('Data Files/Staff Information').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Search Button'))

WebUI.delay(10)

//WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Staff Search iframe'), 30)

String SearchName = "Spencer Adams"

String ResultName= WebUI.getText(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Info Search/Search Result'))

println(ResultName)

if (SearchName.equals(ResultName)) {
	System.out.println('Result Match!')
} else {
	System.out.println('Result not match')
}





/*
//Find a Staff member that would like to edit. Open the record using the Full Name hyperlink
WebUI.switchToFrame(findTestObject('null'), 30)

WebUI.waitForElementVisible(findTestObject('null'), 20)

WebUI.click(findTestObject('null'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)
*/


