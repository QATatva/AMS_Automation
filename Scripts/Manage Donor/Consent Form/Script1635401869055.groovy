import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.switchToDefaultContent()

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Manage Donors/Consent Form/Description picklist arrow'))

WebUI.delay(5)

String description = findTestData('Data Files/Manage Donor/Add Consent Form').getValue(1, 1)

String xpath1 = ('//*[@id="ui-id-1"]//*[text()="' + description) + '"]'

TestObject DESCRIPTION = new TestObject('objectName')

DESCRIPTION.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(DESCRIPTION, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath1)

WebUI.click(findTestObject('Manage Donors/Consent Form/Status picklist arrow'))

WebUI.delay(5)

String status = findTestData('Data Files/Manage Donor/Add Consent Form').getValue(2, 1)

String xpath2 = ('//*[@id="ui-id-10"]//*[text()="' + status) + '"]'

TestObject STATUS = new TestObject('objectName')

STATUS.addProperty('xpath', ConditionType.EQUALS, xpath2)

WebUI.click(STATUS, FailureHandling.STOP_ON_FAILURE)

System.out.println(xpath2)

WebUI.click(findTestObject('Manage Donors/Consent Form/SaveContinue button'))

