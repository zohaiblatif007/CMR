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

'All the test case Navigate to PWB'
WebUI.callTestCase(findTestCase('NavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/input_select_code'), GlobalVariable.timeout)

WebUI.setText(findTestObject('ProblemLst/Page_Welcome to Persivia/input_select_code'), 'cho')

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Cholera due to Vibrio cholerae 01, biova_93f076'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Cholera due to Vibrio cholerae 01, biova_93f076'))

WebUI.setText(findTestObject('ProblemLst/Page_Welcome to Persivia/a_15'), '01072021')

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Mild to moderate'), GlobalVariable.timeout)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Mild to moderate'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Finding of functional performance and activity'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Finding of functional performance and activity'))

//WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy - Copy'))
//
//WebUI.delay(2)
//
//
//WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Inactive'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Inactive'))
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy - Copy - Copy'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Principal'), GlobalVariable.timeout)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Principal'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Save All'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_Cholera, unspecifiedA00.9 - Copy'), 'Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_date'), '01/07/2021')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_Moderate'), 'Moderate')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_type'), 'Finding of functional performance and activity')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_status'), 'Active')

WebUI.verifyElementText(findTestObject('ProblemLst/Page_Welcome to Persivia/td_rank'), 'Principal')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

