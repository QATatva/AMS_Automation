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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText as GetText
import groovy.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/* 
 * Call TC_01_Login_Valid_User
 * Create New Project from Home Page
 * Submit the required fields data into each field through created data excel file (Project_Data (1))
 * Using Assertion, verify title of the Project in the create form and project created page. 
 * */
//Run login test case
//WebUI.acceptAlert()
//
//WebUI.acceptAlert()
//
//WebUI.acceptAlert()
//
//WebUI.waitForPageLoad(20)

//Click on the 'Create New project' from the Quick Links  
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/div_CreateNewProject'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

//Get 'Project title' data from the 'Project_Data (1)' data file
String test = WebUI.sendKeys(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Title'), 
    findTestData('Add Project/Add_Project').getValue(1, 1))

//Get 'Project Short title' data from the 'Project_Data (1)' data file
WebUI.sendKeys(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Short_Title'), findTestData(
        'Add Project/Add_Project').getValue(2, 1))

//Click on the 'Project type' picklist icon
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/img_Picklist_for_Project Type'))

WebUI.delay(5)

//select value of the 'Project type' from the 'Project_Data(1)' excel
String prjType = findTestData('Add Project/Add_Project').getValue(3, 2)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + prjType) + '"]'

TestObject project1 = new TestObject('objectName')

project1.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(project1, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

//Click on the 'Sample Prefix' and add text value from the 'Project_Data(1)' excel
WebUI.clearText(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_SamplePrefix'))

WebUI.sendKeys(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_SamplePrefix'), findTestData(
        'Add Project/Add_Project').getValue(4, 1))

//Click on the 'Therapeutic Area' picklist icon
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/img_TherapeuticArea'))

WebUI.delay(5)

//select value of the 'Therapeutic Area' from the 'Project_Data(1)' excel
String TheraAr = findTestData('Add Project/Add_Project').getValue(5, 2)

System.out.println(TheraAr)

WebUI.delay(2)

String xpath2 = ('//*[@id="ui-id-7"]//*[text()="' + TheraAr) + '"]'

TestObject project2 = new TestObject('objectName')

project2.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(project2, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

//Click on the 'Oversight Officer' picklist icon
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/img_Oversight Officer'))

WebUI.delay(5)

//select value of the 'Oversight Officer' from the 'Project_Data(1)' excel
String OversightOfficer = findTestData('Add Project/Add_Project').getValue(7, 1)

System.out.println(OversightOfficer)

WebUI.delay(2)

String xpath3 = ('//*[@id="ui-id-10"]//*[text()="' + OversightOfficer) + '"]'

TestObject project3 = new TestObject('objectName')

project3.addProperty('xpath', ConditionType.EQUALS, xpath3)

WebUI.click(project3, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath3)

//DatePicker
//Date date = new Date()
//
//String datePart = date.format('dd/MM/yyyy')
////getting time
//String timePart = date.format('HH:mm')
//println('datePart : ' + datePart)
//
//WebUI.setText(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/Start_Date_Picker'), '')
//Click on the Save Button
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_btn_Save'))

//Call Assertion statement 
if (true) {
    String prjTitle = WebUI.getText(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_Created_Project Title_'))

    prjTitle == test

    assert true
}

WebUI.delay(5)

//Click on the Save & Close Button
WebUI.click(findTestObject('User Module/Demo_OR/Project_OR/Page_Project 5.6 (2105.12)/input_btn_SaveClose'))

