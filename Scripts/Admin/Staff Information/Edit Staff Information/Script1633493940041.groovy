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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText

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

//Find a Staff member that would like to edit. Open the record using the Full Name hyperlink
WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/iFrame Staff Information'), 30)

WebUI.waitForElementVisible(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Edit Staff Hyperlink'), 20)

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Edit Staff Hyperlink'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.delay(10)


//Edit Information details - Email Address
	WebUI.sendKeys(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Edit Email Address'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

	WebUI.sendKeys(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Edit Email Address'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.setText(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Edit Email Address'), findTestData('Data Files/Staff Information').getValue(2, 1))
	

WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Input_SaveBtn'))
	

	//Click on the Chronology Navigation menu
	//WebUI.click(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Chronology Nav Menu'))
	
	//WebUI.switchToFrame(findTestObject('Object Repository/Admin_OR/General Information_OR/Staff Information/Staff Infornation Edit/Iframe Staff Information Chronology'), 30)
	
	//note down creation and changed by dates and who they are created/changed by.
	//String CB =  WebUI.getText(findTestObject('null'))
	//System.out.println(CB)
	
