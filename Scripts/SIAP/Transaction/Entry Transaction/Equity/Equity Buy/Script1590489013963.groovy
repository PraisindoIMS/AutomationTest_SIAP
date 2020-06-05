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

WebUI.click(findTestObject('EQ buy/span_Equity Buy'))

WebUI.click(findTestObject('EQ buy/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('EQ buy/td_RDBDKS'))

WebUI.click(findTestObject('EQ buy/td_Instrument_ContentPlaceHolder1_ASPxRound_986fd4'))

WebUI.click(findTestObject('EQ buy/td_ABMM'))

WebUI.click(findTestObject('EQ buy/td_InvClass_ContentPlaceHolder1_ASPxRoundPa_7d86cd'))

WebUI.click(findTestObject('EQ buy/td_TRADING'))

WebUI.click(findTestObject('EQ buy/td_Broker_ContentPlaceHolder1_ASPxRoundPane_0797b0'))

WebUI.click(findTestObject('EQ buy/td_ABN AMRO'))

WebUI.setText(findTestObject('EQ buy/input_Instruction No_ctl00ContentPlaceHolde_d20025'), 'EQ4141')

WebUI.click(findTestObject('EQ buy/td_'))

WebUI.click(findTestObject('EQ buy/td_25'))

WebUI.setText(findTestObject('EQ buy/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), '1231.54')

WebUI.setText(findTestObject('EQ buy/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), '50000')

WebUI.click(findTestObject('EQ buy/img_Tax_ContentPlaceHolder1_ASPxRoundPanel1_9a7984'))

WebUI.click(findTestObject('EQ buy/td_PPH23'))

WebUI.click(findTestObject('EQ buy/div_Save'))

WebUI.click(findTestObject('EQ buy/Button_OK'))

