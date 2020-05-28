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

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption_Fixx/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption_Fixx/span_SIAP'))

WebUI.click(findTestObject('MF Redemption_Fixx/span_Transaction'))

WebUI.doubleClick(findTestObject('MF Redemption_Fixx/span_Transaction'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption/span_Entry Transaction'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption_Fix (1)/span_Mutual Fund'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption_Fix (1)/span_Mutual Fund'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption_Fix (2)/span_Redemption'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Product_ContentPlaceHolder1_pnlAll_cmbPFolio_B-1'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_DPJASINDO'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Instrument_ContentPlaceHolder1_pnlAll_cm_07e3c8'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_SDKM'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Sell Method_ContentPlaceHolder1_pnlAll_c_160d04'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_AVG'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Counter Party_ContentPlaceHolder1_pnlAll_14a27d'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_BCA'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_NAV Date_ContentPlaceHolder1_pnlAll_dtNA_ba2316'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_26'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Book Date_ContentPlaceHolder1_pnlAll_dtB_462099'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_27'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_Settle Date_ContentPlaceHolder1_pnlAll_d_d388b6'))

WebUI.click(findTestObject('MF Redemption_Fixx/td_29'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption (5)/input_NAVUnit_ctl00ContentPlaceHolder1pnlAl_fa4d3f'), '2124.54')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption (4)/input_Loading_ctl00ContentPlaceHolder1pnlAl_592ae0'), '1000')

WebUI.setText(findTestObject('MF Redemption_Fixx/textarea_Remarks_ctl00ContentPlaceHolder1pn_7a439a'), 'test')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption (2)/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF Redemption (3)/input_Deal has been saved Deal No  MF25_ctl_d23e48'))

WebUI.closeBrowser()

