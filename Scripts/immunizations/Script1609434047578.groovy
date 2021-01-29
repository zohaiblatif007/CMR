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

WebUI.click(findTestObject('Immunizaion/Page_Welcome to Persivia/span_Immunizations'))

WebUI.waitForElementClickable(findTestObject('Immunizaion/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('Immunizaion/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('Immunizaion/Page_Welcome to Persivia/span_select'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('Immunizaion/Page_Welcome to Persivia/li_ICD-9'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/li_ICD-9'))

WebUI.setText(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/input_select_code'), 'THER ULTRASOUND OF HEART::00.02')

WebUI.waitForElementClickable(findTestObject('Immunizaion/Page_Welcome to Persivia/li_ICD-9 - Copy'), GlobalVariable.timeout)

WebUI.click(findTestObject('Immunizaion/Page_Welcome to Persivia/li_ICD-9 - Copy'))

WebUI.click(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/a_23'))

WebUI.setText(findTestObject('Immunizaion/Page_Welcome to Persivia/a_23'), '01012021')

//WebUI.click(findTestObject('Immunizaion/Page_Welcome to Persivia/span_select - Copy'))
//
//WebUI.click(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/li_Normal'))
WebUI.setText(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/input_select_lotNumber'), '1')

WebUI.setText(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/input_select_manufacturerName'), 'vaccination')

WebUI.setText(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/input_select_textNote'), 'Immunization protects from disease')

WebUI.click(findTestObject('Object Repository/Immunizaion/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_source'), 'ICD9CM')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_vaccine'), 'THER ULTRASOUND OF HEART::00.02')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_startdate'), '01/01/2021')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_status'), 'Completed')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_lot'), '1')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_manofcture'), 'vaccination')

WebUI.verifyElementText(findTestObject('Immunizaion/Page_Welcome to Persivia/td_comment'), 'Immunization protects from disease')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

