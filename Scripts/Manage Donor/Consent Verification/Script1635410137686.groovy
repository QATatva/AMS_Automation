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

WebUI.delay(5)

'Verify'
String DonorID = WebUI.getAttribute(findTestObject('Object Repository/Manage Donors/Verify/input_Donor ID'), 'value')

println(DonorID)

WebUI.click(findTestObject('Manage Donors/Verify/saveClose button'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(0)

WebUI.switchToFrame(findTestObject('Manage Donors/Verify/iframe search'), 20)

WebUI.setText(findTestObject('Manage Donors/Verify/input search Donor ID'), DonorID)

WebUI.click(findTestObject('Manage Donors/Verify/Search button'))

//String SearchDonorID = WebUI.getAttribute(findTestObject('Manage Donors/Verify/grid Donor ID'), 'value')
//println(SearchDonorID)
//WebUI.verifyMatch(DonorID, SearchDonorID, false)
String SearchDonorID = WebUI.getText(findTestObject('Manage Donors/Verify/grid Donor ID'))
println(SearchDonorID)

WebUI.verifyMatch(DonorID, SearchDonorID, false)