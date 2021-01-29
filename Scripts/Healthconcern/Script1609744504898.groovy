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

WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'))

WebUI.delay(2)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Care Coordination'))

WebUI.delay(10)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Paulazo201, Atom201'))

WebUI.delay(16)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Clinical'))

WebUI.delay(10)

WebUI.click(findTestObject('MentalStatus/Page_Welcome to Persivia/span_Period_k-icon k-i-arrow-e'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/span_Health Concern'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Healthconcern/Page_Welcome to Persivia/span_Select_k-icon k-add-list'))

WebUI.delay(2)

WebUI.click(findTestObject('Healthconcern/Page_Welcome to Persivia/span_Select_k-icon k-add-list - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/td_Cholera due to Vibrio cholerae 01, biova_e44575'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/input_Principal_1609751418420'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/button_Proceed'))

WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/span_select'))
//
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/li_Aborted'))

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/a_7'))

WebUI.setText(findTestObject('Healthconcern/Page_Welcome to Persivia/a_7'), '01012021')

WebUI.click(findTestObject('Object Repository/Healthconcern/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))

WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
    'successRecord saved successfully.Hide')

