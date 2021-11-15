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

'Click on search result Hyperlink'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Search/Search_result'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

'Click on Linked Document Icon'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/Linked_Document_icon'))

WebUI.delay(10)

'Switch  to frame'
WebUI.switchToFrame(findTestObject('General Administratin/Analysis Defination/Linked Documents/iframe_Linked_Document'), 
    0)

WebUI.delay(5)

'Click on Add Icon'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/Add_Linked_element_Icon'))

WebUI.switchToDefaultContent()

WebUI.delay(10)

WebUI.switchToWindowIndex(2)

'Enter text '
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Linked Documents/txt_Description'), findTestData(
        'Analysis_Defination/Add_LinkedDocument').getValue(1, 1))

'Attach  File'
WebUI.uploadFile(findTestObject('General Administratin/Analysis Defination/Linked Documents/Btn_Attach_file'), findTestData(
        'Analysis_Defination/Add_LinkedDocument').getValue(3, 1))

'Enter Notes'
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Linked Documents/Txt_Notes'), findTestData('Analysis_Defination/Add_LinkedDocument').getValue(
        2, 1))

'Click on save and CLose'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/btn_Save_and_Close_Sample_Site'))

