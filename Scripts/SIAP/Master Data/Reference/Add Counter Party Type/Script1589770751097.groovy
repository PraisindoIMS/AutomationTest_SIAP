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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Counter Party Type/span_Counter Party Type'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Counter Party Type/img_Custodian Bank_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Counter Party Type/input_Code_ctl00ContentPlaceHolder1gridCPar_67534e'), 
    'DIST')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Counter Party Type/input_Name_ctl00ContentPlaceHolder1gridCPar_1e60a4'), 
    'Distributor')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Counter Party Type/input_Description_ctl00ContentPlaceHolder1g_32b619'), 
    'Distributor')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Counter Party Type/img'))

WebUI.delay(2)

WebUI.closeBrowser()

