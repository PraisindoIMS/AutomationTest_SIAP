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

WebUI.click(findTestObject('MENU/SIAP/correction/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Announcement RUP_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Upload Transaction_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Entry Transaction_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('EQ Buy Corr/span_Equity Buy'))

WebUI.click(findTestObject('EQ Buy Corr/img_Product_ContentPlaceHolder1_ASPxRoundPanel1_cmbPFolio_B-1Img'))

WebUI.click(findTestObject('EQ Buy Corr/td_RDBDKS'))

WebUI.click(findTestObject('EQ Buy Corr/img_Instrument_ContentPlaceHolder1_ASPxRoun_53dab2'))

WebUI.click(findTestObject('EQ Buy Corr/td_ABBA'))

WebUI.click(findTestObject('EQ Buy Corr/img_InvClass_ContentPlaceHolder1_ASPxRoundP_94ff3c'))

WebUI.click(findTestObject('EQ Buy Corr/td_TRADING'))

WebUI.click(findTestObject('EQ Buy Corr/img_Broker_ContentPlaceHolder1_ASPxRoundPan_98b493'))

WebUI.click(findTestObject('EQ Buy Corr/td_ABN AMRO'))

WebUI.click(findTestObject('EQ Buy Corr/td_'))

WebUI.click(findTestObject('EQ Buy Corr/td_2'))

WebUI.setText(findTestObject('EQ Buy Corr/input_Unit Price_ctl00ContentPlaceHolder1AS_f7c703'), '1200')

WebUI.setText(findTestObject('EQ Buy Corr/input_Quantity_ctl00ContentPlaceHolder1ASPx_e13826'), '10000')

WebUI.click(findTestObject('EQ Buy Corr/td_Tax_dx'))

WebUI.click(findTestObject('EQ Buy Corr/td_PPH23'))

WebUI.click(findTestObject('EQ Buy Corr/span_Save'))

WebUI.click(findTestObject('EQ Buy Corr/input_Deal has been saved Deal No  EQ144_ct_5a7b9f'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Upload Transaction_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.setText(findTestObject('EQ Buy Corr/Corr filter/input_Filter_TriggerField1'), 'Correction')

WebUI.click(findTestObject('EQ Buy Corr/Corr filter/span_Correction'))

WebUI.click(findTestObject('EQ Buy Corr/img_Category_ContentPlaceHolder1_cboCategory_B-1Img'))

WebUI.click(findTestObject('EQ Buy Corr/td_Equity'))

WebUI.click(findTestObject('EQ Buy Corr/img_Period_ContentPlaceHolder1_dtpFrom_B-1Img'))

WebUI.click(findTestObject('EQ Buy Corr/td_1'))

WebUI.click(findTestObject('EQ Buy Corr/td_Cancel_ContentPlaceHolder1_dtpTo_B-1'))

WebUI.click(findTestObject('EQ Buy Corr/td_30'))

WebUI.click(findTestObject('EQ Buy Corr/img_Status_ContentPlaceHolder1_cboStatus_B-1Img'))

WebUI.click(findTestObject('EQ Buy Corr/td_Both'))

WebUI.click(findTestObject('EQ Buy Corr/img_Product_ContentPlaceHolder1_cboPortfoli_259549'))

WebUI.click(findTestObject('EQ Buy Corr/td_RDBDKS'))

WebUI.click(findTestObject('EQ Buy Corr/span_Search'))

WebUI.click(findTestObject('EQ Buy Corr/a_View'))

WebUI.click(findTestObject('EQ Buy Corr/img_InvClass_ContentPlaceHolder1_ASPxRoundP_94ff3c (1)'))

WebUI.click(findTestObject('EQ Buy Corr/td_AFS'))

WebUI.click(findTestObject('EQ Buy Corr/span_Save (1)'))

WebUI.click(findTestObject('EQ Buy Corr/input_Deal has been updated Deal No  EQ116__722b64'))

WebUI.click(findTestObject('EQ Buy Corr/button_Logout'))

WebUI.closeBrowser()

