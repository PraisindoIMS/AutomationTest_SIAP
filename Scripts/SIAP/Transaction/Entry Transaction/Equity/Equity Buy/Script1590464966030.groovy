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

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/span_SIAP'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/span_Equity'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/span_Equity Buy'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_RDLIKUID'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_Instrument_ContentPlaceHolder1_ASPxRound_986fd4'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_ADES'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_InvClass_ContentPlaceHolder1_ASPxRoundPa_7d86cd'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_TRADING'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_Broker_ContentPlaceHolder1_ASPxRoundPane_0797b0'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_AMC'))

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/input_Instruction No_ctl00ContentPlaceHolde_d20025'), 
    'eq121')

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_25'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/div_May 2020SunMonTueWedThuFriSat1826272829_de69df'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_27'))

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), 
    '1200')

WebUI.setText(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_No TaxPPnPPh23OldPrepaid Tax 29PAJAK TAK_d068ae'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/td_PPH23'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/div_Save'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/input_Deal has been saved Deal No  EQ54_ctl_e66772'))

WebUI.click(findTestObject('Object Repository/Transaction/Entry Transaction/Equity/Equity Buy/Page_IMS/Page_IMS/button_Logout'))

WebUI.closeBrowser()

