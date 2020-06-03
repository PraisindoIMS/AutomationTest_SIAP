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

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/span_Redemption'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Product_ContentPlaceHolder1_pnlAll_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Instrument_ContentPlaceHolder1_pnlAll_cm_07e3c8'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_SDKM'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Sell Method_ContentPlaceHolder1_pnlAll_c_160d04'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_AVG'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Counter Party_ContentPlaceHolder1_pnlAll_14a27d'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_BCA'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/button nav date'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_26_nav date'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Book Date_ContentPlaceHolder1_pnlAll_dtB_462099'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_27'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_Settle Date_ContentPlaceHolder1_pnlAll_d_d388b6'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/td_29'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/input_NAVUnit_ctl00ContentPlaceHolder1pnlAl_fa4d3f'), 
    '1200')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/input_Loading_ctl00ContentPlaceHolder1pnlAl_592ae0'), 
    '1000')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/textarea_Remarks_ctl00ContentPlaceHolder1pn_7a439a'), 
    'test lagi')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/input_Deal has been saved Deal No  MF28_ctl_07e11e'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Red/button_Logout'))

WebUI.closeBrowser()

