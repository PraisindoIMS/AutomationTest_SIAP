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

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Generator Email_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/span_Portfolio'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci (1)'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/img_Custody_ContentPlaceHolder1_cmbCounterP_826abe (1)'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/td_INTERNMJ'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/img_Tax Rate_ContentPlaceHolder1_cmbTax_B-1Img'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/td_15'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/span_Contractual Unit_ContentPlaceHolder1_c_622072 (1)'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/span_Update'))

WebUI.click(findTestObject('Portfolio Setup/Edit Portfolio/input_Are you sure want to save_ctl00UCMess_122409'))

