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

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_SIAR_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Generator Email_x-tree-ec-icon x-tree-elbow-plus'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Portfolio'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Create New'))

WebUI.setText(findTestObject('Portfolio Setup/Create Portfolio/input_Portfolio Code_ctl00ContentPlaceHolde_a40f28'), 'testlagilagiyaaaaa')

WebUI.setText(findTestObject('Portfolio Setup/Create Portfolio/input_ISIN Code_ctl00ContentPlaceHolder1txtISIN'), '123454321')

WebUI.setText(findTestObject('Portfolio Setup/Create Portfolio/input_Short Name_ctl00ContentPlaceHolder1tx_0db32d'), 'testlagi')

WebUI.setText(findTestObject('Portfolio Setup/Create Portfolio/input_Full Name_ctl00ContentPlaceHolder1txt_292ddf'), 'testlagi')

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Fund Manager_ContentPlaceHolder1_cmbMI_B-1Img'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_BKP'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Type_ContentPlaceHolder1_cmbPFolioType_B-1Img'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_Terbuka - Perseroan'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Custody_ContentPlaceHolder1_cmbCounterP_826abe'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_INTERNMJ'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Asset Class_ContentPlaceHolder1_cmbJeni_4c9872'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_Mixed'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Contract Name_ContentPlaceHolder1_cmbCo_cd4f66'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_RDSBMKF'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/img_Tax Number Issue Date_ContentPlaceHolde_b1edc4'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_1'))

WebUI.setText(findTestObject('Portfolio Setup/Create Portfolio/input_Tax Number_ctl00ContentPlaceHolder1txtNPWP'), 'TX12301')

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_Tax Rate_ContentPlaceHolder1_cmbTax_B-1'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/td_15'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_No Tax_ContentPlaceHolder1_chkIsTaxRep_819614'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Tax Reported_ContentPlaceHolder1_chkIs_ce5119'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Pasar Uang_ContentPlaceHolder1_chkCont_8b2b07'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/span_Contractual Unit_ContentPlaceHolder1_c_622072'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/div_Save'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/input_Are you sure want to save_ctl00UCMess_122409'))

WebUI.click(findTestObject('Portfolio Setup/Create Portfolio/input_PFolioPending has been saved_ctl00UCM_81c8ab'))

