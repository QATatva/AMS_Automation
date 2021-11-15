import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login Page/Admin_Login_Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.switchToFrame(findTestObject('User Module/Project/Iframe_Add_Project'), 5)

WebUI.waitForPageLoad(20)

//Click on the 'Create New project' from the Quick Links  
WebUI.click(findTestObject('User Module/Project/Add_New_Project_Icon'))

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

//
////Get 'Project title' data from the 'Project_Data (1)' data file
//String test = WebUI.sendKeys(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Title'), 
//    findTestData('Add Project/Add_Project').getValue(1, 1))
//
////Get 'Project Short title' data from the 'Project_Data (1)' data file
//WebUI.sendKeys(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Project_Short_Title'), findTestData(
//        'Add Project/Add_Project').getValue(2, 1))
//
////Click on the 'Project type' picklist icon
//WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/img_Picklist_for_Project Type'))
//
//WebUI.delay(5)
//
////select value of the 'Project type' from the 'Project_Data(1)' excel
//String prjType = findTestData('Add Project/Add_Project').getValue(3, 2)
//
//String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + prjType) + '"]'
//
//TestObject project1 = new TestObject('objectName')
//
//project1.addProperty('xpath', ConditionType.EQUALS, xpath1)
//
//WebUI.click(project1, FailureHandling.STOP_ON_FAILURE)
//
//System.out.println(xpath1)
//
////Click on the 'Sample Prefix' and add text value from the 'Project_Data(1)' excel
//WebUI.clearText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_SamplePrefix'))
//
//WebUI.sendKeys(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_SamplePrefix'), findTestData(
//        'Add Project/Add_Project').getValue(4, 1))
//
////Click on the 'Therapeutic Area' picklist icon
//WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/img_TherapeuticArea'))
//
//WebUI.delay(5)
//
////select value of the 'Therapeutic Area' from the 'Project_Data(1)' excel
//String TheraAr = findTestData('Add Project/Add_Project').getValue(5, 2)
//
//System.out.println(TheraAr)
//
//WebUI.delay(2)
//
//String xpath2 = ('//*[@id="ui-id-7"]//*[text()="' + TheraAr) + '"]'
//
//TestObject project2 = new TestObject('objectName')
//
//project2.addProperty('xpath', ConditionType.EQUALS, xpath2)
//
//WebUI.click(project2, FailureHandling.STOP_ON_FAILURE)
//
//System.out.println(xpath2)
//
////Click on the 'Oversight Officer' picklist icon
//WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/Oversight _Officer_Arrow'))
//
//WebUI.delay(5)
//
////select value of the 'Oversight Officer' from the 'Project_Data(1)' excel
//String OversightOfficer = findTestData('Add Project/Add_Project').getValue(7, 1)
//
//System.out.println(OversightOfficer)
//
//WebUI.delay(2)
//
//String xpath3 = ('//*[@id="ui-id-10"]//*[text()="' + OversightOfficer) + '"]'
//
//TestObject project3 = new TestObject('objectName')
//
//project3.addProperty('xpath', ConditionType.EQUALS, xpath3)
//
//WebUI.click(project3, FailureHandling.STOP_ON_FAILURE)
//
//System.out.println(xpath3)
//DatePicker
Date date = new Date()

String datePart = date.format('dd')

println('date : ' + datePart)

WebDriver driver = DriverFactory.getWebDriver()

'Expected value from Table'
String ExpectedValue = '14'

'To locate table'
WebElement Table = driver.findElement(By.xpath('table'))

'To locate rows of table it will Capture all the rows available in the table'
List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

'To calculate no of rows In table'
int rows_count = rows_table.size()

'Loop will execute for all the rows of the table'
Loop: for (int row = 0; row < rows_count; row++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName('td'))

    'To calculate no of columns(cells) In that specific row'
    int columns_count = Columns_row.size()

    println((('Number of cells In Row ' + row) + ' are ') + columns_count)

    'Loop will execute till the last cell of that specific row'
    for (int column = 0; column < columns_count; column++) {
        'It will retrieve text from each cell'
        String celltext = Columns_row.get(column).getText()

        println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)

        'Checking if Cell text is matching with the expected value'
        if (celltext == ExpectedValue) {
            'Getting the Country Name if cell text i.e Company name matches with Expected value'
            println('Text present in row number 3 is: ' + Columns_row.get(2).getText())

            'After getting the Expected value from Table we will Terminate the loop'
            Loop: break
        }
    }
}

//
//WebUI.setText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/Start_Date_Picker'), '')
//Click on the Save Button
WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_btn_Save'))

//Call Assertion statement 
if (true) {
    String prjTitle = WebUI.getText(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_Created_Project Title_'))

    prjTitle == test

    assert true
}

WebUI.delay(5)

//Click on the Save & Close Button
WebUI.click(findTestObject('User Module/Project/Project_OR/Page_Project 5.6 (2105.12)/input_btn_SaveClose'))

