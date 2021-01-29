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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Welcome to_userpwd'), 
    'em0u++r5ZmBhKcW47ry+fQ==')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_Patients'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_Shelly, Shelly'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_Clinical'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_Procedure Order'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/button_Add'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/li_Latif, Zohaib (Care Manager)'))

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Date_orderDate'), '01/28/2021 14:14')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/li_HPC'))

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_select_form-control lab-observations k-input'), 
    'a')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/li_Outside state ambulance servA0021'))

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Effective Date_effectiveDate0'), 
    '01//122020  14:14')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/div_Diagnosis_k-multiselect-wrap k-floatwrap'))

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'))

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Body Site_bodySite0'), 'a')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/li_Abnormal hematopoietic cell (cell)'))

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/input_Body Site_bodySite0'), 'Abnormal hematopoietic cell (cell)')

WebUI.setText(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/textarea_Comments_comments'), 'Procedure Order')

WebUI.click(findTestObject('Object Repository/Procedure_Order/Page_Welcome to Persivia/button_Save'))

