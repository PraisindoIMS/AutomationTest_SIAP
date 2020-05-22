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

WebUI.click(findTestObject('Master Data/Add Fee Formula/span_Fee Formula'))

WebUI.click(findTestObject('Master Data/Add Fee Formula/img_Loading_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('Master Data/Add Fee Formula/input_Name_ctl00ContentPlaceHolder1gridFeeF_10e0de'), 'MANAGEMENT FEE')

WebUI.click(findTestObject('Master Data/Add Fee Formula/td_Fee Method_ContentPlaceHolder1_gridFeeFo_90ad6c'))

WebUI.click(findTestObject('Master Data/Add Fee Formula/td_FLAT'))

WebUI.click(findTestObject('Master Data/Add Fee Formula/td_Int Days_ContentPlaceHolder1_gridFeeForm_19688b'))

WebUI.click(findTestObject('Master Data/Add Fee Formula/td_ACTUALACTUAL'))

WebUI.click(findTestObject('Master Data/Add Fee Formula/img'))

