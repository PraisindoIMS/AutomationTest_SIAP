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

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_Money Market'))

WebUI.doubleClick(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_Deposit'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/span_Deposit Rollover'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/td__ContentPlaceHolder1_dtBeginDate_B-1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/td_1'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/div_Search'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/a_ROLL'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/td_'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/td_29'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/div_Save'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/Save_Yes'))

WebUI.click(findTestObject('Transaction/Entry Transaction/Deposito/Deposito Rollover/input_Deal has been saved Deal No  MM93_ctl_1d05dc'))

