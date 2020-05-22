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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/span_Holiday'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/img_Cancel_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/img_Exchange_ContentPlaceHolder1_gridHolida_9c8087'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/td_BI'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/img_Date_ContentPlaceHolder1_gridHoliday_DX_97dd09'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/td_7'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Holiday/input_Holiday Name_ctl00ContentPlaceHolder1_263425'), 'Tahun Baru')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Holiday/img'))

WebUI.delay(2)

WebUI.closeBrowser()

