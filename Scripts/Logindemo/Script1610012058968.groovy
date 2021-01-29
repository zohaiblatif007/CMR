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

WebUI.setText(findTestObject('OR_Login/textfield_username'), 'zl@slt.com')

WebUI.setText(findTestObject('OR_Login/textfield_password'), 'Soliton@2020!')

WebUI.click(findTestObject('OR_Login/button_Sign in'))

WebUI.delay(2)

'Mose over on CMR'
WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'))

WebUI.delay(2)

'Click on Care Coordination'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Care Coordination'))

WebUI.delay(10)

'Click on a Patient'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Paulazo201, Atom201'))

WebUI.delay(16)

'Click on Clinical tab'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Clinical'))

WebUI.delay(10)

