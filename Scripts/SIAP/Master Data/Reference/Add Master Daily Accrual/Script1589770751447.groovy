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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/span_Master Daily Accrual'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/input_Name_ctl00ContentPlaceHolder1ASPxGrid_d98e42'), 
    'OS MTM')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/span_Is Active_ContentPlaceHolder1_ASPxGrid_c7f8eb'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/input_SP Name_ctl00ContentPlaceHolder1ASPxG_e98ab0'), 
    'sp_DailyAccrual_MarkToMarket')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/input_Description_ctl00ContentPlaceHolder1A_516987'), 
    'OSMTM')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/td_Journal Scenario_ContentPlaceHolder1_ASP_081eb8'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/td_OS-MTM'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/input_Input Param1_ctl00ContentPlaceHolder1_d40736'), 
    'EQ')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Master Daily Accrual/img'))

WebUI.delay(2)

