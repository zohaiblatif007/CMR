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

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/span_Procedure Results'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/span_Procedure Results'))

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/span_select'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_HPC'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/li_HPC'))

WebUI.setText(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/input_select_code'), 'a')

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Noninterest escort in non erA0080'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Noninterest escort in non erA0080'))

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/a_15'))

WebUI.setText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/a_15'), '01012021')

WebUI.setText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/input_select_code - Copy'), 'a')

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Abdomen, excluding retroperitoneal regio_cdc860'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Abdomen, excluding retroperitoneal regio_cdc860'))

//WebUI.click(findTestObject('ProcedurresulT/Page_Welcome to Persivia/span_select - Copy'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/li_Active'))
WebUI.setText(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/input_select_reasonCode'), 'a')

WebUI.waitForElementClickable(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Breast cancer screening declined (situat_655684'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('ProcedurresulT/Page_Welcome to Persivia/li_Breast cancer screening declined (situat_655684'))

WebUI.setText(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/input_select_serviceDeliveryLocation'), 
    'a')

WebUI.click(findTestObject('Object Repository/ProcedurresulT/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_source'), 'HPC')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_procedure'), 'Noninterest escort in non er::A0080')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_startdate'), '01/01/2021')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_targetsite'), 'Abnormal hematopoietic cell (cell) :: 107677004')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_status'), 'Completed')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_reason'), 'Breast cancer screening declined (situation)::1.2275351e+16')

WebUI.verifyElementText(findTestObject('ProcedurresulT/Page_Welcome to Persivia/td_serviceD_L'), 'a')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

