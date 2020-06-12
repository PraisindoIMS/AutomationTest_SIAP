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

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Announcement RUP_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Upload Transaction_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/Span FI'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/span_Fixed Income Sell'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1Img'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_BJBR01CCN1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img__ContentPlaceHolder1_PanelMain_cbx_TInv_96bafe'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_TRADING'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img__ContentPlaceHolder1_PanelMain_cbx_TSel_16a0b6'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_AVG'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img__ContentPlaceHolder1_PanelMain_cboCPart_7d4b4b'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_ABN AMRO'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 
    'FI SELLL')

WebUI.focus(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/input_Face Value_ctl00ContentPlaceHolder1Pa_00da12'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'))

WebUI.clearText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'), 
    '100.7')

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img_Deal Date_ContentPlaceHolder1_PanelMain_8e092f'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_8'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/img_Tax_ContentPlaceHolder1_PanelMain_Panel_42382f'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/td_15'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/span_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/button_Logout'))

WebUI.closeBrowser()

