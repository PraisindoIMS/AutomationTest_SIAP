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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/span_Bank'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Code_ctl00ContentPlaceHolder1gridBank_f0951d'), 'BRI01')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Full Name_ctl00ContentPlaceHolder1gri_1104ac'), 'BANK RAKYAT INDONESIA')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/span_Is Active_ContentPlaceHolder1_gridBank_03df7d'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Contact Person_ctl00ContentPlaceHolde_819b7d'), 'IBU SELLY')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Short Name_ctl00ContentPlaceHolder1gr_76a6ce'), 'BANK BRI')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Address_ctl00ContentPlaceHolder1gridB_ae54e1'), 'JALAN SUDIRMAN NO 15')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_COA_ContentPlaceHolder1_gridBank_DXEditor7_B-1'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_COA_ctl00ContentPlaceHolder1gridBankD_07e1f5'), '121.0305')

WebUI.sendKeys(findTestObject('SIAP_REFERENCE/Add Bank/input_COA_ctl00ContentPlaceHolder1gridBankD_07e1f5'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Telephone_ctl00ContentPlaceHolder1gri_1c9fcb'), '021.8090802')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/img_BNI_dxGridView_gvDetailCollapsedButton_Glass'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/Add Detail Bank'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Account Number_ctl00ContentPlaceHolde_efb4cf'), '0989079708070')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Address_ctl00ContentPlaceHolder1gridB_fd246b'), 'JALAN SUDIRMAN NO 15')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_CodeName1000000Assets1000001TES1100000Po_3966c3'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Address_ctl00ContentPlaceHolder1gridB_fd246b'), 'JALAN SUDIRMAN NO 15')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_COA_ctl00ContentPlaceHolder1gridBankd_9fdd7a'), '121.0305')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/span_Is Active_ContentPlaceHolder1_gridBank_f9cc65'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/span_Is CParty_ContentPlaceHolder1_gridBank_2b357f'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Bank/input_Account Name_ctl00ContentPlaceHolder1_a57362'), 'BANK BRI')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_Account Type_ContentPlaceHolder1_gridBan_5f6801'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_Operation'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_Currency_ContentPlaceHolder1_gridBank_dx_5da7c0'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/td_IDR'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Bank/Save Detail Instrument Group'))

