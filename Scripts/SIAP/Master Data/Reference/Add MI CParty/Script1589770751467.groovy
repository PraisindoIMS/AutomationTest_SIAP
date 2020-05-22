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

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/span_MI CParty'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/td_MI_ContentPlaceHolder1_GridTMICParty_DXE_a1267f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/td_CC002'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/img_Broker_ContentPlaceHolder1_GridTMICPart_e91a13'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/td_INDOP'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add MI Cparty/img'))

WebUI.delay(2)

WebUI.closeBrowser()

