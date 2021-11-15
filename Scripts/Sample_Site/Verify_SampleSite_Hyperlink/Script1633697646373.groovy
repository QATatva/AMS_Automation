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

WebUI.switchToFrame(findTestObject('Sample Information/Sample SItes/Sample Site Add/Iframe_Add sample Sites'), 5)

'Click on sample site hyperlink'
WebUI.click(findTestObject('Sample Information/Sample SItes/Verify Sample Site Hyperlink/Verfiy_Sample_Site_Hyperlink'))

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

//'CHRONOLOGY DETAILS'
//WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Chronology/Iframe'), 10)
//
//'get Creation date'
//String C_Date = WebUI.getAttribute(findTestObject('Storage Information/Container Type/Container_Type/Chronology/Creation_Date'),
//	'value')
//
//println("Creation Date of Container type:"+C_Date)
//
//WebUI.delay(5)
//
//'Get Created By'
//String C_By = WebUI.getAttribute(findTestObject('Storage Information/Container Type/Container_Type/Chronology/TXt_Created_By'),
//	'value')
//
//println("created by:"+C_By)
//
//WebUI.delay(5)
//
//'Get chnaged date'
//String Change_Date = WebUI.getAttribute(findTestObject('Storage Information/Container Type/Container_Type/Chronology/Changed_Date'),
//	'value')
//
//println("changed Date:"+Change_Date)
//
//WebUI.delay(5)
//
//'Get Changed By'
//String Chnaged_By = WebUI.getAttribute(findTestObject('Storage Information/Container Type/Container_Type/Chronology/Txt_Changed_By'),
//	'value')
//
//println("Chnaged by:"+Chnaged_By)
//
//WebUI.switchToDefaultContent()
'Click on Saveand Close Button'
WebUI.click(findTestObject('General Administratin/Analysis Defination/Add Analysis Defination/btn_Save_and_Close'))

