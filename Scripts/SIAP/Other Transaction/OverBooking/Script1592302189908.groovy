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

WebUI.click(findTestObject('Other Transaction/Page_IMS/Span Corporate Action'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/span_Over Booking'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/div_New'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_Product_ContentPlaceHolder1_pnlInput_cm_9e0528'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_BBMNFD'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_Bank Account_ContentPlaceHolder1_pnlInp_ab7561'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_1024362015'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_PFolio_ContentPlaceHolder1_pnlInput_gdvG_6efb9c'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/td_BUMNFD'))

WebUI.setText(findTestObject('Object Repository/Other Transaction/Page_IMS/input_Transfer Amount_ctl00ContentPlaceHold_53c6c7'), 
    '1000000')

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/img_1'))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/div_Save'))

WebUI.click(findTestObject('Other Transaction/Page_IMS/Save OB'))

WebUI.acceptAlert()

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Other Transaction/Page_IMS/button_Logout'))

WebUI.closeBrowser()

