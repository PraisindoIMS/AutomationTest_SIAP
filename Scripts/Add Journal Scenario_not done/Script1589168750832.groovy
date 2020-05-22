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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://111.67.78.152/Custody/SSO/LoginPages/3/Login.html')

WebUI.setText(findTestObject('Login/input_User ID_UserID'), 'laras1')

WebUI.setEncryptedText(findTestObject('Login/input_Password_Password'), '1eYZqUn0ugE=')

WebUI.sendKeys(findTestObject('Login/input_Password_Password'), Keys.chord(Keys.ENTER))

WebUI.doubleClick(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_SIAP'))

WebUI.doubleClick(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Master Data'))

WebUI.doubleClick(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Reference'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Journal Scenario'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Scenario Name_ctl00ContentPlaceHolder_96b16f'), 'NISBAH')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Sub Type_dx'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_OT'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Transaction Type_ContentPlaceHolder1_gvJ_7f9465'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_NA'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Cash Flow Type_ContentPlaceHolder1_gvJo_fb9c61'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_TRANS'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Description_ctl00ContentPlaceHolder1g_82c2ce'), 'PEMBAGIAN NISBAH')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Transactional_ContentPlaceHolder1_g_3b5752'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Reverse On Un Settle_ContentPlaceHo_a4403f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Create On Settle_ContentPlaceHolder_caf2e6'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Create On Approve_ContentPlaceHolde_5c7f4f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Reverse On Un Approve_ContentPlaceH_0271d0'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Deal Type_ContentPlaceHolder1_gvJournal_d893ba'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_EXPENSE'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Scenario No_ctl00ContentPlaceHolder1g_f87c6e'), '10003')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Journal Date Field_ctl00ContentPlaceH_d6ce28'), 'Tdeal.Dealdate')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Tinv Class_ContentPlaceHolder1_gvJourna_52ac58'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_TRADING'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/Page_IMS/td_32'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_SETTLE_dxGridView_gvDetailCollapsedButt_a41a9f'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 'FINAL TAX')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Debit_ContentPlaceHolder1_gvJournal_36ce24'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), '1')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 'Tdeal.settleamount* 0.2')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_COA Code_dx'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_7005500'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_DBCR Mode_ContentPlaceHolder1_gvJournal_6171f4'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Fixed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_COA Scenario Type_ContentPlaceHolder1_g_4c4d60'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_DIRECT INPUT'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Rate Mode_ContentPlaceHolder1_gvJournal_5314f1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 'BANK')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), '2')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 'tdeal.settleamount')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_COA Scenario Type_ContentPlaceHolder1_gv_e747ed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_BANK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_DBCR Mode_ContentPlaceHolder1_gvJournalS_4c1ad2'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Fixed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Rate Mode_ContentPlaceHolder1_gvJournalS_b09942'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 'NISBAH')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), '3')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 'Tdeal.settleamount')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_COA Code_ContentPlaceHolder1_gvJournalSc_58a36d'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 'Tdeal.settleamount')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_COA Code_ContentPlaceHolder1_gvJournalS_e15357'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_COA Code_dx'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Code Name'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/div_'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_1103203'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_DBCR Mode_ContentPlaceHolder1_gvJournalS_4c1ad2'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Fixed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_COA Scenario Type_ContentPlaceHolder1_g_4c4d60'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_DIRECT INPUT'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Rate Mode_ContentPlaceHolder1_gvJournal_5314f1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Relation Code ID_ctl00ContentPlaceHol_eb6559'), 'BANK')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/span_Is Debit_ContentPlaceHolder1_gvJournal_36ce24'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Sequence_ctl00ContentPlaceHolder1gvJo_57c55d'), '4')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_Amount Field_ctl00ContentPlaceHolder1_1c597f'), 'Tdeal.Settleamount*0.2')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/input_DBCR Mode_ctl00ContentPlaceHolder1gvJ_6b9982'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Fixed'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_COA Scenario Type_dx'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_BANK'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_Rate Mode_ContentPlaceHolder1_gvJournalS_b09942'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/td_CURRENT DEAL'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Journal Scenario_not done/img'))

