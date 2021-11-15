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

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

'Enter text to Search'
WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

'Search Icon'
WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

'click on search result hyperlink'
WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

'Click on Add Icon'
WebUI.click(findTestObject('User Module/Project Team/ProjectTeam'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('User Module/Project Team/Iframe'), 0)

'click on Active Icon'
WebUI.click(findTestObject('User Module/Project Team/Active_Icon'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

'Click on Workflow Icon'
WebUI.click(findTestObject('User Module/Project Team/WorkFlow_Icon'))

'Click on Toogle to approve request'
WebUI.click(findTestObject('User Module/Project Team/Toggle_Approve_Request'))

println('Request approved ')

WebUI.click(findTestObject('User Module/Project/Btn_Save_and_Close'))

