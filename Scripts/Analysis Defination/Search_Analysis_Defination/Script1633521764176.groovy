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

WebUI.switchToFrame(findTestObject('General Administratin/Analysis Defination/Search/Iframe'), 0)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

"enter text to searrch"
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Search/Txt_Begin_with_search'), findTestData('Analysis_Defination/Add_Analysis_Description').getValue(
        1, 1))
"Click on Search Icon"
WebUI.click(findTestObject('General Administratin/Analysis Defination/Search/SEarch_Icon'))

WebUI.delay(5)
"Get search value"
String Search_value = WebUI.getText(findTestObject('General Administratin/Analysis Defination/Search/search_result'))

println(Search_value)

