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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Authorizer/ul_CompanyContractInstrument COA TypeAuthor_adb873'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Authorizer/span_Authorizer'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Authorizer/img_Manager Utama_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Authorizer/input_Name_ctl00ContentPlaceHolder1gv_Autho_3fae9e'), Name)

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Authorizer/input_Position_ctl00ContentPlaceHolder1gv_A_26537c'), Position)

WebUI.click(findTestObject('SIAP_REFERENCE/Add Authorizer/img'))

