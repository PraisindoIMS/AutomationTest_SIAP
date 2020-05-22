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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Issuer/span_Issuer'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Issuer/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Issuer/input_Issuer Code_ctl00ContentPlaceHolder1g_c70244'), 'ZINCI')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Issuer/input_Issuer Name_ctl00ContentPlaceHolder1g_ab812c'), 'KAPUAS PRIMA COAL Tbk,PT')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Issuer/input_Sector_ctl00ContentPlaceHolder1gridIs_16524e'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Issuer/td_MINING'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Issuer/img'))

WebUI.delay(2)

WebUI.closeBrowser()

