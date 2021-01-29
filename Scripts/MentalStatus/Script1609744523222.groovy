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

WebUI.click(findTestObject('MentalStatus/Page_Welcome to Persivia/span_Period_k-icon k-i-arrow-e'))

WebUI.waitForElementClickable(findTestObject('MentalStatus/Page_Welcome to Persivia/span_Mental Status'), GlobalVariable.timeout)

WebUI.click(findTestObject('MentalStatus/Page_Welcome to Persivia/span_Mental Status'))

WebUI.waitForElementClickable(findTestObject('MentalStatus/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/MentalStatus/Page_Welcome to Persivia/button_Add'))

WebUI.setText(findTestObject('Object Repository/MentalStatus/Page_Welcome to Persivia/input_Column Settings_code'), 'a')

WebUI.waitForElementClickable(findTestObject('MentalStatus/Page_Welcome to Persivia/li_Spirometry reversibility negative (findi_78a245'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/MentalStatus/Page_Welcome to Persivia/li_Spirometry reversibility negative (findi_78a245'))

WebUI.setText(findTestObject('MentalStatus/Page_Welcome to Persivia/a_4'), '01032021')

WebUI.click(findTestObject('Object Repository/MentalStatus/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.verifyElementText(findTestObject('MentalStatus/Page_Welcome to Persivia/td_condition'), 'Spirometry reversibility negative (finding):: 314980001')

WebUI.verifyElementText(findTestObject('MentalStatus/Page_Welcome to Persivia/td_date'), '01/03/2021')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

