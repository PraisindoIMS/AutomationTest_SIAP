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

WebUI.doubleClick(findTestObject('FI Sell/span_SIAP'))

WebUI.doubleClick(findTestObject('FI Sell/span_Transaction'))

WebUI.doubleClick(findTestObject('FI Sell/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('FI Sell/span_Fixed Income'))

WebUI.click(findTestObject('FI Sell/span_Fixed Income Sell'))

WebUI.click(findTestObject('FI Sell/img__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1Img'))

WebUI.click(findTestObject('FI Sell/td_TEST'))

WebUI.click(findTestObject('FI Sell/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb'))

WebUI.click(findTestObject('FI Sell/td_FIFI'))

WebUI.click(findTestObject('FI Sell/td__ContentPlaceHolder1_PanelMain_cbx_TInvC_2dfd7a'))

WebUI.click(findTestObject('FI Sell/td_TRADING'))

WebUI.click(findTestObject('FI Sell/td__ContentPlaceHolder1_PanelMain_cbx_TSell_d7cb02'))

WebUI.click(findTestObject('FI Sell/td_AVG'))

WebUI.click(findTestObject('FI Sell/td__ContentPlaceHolder1_PanelMain_cboCParty_B-1'))

WebUI.click(findTestObject('FI Sell/td_ABN AMRO'))

WebUI.setText(findTestObject('FI Sell/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 'fisell')

WebUI.setText(findTestObject('FI Sell/input_Face Value_ctl00ContentPlaceHolder1Pa_00da12'), '1000000000')

WebUI.setText(findTestObject('FI Sell/input_Deal Price_ctl00ContentPlaceHolder1PanelMainPanelDetailnudDealPrice'), 
    '101.4')

WebUI.click(findTestObject('FI Sell/img_Deal Date_ContentPlaceHolder1_PanelMain_8e092f'))

WebUI.click(findTestObject('FI Sell/td_26 (1)'))

WebUI.click(findTestObject('FI Sell/img_Tax_ContentPlaceHolder1_PanelMain_Panel_42382f'))

WebUI.click(findTestObject('FI Sell/td_15 (1)'))

WebUI.click(findTestObject('FI Sell/div_Save (1)'))

