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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Currency/div_Currency'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Currency/img_Symbol_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Currency/input_Currency Code_ctl00ContentPlaceHolder_90deb2'), Currency_Code)

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Currency/input_Currency Name_ctl00ContentPlaceHolder_2731b2'), Currency_Name)

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Currency/input_Description_ctl00ContentPlaceHolder1g_74c463'), Description)

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Currency/input_Symbol_ctl00ContentPlaceHolder1gridCu_09d8c4'), Symbol)

WebUI.click(findTestObject('SIAP_REFERENCE/Add Currency/img (1)'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Currency/button_Logout'))

