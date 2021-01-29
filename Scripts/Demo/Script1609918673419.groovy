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

WebUI.setEncryptedText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Welcome to_userpwd'), 
    'em0u++r5ZmDZgjWgSgoa/Q==')

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

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Add'))

WebUI.delay(1)

WebUI.setText(findTestObject('ProblemLst/Page_Welcome to Persivia/input_select_code'), 'Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0')

WebUI.delay(1)

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Cholera due to Vibrio cholerae 01, biova_93f076'))

WebUI.setText(findTestObject('ProblemLst/Page_Welcome to Persivia/a_15'), '11112020')

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Mild to moderate'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Finding of functional performance and activity'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy - Copy'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Inactive'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/span_select - Copy - Copy - Copy'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/li_Principal'))

WebUI.click(findTestObject('ProblemLst/Page_Welcome to Persivia/button_Save All'))

WebUI.delay(13)

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/span_Medications'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/source_select'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/li_MMSL'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_cmtake_code'), 'Humulin R U-500 KwikPen 500unit/ml Solution for Injection::100034')

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_cmtake_frequency'), '7')

WebUI.delay(1)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/span_frquency'))

WebUI.delay(1)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/span_frquency - Copy'))

WebUI.delay(1)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_Cutaneous'))

WebUI.delay(1)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy'))

WebUI.setText(findTestObject('medication/Page_Welcome to Persivia/a_31 - Copy'), '12102020')

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/li_yet, another'))

WebUI.delay(1)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/li_MMSL - Copy - Copy'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_ca4c29'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_e_sent'))

WebUI.click(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_select_pwb_550753_clinical_medication_f7096f'))

WebUI.setText(findTestObject('Object Repository/medication/Page_Welcome to Persivia/input_Decrease value_cmtake_comments'), 
    'As per the doctor recomend')

WebUI.delay(2)

WebUI.click(findTestObject('medication/Page_Welcome to Persivia/button_Save All'))

WebUI.delay(13)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_Lab Results'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_Add Panel'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_select'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_LipidPanel'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_OK'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_Add Analyte'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_Add Analyte_code'), 'a')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Osteoarthritis composite0005F'))

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/a_4'))

WebUI.setText(findTestObject('LabResults/Page_Welcome to Persivia/a_4'), '01012021')

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_time'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_003000'))

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_result'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_CD LOINC'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_select_sourceValue'), 'a')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Amdinocillin Islt KB1-Sep'))

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_flag'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_Abnormal alert'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/input_select_range'), '1')

WebUI.delay(1)

WebUI.click(findTestObject('LabResults/Page_Welcome to Persivia/span_status'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/li_aborted'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/span_select_fa fa-file like-btn view-notes'))

WebUI.setText(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/textarea_Cancel_lab-notes txtstuff'), 
    'This is not valid')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/LabResults/Page_Welcome to Persivia/button_Save All'))

WebUI.delay(13)

WebUI.click(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/span_Vital Signs'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/a_23date'))

WebUI.delay(2)

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/a_23date'), '01012021')

WebUI.delay(2)

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/span_select'))

WebUI.delay(2)

WebUI.click(findTestObject('VitalSign/Page_Welcome to Persivia/a_23time'))

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_select_temperature'), '98')

WebUI.setText(findTestObject('VitalSign/Page_Welcome to Persivia/input_select_pulse'), '6')

WebUI.delay(1)

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

WebUI.setText(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/input_Decrease value_bloodSugar'), '400')

WebUI.click(findTestObject('Object Repository/VitalSign/Page_Welcome to Persivia/button_Save All'))

WebUI.delay(13)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_Allergies'))

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_select'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Allergy to substance'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_select - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/li_Snomed'))

WebUI.delay(2)

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/input_select_code'))

WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_code'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Allergy to salicylate (finding)293585002'))

WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_Allergy is required_reactionCode'), 
    'a')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Edema of lower extremity (finding)102572006'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_Severity'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Moderate'))

WebUI.click(findTestObject('Alergies/Page_Welcome to Persivia/span_status'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/li_Inactive'))

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/a_4'))

WebUI.setText(findTestObject('Alergies/Page_Welcome to Persivia/a_4'), '01042021')

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/a_23'))

WebUI.setText(findTestObject('Alergies/Page_Welcome to Persivia/a_23'), '01232021')

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_textNote'))

WebUI.setText(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/input_select_textNote'), 'For a long time suffering')

WebUI.click(findTestObject('Object Repository/Alergies/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.delay(13)

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_Family History'))

WebUI.delay(5)

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/button_Add'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_select'))

WebUI.delay(1)

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_ICD-9'))

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_code'), 'a')

WebUI.delay(2)

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/li_Spirometry reversibility negative (finding) 314980001'))

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/span_select - Copy'))

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/li_Foster child'))

WebUI.click(findTestObject('FamilyHistry/Page_Welcome to Persivia/span_select - Copy - Copy'))

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/li_Male'))

WebUI.setText(findTestObject('FamilyHistry/Page_Welcome to Persivia/a_12'), '01012021')

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/a_22'), '01122021')

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_negation'))

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_deceased'))

WebUI.setText(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/input_select_textNote'), 'No disease found in family')

WebUI.click(findTestObject('Object Repository/FamilyHistry/Page_Welcome to Persivia/span_Update_k-icon k-update'))

WebUI.delay(5)

WebUI.click(findTestObject('LogOut/Page_Welcome to Persivia/span_Latif, Zohaib_fa fa-caret-down'))

WebUI.delay(2)

WebUI.click(findTestObject('LogOut/Page_Welcome to Persivia/button_Sign Out'))

WebUI.delay(3)

WebUI.closeBrowser()

