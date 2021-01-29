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

WebUI.maximizeWindow()

'Mose over on the CMR'
WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/input_Welcome to_username'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'Soliton@2334')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Sign in'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('NavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/span_Lab Orders'))

Date today = new Date()

String nowTime = today.format('HH:mm')

String nowDate = today.format('MM/dd/yyyy')

def yourText = (((('Lipid Panel: ' + nowDate) + ' ') + nowTime) + ' (STAT)') + '\nCholera due to Vibrio cholerae 01, biovar cholerae'



WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/button_Add'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/li_Quest Diagnostics'))

WebUI.setText(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/input_Date_labDate'), '01/28/2021 13:57')

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/button_Add Panel'))

//WebUI.setText(findTestObject('Lab_Order/Page_Welcome to Persivia/input_Date_lipdDate - Copy'), '01/28/2021 13:57')
WebUI.click(findTestObject('Lab_Order/Page_Welcome to Persivia/span_select - Copy'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/li_LipidPanel'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/button_OK'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/input'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/div_Diagnosis_k-multiselect-wrap k-floatwrap'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/div_Specimen_collapse-symbl0 glyphicon glyp_2ca356'))

WebUI.setText(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/input_Collection Date_specimenDate0'), 
    '01/28/2021 13:57')

WebUI.click(findTestObject('Lab_Order/Page_Welcome to Persivia/span_select - Copy - Copy'))

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/li_Serum'))

WebUI.setText(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/input_Specimen No._specimenNo0'), '10')

WebUI.setText(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/input_Notes_specimenNotes0'), 'lab order')

WebUI.click(findTestObject('Object Repository/Lab_Order/Page_Welcome to Persivia/button_Save'))

WebUI.click(findTestObject('Lab_Order/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Lab_Order/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successLab Order Saved SuccessfullyHide')

WebUI.verifyElementText(findTestObject('Lab_Order/Page_Welcome to Persivia/td_labortry'), 'Quest Diagnostics')

WebUI.verifyElementText(findTestObject('Lab_Order/Page_Welcome to Persivia/td_labtest'), yourText)

