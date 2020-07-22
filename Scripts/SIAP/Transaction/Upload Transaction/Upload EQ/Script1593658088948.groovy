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

WebUI.navigateToUrl('https://poc.praisindo.com/Custody/SSO/LoginPages/3/Login.html')

WebUI.setText(findTestObject('Page_Login Page/input_User ID_UserID'), 'andaru')

WebUI.setEncryptedText(findTestObject('Page_Login Page/input_Password_Password'), 'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Page_Login Page/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('MENU/SIAP/Equity/img_Announcement RUP_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/Span Upload Transaction'))

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/span_Upload Transactions EQMFFI'))

CustomKeywords.'uploadFile.upload.uploadFile'(findTestObject('Transaction/Upload Transaction/Upload EQ/Button Browse'), 
    'C:\\Users\\LENOVO\\git\\AutomationTest_SIAP\\Data Files\\Upload Transaksi\\FormatUploadTransaksi-EQ.xlsx')

WebUI.switchToFrame(findTestObject('Transaction/Upload Transaction/Upload EQ/iframe_This product is licensed to PT Prais_fe5675'), 
    0)

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/a_Upload'))

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/span_Transfer'))

WebUI.delay(3)

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/div_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Transaction/Upload Transaction/Upload EQ/input_Are you sure want to save_ctl00ctl00U_81eda8'))

