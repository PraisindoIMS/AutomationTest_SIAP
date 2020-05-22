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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Base Parameter/span_Base Parameter'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Base Parameter/img_Method_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Base Parameter/input_Int Days Code_ctl00ContentPlaceHolder_ae19b8'), '30/365')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Base Parameter/input_Days In Month_ctl00ContentPlaceHolder_984b9c'), '30')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Base Parameter/input_Description_ctl00ContentPlaceHolder1g_078214'), '30/365')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Base Parameter/input_Days In Year_ctl00ContentPlaceHolder1_8512d4'), '365')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Base Parameter/input_Method_ctl00ContentPlaceHolder1gridIn_0540da'), 'A')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Base Parameter/img'))

WebUI.delay(2)

