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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/input_Welcome to_username'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'Soliton@2334')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Sign in'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('NavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

WebUI.doubleClick(findTestObject('ProblemLst - Copy/Page_Welcome to Persivia/button_Add'))

WebUI.delay(1)

WebUI.setText(findTestObject('ProblemLst/Page_Welcome to Persivia/input_select_code'), 'Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0')

WebUI.delay(2)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Cholera due to Vibrio cholerae 01, biova_93f076'))

WebUI.setText(findTestObject('ProblemLst - Copy/Page_Welcome to Persivia/a_15'), '01132021')

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select'))

WebUI.delay(1)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Mild to moderate'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy'))

WebUI.delay(1)

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

WebUI.delay(1)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Principal'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Save All'))

WebUI.delay(2)

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide'), 'successRecord updated successfully.Hide')

