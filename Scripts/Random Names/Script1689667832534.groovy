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
import java.util.Random as Random

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/links')

WebUI.click(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/span_Text Box'))

// List of predefined names
List<Integer> namesList = ['John', 'Alice', 'Michael', 'Emily', 'James', 'Sophia', 'William', 'Olivia', 'Robert', 'Emma'
    , 'David', 'Ava' // Add more names as needed
]

// List of predefined surnames
List<Integer> surnamesList = ['Smith', 'Johnson', 'Brown', 'Davis', 'Miller', 'Wilson', 'Anderson', 'Taylor', 'Thomas', 'Jackson'
    , 'White', 'Jones' // Add more surnames as needed
]

// Define the number of random names to generate
int numberOfRandomNames = 9

// Create a Random object
Random random = new Random()

// Initialize a list to store the random full names
List<Integer> randomFullNamesList = new ArrayList<Integer>()

// Generate random names and surnames and add them to the list
for (int i = 0; i < numberOfRandomNames; i++) {
    int randomNameIndex = random.nextInt(namesList.size())

    int randomSurnameIndex = random.nextInt(surnamesList.size())

    String randomName = namesList[randomNameIndex]

    String randomSurname = surnamesList[randomSurnameIndex]

    String randomFullName = (randomName + ' ') + randomSurname

    randomFullNamesList.add(randomFullName)
}

// Output the list of random full names
println('Random Full Names: ' + randomFullNamesList)

// Assuming you have two input fields where you want to set the random names and surnames
String inputField1Locator = 'your/input/field1/locator'

String inputField2Locator = 'your/input/field2/locator'

// Set the generated random names and surnames in the input fields
String[] nameParts = (randomFullNamesList[0]).split(' ')

WebUI.setText(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/input_Full Name_userName'), nameParts[0] // Set first name in inputField1
    )

WebUI.setText(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/input_Email_userEmail'), nameParts[1] // Set last name in inputField2
    )

WebUI.setText(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/textarea_Current Address_currentAddress'), 
    'Third')

WebUI.setText(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 
    'Fourth')

WebUI.click(findTestObject('Object Repository/Random Generation of Names/Page_DEMOQA/button_Submit'))


