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

'Click the button on family history'
WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_Family History'))

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

'Click on add button '
WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/span_select'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_ICD-9'), GlobalVariable.timeout)

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_ICD-9'))

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_code'), 'a')

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_Spirometry reversibility negative (finding) 314980001'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_Spirometry reversibility negative (finding) 314980001'))

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/span_select - Copy'))

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_Foster child'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/li_Foster child'))

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/span_select - Copy - Copy'))

WebUI.waitForElementClickable(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_Male'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/li_Male'))

WebUI.setText(findTestObject('FamilyHistry/Page_Welcome to Persivia/a_12'), '01012021')

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/a_22'), '01122021')

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_negation'))

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_deceased'))

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_textNote'), 'No disease found in family')

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_source'), 'ICD9CM')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_code'), 'THER ULT HEAD & NECK VES::00.01')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_relation'), 'Foster child')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_gender'), 'Male')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_startdate'), '01/01/2021')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_endate'), '01/12/2021')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_negation'), 'Yes')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_deceased'), 'Yes')

WebUI.verifyElementText(findTestObject('FamilyHistry/Page_Welcome to Persivia/td_comment'), 'No disease found in family')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

