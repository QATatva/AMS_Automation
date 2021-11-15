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

//WebUI.callTestCase(findTestCase('User_Mdule/Demo_Project/Create_Project(Quick_Links)'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Login Page/Admin_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('User_Mdule/Demo_Project/Select_Manage_Project'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

//WebUI.clearText(findTestObject('User Module/Demo_OR/Project_OR/Search_OR/input_Search_Project.Active'))
WebUI.click(findTestObject('User Module/Filters/Count_Icon'))

//WebUI.delay(2)
//
//WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 4))
//
//WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Filters/Reset_Icon'))

WebUI.click(findTestObject('User Module/Filters/Equal_To'))

WebUI.click(findTestObject('User Module/Filters/Equal_TO(No)'))

WebUI.delay(2)

//WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Search_OR/span_Click_Search'))
WebUI.click(findTestObject('User Module/Filters/Count_Icon'))

WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(10)

WebUI.click(findTestObject('User Module/Filters/Reset_Icon'))

