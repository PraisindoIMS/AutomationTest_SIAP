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

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/span_Fixed Income Buy'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1Img'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_cboInstr_126ebb'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_BJBR01CCN1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_cbx_TInv_96bafe'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_TRADING'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_cboCPart_7d4b4b'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_ABN AMRO'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 
    'FI Buy')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'), 
    '98')

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img_Deal Date_ContentPlaceHolder1_PanelMain_8e092f'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img_Deal Date_ContentPlaceHolder1_PanelMain_50d4c1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_26'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img_Tax Counter Party_ContentPlaceHolder1_P_42b294'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_15'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/input__ctl00ContentPlaceHolder1PanelMainPan_72cdaf'), 
    '5000000000')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/input__ctl00ContentPlaceHolder1PanelMainPan_820913'), 
    '97')

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_PanelDet_1f572b'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img__ContentPlaceHolder1_PanelMain_PanelDet_4e75c9'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/td_4'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/img_Cancel_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/input_Deal has been saved Deal No  FI81_ctl00UCMessageBox1btnOK'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Fixed Income/FI_Buy/button_Logout'))

WebUI.closeBrowser()

