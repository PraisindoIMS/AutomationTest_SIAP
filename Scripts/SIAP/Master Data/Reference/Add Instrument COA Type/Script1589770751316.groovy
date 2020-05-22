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

WebUI.doubleClick(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/span_Instrument COA Type'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/img_LIABILITY_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/input_Type Name_ctl00ContentPlaceHolder1ASP_ec9023'), 
    'ASSET')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/input_Description_ctl00ContentPlaceHolder1A_516987'), 
    'ASSET')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/span_Is Active_ContentPlaceHolder1_ASPxGrid_c7f8eb'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Instrument COA Type/img'))

WebUI.delay(2)

WebUI.closeBrowser()

