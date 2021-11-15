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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login Page/Admin_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub_Location_Type/Select_Sub_Location_type'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub_Location_Type/Add_Sub_Location_Type (Fixed_Location)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

'Click on Show Filter'
WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Iframe_Show_Filter'), 
    0)

WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Btn_Show_Filter'))

'Set text to begin with search text  field'
WebUI.setText(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Txt_Begin_with'), GlobalVariable.random)

WebUI.delay(5)

'click on search Icon'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Search_Icon'))

WebUI.delay(5)

'Search Analysis Code'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Get_SEarch_Value'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

'Get Analysis code'
WebUI.clearText(findTestObject('Storage Information/Sub Location Type/Edit_Sublocation_Types/Edit_Sublocation_type'))

'Edit Analysis Code'
WebUI.setText(findTestObject('Storage Information/Sub Location Type/Edit_Sublocation_Types/Edit_Sublocation_type'), 'Newtest1235')

WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Btn_Save'))

println('Analysis Description Edited Successfully')

WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Chronology/Iframe'), 0)

String C_Date = WebUI.getText(findTestObject('Storage Information/Sub Location Type/Chronology/Creation_Date'))

println(C_Date)

WebUI.delay(5)

String C_By = WebUI.getText(findTestObject('Storage Information/Sub Location Type/Chronology/TXt_Created_By'))

println(C_By)

WebUI.delay(5)

String Change_Date = WebUI.getText(findTestObject('Storage Information/Sub Location Type/Chronology/Changed_Date'))

println(Change_Date)

String Chnaged_By = WebUI.getText(findTestObject('Storage Information/Sub Location Type/Chronology/Txt_Changed_By'))

println(Chnaged_By)

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('General Administratin/Analysis Defination/Add Analysis Defination/btn_Save_and_Close'))

WebUI.delay(5)

