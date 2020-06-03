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

WebUI.click(findTestObject('FI IPO/span_Fixed Income IPO'))

WebUI.click(findTestObject('FI IPO/img__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1Img'))

WebUI.click(findTestObject('FI IPO/td_DPJASINDO (1)'))

WebUI.click(findTestObject('FI IPO/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb'))

WebUI.click(findTestObject('FI IPO/td_AFIIPO'))

WebUI.click(findTestObject('FI IPO/img__ContentPlaceHolder1_PanelMain_cbx_TInv_96bafe'))

WebUI.click(findTestObject('FI IPO/td_TRADING (1)'))

WebUI.click(findTestObject('FI IPO/img__ContentPlaceHolder1_PanelMain_cboCPart_7d4b4b'))

WebUI.click(findTestObject('FI IPO/td_ABN AMRO'))

WebUI.setText(findTestObject('FI IPO/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 'fiipo')

WebUI.setText(findTestObject('FI IPO/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2 (1)'), '100')

WebUI.click(findTestObject('FI IPO/td_Deal Date_ContentPlaceHolder1_PanelMain__42d557'))

WebUI.click(findTestObject('FI IPO/td_28'))

WebUI.click(findTestObject('FI IPO/img_Tax Counter Party_ContentPlaceHolder1_P_42b294 (1)'))

WebUI.click(findTestObject('FI IPO/td_15 (1)'))

WebUI.click(findTestObject('FI IPO/img (1)'))

WebUI.setText(findTestObject('FI IPO/input__ctl00ContentPlaceHolder1PanelMainPan_72cdaf'), '5000000000')

WebUI.click(findTestObject('FI IPO/img__dxgvCommandColumnItem_Glass dxgv__cci (1)'))

WebUI.click(findTestObject('FI IPO/div_Save'))

WebUI.click(findTestObject('FI IPO/input_Deal has been saved Deal No  FI76_ctl_c83333'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI Sell/button_Logout (1)'))

WebUI.closeBrowser()

