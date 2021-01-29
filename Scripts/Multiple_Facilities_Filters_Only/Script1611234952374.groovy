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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utility_Functions/Open_application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/Login'), [:], FailureHandling.STOP_ON_FAILURE)


//WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/HideAlert_Object'))

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/AprimaEnterprise_Object'))

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/SelectMHPN_Object'))

Thread.sleep(2000)

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/HideAlert_Object'))

String ActualText = WebUI.getText(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/MouseOver_Object'))


WebUI.verifyEqual(ActualText, 'CMR')


WebUI.mouseOver(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/MouseOver_Object'))

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/SelectPatient_Object'))

Thread.sleep(3000)

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/HideAlert_Object'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/ResetBtn_Object'))

Thread.sleep(3000)

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/Facility_Field_Object'))

WebUI.setText(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/Input_Facility_Object'), "MHPN2")
WebUI.click(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/Select_Facility_Object'))

WebUI.setText(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/Input_Facility_Object'), "McLaren Greater Lansing - Holt Family Medicine")
WebUI.click(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/Select_Facility_Object'))

WebUI.click(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/ApplyBtn_Object'))

WebUI.scrollToElement(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/Scroll_Facility_Element_Object'), 300)

String Actual_Text = WebUI.getText(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/MHPN_Verification_Object'))
WebUI.verifyEqual(Actual_Text, "MHPN2")

String Actual = WebUI.getText(findTestObject('Object Repository/MULTIPLE_FACILITIES_ONLY_OR/McLaren_Facility_Verification_Object'))
WebUI.verifyEqual(Actual, "McLaren Greater Lansing - Holt Family Medicine")

WebUI.callTestCase(findTestCase('Utility_Functions/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
