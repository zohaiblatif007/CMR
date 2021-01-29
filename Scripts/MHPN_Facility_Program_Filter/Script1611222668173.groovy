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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Utility_Functions/Open_application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'))

    WebUI.delay(2)
}

if (WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/select_MHPN'), 1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/select_MHPN'))

    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_Hide'))

    WebUI.getUrl()

    WebUI.getText(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/select_MHPN'))
}

WebUI.verifyElementText(findTestObject('APRIMA_ENTERPRISE_OR/Page_Welcome to Persivia/a_CMR'), 'CMR')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/MHPN_OR/Page_Welcome to Persivia/a_Care Coordination'), 'Care Coordination')

WebUI.delay(2)

WebUI.mouseOver(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/a_CMR'))

WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_Patients'))

WebUI.delay(3)

WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_Hide'))

WebUI.delay(2)

WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/button_Reset'))

//Click On Facility Field
WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/div_Facility_k-multiselect-wrap k-floatwrap'))

//Input
WebUI.setText(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/input_Facility_k-input'), 'MHPN')

if (WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/li_MHPN'), 1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/li_MHPN'))
} else {
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/li_MHPN'), 1)) {
    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/Page_Welcome to Persivia/Page_Welcome to Persivia/Page_Welcome to Persivia/span_Allselect'))

    WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/Page_Welcome to Persivia/Page_Welcome to Persivia/li_CCM (1)'))
} else {
    WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/button_Apply'))

WebUI.scrollToElement(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/Page_Welcome to Persivia/th_Column SettingsFacility'), 
    20)

WebUI.scrollToPosition(30, 30)

if (WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_MHPN'), 10)) {
    WebUI.verifyElementText(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_MHPN'), 'MHPN')
} else {
    WebUI.verifyElementText(findTestObject('MHPN_FACILITY_FILTERS_OR/Page_Welcome to Persivia/span_MHPN'), 'MHPN2')
}

WebUI.verifyElementPresent(findTestObject('MHPN_FACILITY_FILTERS_OR/iframe_SignOut_appCCM/td_Heart Failure, CCM, Readmission (1)'), 
    10)


WebUI.callTestCase(findTestCase('Utility_Functions/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

