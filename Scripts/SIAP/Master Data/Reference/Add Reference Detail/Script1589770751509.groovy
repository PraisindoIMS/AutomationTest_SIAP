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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/span_Reference Detail'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/span_Add'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Reference Detail/input_Reference Group Name_ctl00BodyContenteditor7A'), 
    'BANK')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/span_Add_Detail_Reference'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Reference Detail/input_Value_ctl00BodyContenteditor4A'), '1')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Reference Detail/input_Display_ctl00BodyContenteditor5A'), 'BANK BRI')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Reference Detail/input_Display_ctl00BodyContenteditor11A'), 'BANK BRI')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Reference Detail/input_Display_ctl00BodyContenteditor14A'), 'BANK BRI')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/div_Save'))

WebUI.acceptAlert()

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/ul_HomeReference Detail'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Reference Detail/div_Save_Reference'))

WebUI.acceptAlert()

WebUI.delay(2)

