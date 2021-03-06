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

WebUI.navigateToUrl('http://111.67.78.152/Custody/SSO/LoginPages/3/Login.html')

WebUI.setText(findTestObject('Page_Login Page/input_User ID_UserID'), 'laras1')

WebUI.setEncryptedText(findTestObject('Page_Login Page/input_Password_Password'), '1eYZqUn0ugE=')

WebUI.sendKeys(findTestObject('Page_Login Page/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/span_Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/span_Mutual Fund'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/span_Dividend Cash'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_Product_ContentPlaceHolder1_pnlAll_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_Instrument_ContentPlaceHolder1_pnlAll_cm_07e3c8'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_SDKM'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_Counter Party_ContentPlaceHolder1_pnlAll_14a27d'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_BCA'))

WebUI.click(findTestObject('MF Red/button nav date'))

WebUI.click(findTestObject('MF Red/td_26_nav date'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_Deal Date_ContentPlaceHolder1_pnlAll_cpD_84f070'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_25'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_Settle Date_ContentPlaceHolder1_pnlAll_d_49cfe4'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/td_27'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/input_Total Cost_ctl00ContentPlaceHolder1pn_d1eab6'), 
    '2320.53')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/textarea_Remarks_ctl00ContentPlaceHolder1pn_7a439a'), 
    'test dividend katalon')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Dividend/input_Deal has been saved Deal No  MF9_ctl0_df854d'))

WebUI.closeBrowser()

