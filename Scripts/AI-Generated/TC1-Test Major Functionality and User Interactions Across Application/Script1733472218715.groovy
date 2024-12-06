import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link WebInputs -> Navigate to page 'resource page#inputs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_WebInputs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link WebInputs - Navigate to page resource pageinputs.png')

"Step 3: Click on input formFields (Number)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on input formFields Number.png')

"Step 4: Enter input value in input formFields (Number)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_1]), input_formFields)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Enter input value in input formFields Number.png')

"Step 5: Click on input formFields (Text)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input formFields Text.png')

"Step 6: Enter input value in input formFields (Text)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_3]), input_formFields_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in input formFields Text.png')

"Step 7: Click on input formFields (Password)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on input formFields Password.png')

"Step 8: Enter input value in input formFields (Password)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_5]), input_formFields_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in input formFields Password.png')

"Step 9: Click on input formFields (Date)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input formFields Date.png')

"Step 10: Click on input formFields (Date)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/input_formFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/input_formFields', ['input_formFields_internalLabel': input_formFields_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input formFields Date.png')

"Step 11: Click on button inputActions (DisplayInputs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_inputActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_inputActions', ['button_inputActions_internalRoleButtonName': button_inputActions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button inputActions DisplayInputs.png')

"Step 12: Click on button inputActions (ClearInputs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_inputActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_inputActions', ['button_inputActions_internalRoleButtonName': button_inputActions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button inputActions ClearInputs.png')

"Step 13: Click on link APITesting -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'inputs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resource/link_APITesting'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link APITesting - Navigate to page .png')

"Step 14: Click on link TestLoginPage -> Navigate to page 'authentication page#login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_TestLoginPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link TestLoginPage - Navigate to page authentication pagelogin.png')

"Step 15: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input Username.png')

"Step 16: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input Username.png')

"Step 17: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input Password.png')

"Step 18: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Enter input value in input Password.png')

"Step 19: Click on button Login -> Navigate to page '/secure'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button Login - Navigate to page secure.png')

"Step 20: Click on link Logout -> Navigate to page 'authentication page#login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link Logout - Navigate to page authentication pagelogin.png')

"Step 21: Click on button authenticationOptions (Practice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions', ['button_authenticationOptions_internalText': button_authenticationOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on button authenticationOptions Practice.png')

"Step 22: Click on button authenticationOptions (Practice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions', ['button_authenticationOptions_internalText': button_authenticationOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on button authenticationOptions Practice.png')

"Step 23: Click on input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Username2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on input Username2.png')

"Step 24: Enter input value in input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username2'), input_Username2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Enter input value in input Username2.png')

"Step 25: Click on button authenticationOptions (SuperSecretPassword)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on button authenticationOptions SuperSecretPassword.png')

"Step 26: Click on button authenticationOptions (SuperSecretPassword)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_authentication/button_authenticationOptions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on button authenticationOptions SuperSecretPassword.png')

"Step 27: Click on item Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/item_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on item Password.png')

"Step 28: Click on item Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/item_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on item Password.png')

"Step 29: Click on input Password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Password2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on input Password2.png')

"Step 30: Enter input value in input Password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Password2'), input_Password2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Enter input value in input Password2.png')

"Step 31: Click on button Login2 -> Navigate to page '/secure'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/button_Login2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on button Login2 - Navigate to page secure.png')

"Step 32: Click on link Logout -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/secure?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_secure/link_Logout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on link Logout - Navigate to page .png')

"Step 33: Click on link Practice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on link Practice.png')

"Step 34: Click on link DragAndDrop -> Navigate to page 'interactive tool#drag-and-drop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DragAndDrop'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on link DragAndDrop - Navigate to page interactive tooldrag-and-drop.png')

"Step 35: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'drag-and-drop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_interactive_tool/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on link Practice - Navigate to page .png')

"Step 36: Click on link RadioButtons -> Navigate to page 'form elements#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_RadioButtons'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on link RadioButtons - Navigate to page form elements.png')

"Step 37: Click on input colorSports (Red)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports', ['input_colorSports_internalLabel': input_colorSports_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on input colorSports Red.png')

"Step 38: Click on input colorSports (Yellow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports', ['input_colorSports_internalLabel': input_colorSports_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on input colorSports Yellow.png')

"Step 39: Click on input colorSports (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports', ['input_colorSports_internalLabel': input_colorSports_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on input colorSports Black.png')

"Step 40: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_elements/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on div Object.png')

"Step 41: Click on input colorSports (Basketball)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports', ['input_colorSports_internalLabel': input_colorSports_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on input colorSports Basketball.png')

"Step 42: Click on input colorSports (Football)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_form_elements/input_colorSports', ['input_colorSports_internalLabel': input_colorSports_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on input colorSports Football.png')

"Step 43: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form_elements/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on link Practice - Navigate to page .png')

"Step 44: Click on link FileUpload -> Navigate to page 'upload page#upload'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_FileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on link FileUpload - Navigate to page upload pageupload.png')

"Step 45: Click on input FileInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/input_FileInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on input FileInput.png')

"Step 46: Click on button Upload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/button_Upload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on button Upload.png')

"Step 47: Click on p UploadedFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/p_UploadedFiles'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on p UploadedFiles.png')

"Step 48: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on link Practice - Navigate to page .png')

"Step 49: Click on link FileDownloader -> Navigate to page 'download page#download'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_FileDownloader'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on link FileDownloader - Navigate to page download pagedownload.png')

"Step 50: Click on link FileDownload -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'download?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_download/link_FileDownload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Click on link FileDownload - Navigate to page .png')

"Step 51: Click on link Autocomplete -> Navigate to page 'autocomplete#autocomplete'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Autocomplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on link Autocomplete - Navigate to page autocompleteautocomplete.png')

"Step 52: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Click on input Country.png')

"Step 53: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Enter input value in input Country.png')

"Step 54: Click on div countryAutocomplete (India)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on div countryAutocomplete India.png')

"Step 55: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Click on input Country.png')

"Step 56: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Click on input Country.png')

"Step 57: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Enter input value in input Country.png')

"Step 58: Click on div countryAutocomplete (UnitedStates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Click on div countryAutocomplete UnitedStates.png')

"Step 59: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Click on button Submit.png')

"Step 60: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Click on link Practice - Navigate to page .png')

"Step 61: Click on link homeTopics (ChallengingDOM) -> Navigate to page 'dom interaction#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_homeTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_homeTopics', ['link_homeTopics_internalRoleLinkName': link_homeTopics_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Click on link homeTopics ChallengingDOM - Navigate to page dom interaction.png')

"Step 62: Click on link domElements (Bar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_domElements'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Click on link domElements Bar.png')

"Step 63: Click on link domElements (Qux)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_domElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_domElements', ['link_domElements_internalRoleLinkName': link_domElements_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Click on link domElements Qux.png')

"Step 64: Click on link profileActions (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName, 'link_profileActions_nth': link_profileActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Click on link profileActions Object.png')

"Step 65: Click on link profileActions (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_1, 'link_profileActions_nth': link_profileActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Click on link profileActions Object.png')

"Step 66: Click on link profileActions (Object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_2, 'link_profileActions_nth': link_profileActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Click on link profileActions Object2.png')

"Step 67: Click on link profileActions (Object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_3, 'link_profileActions_nth': link_profileActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Click on link profileActions Object3.png')

"Step 68: Click on link profileActions (Object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_4, 'link_profileActions_nth': link_profileActions_nth_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on link profileActions Object.png')

"Step 69: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Click on link Practice - Navigate to page .png')

"Step 70: Click on link LargeAndDeepDOM -> Navigate to page 'page size#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_LargeAndDeepDOM'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Click on link LargeAndDeepDOM - Navigate to page page size.png')

"Step 71: Click on tr Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/tr_Object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on tr Object.png')

"Step 72: Click on tr Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/tr_Object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on tr Object.png')

"Step 73: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on link Practice - Navigate to page .png')

"Step 74: Click on link DragAndDropCircles -> Navigate to page 'drag and drop#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DragAndDropCircles'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Click on link DragAndDropCircles - Navigate to page drag and drop.png')

"Step 75: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_drag_and_drop/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Click on link Practice - Navigate to page .png')

"Step 76: Click on link SecureFileDownload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_SecureFileDownload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Click on link SecureFileDownload.png')

"Step 77: Click on link homeTopics (ShadowDOM) -> Navigate to page 'dom interaction#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_homeTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_homeTopics', ['link_homeTopics_internalRoleLinkName': link_homeTopics_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Click on link homeTopics ShadowDOM - Navigate to page dom interaction.png')

"Step 78: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Click on body Object.png')

"Step 79: Click on button BasicButtonExample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/button_BasicButtonExample'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Click on button BasicButtonExample.png')

"Step 80: Click on div ShadowHost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/div_ShadowHost'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Click on div ShadowHost.png')

"Step 81: Click on button BasicButtonExample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/button_BasicButtonExample'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on button BasicButtonExample.png')

"Step 82: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 82-Click on link Practice - Navigate to page .png')

"Step 83: Click on link Typos -> Navigate to page 'text content#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Typos'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 83-Click on link Typos - Navigate to page text content.png')

"Step 84: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_text_content/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 84-Click on link Practice - Navigate to page .png')

"Step 85: Click on link NotificationMessage -> Navigate to page 'notification#notification-message-rendered'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_NotificationMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 85-Click on link NotificationMessage - Navigate to page notificationnotification-message-rendered.png')

"Step 86: Click on link ClickHere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'notification-message-rendered?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notification/link_ClickHere'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 86-Click on link ClickHere.png')

"Step 87: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'notification-message-rendered?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_notification/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 87-Click on link Practice - Navigate to page .png')

"Step 88: Click on link InfiniteScroll -> Navigate to page 'test resources#infinite-scroll'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_InfiniteScroll'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 88-Click on link InfiniteScroll - Navigate to page test resourcesinfinite-scroll.png')

"Step 89: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'infinite-scroll?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 89-Click on link Practice - Navigate to page .png')

"Step 90: Click on link contextMenu (ContextMenu) -> Navigate to page 'generic page#context-menu'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_contextMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 90-Click on link contextMenu ContextMenu - Navigate to page generic pagecontext-menu.png')

"Step 91: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'context-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 91-Click on link Practice - Navigate to page .png')

"Step 92: Click on link InfiniteScroll -> Navigate to page 'test resources#infinite-scroll'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_InfiniteScroll'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 92-Click on link InfiniteScroll - Navigate to page test resourcesinfinite-scroll.png')

"Step 93: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'infinite-scroll?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 93-Click on link Practice - Navigate to page .png')

"Step 94: Click on link contextMenu (ContextMenu) -> Navigate to page 'generic page#context-menu'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_contextMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 94-Click on link contextMenu ContextMenu - Navigate to page generic pagecontext-menu.png')

"Step 95: Click on div HotSpot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'context-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/div_HotSpot'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 95-Click on div HotSpot.png')

"Step 96: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'context-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 96-Click on link Practice - Navigate to page .png')

"Step 97: Click on link KeyPresses -> Navigate to page 'test resources#key-presses'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_KeyPresses'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 97-Click on link KeyPresses - Navigate to page test resourceskey-presses.png')

"Step 98: Click on input Target"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'key-presses?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/input_Target'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 98-Click on input Target.png')

"Step 99: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'key-presses?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 99-Click on link Practice - Navigate to page .png')

"Step 100: Click on link hoverEffects (Hovers) -> Navigate to page 'element visibility#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_hoverEffects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_hoverEffects', ['link_hoverEffects_internalRoleLinkName': link_hoverEffects_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 100-Click on link hoverEffects Hovers - Navigate to page element visibility.png')

"Step 101: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 101-Click on link Practice - Navigate to page .png')

"Step 102: Click on link DropdownList -> Navigate to page 'generic page#dropdown'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DropdownList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 102-Click on link DropdownList - Navigate to page generic pagedropdown.png')

"Step 103: Click on select Dropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Dropdown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 103-Click on select Dropdown.png')

"Step 104: Click on select Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 104-Click on select Country.png')

"Step 105: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 105-Click on link Practice - Navigate to page .png')

"Step 106: Click on link IFrame -> Navigate to page '/iframe'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_IFrame'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 106-Click on link IFrame - Navigate to page iframe.png')

"Step 107: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframe/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 107-Click on link Practice - Navigate to page .png')

"Step 108: Click on link MultipleWindows -> Navigate to page 'window management#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_MultipleWindows'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 108-Click on link MultipleWindows - Navigate to page window management.png')

"Step 109: Click on link ClickHere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_window_management/link_ClickHere'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 109-Click on link ClickHere.png')

"Step 110: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_window_management/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 110-Click on link Practice - Navigate to page .png')

"Step 111: Click on link RedirectLink -> Navigate to page 'redirector#redirector'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_RedirectLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 111-Click on link RedirectLink - Navigate to page redirectorredirector.png')

"Step 112: Click on body Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'redirector?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_redirector/body_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 112-Click on body Notification.png')

"Step 113: Click on link Here -> Navigate to page 'http status codes#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'redirector?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_redirector/link_Here'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 113-Click on link Here - Navigate to page http status codes.png')

"Step 114: Click on link 301 -> Navigate to page 'http status codes#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_http_status_codes/link_301'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 114-Click on link 301 - Navigate to page http status codes.png')

"Step 115: Click on link Here"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_http_status_codes/link_Here'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 115-Click on link Here.png')

"Step 116: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_http_status_codes/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 116-Click on link Practice - Navigate to page .png')

"Step 117: Click on link DynamicControls -> Navigate to page 'dynamic content#dynamic-controls'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DynamicControls'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 117-Click on link DynamicControls - Navigate to page dynamic contentdynamic-controls.png')

"Step 118: Click on div Checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-controls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/div_Checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 118-Click on div Checkbox.png')

"Step 119: Click on input Checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-controls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/input_Checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 119-Click on input Checkbox.png')

"Step 120: Click on button Remove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-controls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_Remove'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 120-Click on button Remove.png')

"Step 121: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-controls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 121-Click on link Practice - Navigate to page .png')

"Step 122: Click on link Scrollbars -> Navigate to page 'scrolling#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Scrollbars'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 122-Click on link Scrollbars - Navigate to page scrolling.png')

"Step 123: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_scrolling/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 123-Click on link Practice - Navigate to page .png')

"Step 124: Click on link ColorWheel -> Navigate to page 'resource page#color-wheel'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ColorWheel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 124-Click on link ColorWheel - Navigate to page resource pagecolor-wheel.png')

"Step 125: Click on button gameControls (ResetGame)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'color-wheel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_gameControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_gameControls', ['button_gameControls_internalRoleButtonName': button_gameControls_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 125-Click on button gameControls ResetGame.png')

"Step 126: Click on button gameControls (PlayGame)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'color-wheel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_gameControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_gameControls', ['button_gameControls_internalRoleButtonName': button_gameControls_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 126-Click on button gameControls PlayGame.png')

"Step 127: Click on button gameControls (Maroon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'color-wheel?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_gameControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_gameControls', ['button_gameControls_internalRoleButtonName': button_gameControls_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 127-Click on button gameControls Maroon.png')

"Step 128: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'color-wheel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resource/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 128-Click on link Practice - Navigate to page .png')

"Step 129: Click on link TestRegisterPage -> Navigate to page 'registration page#register'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_TestRegisterPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 129-Click on link TestRegisterPage - Navigate to page registration pageregister.png')

"Step 130: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 130-Click on input Username.png')

"Step 131: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_registration/input_Username'), input_Username_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 131-Enter input value in input Username.png')

"Step 132: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 132-Click on input Password.png')

"Step 133: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_registration/input_Password'), input_Password_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 133-Enter input value in input Password.png')

"Step 134: Click on input ConfirmPassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/input_ConfirmPassword'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 134-Click on input ConfirmPassword.png')

"Step 135: Enter input value in input ConfirmPassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_registration/input_ConfirmPassword'), input_ConfirmPassword)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 135-Enter input value in input ConfirmPassword.png')

"Step 136: Click on button Register"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/button_Register'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 136-Click on button Register.png')

"Step 137: Click on button Register"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/button_Register'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 137-Click on button Register.png')

"Step 138: Click on link Practice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 138-Click on link Practice.png')

"Step 139: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'register?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 139-Click on link Practice - Navigate to page .png')

"Step 140: Click on link ForgotPasswordForm -> Navigate to page 'form page#forgot-password'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ForgotPasswordForm'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 140-Click on link ForgotPasswordForm - Navigate to page form pageforgot-password.png')

"Step 141: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'forgot-password?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 141-Click on input Email.png')

"Step 142: Click on button RetrievePassword"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'forgot-password?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form/button_RetrievePassword'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 142-Click on button RetrievePassword.png')

"Step 143: Click on body Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'forgot-password?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form/body_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 143-Click on body Notification.png')

"Step 144: Click on div ConfirmationAlert"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'forgot-password?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form/div_ConfirmationAlert'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 144-Click on div ConfirmationAlert.png')

"Step 145: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'forgot-password?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_form/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 145-Click on link Practice - Navigate to page .png')

"Step 146: Click on link DynamicTable -> Navigate to page 'dynamic content#dynamic-table'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DynamicTable'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 146-Click on link DynamicTable - Navigate to page dynamic contentdynamic-table.png')

"Step 147: Click on p ChromeCPU"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-table?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/p_ChromeCPU'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 147-Click on p ChromeCPU.png')

"Step 148: Click on td Cell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-table?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/td_Cell'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 148-Click on td Cell.png')

"Step 149: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dynamic-table?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 149-Click on link Practice - Navigate to page .png')

"Step 150: Click on link BasicAuthentication -> Navigate to page 'authentication page#basic-auth'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_BasicAuthentication'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 150-Click on link BasicAuthentication - Navigate to page authentication pagebasic-auth.png')

"Step 151: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'basic-auth?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 151-Click on link Practice - Navigate to page .png')

"Step 152: Click on link MyBrowserInformation -> Navigate to page 'generic page#my-browser'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_MyBrowserInformation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 152-Click on link MyBrowserInformation - Navigate to page generic pagemy-browser.png')

"Step 153: Click on button ShowBrowserInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'my-browser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_ShowBrowserInformation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 153-Click on button ShowBrowserInformation.png')

"Step 154: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'my-browser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 154-Click on link Practice - Navigate to page .png')

"Step 155: Click on link DragAndDrop2 -> Navigate to page 'interactive tool#drag-and-drop'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DragAndDrop2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 155-Click on link DragAndDrop2 - Navigate to page interactive tooldrag-and-drop.png')

"Step 156: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'drag-and-drop?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_interactive_tool/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 156-Click on link Practice - Navigate to page .png')

"Step 157: Click on link DragAndDropCircles -> Navigate to page 'drag and drop#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DragAndDropCircles'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 157-Click on link DragAndDropCircles - Navigate to page drag and drop.png')

"Step 158: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_drag_and_drop/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 158-Click on link Practice - Navigate to page .png')

"Step 159: Click on link DragAndDropCircles -> Navigate to page 'drag and drop#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DragAndDropCircles'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 159-Click on link DragAndDropCircles - Navigate to page drag and drop.png')

"Step 160: Click on div ColumnRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_drag_and_drop/div_ColumnRow'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 160-Click on div ColumnRow.png')

"Step 161: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_drag_and_drop/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 161-Click on link Practice - Navigate to page .png')

"Step 162: Click on link FileUpload -> Navigate to page 'upload page#upload'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_FileUpload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 162-Click on link FileUpload - Navigate to page upload pageupload.png')

"Step 163: Click on input FileInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/input_FileInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 163-Click on input FileInput.png')

"Step 164: Click on button Upload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/button_Upload'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 164-Click on button Upload.png')

"Step 165: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_upload/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 165-Click on link Practice - Navigate to page .png')

"Step 166: Click on link Autocomplete -> Navigate to page 'autocomplete#autocomplete'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Autocomplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 166-Click on link Autocomplete - Navigate to page autocompleteautocomplete.png')

"Step 167: Click on body Notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/body_Notification'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 167-Click on body Notification.png')

"Step 168: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 168-Click on input Country.png')

"Step 169: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 169-Enter input value in input Country.png')

"Step 170: Click on div countryAutocomplete (UnitedStates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 170-Click on div countryAutocomplete UnitedStates.png')

"Step 171: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 171-Click on button Submit.png')

"Step 172: Click on p SelectedCountry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/p_SelectedCountry'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 172-Click on p SelectedCountry.png')

"Step 173: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 173-Click on link Practice - Navigate to page .png')

"Step 174: Click on link Autocomplete -> Navigate to page 'autocomplete#autocomplete'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Autocomplete'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 174-Click on link Autocomplete - Navigate to page autocompleteautocomplete.png')

"Step 175: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 175-Click on input Country.png')

"Step 176: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 176-Enter input value in input Country.png')

"Step 177: Click on div countryAutocomplete (UnitedStates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 177-Click on div countryAutocomplete UnitedStates.png')

"Step 178: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 178-Click on button Submit.png')

"Step 179: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 179-Click on input Country.png')

"Step 180: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country_4)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 180-Enter input value in input Country.png')

"Step 181: Click on div countryAutocomplete (CountryAutocomplete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 181-Click on div countryAutocomplete CountryAutocomplete.png')

"Step 182: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 182-Click on button Submit.png')

"Step 183: Click on input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/input_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 183-Click on input Country.png')

"Step 184: Enter input value in input Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_autocomplete/input_Country'), input_Country_5)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 184-Enter input value in input Country.png')

"Step 185: Click on div countryAutocomplete (CountryAutocomplete2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_autocomplete/div_countryAutocomplete', ['div_countryAutocomplete_internalText': div_countryAutocomplete_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 185-Click on div countryAutocomplete CountryAutocomplete2.png')

"Step 186: Click on button Submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/button_Submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 186-Click on button Submit.png')

"Step 187: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'autocomplete?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_autocomplete/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 187-Click on link Practice - Navigate to page .png')

"Step 188: Click on link CypressSpiesStubs -> Navigate to page 'testing tools#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_CypressSpiesStubs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 188-Click on link CypressSpiesStubs - Navigate to page testing tools.png')

"Step 189: Click on button testingTools (FindMyLocation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools', ['button_testingTools_internalRoleButtonName': button_testingTools_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 189-Click on button testingTools FindMyLocation.png')

"Step 190: Click on button testingTools (FindMyLocation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools', ['button_testingTools_internalRoleButtonName': button_testingTools_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 190-Click on button testingTools FindMyLocation.png')

"Step 191: Click on button testingTools (FindMyLocation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools', ['button_testingTools_internalRoleButtonName': button_testingTools_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 191-Click on button testingTools FindMyLocation.png')

"Step 192: Click on tr CountryRow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_tools/tr_CountryRow'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 192-Click on tr CountryRow.png')

"Step 193: Click on button testingTools (DiscoverScientificMethod)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_testing_tools/button_testingTools', ['button_testingTools_internalRoleButtonName': button_testingTools_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 193-Click on button testingTools DiscoverScientificMethod.png')

"Step 194: Click on p StepOne"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_tools/p_StepOne'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 194-Click on p StepOne.png')

"Step 195: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_tools/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 195-Click on link Practice - Navigate to page .png')

"Step 196: Click on link homeTopics (ChallengingDOM) -> Navigate to page 'dom interaction#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_homeTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_homeTopics', ['link_homeTopics_internalRoleLinkName': link_homeTopics_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 196-Click on link homeTopics ChallengingDOM - Navigate to page dom interaction.png')

"Step 197: Click on link profileActions (EditProfile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_5, 'link_profileActions_nth': link_profileActions_nth_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 197-Click on link profileActions EditProfile.png')

"Step 198: Click on link profileActions (DeleteProfile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_profileActions', ['link_profileActions_internalRoleRowName': link_profileActions_internalRoleRowName_6, 'link_profileActions_nth': link_profileActions_nth_6]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 198-Click on link profileActions DeleteProfile.png')

"Step 199: Click on link domElements (Bar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dom_interaction/link_domElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dom_interaction/link_domElements', ['link_domElements_internalRoleLinkName': link_domElements_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 199-Click on link domElements Bar2.png')

"Step 200: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 200-Click on link Practice - Navigate to page .png')

"Step 201: Click on link LargeAndDeepDOM -> Navigate to page 'page size#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_LargeAndDeepDOM'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 201-Click on link LargeAndDeepDOM - Navigate to page page size.png')

"Step 202: Click on div SiblingElements"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/div_SiblingElements'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 202-Click on div SiblingElements.png')

"Step 203: Click on div SiblingElements"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/div_SiblingElements'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 203-Click on div SiblingElements.png')

"Step 204: Click on td CellValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/td_CellValue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 204-Click on td CellValue.png')

"Step 205: Click on td CellValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/td_CellValue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 205-Click on td CellValue.png')

"Step 206: Click on td CellValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/td_CellValue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 206-Click on td CellValue.png')

"Step 207: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_page_size/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 207-Click on link Practice - Navigate to page .png')

"Step 208: Click on link homeTopics (ShadowDOM) -> Navigate to page 'dom interaction#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_homeTopics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_homeTopics', ['link_homeTopics_internalRoleLinkName': link_homeTopics_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 208-Click on link homeTopics ShadowDOM - Navigate to page dom interaction.png')

"Step 209: Click on button BasicButtonExample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/button_BasicButtonExample'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 209-Click on button BasicButtonExample.png')

"Step 210: Click on div ShadowHost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/div_ShadowHost'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 210-Click on div ShadowHost.png')

"Step 211: Click on button BasicButtonExample"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/button_BasicButtonExample'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 211-Click on button BasicButtonExample.png')

"Step 212: Click on div ShadowHost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/div_ShadowHost'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 212-Click on div ShadowHost.png')

"Step 213: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dom_interaction/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 213-Click on link Practice - Navigate to page .png')

"Step 214: Click on link Typos -> Navigate to page 'text content#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Typos'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 214-Click on link Typos - Navigate to page text content.png')

"Step 215: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_text_content/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 215-Click on link Practice - Navigate to page .png')

"Step 216: Click on link JavaScriptDialogs -> Navigate to page 'resource page#js-dialogs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_JavaScriptDialogs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 216-Click on link JavaScriptDialogs - Navigate to page resource pagejs-dialogs.png')

"Step 217: Click on button jsAlerts (JsAlert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 217-Click on button jsAlerts JsAlert.png')

"Step 218: Click on button jsAlerts (JsConfirm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 218-Click on button jsAlerts JsConfirm.png')

"Step 219: Click on button jsAlerts (JsPrompt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 219-Click on button jsAlerts JsPrompt.png')

"Step 220: Click on button jsAlerts (JsAlert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 220-Click on button jsAlerts JsAlert.png')

"Step 221: Click on button jsAlerts (JsConfirm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 221-Click on button jsAlerts JsConfirm.png')

"Step 222: Click on button jsAlerts (JsPrompt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 222-Click on button jsAlerts JsPrompt.png')

"Step 223: Click on button jsAlerts (JsAlert)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_6]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 223-Click on button jsAlerts JsAlert.png')

"Step 224: Click on button jsAlerts (JsConfirm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_7]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 224-Click on button jsAlerts JsConfirm.png')

"Step 225: Click on button jsAlerts (JsPrompt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_resource/button_jsAlerts', ['button_jsAlerts_internalRoleButtonName': button_jsAlerts_internalRoleButtonName_8]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 225-Click on button jsAlerts JsPrompt.png')

"Step 226: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'js-dialogs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resource/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 226-Click on link Practice - Navigate to page .png')

"Step 227: Click on link JavaScriptError -> Navigate to page 'error page#javascript-error'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_JavaScriptError'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 227-Click on link JavaScriptError - Navigate to page error pagejavascript-error.png')

"Step 228: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'javascript-error?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_error/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 228-Click on link Practice - Navigate to page .png')

"Step 229: Click on link JQueryUI -> Navigate to page 'jquery ui#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_JQueryUI'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 229-Click on link JQueryUI - Navigate to page jquery ui.png')

"Step 230: Click on link Menu -> Navigate to page 'jquery ui menu#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui/link_Menu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 230-Click on link Menu - Navigate to page jquery ui menu.png')

"Step 231: Click on link EnabledMenuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_EnabledMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 231-Click on link EnabledMenuItem.png')

"Step 232: Click on link EnabledMenuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_EnabledMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 232-Click on link EnabledMenuItem.png')

"Step 233: Click on link DownloadsMenuItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_DownloadsMenuItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 233-Click on link DownloadsMenuItem.png')

"Step 234: Click on link BackToJQueryUI -> Navigate to page 'jquery ui#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_BackToJQueryUI'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 234-Click on link BackToJQueryUI - Navigate to page jquery ui.png')

"Step 235: Click on link Menu -> Navigate to page 'jquery ui menu#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui/link_Menu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 235-Click on link Menu - Navigate to page jquery ui menu.png')

"Step 236: Click on link menuItems (PDFMenuItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems', ['link_menuItems_internalRoleMenuitemName': link_menuItems_internalRoleMenuitemName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 236-Click on link menuItems PDFMenuItem.png')

"Step 237: Click on link menuItems (CSVMenuItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems', ['link_menuItems_internalRoleMenuitemName': link_menuItems_internalRoleMenuitemName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 237-Click on link menuItems CSVMenuItem.png')

"Step 238: Click on link menuItems (ExcelMenuItem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_jquery_ui_menu/link_menuItems', ['link_menuItems_internalRoleMenuitemName': link_menuItems_internalRoleMenuitemName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 238-Click on link menuItems ExcelMenuItem.png')

"Step 239: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 239-Click on link Practice - Navigate to page .png')

"Step 240: Click on link InfiniteScroll -> Navigate to page 'test resources#infinite-scroll'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_InfiniteScroll'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 240-Click on link InfiniteScroll - Navigate to page test resourcesinfinite-scroll.png')

"Step 241: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'infinite-scroll?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 241-Click on link Practice - Navigate to page .png')

"Step 242: Click on link JQueryUIMenus -> Navigate to page 'jquery ui menu#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_JQueryUIMenus'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 242-Click on link JQueryUIMenus - Navigate to page jquery ui menu.png')

"Step 243: Click on link BackToJQueryUI -> Navigate to page 'jquery ui#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui_menu/link_BackToJQueryUI'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 243-Click on link BackToJQueryUI - Navigate to page jquery ui.png')

"Step 244: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_jquery_ui/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 244-Click on link Practice - Navigate to page .png')

"Step 245: Click on link KeyPresses -> Navigate to page 'test resources#key-presses'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_KeyPresses'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 245-Click on link KeyPresses - Navigate to page test resourceskey-presses.png')

"Step 246: Click on body MailStackApiAnnouncement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'key-presses?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/body_MailStackApiAnnouncement'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 246-Click on body MailStackApiAnnouncement.png')

"Step 247: Click on input Target"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'key-presses?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/input_Target'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 247-Click on input Target.png')

"Step 248: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'key-presses?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_resources/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 248-Click on link Practice - Navigate to page .png')

"Step 249: Click on link Practice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 249-Click on link Practice.png')

"Step 250: Click on link contextMenu (ContextMenu) -> Navigate to page 'generic page#context-menu'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_contextMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 250-Click on link contextMenu ContextMenu - Navigate to page generic pagecontext-menu.png')

"Step 251: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'context-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 251-Click on link Practice - Navigate to page .png')

"Step 252: Click on link hoverEffects (DisappearingElements) -> Navigate to page 'element visibility#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_hoverEffects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_hoverEffects', ['link_hoverEffects_internalRoleLinkName': link_hoverEffects_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 252-Click on link hoverEffects DisappearingElements - Navigate to page element visibility.png')

"Step 253: Click on button Inbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/button_Inbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 253-Click on button Inbox.png')

"Step 254: Click on button Sent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/button_Sent'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 254-Click on button Sent.png')

"Step 255: Click on button Spam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/button_Spam'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 255-Click on button Spam.png')

"Step 256: Click on button Important"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/button_Important'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 256-Click on button Important.png')

"Step 257: Click on button Starred"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/button_Starred'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 257-Click on button Starred.png')

"Step 258: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 258-Click on link Practice - Navigate to page .png')

"Step 259: Click on link DropdownList -> Navigate to page 'generic page#dropdown'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_DropdownList'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 259-Click on link DropdownList - Navigate to page generic pagedropdown.png')

"Step 260: Click on select Dropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Dropdown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 260-Click on select Dropdown.png')

"Step 261: Click on select ElementsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_ElementsPerPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 261-Click on select ElementsPerPage.png')

"Step 262: Click on select Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 262-Click on select Country.png')

"Step 263: Click on select Dropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Dropdown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 263-Click on select Dropdown.png')

"Step 264: Click on select ElementsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_ElementsPerPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 264-Click on select ElementsPerPage.png')

"Step 265: Click on select ElementsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_ElementsPerPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 265-Click on select ElementsPerPage.png')

"Step 266: Click on select Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 266-Click on select Country.png')

"Step 267: Click on select Dropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Dropdown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 267-Click on select Dropdown.png')

"Step 268: Click on select ElementsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_ElementsPerPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 268-Click on select ElementsPerPage.png')

"Step 269: Click on select Country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/select_Country'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 269-Click on select Country.png')

"Step 270: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'dropdown?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 270-Click on link Practice - Navigate to page .png')

"Step 271: Click on link Geolocation -> Navigate to page 'resource page#geolocation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Geolocation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 271-Click on link Geolocation - Navigate to page resource pagegeolocation.png')

"Step 272: Click on button WhereAmI"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'geolocation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resource/button_WhereAmI'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 272-Click on button WhereAmI.png')

"Step 273: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'geolocation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_resource/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 273-Click on link Practice - Navigate to page .png')

"Step 274: Click on link HorizontalSlider -> Navigate to page 'testing resource#horizontal-slider'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_HorizontalSlider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 274-Click on link HorizontalSlider - Navigate to page testing resourcehorizontal-slider.png')

"Step 275: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 275-Click on input Slider.png')

"Step 276: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 276-Click on input Slider.png')

"Step 277: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 277-Click on input Slider.png')

"Step 278: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 278-Click on input Slider.png')

"Step 279: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 279-Click on input Slider.png')

"Step 280: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 280-Click on input Slider.png')

"Step 281: Click on input Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/input_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 281-Click on input Slider.png')

"Step 282: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'horizontal-slider?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_testing_resource/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 282-Click on link Practice - Navigate to page .png')

"Step 283: Click on link hoverEffects (Hovers) -> Navigate to page 'element visibility#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_hoverEffects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_hoverEffects', ['link_hoverEffects_internalRoleLinkName': link_hoverEffects_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 283-Click on link hoverEffects Hovers - Navigate to page element visibility.png')

"Step 284: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 284-Click on link ViewProfile.png')

"Step 285: Click on link ViewProfile2 -> Navigate to page 'user profiles#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_ViewProfile2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 285-Click on link ViewProfile2 - Navigate to page user profiles.png')

"Step 286: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profiles/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 286-Click on link Practice - Navigate to page .png')

"Step 287: Click on link hoverEffects (Hovers) -> Navigate to page 'element visibility#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/link_hoverEffects"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/link_hoverEffects', ['link_hoverEffects_internalRoleLinkName': link_hoverEffects_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 287-Click on link hoverEffects Hovers - Navigate to page element visibility.png')

"Step 288: Click on link ViewProfile3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_ViewProfile3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 288-Click on link ViewProfile3.png')

"Step 289: Click on link ViewProfile2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_ViewProfile2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 289-Click on link ViewProfile2.png')

"Step 290: Click on link ViewProfile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_ViewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 290-Click on link ViewProfile.png')

"Step 291: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_element_visibility/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 291-Click on link Practice - Navigate to page .png')

"Step 292: Click on link FloatingMenu -> Navigate to page 'static page#floating-menu'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_FloatingMenu'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 292-Click on link FloatingMenu - Navigate to page static pagefloating-menu.png')

"Step 293: Click on link ExpandTesting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'floating-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_static/link_ExpandTesting'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 293-Click on link ExpandTesting.png')

"Step 294: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'floating-menu?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_static/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 294-Click on link Practice - Navigate to page .png')

"Step 295: Click on link IFrame -> Navigate to page '/iframe'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_IFrame'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 295-Click on link IFrame - Navigate to page iframe.png')

"Step 296: Click on link Practice -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_iframe/link_Practice'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 296-Click on link Practice - Navigate to page .png')

"Step 297: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Major Functionality and User Interactions Across Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}