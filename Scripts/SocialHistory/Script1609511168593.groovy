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

WebUI.callTestCase(findTestCase('NavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Social History/Page_Welcome to Persivia/span_Social History'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/span_Social History'))

WebUI.waitForElementClickable(findTestObject('Social History/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('Social History/Page_Welcome to Persivia/span_select'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('Social History/Page_Welcome to Persivia/li_Tobacco use and exposure'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/li_Tobacco use and exposure'))

WebUI.setText(findTestObject('Social History/Page_Welcome to Persivia/span_select - Copy'), 'under observation')

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/a_12'))

WebUI.setText(findTestObject('Social History/Page_Welcome to Persivia/a_12'), '01012021')

WebUI.setText(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/a_23'), '01122021')

WebUI.click(findTestObject('Object Repository/Social History/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.verifyElementText(findTestObject('Social History/Page_Welcome to Persivia/td_type'), 'Tobacco use and exposure')

WebUI.verifyElementText(findTestObject('Social History/Page_Welcome to Persivia/td_observation'), 'under observation')

WebUI.verifyElementText(findTestObject('Social History/Page_Welcome to Persivia/td_startdate'), '01/01/2021')

WebUI.verifyElementText(findTestObject('Social History/Page_Welcome to Persivia/td_endate'), '01/12/2021')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

