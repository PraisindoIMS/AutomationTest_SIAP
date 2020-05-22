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

WebUI.click(findTestObject('Master Data/Add Portfolio List/span_Portfolio List'))

WebUI.click(findTestObject('Master Data/Add Portfolio List/img'))

WebUI.setText(findTestObject('Master Data/Add Portfolio List/input_List Name_ctl00ContentPlaceHolder1tl__b7faf4'), 'Syariah')

WebUI.setText(findTestObject('Master Data/Add Portfolio List/input_List Description_ctl00ContentPlaceHol_0a0295'), 'Portfolio Syariah')

WebUI.click(findTestObject('Master Data/Add Portfolio List/span_Is Active_ContentPlaceHolder1_tl_Pfoli_f9f1e6'))

WebUI.click(findTestObject('Master Data/Add Portfolio List/td_Portfolio List Type_ContentPlaceHolder1__18a923'))

WebUI.click(findTestObject('Master Data/Add Portfolio List/td_Rpt'))

WebUI.setText(findTestObject('Master Data/Add Portfolio List/input_Dipasang Di_ctl00ContentPlaceHolder1t_7f9702'), 'Report')

WebUI.click(findTestObject('Master Data/Add Portfolio List/img_1'))

