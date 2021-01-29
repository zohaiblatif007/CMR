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

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/span_Medications'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/source_select'), GlobalVariable.timeout)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/source_select'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/li_MMSL'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/li_MMSL'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_cmtake_code'), 'Humulin R U-500 KwikPen 500unit/ml Solution for Injection::100034')

//WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_cmtake_frequency'), '7')
//
//WebUI.delay(1)
WebUI.click(findTestObject('medication/Page_Welcome to Persivia/span_frquency'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/span_frquency - Copy'), GlobalVariable.timeout)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/span_frquency - Copy'))

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_Cutaneous'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy'), GlobalVariable.timeout)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy'))

WebUI.setText(findTestObject('medication/Page_Welcome to Persivia/a_31 - Copy'), '12102020')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/li_yet, another'))

WebUI.waitForElementClickable(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy - Copy'), GlobalVariable.timeout)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy - Copy'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_ca4c29'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_e_sent'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_f7096f'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Decrease value_cmtake_comments'), 
    'As per the doctor recomend')

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/button_Save All'))

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/div_successchanges saved successfully.Hide'))

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/div_successchanges saved successfully.Hide'), 
    'successChanges saved successfully.Hide')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_source'), 'MMSL')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_name'), 'Humulin R U-500 KwikPen 500unit/ml Solution for Injection::100034')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_frequency'), '3 times a day')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_route'), 'Auricular (otic)')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_startdate'), '12/10/2020')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_prescribedby'), 'Mason Elijah')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_spoea'), 'Yes')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_esent'), 'Yes')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_drug'), 'Yes')

WebUI.verifyElementText(findTestObject('medication/Page_Welcome to Persivia/td_direction'), 'As per the doctor recomend')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

