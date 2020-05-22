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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/span_Portfolio List Type'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/img_Reporting Group_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/input_List Type Name_ctl00ContentPlaceHolde_23945d'), 
    'Report')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/input_Description_ctl00ContentPlaceHolder1g_b5bc2a'), 
    'Reporting Group')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/span_Show In Report_ContentPlaceHolder1_gri_6b05d1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Portfolio List Type/img'))

WebUI.delay(2)

WebUI.closeBrowser()

