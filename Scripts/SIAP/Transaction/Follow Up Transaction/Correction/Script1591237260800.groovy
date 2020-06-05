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

WebUI.doubleClick(findTestObject('Transaction/Follow Up Transaction/Correction/span_SIAP'))

WebUI.doubleClick(findTestObject('Transaction/Follow Up Transaction/Correction/span_Transaction'))

WebUI.doubleClick(findTestObject('Transaction/Follow Up Transaction/Correction/span_Follow Up Transaction'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/span_Correction'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_Category_ContentPlaceHolder1_cboCategory_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/td_Equity'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_Period_ContentPlaceHolder1_dtpFrom_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_Period_ContentPlaceHolder1_dtpFrom_DDD__e2bfcb'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/td_1'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_Status_ContentPlaceHolder1_cboStatus_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/td_Entried'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_Product_ContentPlaceHolder1_cboPortfoli_259549'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/span_Search'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/a_View'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/img_InvClass_ContentPlaceHolder1_ASPxRoundP_94ff3c'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/td_AFS'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/span_Save'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Correction/input_Deal has been updated Deal No  EQ64_c_4246c5'))

WebUI.closeBrowser()

