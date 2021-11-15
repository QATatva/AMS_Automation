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

WebUI.click(findTestObject('User Module/Grid_Icons/Project_Row_Expand_Icon'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Title'), 
    0)

WebUI.clearText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Title'))

WebUI.setText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Title'), 'Edit test')

WebUI.clearText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Short_Title'))

WebUI.setText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Short_Title'), 'Test')

WebUI.clearText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/ul_menu_Project_Type'))

WebUI.setText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/ul_menu_Project_Type'), 'Test')

WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_btn_Save'))

