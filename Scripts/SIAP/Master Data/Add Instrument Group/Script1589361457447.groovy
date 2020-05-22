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

WebUI.doubleClick(findTestObject('Master Data/Add Instrument Group/span_SIAP'))

WebUI.doubleClick(findTestObject('Master Data/Add Instrument Group/span_Master Data'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/span_Instrument Group'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('Master Data/Add Instrument Group/input_Group Code_ctl00ContentPlaceHolder1gv_f22102'), 'ASTRA')

WebUI.setText(findTestObject('Master Data/Add Instrument Group/input_Group Name_ctl00ContentPlaceHolder1gv_7ead27'), 'HOLDING')

WebUI.click(findTestObject('Master Data/Add Instrument Group/span_Is COA Group_ContentPlaceHolder1_gv_In_3f9e96'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/span_Is Active_ContentPlaceHolder1_gv_Instr_90fe54'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/img'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/td_2'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/img_Holding_dxGridView_gvDetailCollapsedBut_6a3968'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/button_Add Detail Instrument Group'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/td_Instrument CodeInstrument FNameMutualFun_7daa58'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/td_ASII'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/span_Is Active_ContentPlaceHolder1_gv_Instr_bad9ae'))

WebUI.click(findTestObject('Master Data/Add Instrument Group/button_Save Detail Intrument Group'))

