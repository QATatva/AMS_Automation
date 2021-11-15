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

'Click on the Projects navigation menu'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Project Navigation menu'))

WebUI.switchToFrame(findTestObject('User Module/Storage/Add Storage to Project/menu iframe'), 10)

'Click on the \'...\' menu'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Click_Menu_1'))

'Select "Add to Project" option'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Select Add to Project'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(2)

'Search project record by entering Project Title'
WebUI.sendKeys(findTestObject('User Module/Storage/Add Storage to Project/Search Text Project Title'), findTestData('Manage Storage/Search Storage').getValue(
        2, 1))

'Click on the Search button'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Project Add Search Button'))

'Click and highlight the project'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Select Project'))

'Click on the Add button to link the project in the storage record.'
WebUI.click(findTestObject('User Module/Storage/Add Storage to Project/Add to Project Button'))

printf('Project Added successfully.')

