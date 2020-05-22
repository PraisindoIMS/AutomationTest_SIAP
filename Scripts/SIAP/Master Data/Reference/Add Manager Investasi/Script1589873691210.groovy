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

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/span_Manager Investasi'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Drag a column header here to group by that column_ctl00ContentPlaceHolder1gridMIheader0TCbtnNew'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Code_ctl00ContentPlaceHolder1txtCode'), 'KAMI')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_BIC Code_ctl00ContentPlaceHolder1txtBIC'), 'KAMI800')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Name_ctl00ContentPlaceHolder1txtName'), 'KRESNA ASSET MANAGEMENT')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Legal Domicile_ctl00ContentPlaceHolde_c2e8b0'), 'JAKARTA')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_NPWP Date_ContentPlaceHolder1_dtNPWP_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_Expired Date of SKD_ContentPlaceHolder1__b0f738'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_29'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_Date of MI Establishment_ContentPlaceHol_9b0dd0'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_13'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_NPWP_ctl00ContentPlaceHolder1txtNPWP'), '800706023024')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_SKD_ctl00ContentPlaceHolder1txtSKD'), 'KAMI1010')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Place of MI Establishment_ctl00Conten_8bafd5'), 'JAKARTA')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Business registration certificate No__4eed41'), 'KAMI1000')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Adress 1_ctl00ContentPlaceHolder1txtAddress1'), 'JALAN SENAYAN NO 15 KEBAYORAN BARU')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_City_ctl00ContentPlaceHolder1txtCity'), 'KEBAYORAN BARU')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_Country_ContentPlaceHolder1_cmbCountry_B-1'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_City_ctl00ContentPlaceHolder1txtCity'), 'KEBAYORAN BARU')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_INA'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Fax_ctl00ContentPlaceHolder1txtFAX'), '021-800900')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Province_ctl00ContentPlaceHolder1txtProvince'), 'DKI JAKARTA')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Phone_ctl00ContentPlaceHolder1txtPhone'), '021-800900')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Postal Code_ctl00ContentPlaceHolder1t_d9afe1'), '12111')

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Email_ctl00ContentPlaceHolder1txtEmail'), 'kami@gmail.com')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_Owner Type_ContentPlaceHolder1_cmbOwnerType_B-1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/td_P'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/div_Save'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Legal Domicile max 3 char_ctl00UCMess_a7f104'))

WebUI.setText(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Legal Domicile_ctl00ContentPlaceHolde_c2e8b0'), 'JAK')

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/div_Save_1'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('SIAP_REFERENCE/Add Manager Investasi/input_Legal Domicile max 3 char_ctl00UCMess_a7f104'))

