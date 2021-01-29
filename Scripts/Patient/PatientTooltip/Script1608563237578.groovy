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

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'em0u++r5ZmDZgjWgSgoa/Q==')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Persivia/button_Sign in'))

WebUI.mouseOver(findTestObject('subMenu/Page_Welcome to Persivia/span_CMR_k-icon k-i-arrow-s'))

WebUI.click(findTestObject('subMenu/Page_Welcome to Persivia/span_eRx'))

