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


WebUI.getUrl()

WebUI.callTestCase(findTestCase('Utility_Functions/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/MHPN_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('Object Repository/MHPN_OR/Page_Welcome to Persivia/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/MHPN_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('PRIMEHEALTHCARE_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'))

    WebUI.click(findTestObject('PRIMEHEALTHCARE_OR/Page_Welcome to Persivia/span_Hide'))

    WebUI.getUrl()

    WebUI.getText(findTestObject('Object Repository/MHPN_OR/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'))
}

WebUI.verifyElementText(findTestObject('APRIMA_ENTERPRISE_OR/Page_Welcome to Persivia/a_CMR'), 'CMR')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Utility_Functions/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

