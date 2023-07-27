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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/links')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Text Box'))

// Define the file path to store the global variable value
def filePath = "C:/Users/j.bundalian/Katalon Studio/Sample on DEMO QA/iterationValue.txt" // Replace with the actual file path

// Function to read the value from the file
def readGlobalValueFromFile() {
	try {
		File file = new File('C:/Users/j.bundalian/Katalon Studio/Sample on DEMO QA/iterationValue.txt')
		if (file.exists()) {
			return Integer.parseInt(file.text)
		}
	} catch (Exception e) {
		// Handle any potential exceptions while reading the file
		// You can log an error or take appropriate actions here
	}
	return null
}

// Function to write the value to the file
def writeGlobalValueToFile(int value) {
	try {
		File file = new File('C:/Users/j.bundalian/Katalon Studio/Sample on DEMO QA/iterationValue.txt')
		file.text = value.toString()
	} catch (Exception e) {
		// Handle any potential exceptions while writing to the file
		// You can log an error or take appropriate actions here
	}
}

// Get the initial value from the file
def initialValue = readGlobalValueFromFile()
if (initialValue == null) {
	initialValue = 0 // Set the initial value if the file doesn't exist or is empty
}

// Define the number of iterations
def numberOfIterations = 1 // Change this value to set the number of iterations you need

// Start the loop
for (int i = 0; i < numberOfIterations; i++) {
	// Perform your web automation actions here using 'initialValue'
	
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), initialValue.toString()) // Replace 'yourTestObject' with the actual Test Object

	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), initialValue.toString())
	
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), initialValue.toString())
	
	// Add other web automation actions as needed


	// Increment the 'initialValue' by 1 for the next iteration
	initialValue++

	// Save the updated 'initialValue' back to the file after each iteration
	writeGlobalValueToFile(initialValue)
}

//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), iterationValue.toString())


