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

WebUI.setText(findTestObject('Login/input_User ID_UserID'), 'laras1')

WebUI.setEncryptedText(findTestObject('Login/input_Password_Password'), '1eYZqUn0ugE=')

WebUI.sendKeys(findTestObject('Login/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('Master Data/Coupon Schedule MF/span_SIAP'))

WebUI.doubleClick(findTestObject('Master Data/Coupon Schedule MF/span_Master Data'))

WebUI.click(findTestObject('Master Data/Coupon Schedule MF/span_Coupon Schedule MF'))

WebUI.click(findTestObject('Master Data/Coupon Schedule MF/td_Instrument_ContentPlaceHolder1_cmbInstrument_B-1 (1)'))

WebUI.click(findTestObject('Master Data/Coupon Schedule MF/td_MSDK'))

WebUI.click(findTestObject('Master Data/Coupon Schedule MF/div_View (1)'))

WebUI.click(findTestObject('Master Data/Coupon Schedule MF/div_Generate (1)'))

