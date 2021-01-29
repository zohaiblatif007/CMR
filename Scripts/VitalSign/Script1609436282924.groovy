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


//GlobalVariable.timeout=1
println(temp)

WebUI.callTestCase(findTestCase('NavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('VitalSign/Page_Welcome to Persivia/span_Vital Signs'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/span_Vital Signs'))

WebUI.waitForElementClickable(findTestObject('VitalSign/Page_Welcome to Persivia/button_Add'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/button_Add'))

WebUI.waitForElementClickable(findTestObject('VitalSign/Page_Welcome to Persivia/a_23date'), GlobalVariable.timeout)

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/a_23date'))

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/a_23date'), '01012021')

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/span_select'))

WebUI.waitForElementClickable(findTestObject('VitalSign/Page_Welcome to Persivia/a_23time'), GlobalVariable.timeout)

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/a_23time'))

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_select_temperature'), '98')

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/input_select_pulse'), '6')

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/input_Respiratory'), '30')

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/input_Decrease value_systolic'), '60')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_diastolic'), '77')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_weight'), '88')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_height'), '7')

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/input_Decrease value_BMI'), '0.5')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_BSA'), '6')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_o2Saturation'), 
    '78')

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_inhaledOxygenConcentration'), 
    '56')

//WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_bloodSugar'), '30')
//
//WebUI.delay(2)
WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/button_Save All'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

WebUI.waitForElementNotPresent(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

def now = new Date().format('MM/dd/yyyy')

temp = (now + ' 01:30:00 AM')


WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_ODate'), temp)

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_temp'), '98')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_pulse'), '6')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_RRate'), '30')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_blodPre'), '60/77')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_weight'), '88')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_height'), '7')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_BMI'), '0.5')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_BSA'), '6')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_wO2sat'), '78')

WebUI.verifyElementText(findTestObject('VitalSign/Page_Welcome to Persivia/td_inhaledO2'), '56')

