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

WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Iframe_Show_Filter'), 
    0)

'Click onShow Filter'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Btn_Show_Filter'))

'Enter text in Begin With Field'
WebUI.setText(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Txt_Begin_with'), findTestData(
        'Storage Information/Add_Sub_Location_Type').getValue(4, 1))

WebUI.delay(5)

'Click on Search Icon'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Search_Icon'))

WebUI.delay(5)

'Click on Count'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Count_Icon'))

WebUI.delay(5)

'Click on Reset'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Reset_Icon'))

