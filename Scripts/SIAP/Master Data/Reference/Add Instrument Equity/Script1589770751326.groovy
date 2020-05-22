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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/span_Instrument'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/span_Create New'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_Category_ContentPlaceHolder1_cmbCategory_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_Equity'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument Equity/input_Instrument Code_ctl00ContentPlaceHold_bde003'), 
    'BBBCA')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument Equity/input_ISIN Code_ctl00ContentPlaceHolder1txt_589cbb'), 
    '24125125')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument Equity/input_Short Name_ctl00ContentPlaceHolder1tx_c76f9c'), 
    'BANK BCA')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument Equity/input_Full Name_ctl00ContentPlaceHolder1txt_e1230e'), 
    'BANK BCA BARU')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img_Sector_ContentPlaceHolder1_cmbSector_B-1Img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_BANK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_Currency_dx'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_IDR'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img__ContentPlaceHolder1_dtListingDate_DDD__68fa11'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_Emiten_ContentPlaceHolder1_cmbEmiten_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_AALI'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_Sub Type_ContentPlaceHolder1_cpSubType_c_567e1e'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_OS'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img_Status_ContentPlaceHolder1_cmbStatus_B-1Img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img_Status_ContentPlaceHolder1_cmbStatus_B-1Img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img_Country_ContentPlaceHolder1_cmbCountry_B-1Img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_INA'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/img_Stock Exchange_ContentPlaceHolder1_cmbS_b43049'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/td_IDX'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/span_Save'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/Page_IMS/input_Are you sure want to save_ctl00UCMessageBox1btnPostOK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument Equity/Page_IMS/input_Instrument has been saved_ctl00UCMessageBox1btnOK'))

WebUI.delay(2)

