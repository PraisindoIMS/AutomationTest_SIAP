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

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Other Transaction/OverBooking/Span other transaction'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/span_Manual Journal'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_Date_ContentPlaceHolder1_dtBeginDate_B-1'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_15'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_sd_ContentPlaceHolder1_dtEndDate_B-1'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_19'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/span_Search'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_Loading_dxGridView_gvDetailCollapsedBut_f2141e'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_COA_ContentPlaceHolder1_gridDeal_dxdt0__ecff98'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_1101000'))

WebUI.setText(findTestObject('Object Repository/Other Transaction/Page_IMS/input_Amount_ctl00ContentPlaceHolder1gridDe_31adb9'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/span_Debit_ContentPlaceHolder1_gridDeal_dxd_c81892'))

WebUI.setText(findTestObject('Object Repository/Other Transaction/Page_IMS/input_Description_ctl00ContentPlaceHolder1g_80689b'), 
    'EQ')

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_1'))

WebUI.click(findTestObject('Other Transaction/Page_IMS/add coa'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_COA_dx'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_7'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_1200000'))

WebUI.setText(findTestObject('Object Repository/Other Transaction/Page_IMS/input_Amount_ctl00ContentPlaceHolder1gridDe_31adb9'), 
    '1000000')

WebUI.setText(findTestObject('Object Repository/Other Transaction/Page_IMS/input_Description_ctl00ContentPlaceHolder1g_80689b'), 
    'cash')

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_1'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/button_Logout'))

WebUI.closeBrowser()

