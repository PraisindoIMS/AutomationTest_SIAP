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

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/span_Fee Formula'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/td_3'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/img_FLAT_dxGridView_gvDetailCollapsedButton_Glass'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/img'))

WebUI.setText(findTestObject('Master Data/Add Fee Formula Detail/input_Pos_ctl00ContentPlaceHolder1gridFeeFo_65d965'), '1')

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/td_--aspxAddDisabledItems(ContentPlaceHolde_cdaab6'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/td_'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/td_Amount Code_ContentPlaceHolder1_gridFeeF_28a06f'))

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/td__1'))

WebUI.setText(findTestObject('Master Data/Add Fee Formula Detail/Input_Amount'), '0.69')

WebUI.setText(findTestObject('Master Data/Add Fee Formula Detail/input_Journal Adjustment_ctl00ContentPlaceH_1aed57'), '1')

WebUI.click(findTestObject('Master Data/Add Fee Formula Detail/img_1'))

