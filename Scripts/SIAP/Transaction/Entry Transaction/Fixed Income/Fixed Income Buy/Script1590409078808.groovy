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

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_Login Page/input_User ID_UserID'), 'andaru')

WebUI.setEncryptedText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_Login Page/input_Password_Password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_Login Page/input_Password_btnLogin'))

WebUI.doubleClick(findTestObject('Transaction/Fixed Income Buy/Page_IMS/span_SIAP'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/span_Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/span_Entry Transaction'))

WebUI.doubleClick(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/span_Fixed Income'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/span_Fixed Income Buy'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td__ContentPlaceHolder1_PanelMain_cboPortfolio_B-1'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td_RDPT BAHANA BUMN FUND III'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td__ContentPlaceHolder1_PanelMain_cboInstru_3b4f5c'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td_BANK PEMABNGUNAN DAERAH JAWA BARAT DAN B_b9b407'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td__ContentPlaceHolder1_PanelMain_cbx_TInvC_2dfd7a'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td_TRADING'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td__ContentPlaceHolder1_PanelMain_cboCParty_B-1'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td_ABN AMRO'))

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMaintxt_bae2ee'), 
    '1021')

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input_Deal Price_ctl00ContentPlaceHolder1Pa_51bab2'), 
    '101')

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input_Disc ()_ctl00ContentPlaceHolder1Panel_fff07b'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input_Fee ()_ctl00ContentPlaceHolder1PanelM_17e3c2'), 
    '1')

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/img'))

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_72cdaf'), 
    '100000')

WebUI.doubleClick(findTestObject('Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_820913'))

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_820913'), 
    '101')

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_b855f5'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td__ContentPlaceHolder1_PanelMain_PanelDeta_9c935c'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/td_19'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input_Cancel_ctl00ContentPlaceHolder1PanelM_db32b8'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/img_Cancel_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/img__dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.doubleClick(findTestObject('Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_820913'))

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/input__ctl00ContentPlaceHolder1PanelMainPan_820913'), 
    '102')

WebUI.setText(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/textarea_Remarks 2_ctl00ContentPlaceHolder1_c7fa5c'), 
    'Automation Test by Katalon')

WebUI.click(findTestObject('Object Repository/Transaction/Fixed Income Buy/Page_IMS/div_Save'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

