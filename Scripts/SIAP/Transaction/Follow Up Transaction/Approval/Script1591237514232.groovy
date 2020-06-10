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

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/Span approval'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/img_Category_ContentPlaceHolder1_cboCategory_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/td_Equity'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/img_Period_ContentPlaceHolder1_dtpFrom_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/img_Period_ContentPlaceHolder1_dtpFrom_DDD__e2bfcb'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/td_1'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/img_Status_ContentPlaceHolder1_cboStatus_B-1Img'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/td_Not Approved'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/img_Product_ContentPlaceHolder1_cboPortfoli_259549'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/td_DPJASINDO'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/span_Search'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/span_View_ContentPlaceHolder1_gvApproval_DX_e748b2'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/span_Approve Selected'))

WebUI.click(findTestObject('Transaction/Follow Up Transaction/Approval/button_Logout'))

WebUI.closeBrowser()

