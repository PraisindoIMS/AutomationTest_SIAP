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

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Generator Email_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Portfolio'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/img_Loading_dxGridView_gvDetailCollapsedButton_Glass'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Bank Account'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/img_BBKP2 BANK BUKOPIN KANTOR PUSAT 1024363_403389'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Bank Account_ContentPlaceHolder1_gridPFo_ddcce4'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_BBKP2'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/img'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Fee Formula'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/Add Fee Formula'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/button fee formula'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_CUST'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Calc Base_ContentPlaceHolder1_gridPFolio_a049ae'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_NAV-1'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/img_Effective Date_ContentPlaceHolder1_grid_72e1e9'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_1'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Fee Formula_dx'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/td_Cust Fee-075'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/span_Accrual_ContentPlaceHolder1_gridPFolio_2c47e1'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/save fee formula'))

WebUI.click(findTestObject('Portfolio Setup/Portfolio Detail/button_Logout'))

WebUI.closeBrowser()

