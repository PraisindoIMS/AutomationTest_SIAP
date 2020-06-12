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

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Page_IMS/img_Generator Email_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Page_IMS/img_Portfolio_x-tree-ec-icon x-tree-elbow-end-plus'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/span_Portfolio'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/span_Pending Type_ContentPlaceHolder1_gridPending_DXSelBtn0_D'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/span_Approve Selected'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/input_Are you sure want to approve_ctl00UCM_72eb17'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/input_Approve success_ctl00UCMessageBox1btnOK'))

WebUI.click(findTestObject('Object Repository/Portfolio Setup/Page_IMS/button_Logout'))

WebUI.closeBrowser()

