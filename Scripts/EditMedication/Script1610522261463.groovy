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

//import static blah.blah.*
import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')


//WebUI.maximizeWindow()

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')
WebUI.delay(5)

String xpath = "//input[@id='username']"


TestObject to = new TestObject('Paulazo201')


//TestObject to=findTestObject('Object Repository/medication - Copy/Page_Welcome to Persivia/input_Welcome to_username')//

//to.findProperty('xpath').sefindTestObject('Object Repository/medication - Copy/Page_Welcome to Persivia/span_Paulazo201, Atom201')tValue(//input[@id='username')
//Map allSelectors = to.getSelectorCollection()
to.setSelectorValue(SelectorMethod.XPATH, "//input[@id='username'")
//towa=makeTO(xpath)

List<WebElement> listElement = WebUI.findWebElements(findTestObject("listItem"),2)
WebUI.click(to)
//WebUI.closeBrowser()
//TestObject towa=makeTO(xpath)
//TestObject towa = new TestObject()
//towa.addProperty("xpath", ConditionType.EQUALS, xpath)
//WebUI.click(towa)

//WebUI.setText('zl@slt.com')




//WebUI.click(findTestObject('medication/Page_Welcome to Persivia/input_Welcome to_username'))
//
//WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')
//
//WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'Soliton@2334')
//
//WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Sign in'))
//
//WebUI.delay(2)
//
//'Mose over on CMR'
//WebUI.mouseOver(findTestObject('ProblemLst/Page_Welcome to Persivia/a_CMR'))
//
//WebUI.delay(2)
//
//'Click on Care Coordination'
//WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_Patients'))
//
////Random rand = new Random();
////int randomNum = rand.nextInt(10 - 2)+2;
//////for(int i =0; i < 20; i++)
//////{
//////	int randomNu = rand.nextInt(10 - 2)+2;
//////System.out.println('No. Denerated  is='+randomNu)
//////
//////}
////
////WebUI.delay(10)
////
////
//////String xpath = '//div[@id="' + dynamicId + '"]'
////
////	String xpath = '((//div[@class='k-grid-content k-auto-scrollable'])[2]//span[@class='link open-pwb single-line-text'])[3]'
////	
////	TestObject towa=makeTO(sXPath)
//////TestObject towa = new TestObject()
//////towa.addProperty("xpath", ConditionType.EQUALS, xpath)
////WebUI.click(towa)
