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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Journal Scenario'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario/input_Scenario Name_ctl00ContentPlaceHolder_96b16f'), 
    'NISBAH')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_CategoryCodeNameDRBFWBond ForwardOTBTBan_bf2006'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_OT'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_CodeNameNANot ApplicableNORMALNormalCROS_929ea0'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_NORMAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_Cash Flow Type_ContentPlaceHolder1_gvJou_485ca1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_TRANS'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Is Transactional_ContentPlaceHolder1_g_3b5752'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Is Reverse On Un Settle_ContentPlaceHo_a4403f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Is Create On Settle_ContentPlaceHolder_caf2e6'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Is Create On Approve_ContentPlaceHolde_5c7f4f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/span_Is Reverse On Un Approve_ContentPlaceH_0271d0'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario/input_Description_ctl00ContentPlaceHolder1g_82c2ce'), 
    'PEMBAYARAN NISBAH')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_Deal Type_ContentPlaceHolder1_gvJournalS_95c729'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_EXPENSE'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario/input_Scenario No_ctl00ContentPlaceHolder1g_f87c6e'), 
    '10005')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario/input_Journal Date Field_ctl00ContentPlaceH_d6ce28'), 
    'Tdeal.Dealdate')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_Tinv Class_ContentPlaceHolder1_gvJournal_78bc5e'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/td_TRADING'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario/img'))

