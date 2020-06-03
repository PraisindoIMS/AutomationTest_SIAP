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

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_Login Page/input_User ID_UserID'), 
    'laras1')

WebUI.setEncryptedText(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_Login Page/input_Password_Password'), 
    '1eYZqUn0ugE=')

WebUI.sendKeys(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_Login Page/input_Password_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/span_SIAP'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/span_Fixed Income'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/span_Fixed Income Sell'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1Img (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_TEST (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb (2)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_FIFI'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_FIFI'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cbx_TInv_96bafe'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_TRADING'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cbx_TSel_16a0b6'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_AVG (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img__ContentPlaceHolder1_PanelMain_cboCPart_7d4b4b'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_ABN AMRO (1)'))

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 
    'FI')

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/input_Face Value_ctl00ContentPlaceHolder1Pa_00da12 (1)'), 
    '10000000')

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'), 
    '99.87')

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img_Deal Date_ContentPlaceHolder1_PanelMain_8e092f (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_2 (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/img_Tax_ContentPlaceHolder1_PanelMain_Panel_42382f (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/td_15 (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/div_Save (1)'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/input_Deal has been saved Deal No  FI87_ctl_100375'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Fixed Income/Page_IMS/button_Logout'))

WebUI.closeBrowser()

