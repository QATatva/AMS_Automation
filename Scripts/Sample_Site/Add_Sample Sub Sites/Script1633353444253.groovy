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

WebUI.switchToFrame(findTestObject('Sample Information/Sample SItes/Sample_Sub_Sites/Iframe_Add_Sample_sub_Sites'), 0)

"Add Sample Sub site icon"
WebUI.click(findTestObject('Sample Information/Sample SItes/Sample_Sub_Sites/Add_Icon_Sample_sub_sites'))

WebUI.switchToWindowIndex(2)

WebUI.waitForElementVisible(findTestObject('Sample Information/Sample SItes/Sample_Sub_Sites/txt_Sample_sub_sites'), 10)
"Text filed to add sample site name "

WebUI.setText(findTestObject('Sample Information/Sample SItes/Sample_Sub_Sites/txt_Sample_sub_sites'), findTestData('Sample_Sites/Sample_Sub_sites').getValue(
        1, 1))

"Save Button"
WebUI.click(findTestObject('Sample Information/Sample SItes/Sample_Sub_Sites/Btn_Save_and_Close'))

