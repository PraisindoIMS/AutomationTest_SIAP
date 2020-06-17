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

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Other Transaction/OverBooking/Span other transaction'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/span_Manual Journal'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/img'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/img_Product_ContentPlaceHolder1_gridDeal_DX_cb8080'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/td_BBMNFD'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/img_Date_ContentPlaceHolder1_gridDeal_DXEdi_6b839f'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/td_16'))

WebUI.setText(findTestObject('Other Transaction/Manual Journal_1/textarea_Remarks_ctl00ContentPlaceHolder1gr_b12b7b'), 
    'Test Manual Jurnal')

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/td_Instrument Remark_dx'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/td_ABBA'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/img_1'))

WebUI.click(findTestObject('Other Transaction/Manual Journal_1/button_Logout'))

WebUI.closeBrowser()

