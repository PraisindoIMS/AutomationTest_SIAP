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

WebUI.click(findTestObject('UP_Subs/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Announcement RUP_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Upload Transaction_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('UP_Subs/Span Unit pricing/img_Fixed Income_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('UP_Subs/span_Subscription'))

WebUI.click(findTestObject('UP_Subs/img_Product_ContentPlaceHolder1_RoundPanelMain_RoundPanelGeneral_cboPortfolio_B-1Img'))

WebUI.click(findTestObject('UP_Subs/td_BBMNFD'))

WebUI.setText(findTestObject('UP_Subs/input_Instruction No_ctl00ContentPlaceHolde_fcd0d9'), 'UP101X')

WebUI.click(findTestObject('UP_Subs/img_NAV Date_ContentPlaceHolder1_RoundPanel_cbf467'))

WebUI.click(findTestObject('UP_Subs/td_10'))

WebUI.click(findTestObject('UP_Subs/img_Book Date_ContentPlaceHolder1_RoundPane_bbcfd4'))

WebUI.click(findTestObject('UP_Subs/td_11'))

WebUI.setText(findTestObject('UP_Subs/total amount/input_Total Amount_ctl00ContentPlaceHolder1RoundPanelMainRoundPanelDetailcbDetailtxtTotalCost'), 
    '10000000,00')

WebUI.click(findTestObject('UP_Subs/div_NAV Date                               _ccea24'))

WebUI.setText(findTestObject('UP_Subs/input_NAVUnit_ctl00ContentPlaceHolder1Round_0cdc1b'), '1421.45')

WebUI.setText(findTestObject('UP_Subs/textarea_Remarks_ctl00ContentPlaceHolder1Ro_d43941'), 'Test Input UP')

WebUI.click(findTestObject('UP_Subs/span_Save'))

WebUI.click(findTestObject('UP_Subs/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('UP_Subs/input_Deal has been saved Deal No  UP55_ctl_774ecc'))

WebUI.click(findTestObject('UP_Subs/button_Logout'))

WebUI.closeBrowser()

