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

/////////////////////////////////////////////////////////////////////////////
//// AUTO GENERATION OF EMAIL BASED ON THE RANDOM FIRST AND LAST NAME ///////
/////////////////////////////////////////////////////////////////////////////
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/links')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/span_Text Box'))

////////////////////////////////////////////////////////////////// List of predefined names
List<Integer> namesList = ['John', 'Jake', 'Michael', 'Jobert', 'James', 'Bogart', 'William', 'Oliver', 'Robert', 'Akira'
    , 'David', 'Tendou', 'Condoriano', 'Sendo', 'Jin', 'Hordy', 'Tony', 'Chris' // Add more names as needed
]

List<Integer> MInamesList = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'
    , 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

// List of predefined surnames
List<Integer> surnamesList = ['Smith', 'Johnson', 'Brown', 'Davis', 'Miller', 'Wilson', 'Anderson', 'Taylor', 'Thomas', 'Jackson'
    , 'White', 'Jones', 'Hernandez', 'Perez', 'Martinez', 'Trevor', 'Stark', 'Evans', 'Hemsworth', 'Romanof', 'York' // Add more surnames as needed
]

// Define the number of random names to generate
int numberOfRandomNames = 9

// Create a Random object
Random random = new Random()

// Initialize a list to store the random full names
List<Integer> randomFullNamesList = new ArrayList<Integer>()

List<Integer> randomEmailAddressesList = new ArrayList<Integer>()

// Generate random names and surnames and add them to the list
for (int i = 0; i < numberOfRandomNames; i++) {
    int randomNameIndex = random.nextInt(namesList.size())

    int randomMINameIndex = random.nextInt(MInamesList.size())

    int randomSurnameIndex = random.nextInt(surnamesList.size())

    String randomName = namesList[randomNameIndex]

    String randomMInameIndex = MInamesList[randomMINameIndex]

    String randomSurname = surnamesList[randomSurnameIndex]

    String randomFullName = (((randomName + ' ') + randomMInameIndex) + ' ') + randomSurname

    String randomEmailAddress = generateEmailAddress(randomName, randomSurname)

    randomFullNamesList.add(randomFullName)

    randomEmailAddressesList.add(randomEmailAddress)
}

// Output the list of random full names
println('Random Full Names: ' + randomFullNamesList)

println('Random Email Addresses: ' + randomEmailAddressesList)

// Set the generated random names and surnames in the input fields
String[] nameParts = (randomFullNamesList[0]).split(' ')

// Function to generate an email address based on the name and surname
// Remove any whitespace from the name and surname
// Convert the name and surname to lowercase
// Generate the email address
WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), nameParts[0 // Set first name in inputField1
    ])

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), nameParts[1 // Middle Name
    ])

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), nameParts[2 // Set last name in inputField2
    ])

String generateEmailAddress(String name, String surname) {
    name = name.trim()

    surname = surname.trim()

    name = name.toLowerCase()

    surname = surname.toLowerCase()

    String emailAddress = ((name + '.') + surname) + '@sample.com'

    return emailAddress
    

}

WebUI.setText(findTestObject('Page_DEMOQA/textarea_Permanent Address_permanentAddress'), randomEmailAddressesList[0])

/////WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), 'First')
////WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'Second')
////WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Third')