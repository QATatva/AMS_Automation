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

WebUI.switchToFrame(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Iframe_Add_Container_Type'), 
    0)
"Click on Add ICon"
WebUI.click(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Add_New_Conatiner_type'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

"Enter container Type"
WebUI.setText(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Txt_Container_type'), 
    findTestData('Storage Information/Add_Conatiner_Type').getValue(1, 1))

"Click on save"
WebUI.click(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Btn_Save'))
"Click on save and close"
WebUI.click(findTestObject('Storage Information/Container Type/Container_Type/Add_Container_type/Btn_save_and_close'))

