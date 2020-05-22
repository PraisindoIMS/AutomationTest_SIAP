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

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_Journal Scenario Tester'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/input__ctl00ContentPlaceHolder1txtDealNo'), 'eq1')

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_Test Journal'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td__ContentPlaceHolder1_cboType_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td_SETTLE'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_Test Journal'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_INTEREST_ContentPlaceHolder1_chkBalance_S_D'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td__ContentPlaceHolder1_cboType_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td_APPROVE'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_Test Journal'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td__ContentPlaceHolder1_cboType_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/td_SETTLE'))

WebUI.click(findTestObject('SIAP_REFERENCE/Journal Scenario Tester/span_Test Journal'))

WebUI.delay(2)

WebUI.closeBrowser()

