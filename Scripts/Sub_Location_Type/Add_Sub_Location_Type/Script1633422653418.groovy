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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String chars = 'abcdefghijklmnopqrstuvyz'

String Location = randomString(chars, 5)

println(Location)


String Ltype = 'test' + Location
println(Ltype)

WebUI.switchToFrame(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Iframe_Add_SubLocation_Type'), 
    0)

WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Add_New_Sub_Location_type'))

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Txt_Sub_location_type'), Ltype)

WebUI.setText(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Txt_Capacity'), findTestData('Storage Information/Add_Sub_Location_Type').getValue(
        2, 1))

WebUI.setText(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Txt_Width'), findTestData('Storage Information/Add_Sub_Location_Type').getValue(
        3, 1))

WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Btn_Save'))

String Sub_Locationt = WebUI.getText(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Get_value_Sub_location_type'))

System.out.println(Sub_Locationt)

WebUI.click(findTestObject('Storage Information/Sub Location Type/Add Sub Location Type/Btn_save_and_close'))

static String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

