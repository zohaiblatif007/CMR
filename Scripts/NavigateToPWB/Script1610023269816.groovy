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

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'), GlobalVariable.timeout)

'Mose over on CMR'
WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'))

'Click on Patient tab to go into Patient Grid'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Patients'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Patient'), GlobalVariable.timeout)

'Click on a Patient'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Moldova, Moldova'))

'Click on a Patient'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/barr'))

WebUI.waitForElementPresent(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Patient - Copy'), GlobalVariable.timeout)

'Click on Clinical tab'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Clinical'))

WebUI.waitForElementClickable(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

