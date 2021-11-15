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

WebUI.callTestCase(findTestCase('Login Page/Login Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('User_Module/Demo_Project/Select_Manage_Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 10)

WebUI.sendKeys(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Grid_Icons/Project_Row_Expand_Icon'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Projects Create and Search/Edit Project via expand row/Span_Details tab'))

WebUI.switchToFrame(findTestObject('User Module/Projects Create and Search/Edit Project via expand row/EXpand detail iframe'), 
    0)

WebUI.clearText(findTestObject('User Module/Projects Create and Search/Edit Project via expand row/input_Project Short Title'))

WebUI.setText(findTestObject('User Module/Projects Create and Search/Edit Project via expand row/input_Project Short Title'), 
    'Test')

WebUI.click(findTestObject('User Module/Projects Create and Search/Edit Project via expand row/Save button'))

