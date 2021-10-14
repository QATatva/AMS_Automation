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

'Switch  to frame'
WebUI.switchToFrame(findTestObject('User Module/Filters/Iframe_Show_Filter'), 0)

'Enter text to Search'
WebUI.setText(findTestObject('User Module/Filters/Txt_Contains'), findTestData('Add Project/Add_Project').getValue(1, 1))

'Search Icon'
WebUI.click(findTestObject('User Module/Filters/Search_Icon'))

WebUI.delay(5)

'click on search result hyperlink'
WebUI.click(findTestObject('User Module/Filters/Get_SEarch_Value_by_Title'))

WebUI.delay(5)

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

'Click on Team Project  Icon'
WebUI.click(findTestObject('User Module/Project Team/ProjectTeam'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('User Module/Project Team/Iframe'), 5)

"clikc on Fullname Header"
WebUI.click(findTestObject('User Module/Project Team/Sorting/Full_Name'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_Arrow'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Project Team/Sorting/Status_Sort_Arrow'))

WebUI.delay(5)

"Order by sorting"
WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_Filter'))

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_Tissue_User'))

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_OK_Filter'))

WebUI.delay(5)

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_Filter'))

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_Tissue_User'))

WebUI.click(findTestObject('User Module/Project Team/Sorting/Role_OK_Filter'))

WebUI.dragAndDropToObject(findTestObject('User Module/Project Team/Sorting/Full_Name'), findTestObject('User Module/Project Team/Sorting/Role'), 
    FailureHandling.STOP_ON_FAILURE)

