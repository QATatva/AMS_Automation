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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

'Click on Show Filter'
WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Iframe_Show_Filter'), 
    0)

WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Btn_Show_Filter'))

'Set text to begin with search text  field'
WebUI.setText(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Txt_Begin_with'), 'test')

'click on search Icon'
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Search_Icon'))

WebUI.delay(5)

"Click on sub location Hyperlink by search"
WebUI.click(findTestObject('Storage Information/Sub Location Type/Show Filter Sub Location Type/Get_SEarch_Value'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)
"Delete Icon"
WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Btn_Delete'))

WebUI.delay(5)

WebUI.acceptAlert()
println("Sub Location Deleted Successfully")
