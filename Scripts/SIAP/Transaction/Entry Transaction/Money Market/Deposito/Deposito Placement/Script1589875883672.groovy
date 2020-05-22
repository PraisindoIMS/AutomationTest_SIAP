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

WebUI.doubleClick(findTestObject('Deposito Placement/span_SIAP'))

WebUI.doubleClick(findTestObject('Deposito Placement/span_Transaction'))

WebUI.doubleClick(findTestObject('Deposito Placement/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Deposito Placement/span_Money Market'))

WebUI.doubleClick(findTestObject('Deposito Placement/span_Deposit'))

WebUI.click(findTestObject('Deposito Placement/span_Deposit Placement'))

WebUI.click(findTestObject('Deposito Placement/td_Product_ContentPlaceHolder1_cmbPFolio_B-1'))

WebUI.click(findTestObject('Deposito Placement/td_BBMNFD'))

WebUI.click(findTestObject('Deposito Placement/td_Instrument_ContentPlaceHolder1_cmbInstru_5fa045'))

WebUI.click(findTestObject('Deposito Placement/td_TDP-AGRIS2'))

WebUI.click(findTestObject('Deposito Placement/td_Bank_ContentPlaceHolder1_cmbCPartyGroup1_B-1'))

WebUI.click(findTestObject('Deposito Placement/td_HSBC1'))

WebUI.setText(findTestObject('Deposito Placement/input_Principal Amount_ctl00ContentPlaceHol_83befb'), '5000000')

WebUI.setText(findTestObject('Deposito Placement/input_Interest Rate_ctl00ContentPlaceHolder_660976'), '5.5')

WebUI.click(findTestObject('Deposito Placement/td_'))

WebUI.click(findTestObject('Deposito Placement/td_29'))

WebUI.click(findTestObject('Deposito Placement/div_Save'))

WebUI.click(findTestObject('Deposito Placement/Button_OK_Save'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Deposito Placement/input_Deal has been saved Deal No  MM89_ctl_5351c9'))

WebUI.acceptAlert()

