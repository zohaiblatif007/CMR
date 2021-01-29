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

def now = new Date().format('MM/dd/yyyy')

System.out.println(now)

Date today = new Date()

String todaysDate = today.format('MM/dd/yy')

String nowTime = today.format('hh:mm:ss a')

println(todaysDate)

println(nowTime)

temp = (now + ' 01:30:00 AM')
// 2 line text in one variable(Concatenate strings on 2 different lines)
def yourText = 'Lipid Panel: 01/28/2021 ' +nowTime +' (STAT)' +'\nCholera due to Vibrio cholerae 01, biovar cholerae'

//GlobalVariable.timeout=1
println(temp)

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/input_Welcome to_username'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_username'), 'zl@slt.com')

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'Soliton@2334')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Sign in'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/span_CMR_k-icon k-i-arrow-s'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_Patients'))

//WebUI.waitForElementPresent(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/button_Patient'), 30)
//
//WebUI.waitForElementVisible(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/button_Patient'), 20)
//WebUI.waitForElementHasAttribute(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/button_Patient'), 'Disable', 20)
WebUI.waitForElementClickable(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/button_Patient'), GlobalVariable.timeout)

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Patient'))

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_First Name_firstName'), 
    'Ali')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Last Name_lastName'), 
    'Zaib')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Birth Name_birthName'), 
    'zabi')

WebUI.waitForElementClickable(findTestObject('CompletePatientAdd/Page_Welcome to Persivia/span_select'), 5)

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Male'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Birth Place_form-control'), 
    'Lahore')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Birth Place_form-control state k-input'), 
    'Punjab')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Birth Place_form-control country k-input'), 
    'Pakistan')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_DOB_birthDate'))

WebUI.doubleClick(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_BPCI Outreach Documentation_k-icon k-i_1cd41c'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Save'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/a_22'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Done'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Interlocutory'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/ul_AbkhazianAchineseAcoliAdangmeAdyghe Adyg_9caed7'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Done'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Done'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Done'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_MHPN'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Asian'))

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Religion_form-control religion k-inpu_0b7f12'), 
    'Islam')

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Sunni (Islam)'))

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Religion_form-control religion k-inpu_0b7f12'), 
    'Sunni (Islam)')

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Not Hispanic or Latino'))

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Address_form-control k-valid'), 
    'Lahore Pakistan')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Address_form-control k-valid_1'), 
    'Gali')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Birth Place_form-control state k-input'), 
    'Muhallah')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Address_form-control zip k-input k-valid'), 
    '342')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Home_phoneHome'), '89067549')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Work_phoneWork'), '890135')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Mobile_phoneMobile'), 
    '907543')

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/li_Work'))

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/input_Email_email'), 'fyfyf@ugugugugugu.hhg')

WebUI.setText(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/textarea_Comments_comments'), 
    'yufugugu tfugihihih tfyfyfuy yuffy.')

WebUI.click(findTestObject('Object Repository/CompletePatientAdd/Page_Welcome to Persivia/button_Save'))

