import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.applitools.eyes.metadata.ActualAppOutput as ActualAppOutput
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

WebUI.click(findTestObject('Object Repository/CarePlan_OR/Patient'))

if(WebUI.verifyElementVisible(findTestObject('Object Repository/CarePlan_OR/CarePlan_Tab'))) {
	
	WebUI.click(findTestObject('Object Repository/CarePlan_OR/CarePlan_Tab'))
	
}else {
	
	println("Care Plan Button Is Not Available")
	WebUI.takeFullPageScreenshot()
}

if(WebUI.verifyElementPresent(findTestObject('Object Repository/CarePlan_OR/AddNewCarePlan'), 3)) {
	
	WebUI.click(findTestObject('Object Repository/CarePlan_OR/AddNewCarePlan'))
}else {
	
	println("Add New Care Plan Button Is Not Available")
	WebUI.takeFullPageScreenshot()
}

if(WebUI.verifyElementPresent(findTestObject('Object Repository/CarePlan_OR/Based_On_Patient_Medical_Report'), 2)) {
	
	WebUI.click(findTestObject('Object Repository/CarePlan_OR/Based_On_Patient_Medical_Report'))
	
}else {
	
	WebUI.takeFullPageScreenshot()
}
	
//WebUI.verifyElementChecked(findTestObject('Object Repository/CarePlan_OR/label_Yes'), 5)




WebUI.callTestCase(findTestCase('Utility_Functions/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

