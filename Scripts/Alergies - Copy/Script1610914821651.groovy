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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/input_Welcome to_username'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'Soliton@2334')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Sign in'))

WebUI.delay(2)

WebUI.delay(2)

'Mose over on CMR'
WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'))

WebUI.delay(2)

'Click on Care Coordination'
WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Patients'))

WebUI.delay(10)

String xpathh = "((//div[@class='k-grid-content k-auto-scrollable'])[2]//span[@class='link open-pwb single-line-text'])[5]"
TestObject to = new TestObject(xpathh)
//to.setSelectorValue(SelectorMethod.BASIC, xpath)(SelectorMethod.XPATH, "//div[@id='patient-grid']/div[3]/table/tbody/tr[4]/td[2]/span")
WebUI.click(to)
List<WebElement> listElement = WebUI.findWebElements(findTestObject('Object Repository/medication - Copy/Page_Welcome to Persivia/span_Paulazo201, Atom201'),2)

WebUI.click(listElement)
'Click on a Patient'
//WebUI.click(find('ProblemLst/Page_Welcome to Persivia/span_Moldova, Moldova'))


//
//WebUI.delay(16)
//
//'Click on Clinical tab'
//WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Clinical'))
//
//WebUI.delay(10)
//
//'Click on Allergies tab'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_Allergies'))
//
//WebUI.delay(4)
//
//'Click on Add button'
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/button_Add'))
//
//WebUI.delay(2)
//
//'Click on Allergy type'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_select'))
//
//WebUI.delay(2)
//
//'select  Alergy type'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Allergy to substance'))
//
//'Click on Source'
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_select - Copy'))
//
//WebUI.delay(1)
//
//'Select Source'
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/li_Snomed'))
//
//WebUI.delay(2)
//
//'Click on Allergy field'
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/input_select_code'))
//
//'Select Allergy'
//WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_code'), 'a')
//
//WebUI.delay(2)
//
//'Click on Reactions'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Allergy to salicylate (finding)293585002'))
//
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_Allergy is required_reactionCode'), 
//    'a')
//
//WebUI.delay(1)
//
//'Select Reactions'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Edema of lower extremity (finding)102572006'))
//
//'Click on Severity'
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_Severity'))
//
//WebUI.delay(1)
//
//'Select Severity'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Moderate'))
//
//WebUI.delay(1)
//
////'Click on status'
////WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_status'))
////
////WebUI.delay(1)
////
////'Select Status'
////WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Inactive'))
//'Click on Sart date'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/a_4'))
//
//'Set Start Date'
//WebUI.setText(findTestObject('Alergies/Page_Welcome to Persivia/a_4'), '01042021')
//
//WebUI.delay(1)
//
//'Click on End Date'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/a_23'))
//
//'Set End Date'
//WebUI.setText(findTestObject('Alergies/Page_Welcome to Persivia/a_23'), '01232021')
//
//'Click on Comments field'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_textNote'))
//
//'Enter comments'
//WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_textNote'), 'For a long time suffering')
//
//'Click on Update icon'
//WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_Update_k-icon k-update'))
//
////
//////WebUI.sw
////WebUI.delay(1)
////
//WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'))
//
//WebUI.verifyElementText(findTestObject('Alergies/Page_Welcome to Persivia/div_successRecord saved successfully.Hide - Copy'), 
//    'successRecord saved successfully.Hide')

