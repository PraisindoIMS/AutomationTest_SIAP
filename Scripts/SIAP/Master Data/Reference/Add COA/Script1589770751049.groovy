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

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/span_COA'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/img'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add COA/input_Code_ctl00ContentPlaceHolder1treeCOAD_63a4f0_1'), '110.1302')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add COA/input_Name (English)_ctl00ContentPlaceHolde_5d7040'), 'NISBAH')

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/td_ASSET     LIABILITY   EXPENSE    INCOME _13513a'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/td_ASSET'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add COA/input_Name_ctl00ContentPlaceHolder1treeCOAD_c70fff'), 'NISBAH')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add COA/input_Description_ctl00ContentPlaceHolder1t_6fb198'), 'Pembayaran Nisbah')

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/td_Category_ContentPlaceHolder1_treeCOA_DXE_b3be12'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/td_MM'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add COA/img_1'))

