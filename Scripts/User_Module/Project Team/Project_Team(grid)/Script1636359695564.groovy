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

WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)
"click on Arrow to expand Project"
WebUI.click(findTestObject('User Module/Grid_Icons/Project_Row_Expand_Icon'))

WebUI.click(findTestObject('User Module/Grid_Icons/Project_Team'))

//WebUI.switchToDefaultContent()
//
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe'), 0)

WebUI.delay(10)
"click on Add Icon"
WebUI.click(findTestObject('User Module/Project Team/Add_ProjectTeam_Icon'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

'Enter text '
WebUI.click(findTestObject('User Module/Project Team/Staff_Name'), FailureHandling.STOP_ON_FAILURE)

'Enter value'
WebUI.click(findTestObject('User Module/Project Team/Staff_Name_Value'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'Team Roles'
WebUI.click(findTestObject('User Module/Project Team/Role'), FailureHandling.STOP_ON_FAILURE)

'Click on save and CLose'
WebUI.click(findTestObject('User Module/Project Team/Role_Value')).WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe'), 
    0)

WebUI.delay(10)

WebUI.click(findTestObject('User Module/Project Team/Add_ProjectTeam_Icon'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

'Add Staff '
WebUI.click(findTestObject('User Module/Project Team/Staff_Name'), FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('User Module/Project Team/Staff_Name_Value'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)
"Add Role from dropdown"
WebUI.click(findTestObject('User Module/Project Team/Role'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User Module/Project Team/Role_Value'))

"save and close"
WebUI.click(findTestObject('User Module/Project/Btn_Save_and_Close'))

