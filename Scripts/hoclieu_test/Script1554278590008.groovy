import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/a_Google'))

WebUI.setText(findTestObject('Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), 'giagia1ts@gmail.com')

WebUI.sendKeys(findTestObject('Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), '9m/2sveT/7KQJp8RtDqsSA==')

WebUI.sendKeys(findTestObject('Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 1 Tp 1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Trng ny khng c  trng'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input'), 'akj')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_No items found'))

WebUI.closeBrowser()

