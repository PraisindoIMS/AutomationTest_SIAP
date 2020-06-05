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

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/span_Equity IPO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/Pilih Instrumen'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_TESTEQ'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/img_InvClass_ContentPlaceHolder1_ASPxRoundP_94ff3c'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_TRADING'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/img_Broker_ContentPlaceHolder1_ASPxRoundPan_98b493'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_ABN AMRO'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/input_Instruction No_ctl00ContentPlaceHolde_d20025'), 
    'EQIPO 1')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_26'))

WebUI.delay(2)

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/unit_price2'), '1200.25')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), 
    '10000')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/img_Tax_ContentPlaceHolder1_ASPxRoundPanel1_9a7984'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/td_PPH23'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/span_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/input_Deal has been saved Deal No  EQ73_ctl00UCMessageBox1btnOK'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity IPO/Button_OK'))

WebUI.acceptAlert(FailureHandling.STOP_ON_FAILURE)

