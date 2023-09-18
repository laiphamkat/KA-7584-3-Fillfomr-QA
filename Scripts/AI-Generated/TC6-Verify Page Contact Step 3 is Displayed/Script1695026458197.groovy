import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_contact_step3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/contact/step3')

'step 2: Add visual checkpoint at Page_contact_step3'

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Page Contact Step 3 is Displayed_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
