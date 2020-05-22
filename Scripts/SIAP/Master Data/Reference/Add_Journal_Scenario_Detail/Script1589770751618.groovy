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

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/span_Journal Scenario'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_32'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/img_SETTLE_dxGridView_gvDetailCollapsedButt_a41a9f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/img'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 
    'Nisbah')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), 
    '1')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 
    'TDeal.SetlleAmount')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_COA Code_ctl00ContentPlaceHolder1gvJo_461ff2'), 
    '130.3130')

WebUI.sendKeys(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_COA Code_ctl00ContentPlaceHolder1gvJo_461ff2'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_DBCR Mode_ContentPlaceHolder1_gvJournalS_4c1ad2'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_Fixed'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Description_ctl00ContentPlaceHolder1g_73a0e6'), 
    'Pembayaran Nisbah')

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_COA Scenario Type_ContentPlaceHolder1_gv_e747ed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_BANK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_Rate Mode_ContentPlaceHolder1_gvJournalS_b09942'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/img_1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/img'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 
    'BANK')

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/span_Is Debit_ContentPlaceHolder1_gvJournal_36ce24'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), 
    '2')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 
    'TDeal.SetlleAmount')

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_DBCR Mode_ContentPlaceHolder1_gvJournalS_4c1ad2'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_Fixed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_COA Scenario Type_ContentPlaceHolder1_gv_e747ed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_BANK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_Rate Mode_ContentPlaceHolder1_gvJournalS_b09942'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add_Journal_Scenario_Detail/img_1'))

