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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Stock Exchange/span_Stock Exchange'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Stock Exchange/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Stock Exchange/input_Exchange Code_ctl00ContentPlaceHolder_986047'), 'KLS')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Stock Exchange/input_Exchange Name_ctl00ContentPlaceHolder_ce6d53'), 'Kuala Lumpur')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Stock Exchange/input_Description_ctl00ContentPlaceHolder1g_c8646c'), 'Kuala Lumpur Malaysia')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Stock Exchange/td_Country_ContentPlaceHolder1_grid_DXEditor5_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Stock Exchange/td_Malaysia'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Stock Exchange/img'))

WebUI.delay(2)

WebUI.closeBrowser()

