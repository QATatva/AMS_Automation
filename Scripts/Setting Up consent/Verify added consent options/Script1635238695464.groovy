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

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.switchToFrame(findTestObject('Consent Options/Add Consent Option/Add button iFrame'), 20)

'Verify'
String consentInput = WebUI.getText(findTestObject('Consent Options/Add Consent Option/Verification/input_option1'))


String consentInputexcel1 = findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 3)
println(consentInputexcel1)

	WebUI.verifyMatch(consentInput, consentInputexcel1, false)
/*
String consentInputexcel2 = WebUI.getText(findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 2))

	WebUI.verifyMatch(consentInput, consentInputexcel2, false)

String consentInputexcel3 = WebUI.getText(findTestData('Data Files/Project_Consent Option/Project_Add_Consent Option').getValue(1, 3))

	WebUI.verifyMatch(consentInput, consentInputexcel3, false)
*/
