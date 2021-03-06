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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/span_Dividend Unit'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_Product_ContentPlaceHolder1_pnlAll_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_Instrument_ContentPlaceHolder1_pnlAll_cm_07e3c8'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_SDKM'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_Counter Party_ContentPlaceHolder1_pnlAll_14a27d'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_BCA'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/input_Instruction No_ctl00ContentPlaceHolde_197de0'), 
    'EQ12')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_Deal Date_ContentPlaceHolder1_pnlAll_cpD_84f070'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_25'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_Settle Date_ContentPlaceHolder1_pnlAll_d_49cfe4'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/td_27'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/input_Units_ctl00ContentPlaceHolder1pnlAlltxtUnits'), 
    '1000')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/textarea_Remarks_ctl00ContentPlaceHolder1pn_7a439a'), 
    'Testing Katalon')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend Unit/input_Deal has been saved Deal No  MF11_ctl_4850f0'))

WebUI.closeBrowser()

