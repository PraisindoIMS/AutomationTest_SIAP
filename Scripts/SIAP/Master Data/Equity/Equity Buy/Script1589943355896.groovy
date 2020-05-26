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

WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Password_btnLogin'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/span_Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('null'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/span_Equity Buy'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_RDBDKS'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_Instrument_ContentPlaceHolder1_ASPxRound_986fd4'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_ABBA'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_InvClass_ContentPlaceHolder1_ASPxRoundPa_7d86cd'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_TRADING'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_Broker_ContentPlaceHolder1_ASPxRoundPane_0797b0'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_INTERN'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/input_Instruction No_ctl00ContentPlaceHolde_d20025'), 'eq32x')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_18'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/Tanggal_Settle'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_20'))

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), '1213.65')

WebUI.setText(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), '10000')

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_Tax_dx'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/td_PPH23'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/span_Tax Included _ContentPlaceHolder1_ASPx_a83975'))

WebUI.click(findTestObject('null'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Transaction/Entry Transaction/Equity/Equity Buy/input_Deal has been saved Deal No  EQ36_ctl_fea196'))

