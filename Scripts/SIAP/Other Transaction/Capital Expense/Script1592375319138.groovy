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

WebUI.setText(findTestObject('Page_Login Page/input_User ID_UserID'), 'andaru')

WebUI.setEncryptedText(findTestObject('Page_Login Page/input_Password_Password'), 'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Page_Login Page/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Other Transaction/Capital Expense/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Other Transaction/OverBooking/Span other transaction'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/span_Capital Expense'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/img_Product_ContentPlaceHolder1_PageControl_trx_cmbPortofolioInput_B-1Img'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/td_BBMNFD'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/td_'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/td_16'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/Td_Settledate'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/td_18'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/img_Transaction Type_ContentPlaceHolder1_Pa_3e9ab6'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/td_BAYAR MI FEE'))

WebUI.setText(findTestObject('Other Transaction/Capital Expense/input_Amount_ctl00ContentPlaceHolder1PageCo_3473ff'), 
    '32500')

WebUI.setText(findTestObject('Other Transaction/Capital Expense/textarea_Remark_ctl00ContentPlaceHolder1Pag_5f2b4c'), 
    'Bayar Management Fee')

WebUI.click(findTestObject('Other Transaction/Capital Expense/span_Save'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/input_Deal has been saved Deal No  OT34_ctl_4732bd'))

WebUI.click(findTestObject('Other Transaction/Capital Expense/button_Logout'))

WebUI.closeBrowser()

