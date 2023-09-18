import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_contact'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/contact')

'step 2: At Page_contact click on input_personal_name'

testObj = findTestObject('Object Repository/Page_contact/input_personal_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_contact input on input_personal_name'

testObj = findTestObject('Object Repository/Page_contact/input_personal_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_personal_name)

'step 4: At Page_contact input on input_personal_age'

testObj = findTestObject('Object Repository/Page_contact/input_personal_age')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_personal_age)

'step 5: At Page_contact click on button_personal_next --> navigate to Page_contact_step1'

testObj = findTestObject('Object Repository/Page_contact/button_personal_next')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: At Page_contact_step1 input on input_contact_email'

testObj = findTestObject('Object Repository/Page_contact/input_personal_name')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_personal_name)

'step 7: At Page_contact_step1 click on button_contact_next --> navigate to Page_contact_step2'

testObj = findTestObject('Object Repository/Page_contact/button_personal_next')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/contact/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: Add visual checkpoint at Page_contact_step2'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Submission of Personal Information on Contact Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
