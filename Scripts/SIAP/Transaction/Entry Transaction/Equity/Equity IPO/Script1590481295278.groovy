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

WebUI.doubleClick(findTestObject('Equity IPO/span_SIAP'))

WebUI.doubleClick(findTestObject('Equity IPO/span_Transaction'))

WebUI.doubleClick(findTestObject('Equity IPO/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Equity IPO/span_Equity'))

WebUI.click(findTestObject('Equity IPO/span_Equity IPO'))

WebUI.click(findTestObject('Equity IPO/td_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Equity IPO/td_DPJASINDO'))

WebUI.click(findTestObject('Equity IPO/td_Instrument_ContentPlaceHolder1_ASPxRound_986fd4'))

WebUI.click(findTestObject('Equity IPO/td_TESTEQ'))

WebUI.click(findTestObject('Equity IPO/td_InvClass_ContentPlaceHolder1_ASPxRoundPa_7d86cd'))

WebUI.click(findTestObject('Equity IPO/td_TRADING'))

WebUI.click(findTestObject('Equity IPO/td_Broker_ContentPlaceHolder1_ASPxRoundPane_0797b0'))

WebUI.click(findTestObject('Equity IPO/td_AMC'))

WebUI.setText(findTestObject('Equity IPO/input_Instruction No_ctl00ContentPlaceHolde_d20025'), 'EQ201')

WebUI.click(findTestObject('Equity IPO/td_'))

WebUI.click(findTestObject('Equity IPO/td_25'))

<<<<<<< HEAD
WebUI.click(findTestObject('Equity IPO/td_'))
=======
WebUI.click(findTestObject('Equity IPO/td_May 2020SunMonTueWedThuFriSat18262728293_bbf064'))
>>>>>>> branch 'master' of https://github.com/PraisindoIMS/AutomationTest_SIAP.git

WebUI.click(findTestObject('Equity IPO/td_26'))

WebUI.click(findTestObject('Equity IPO/td_'))

WebUI.click(findTestObject('Equity IPO/td_27'))

WebUI.setText(findTestObject('Equity IPO/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), '2123.65')

WebUI.setText(findTestObject('Equity IPO/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), '50000')

WebUI.click(findTestObject('Equity IPO/td_No TaxPPnPPh23OldPrepaid Tax 29PAJAK TAK_d068ae'))

WebUI.click(findTestObject('Equity IPO/td_PPH23'))

WebUI.setText(findTestObject('Equity IPO/textarea_Remarks 2_ctl00ContentPlaceHolder1_fac11b'), 'testing EQ IPO')

WebUI.click(findTestObject('Equity IPO/div_Save'))

WebUI.click(findTestObject('Equity IPO/input_Deal has been saved Deal No  EQ55_ctl_3b85a9'))

WebUI.closeBrowser()

