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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Tax/span_Tax'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Tax/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Tax/input_Code_ctl00ContentPlaceHolder1gridTaxD_90d348'), 'PPH23')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Tax/input_Tax Name_ctl00ContentPlaceHolder1grid_674034'), 'PPH23')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Tax/input_Value_ctl00ContentPlaceHolder1gridTax_41a1c5'), '2')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Tax/input_Description_ctl00ContentPlaceHolder1g_e61a11'), 'Pajak PPH23')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Tax/td_COA Code_ContentPlaceHolder1_gridTax_DXE_38e5bc'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Tax/input_COA Code_ctl00ContentPlaceHolder1grid_66dc7c'), '130.6110')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Tax/span_Is Default_ContentPlaceHolder1_gridTax_41a8df'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Tax/img'))

WebUI.delay(2)

WebUI.closeBrowser()

