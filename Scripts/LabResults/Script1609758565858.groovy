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

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_Lab Results'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_Add Panel'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_LipidPanel'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_OK'))

//WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/td_redate'))
//
//WebUI.delay(1)
//WebUI.setText(findTestObject('LabResults/Page_Welcome to Persivia/span_select - Copy'), '01/25/2021 12:00:00')
//
//WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_Save All'))
//
//WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_Add Analyte'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_Add Analyte_code'), 'a')

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/li_Osteoarthritis composite0005F'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Osteoarthritis composite0005F'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/a_4'))

WebUI.setText(findTestObject('LabResults/Page_Welcome to Persivia/a_4'), '01012021')

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_time'))

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/li_003000'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_003000'))

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_result'))

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/li_CD LOINC'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_CD LOINC'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_select_sourceValue'), 'a')

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/li_Amdinocillin Islt KB1-Sep'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Amdinocillin Islt KB1-Sep'))

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_flag'))

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/li_Abnormal alert'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Abnormal alert'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_select_range'), '10')

WebUI.waitForElementClickable(findTestObject('LabResults/Page_Welcome to Persivia/span_select_fa fa-file like-btn view-notes'), 
    GlobalVariable.timeout)

//WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_status'))
//
//WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_aborted'))
//
//WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_select_fa fa-file like-btn view-notes'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/textarea_Cancel_lab-notes txtstuff'), 
    'This is not valid')

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_Save All'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

def now = new Date().format('MM/dd/yyyy')

temp = (now + ' 01:30:00')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_panel'), 'Lipid Panel')

//WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_redate'), '01/25/2021 12:00:00')
WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_ptext1'), 'Cholesterol, serum or whole blood, total::82465')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_ptext2'), 'Lipoprotein, direct measurement, high density cholesterol (HDL cholesterol)::83718')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_ptext3'), 'Triglycerides::84478')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_ptext4'), 'Osteoarthritis composite::0005F::Osteoarthritis composite::0005F')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_redate2'), temp)

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_result'), 'CD [LOINC]')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_value'), 'Amdinocillin Islt KB::1-Sep')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_flag'), 'AA - Abnormal alert')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_range'), '10')

WebUI.verifyElementText(findTestObject('LabResults/Page_Welcome to Persivia/td_status'), 'Completed')

