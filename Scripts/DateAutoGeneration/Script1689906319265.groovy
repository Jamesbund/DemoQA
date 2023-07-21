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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.Keys as Keys
//
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat

//
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/links')

WebUI.click(findTestObject('Object Repository/DateAutoGeneration/Page_DEMOQA/svg'))

WebUI.click(findTestObject('Object Repository/DateAutoGeneration/Page_DEMOQA/div_Forms'))

WebUI.click(findTestObject('Object Repository/DateAutoGeneration/Page_DEMOQA/span_Practice Form'))

//
// Get the current date and create a Calendar instance
Calendar currentDate = Calendar.getInstance()

// subtract 3 years to the current date
currentDate.add(Calendar.YEAR, -18)

// Format the date as "mm/dd/yyyy"
SimpleDateFormat dateFormat = new SimpleDateFormat('dd-MM-yyyy')

String pastDate = dateFormat.format(currentDate.time)

// Print the past date
println('Past Date is: ' + pastDate)



WebUI.clearText(findTestObject('Object Repository/DateAutoGeneration/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.delay(3)

////
// Input the current date into the text box unfortunately i cant clear the text in the field so there's still a problem, but it's working tho' haha
WebUI.setText(findTestObject('Object Repository/DateAutoGeneration/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), pastDate)

WebUI.delay(60)

