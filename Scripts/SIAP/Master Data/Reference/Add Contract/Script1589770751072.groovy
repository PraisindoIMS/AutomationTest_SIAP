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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/span_Contract'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/img_Cancel_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Contract/input_Contract No_ctl00ContentPlaceHolder1g_8b14b2'), 'UNITLINK')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/td_Warning_ContentPlaceHolder1_gridContract_bbd802'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/td_By Pass Without Warning'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/td_7'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/img_By Pass Without Warning_dxGridView_gvDe_a0942b'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/Add Contract Allocation'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/td_Sub Type_ContentPlaceHolder1_gridContrac_029d10'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/td_Ordinary Share'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Contract/input_Min Allocation_ctl00ContentPlaceHolde_4c9d5f'), '0.1')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Contract/input_Max Allocation_ctl00ContentPlaceHolde_9fe3d5'), '0.8')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Contract/Save Allocation'))

