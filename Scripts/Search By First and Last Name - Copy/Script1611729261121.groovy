import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.applitools.eyes.metadata.ActualAppOutput
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

Thread.sleep(5000)

WebUI.click(findTestObject('MULTIPLE_FACILITIES_ONLY_OR/HideAlert_Object'))

WebUI.click(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Input_Search_Field/Input_Search'))
WebUI.setText(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Input_Search_Field/Input_Search'), "jhon, adam")

Type_Text = WebUI.getAttribute(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Input_Search_Field/Input_Search'), "value")
WebUI.verifyEqual(Type_Text, "jhon, adam")


WebUI.delay(3)

WebUI.click(findTestObject('Search By First and Last Name_OR/Parent_Objects/Select_Filters/Select_Search'))

Thread.sleep(10000)


String Actual_Name = WebUI.getText(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Verify_Name/First and Last Name'))
WebUI.verifyEqual(Actual_Name, "jhon, adam")

String Actual_MRN = WebUI.getText(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Verify_MRN/MRN'))
WebUI.verifyEqual(Actual_MRN, "PE464405F7937E44AFB6996691E47674E1")

String Actual_DOB = WebUI.getText(findTestObject('Object Repository/Search By First and Last Name_OR/Parent_Objects/Verify_DOB/DOB'))
WebUI.verifyEqual(Actual_DOB, "07/13/1980")


WebUI.callTestCase(findTestCase('Utility_Functions/Logout'), [:], FailureHandling.STOP_ON_FAILURE)
