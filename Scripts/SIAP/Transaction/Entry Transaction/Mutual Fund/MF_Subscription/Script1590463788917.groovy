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

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/span_Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/span_Mutual Fund'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/div_Subscription'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_Product_ContentPlaceHolder1_pnlAll_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_BBMNFD'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_Instrument_ContentPlaceHolder1_pnlAll_cm_07e3c8'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_SDKM'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_Counter Party_ContentPlaceHolder1_pnlAll_14a27d'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_BCA'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_NAV Date_ContentPlaceHolder1_pnlAll_dtNA_ba2316'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_25'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_Settle Date_ContentPlaceHolder1_pnlAll_d_d388b6'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_27'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/input_NAVUnit_ctl00ContentPlaceHolder1pnlAl_fa4d3f'), '2124.75')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/input_Amount_ctl00ContentPlaceHolder1pnlAll_e83f15'), '25000000000')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/input_Fee ()_ctl00ContentPlaceHolder1pnlAll_d0596a'), '5')

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_Fee (NetGross)_ContentPlaceHolder1_pnlAl_27f7fa'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/td_NET'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/input_Deal has been saved Deal No  MF6_ctl0_e94db7'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Mutual Fund/MF_Subscription/button_Logout'))

WebUI.closeBrowser()

