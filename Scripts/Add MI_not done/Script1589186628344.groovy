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

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('null'))

WebUI.doubleClick(findTestObject('null'))

WebUI.doubleClick(findTestObject('Add Instrument Group/span_Reference'))

WebUI.click(findTestObject('Add Instrument Group/span_Manager Investasi'))

WebUI.click(findTestObject('Add Instrument Group/span_Add'))

WebUI.setText(findTestObject('Add Instrument Group/input_Code_ctl00BodyContenteditor8A'), 'KAM')

WebUI.setText(findTestObject('Add Instrument Group/input_Name_ctl00BodyContenteditor9A'), 'Kresna Asset Management')

WebUI.click(findTestObject('Add Instrument Group/img_NPWP Date_BodyContent_editor11A_B-1Img'))

WebUI.click(findTestObject('Add Instrument Group/td_11'))

WebUI.click(findTestObject('Add Instrument Group/img_Expired Date of SKD_BodyContent_editor1_216977'))

WebUI.click(findTestObject('Add Instrument Group/img_May 2020_BodyContent_editor12A_DDD_C_NYCImg'))

WebUI.click(findTestObject('Add Instrument Group/td_5'))

WebUI.click(findTestObject('Add Instrument Group/img_Date of MI Establishment_BodyContent_ed_9c7d62'))

WebUI.click(findTestObject('Add Instrument Group/td_11'))

WebUI.setText(findTestObject('Add Instrument Group/input_Adress 1_ctl00BodyContenteditor14A'), 'Jalan Senayan Kebayoran Baru No 1')

WebUI.click(findTestObject('Add Instrument Group/img_Country_BodyContent_editor18A_B-1Img'))

WebUI.click(findTestObject('Add Instrument Group/td_INA Indonesia'))

WebUI.doubleClick(findTestObject('Add Instrument Group/td_Email_dxic'))

WebUI.setText(findTestObject('Add Instrument Group/input_Email_ctl00BodyContenteditor20A'), 'Kresna Asetmanagement@gmail.com')

WebUI.click(findTestObject('Add Instrument Group/td_Owner Type_BodyContent_editor21A_B-1'))

WebUI.click(findTestObject('Add Instrument Group/td_P Patungan'))

WebUI.click(findTestObject('Add Instrument Group/span_Bank'))

WebUI.click(findTestObject('Add Instrument Group/span_Add'))

WebUI.click(findTestObject('Add Instrument Group/img_Bank Account_BodyContent_editor5A_B-1Img'))

WebUI.click(findTestObject('Add Instrument Group/td_BANK BUKOPIN KANTOR PUSAT 1022863017 - R_19648e'))

WebUI.click(findTestObject('Add Instrument Group/div_Save'))

WebUI.click(findTestObject('Add Instrument Group/div_Save'))

WebUI.doubleClick(findTestObject('Add Instrument Group/div_Loading_LoadingPanel1_LD'))

WebUI.click(findTestObject('Add Instrument Group/div_OK'))

WebUI.click(findTestObject('null'))

