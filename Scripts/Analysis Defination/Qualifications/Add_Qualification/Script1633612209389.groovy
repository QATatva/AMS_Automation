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

"Click on hyperlink of Search Result"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Search/Search_result'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)
"Click on Qualification Icon"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Qualifications/Qaualification_Icon'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('General Administratin/Analysis Defination/Linked Documents/iframe_Linked_Document'), 
    0)

WebUI.delay(5)
"Click on Add"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Qualifications/Add_Qualification_Icon'))

WebUI.switchToDefaultContent()

WebUI.delay(5)

WebUI.switchToWindowIndex(2)

"Click on Checkbox"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Qualifications/Checkbox_LabTechnician'))

WebUI.delay(5)

"Click on Count Icon"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Qualifications/Btn_Count'))

WebUI.delay(5)
"Click on close Button"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Qualifications/Btn_Close'))

"Click on Save andClose"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Add Analysis Defination/btn_Save_and_Close'))

