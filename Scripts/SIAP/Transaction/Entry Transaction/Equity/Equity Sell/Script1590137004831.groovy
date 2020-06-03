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

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/span_Equity Sell'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_RDBDKS'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_Instrument_ContentPlaceHolder1_ASPxRound_986fd4'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_ABBA'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_InvClass_ContentPlaceHolder1_ASPxRoundPa_7d86cd'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_TRADING'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_Sell Method_ContentPlaceHolder1_ASPxRoun_e7eef3'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_AVG'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_Broker_ContentPlaceHolder1_ASPxRoundPane_0797b0'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_ABN AMRO'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), 
    '1212.75')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), 
    '5000')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_No TaxPPnPPh23OldPrepaid Tax 29PAJAK TAK_d068ae'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), 
    '5000')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/Tax'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/td_PPH23'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/div_Save'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/input_Deal has been saved Deal No  EQ47_ctl_7b93d3'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Sell/Btn OK'))

