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

WebUI.switchToWindowIndex(1)

WebUI.switchToFrame(findTestObject('General Administratin/Analysis Defination/Linked Documents/iframe_Linked_Document'), 
    0)
"Count Button"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/Btn_Count'))

"Show Filter Icon"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/Btn_ShowFilter'))

"Enter text to search"
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Linked Documents/Txt_Filter_BeginWith'), 'test')

"Click on serch Button"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Linked Documents/btn_Search'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('General Administratin/Analysis Defination/Linked Documents/Btn_Reset'))

