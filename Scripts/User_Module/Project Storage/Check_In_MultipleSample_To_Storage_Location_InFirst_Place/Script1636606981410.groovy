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

WebUI.switchToWindowIndex(2)

'Switch to iframe'
WebUI.switchToFrame(findTestObject('NewScript/Add_Participants/Iframe'), 10)

WebUI.delay(5)

'slect sample to print'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Select_All_Sample'))

WebUI.delay(5)

'Click on option menu'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Add_Sample_Arrow-2'))

'Click on  Print Labels'
WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Check_In_Sample_Icon'))

WebUI.delay(10)

'Switch to window  to print samples'
WebUI.switchToWindowIndex(3)

WebUI.click(findTestObject('NewScript/Manage_Locations/Select_Box'))

WebUI.delay(5)

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Txt_ResonFor_Move_Arrow'))

WebUI.delay(10)

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Txt_Reson_For_Move_Value'))

WebUI.delay(10)

WebUI.click(findTestObject('NewScript/Add_Sample(Participants)/Btn_Check_In_Selected_Sample'))

WebUI.delay(10)

