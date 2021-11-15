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

'Switch to frame'
WebUI.switchToFrame(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Iframe_Add_Container_Type'), 
    0)

'Click on Add Icon '
WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Add_New_Sub_Location_type'))

WebUI.switchToDefaultContent()

'Switch to new window to add Analysis description'
WebUI.switchToWindowIndex(1)

'Add Text to Analysis Code'
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Add Analysis Defination/Txt_Analysis_code'), findTestData(
        'Analysis_Defination/Add_Analysis_Description').getValue(1, 1))

'Add text to Analysis Type'
WebUI.setText(findTestObject('General Administratin/Analysis Defination/Add Analysis Defination/Txt_Analysis_Type'), findTestData(
        'Analysis_Defination/Add_Analysis_Description').getValue(2, 1))

'Click on save and Close button'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Add Notes/btn_Save_and_Close'))

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

