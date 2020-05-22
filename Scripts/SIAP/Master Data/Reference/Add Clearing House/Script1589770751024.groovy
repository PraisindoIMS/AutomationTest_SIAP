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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/span_Clearing House'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/img_Sub Registry_dxgvCommandColumnItem_Glass dxgv__cci'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Clearing House/input_Clearing House_ctl00ContentPlaceHolde_c7013c'), Clearing House)

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/span_Is Active_ContentPlaceHolder1_gridClea_8a4458'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/td_Clearing Type_ContentPlaceHolder1_gridCl_19f419'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/td_Clearing House'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/Image Save'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/img_Securities Account_dxGridView_gvDetailC_7835c8'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/Image Plus'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Clearing House/input_Code_ctl00ContentPlaceHolder1gridClea_aaa57d'), Code)

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Clearing House/input_Description_ctl00ContentPlaceHolder1g_89d0c1'), Description)

WebUI.click(findTestObject('SIAP_REFERENCE/Add Clearing House/Page_IMS/img'))

WebUI.delay(2)

