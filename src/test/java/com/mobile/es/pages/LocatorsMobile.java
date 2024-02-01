package com.mobile.es.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;


public class LocatorsMobile {
	public AndroidDriver driver;
	
  public LocatorsMobile(AndroidDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
  }
	
public By checkbox=By.id( "com.earlysalary.android:id/checkbox_verification_tnc");
public By agreebutton=By.id("com.earlysalary.android:id/button_next");
public By permission_options=By.id("com.earlysalary.android:id/text_view_title");
public By mobile_number_textbox=By.id("com.earlysalary.android:id/edit_text_mobile_number");
public By loginbutton=By.id("com.earlysalary.android:id/button_next");
public By pageswipe=  By.id("com.earlysalary.android:id/viewPager");

//3.0 login
public By skipbutton=By.id("com.earlysalary.android:id/btnSkip");
public By mobilenumbertextbox=By.id("com.earlysalary.android:id/textinput_placeholder");
public By checkbox3 = By.id("com.earlysalary.android:id/cbTerms");
public By getOtp =By.id("com.earlysalary.android:id/btnGetOtp");
public By loginButton =	By.id("com.earlysalary.android:id/btnLogin");
public By setupaccountbutton =By.id("com.earlysalary.android:id/btnGetStarted");
public By referralCode =By.id("com.earlysalary.android:id/btnHaveReferralCode");
public By gmailLogin =By.id("com.earlysalary.android:id/viewGoogleLogin");
//public By dialerpopup =By.id("com.google.android.gms:id/credential_primary_label");
public By setupAccount =By.id("com.earlysalary.android:id/btnGetStarted");
public By providepersonaldetailsCTA =By.id("com.earlysalary.android:id/btnGetStarted");
public By email =By.xpath("//android.widget.TextView[@text='earlysalary2015@gmail.com']");
public By otptextfield = By.id("com.earlysalary.android:id/edtOtp");
public By dialerpopup= By.id("com.google.android.gms:id/credential_picker_layout");




//logout
public By moremenu =By.xpath("//android.widget.TextView[@text='More']");
public By logouticon =By.xpath("//android.widget.TextView[@text='Logout']");
public By logoutyesbutton=By.id("com.earlysalary.android:id/btnLeft");


//3.0 first milestone
public By firstName =By.id("com.earlysalary.android:id/etFirstName");
public By lastName =By.id("com.earlysalary.android:id/etLastName");
public By ctaname = By.id("com.earlysalary.android:id/btnSaveName");
public By dob =By.id("com.earlysalary.android:id/btnSelectDate");
public By dobtextBox =By.id("com.earlysalary.android:id/edDateField");
public By dobcta =By.id("com.earlysalary.android:id/text_input_end_icon");
public By salaried =By.id("com.earlysalary.android:id/btnSalaried");
public By selfemployed =By.id("com.earlysalary.android:id/chipSelfEmployed");
public By editPan =By.id("com.earlysalary.android:id/ivEditPan");
public By showPrefetchPan =By.id("com.earlysalary.android:id/etShowPan");
public By ctapan =By.id("com.earlysalary.android:id/etShowPan");
public By completeprofilebutton =By.id("com.earlysalary.android:id/btnContinueCta");
public By laterbutton=By.id("com.earlysalary.android:id/btnContinueCta");
public By DOBpicker =By.xpath("//android.widget.EditText[@resource-id='android:id/numberpicker_input']");
public By panConfirmButton=By.id("com.earlysalary.android:id/btnConfirmPan");
public By permissionSkipButton =By.id("com.earlysalary.android:id/btnSkip");
public By onScreenInstructions = By.xpath("//android.widget.Button[@text='Okay, got it!']");
public By doitlater =By.id("com.earlysalary.android:id/btnTextCta");
public By completeapplication =By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By panumbertextfield = By.id("com.earlysalary.android:id/etPan");
public By enterPAN =By.id("com.earlysalary.android:id/text_input_end_icon");
public By continueKYC = By.xpath("//android.widget.ImageView[@resource-id='com.earlysalary.android:id/btnContinueCta']");
public By uploadBankstatement = By.xpath("//android.widget.ImageView[@resource-id='com.earlysalary.android:id/btnTextCta']");
public By dismiss = By.id("com.earlysalary.android:id/ivDismiss");


//3.0 second milestone
//relationship status
public By singleButton =By.id("com.earlysalary.android:id/btnSingle");
public By maleButton =By.id("com.earlysalary.android:id/chipMale");
public By okaygotit = By.id("com.earlysalary.android:id/btn_save_details");
public By sociallogin = By.id("com.earlysalary.android:id/viewGoogleLogin");
//salary
public By salarytextField =By.id("com.earlysalary.android:id/etSalary");
public By salarycta=By.id("com.earlysalary.android:id/text_input_end_icon");
public By familyIncomeCheckBox =By.id("com.earlysalary.android:id/cbTerms");
public By salaryconfirmcta=By.id("com.earlysalary.android:id/btnConfirmSalary");

//work address
public By workaddress = By.id("com.earlysalary.android:id/etWorkAddress");
public By googlesearch = By.id("com.earlysalary.android:id/places_autocomplete_search_bar");
public By earlysaltext =By.id("com.earlysalary.android:id/places_autocomplete_prediction_primary_text");
public By editButton =By.id("com.earlysalary.android:id/ivEditShortWorkAddress");
public By companyName =By.id("com.earlysalary.android:id/etCompanyName");
public By completeAddress = By.id("com.earlysalary.android:id/etCompleteAddress");
public By OfficeLocality = By.id("com.earlysalary.android:id/etOfficeArea");
public By WorkPincode =By.id("com.earlysalary.android:id/etWorkPincode");
public By City =By.id("com.earlysalary.android:id/etCity");
public By backbutton=By.id("com.earlysalary.android:id/places_autocomplete_back_button");

//home address
public By saveAddressCTA = By.id("com.earlysalary.android:id/btnSaveAddress");
public By homeaddress = By.id("com.earlysalary.android:id/etHomeAddress");
public By annastaytext =By.id("com.earlysalary.android:id/places_autocomplete_prediction_primary_text");
public By edithomeaddress =By.id("com.earlysalary.android:id/ivEditShortHomeAddress");
public By completeaddress =By.id("com.earlysalary.android:id/etCompleteAddress");
public By houseno =By.id("com.earlysalary.android:id/etFlatNo");
public By locality =By.id("com.earlysalary.android:id/etArea");
public By pincode=By.id("com.earlysalary.android:id/etPincode");
public By saveaddressbutton = By.id("com.earlysalary.android:id/btnSaveAddress");

//demographic toggle view
public By localiytoggleview =By.id("com.earlysalary.android:id/etOfficeArea");
public By workpindodetoggleview=By.id("com.earlysalary.android:id/etWorkPincode");
public By saveandproceed =By.id("com.earlysalary.android:id/btnSubmit");



//KYC
public By completeKYCCTAinDashboard = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By completeKYCwelcomebackscreen = By.id("com.earlysalary.android:id/btnGetStarted");
public By selfieuploadbutton =By.id("com.earlysalary.android:id/viewUpload1");
public By selfiepermission =By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
public By cameraicon =By.id("com.earlysalary.android:id/camera_icon");
public By camerabubble = By.id("com.earlysalary.android:id/camera_bubble");
public By retake =By.id("com.earlysalary.android:id/btnSubmitPhoto");

//Manual KYC 
public By submitselfie =By.id("com.earlysalary.android:id/btnSubmitPhoto");
public By manualKYCoption =By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/viewMain'])[3]");
String aadhar ="Aadhar";
public By  aadharchip =By.id("com.earlysalary.android:id/btnAadhar");
//com.earlysalary.android:id/btnAadhar
public By aadhardialogboxfrontside = By.id("com.earlysalary.android:id/viewUpload1");
public By permissionfordocupload = By.id("com.android.permissioncontroller:id/permission_allow_button)");
public By seconddpermissionfordocupload = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
public By takeaadharphoto = By.id("com.earlysalary.android:id/camera_bubble");
public By retakedoc = By.id("com.earlysalary.android:id/btnConfirm");
public By submitdoc = By.id("com.earlysalary.android:id/btnSubmitPhoto");
public By submitCTA = By.id("com.earlysalary.android:id/btnConfirm");
public By aadhardialogboxbackside = By.id("com.earlysalary.android:id/viewUpload2");
public By docnumber = By.id("com.earlysalary.android:id/etDocId");
public By continueKYCCTA =By.xpath("//android.widget.Button[@text='Complete KYC']");
public By illdoitlaterKYC = By.id("com.earlysalary.android:id/btnTextCta");

//Permanent Address
public By Addressline1 = By.id("com.earlysalary.android:id/etCompleteAddress");
public By Addressline2 = By.id("com.earlysalary.android:id/etFlatNo");
public By landmark = By.id("com.earlysalary.android:id/etArea");

//Bank Details
public By bankname = By.id("com.earlysalary.android:id/ed_bank_name");
public By banknamesearchtextfield = By.id("com.earlysalary.android:id/edtSearch");
public By selectbankname = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/itemView'])[1]");
public By accountnumber = By.id("com.earlysalary.android:id/ed_account_number");
public By confirmaccountnumber = By.id("com.earlysalary.android:id/ed_confirm_account_number");
public By IFSCcode = By.id("com.earlysalary.android:id/ed_ifsc_code");
public By savebankdetailsCTA = By.id("com.earlysalary.android:id/btnSaveBankDetails");
public By pandialogbox = By.id("com.earlysalary.android:id/viewUpload1");
public By okaygotitCTA = By.id("com.earlysalary.android:id/btnContinueCta");
public By chequeleaf = By.id("com.earlysalary.android:id/btnChequeLeaf");
public By chequeleafdialoguebox = By.id("com.earlysalary.android:id/viewUpload1");
public By chequeleafcamerabutton = By.id("com.sec.android.app.camera:id/normal_center_button");
public By okaybutton = By.id("com.sec.android.app.camera:id/okay");
public By submitchequeleaf = By.id("com.earlysalary.android:id/btnSubmitPhoto");


//Bank Statement 
public By continuebankstatementCTA = By.id("com.earlysalary.android:id/btnContinueCta");
public By illdoitlater = By .id("com.earlysalary.android:id/btnTextCta");
public By bankstatementdashboardCTA = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By welcomebankBankstatementCTA = By .id("com.earlysalary.android:id/btnGetStarted");
public By banksearchbar = By.id("com.earlysalary.android:id/edtBankName");
public By banksearchbar2 = By.id("com.earlysalary.android:id/edtSearch");
public By selectfromdropdown = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/itemView'])[1]");
public By banklist =By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/tvTitle']");
public By bankconfirmbutton = By.id("com.earlysalary.android:id/btnConfirm");
public By onlineupload = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/viewMain'])[1]");
public By offlineupload = By.xpath("//android.widget.TextView[contains(@text,'Upload PDF bank statement')]");
public By threeinone = By.xpath("//android.widget.TextView[@text='Upload 3 months statement in 1 PDF']");////android.widget.TextView[@text='Upload 3 months statement in 1 PDF']
public By allthreemonths = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/viewMain'])[2]");
public By uploadbankstatementdialogbox = By.id("com.earlysalary.android:id/viewUpload1");
public By selectbankstatementpdf = By.xpath("//android.widget.TextView[@text='DecJanFeb.pdf']");
public By submitbankstatement = By.id("com.earlysalary.android:id/btnConfirm");



//Pre-Pan toggle view
public By toggleswitchbutton = By.id("com.earlysalary.android:id/fabOption");
public By gotohomepage = By.xpath("//android.widget.TextView[contains(@text,'Go to Homepage')]");
public By changetotoggleviewform = By.xpath("//android.widget.TextView[contains(@text,'Change View')]");
public By firstnametoggleview = By.id("com.earlysalary.android:id/etFirstName");
public By lastnametoggleview = By.id("com.earlysalary.android:id/etFirstName");
public By dobtoggleview = By.id("com.earlysalary.android:id/etDob");
public By employmentTypetoggleview = By.id("com.earlysalary.android:id/btnSalaried");
public By submitCTAtoggleview = By.id("com.earlysalary.android:id/btnSubmit");
public By confirmPanToggleview = By.id("com.earlysalary.android:id/btnConfirmPan");









//Validation messages
public By mobileNumberValidationMessage = By.xpath("//android.widget.TextView[contains(@text,'Enter 10-digit mobile number')]");
public By termsandconditionsValidationMessage = By.xpath("//android.widget.TextView[contains(@text,'Accept Terms & Conditions')]");
public By otpblankvalidationmessage  = By.xpath("//android.widget.TextView[contains(@text,'Accept Terms & Conditions')]");
public By firstnameandlastnamevalidationmessage = By.xpath("//android.widget.TextView[contains(@text,'Minimum 2 characters required')]");
public By dobvalidationmessage = By.xpath("//android.widget.TextView[contains(@text,'Select date of birth')]");
public By employmentTypevalidation = By.xpath("//android.widget.TextView[contains(@text,'Your employment type?')]");
public By relationshipStatusToggleViewvalidation = By.id("com.earlysalary.android:id/tvRelationType");
public By companyNameValidationmessage = By.xpath("//android.widget.TextView[contains(@text,'This field cannot remain empty')]");
public By completeOfficeAddressValidationmessage = By.xpath("//android.widget.TextView[contains(@text,'This field cannot remain empty')]");
public By LocalityValidationmessage = By.xpath("//android.widget.TextView[contains(@text,'This field cannot remain empty')]");
public By invalidPincodevalidationmessage = By.xpath("//android.widget.TextView[contains(@text,'Invalid pincode')]");
public By cityvalidationmessage = By.xpath("//android.widget.TextView[contains(@text,'This field cannot remain empty')]");
public By salaryvalidationmessage = By.xpath("//android.widget.TextView[contains(@text,'This field cannot remain empty')]");

//UW 
public By provideAdditionalDocument = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By continueUWsuspendjourneybuttonCTA = By.id("com.earlysalary.android:id/btnGetStarted");
public By appointmentLetter = By.xpath("//android.widget.TextView[contains(@text,'Provide appointment/offer letter')]");
public By UpdatePANnumber = By.xpath("//android.widget.TextView[contains(@text,'Update PAN number')]");
public By Salarysliprequired = By.xpath("//android.widget.TextView[contains(@text,'Salary slip required')]");
public By Salarymissing = By.xpath("//android.widget.TextView[contains(@text,'Salary missing')]");
public By ProvideindividualITR = By.xpath("//android.widget.TextView[contains(@text,'Provide individual ITR-3/4')]");
public By Providebankstatement = By.xpath("//android.widget.TextView[contains(@text,'Provide bank statement')]");

//Buttons and fields
public By reasonList = By.xpath("//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/itemView']");
public By uwsuspendCTA = By.id("com.earlysalary.android:id/btnConfirm");
public By uwsuspenduploaddialoguebox1 = By.id("com.earlysalary.android:id/viewUpload1");
public By uwsuspenduploaddialoguebox2 = By.id("com.earlysalary.android:id/viewUpload2");
public By uwsuspenduploaddialoguebox3 = By.id("com.earlysalary.android:id/viewUpload3");
public By uwsuspendpantextfield = By.id("com.earlysalary.android:id/etPan");
public By verifyTickButton = By.xpath("//android.widget.ImageView[@resource-id='com.earlysalary.android:id/ivStatus']");

//SALARY missing reasons
public By salaryReason1 = By.xpath("//android.widget.RadioButton[contains(@text,'I got salary for 1 months in another bank account')]"); //user gets redirected to bank statement journey
public By salaryReason2 = By.xpath("//android.widget.RadioButton[contains(@text,'I do not get salary in a bank account (May be salary in cash')]");//user gets redirected to dashboard
public By salaryReason3 = By.xpath("//android.widget.RadioButton[contains(@text,'I did not get salary for the last 1 months (Salary issues or student or self-employed')]");//
public By salaryReason4 = By.xpath("//android.widget.RadioButton[contains(@text,'I have just started working (Do not have atleast 2 months salary')]");

public By submitsalaryreason2 = By.id("com.earlysalary.android:id/btnRight");
public By changeanswer = By.id("com.earlysalary.android:id/btnLeft");
public By provideITR = By.xpath("//android.widget.TextView[contains(@text,'Upload ITR file')]");
public By ITRcta= By.xpath("//android.widget.Button[@text='Provide individual ITR-3/4']");
public By continueTouploadITR = By.id("com.earlysalary.android:id/btnOkay");
public By informativetext = By.id("com.earlysalary.android:id/btn_save_details");


//editProfile
public By editPofilebutton = By.id("com.earlysalary.android:id/cl_my_profile");
public By editemailaddress = By.id("com.earlysalary.android:id/txt_edit_email_address");
public By editprofilehomeaddress = By.id("com.earlysalary.android:id/txt_edit_address_details");
public By editworkadresseditprofile= By.id("com.earlysalary.android:id/txt_edit_company_details");
public By otpemailtextfield = By.id("com.earlysalary.android:id/ed_otp");
public By saveOTP = By.id("com.earlysalary.android:id/btn_save_details");
public By emailIDTextField = By.id("com.earlysalary.android:id/ed_email_id");
public By editprofileokaygotit = By.id("com.earlysalary.android:id/btn_done");
public By backButtoneditprofile = By.xpath("//android.widget.ImageView[@resource-id='com.earlysalary.android:id/img_back_profile']");
public By editBankDetails = By.xpath("com.earlysalary.android:id/txt_edit_bank_detail");
public By closedialerpopup = By.id("com.google.android.gms:id/cancel");
public By status = By.id("com.earlysalary.android:id/tvStatusTitle");



//auto-debit
public By setupautodebitCTA = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By getstartedautodebitwelcomescreenCTA = By.id("com.earlysalary.android:id/btnGetStarted");
public By setupautodebitonlinebutton = By.id("com.earlysalary.android:id/btnSetup");
public By uploadofflineNACHFormlink= By.xpath("(//android.widget.TextView[@resource-id='com.earlysalary.android:id/tvSubHeader'])[2]");
public By downloadandemailform = By.id("com.earlysalary.android:id/btn_yes");
public By alreadydownloadedNACH = By.id("com.earlysalary.android:id/btn_no");
public By clickNACHformphotooption = By.id("com.earlysalary.android:id/viewMainClickNach");
public By uploadNACH = By.id("com.earlysalary.android:id/viewMainClickUploadNach");
public By clicknachformphotobutton = By.id("com.earlysalary.android:id/btnOkay");
public By camera_bubble = By.id("com.earlysalary.android:id/camera_bubble");
public By tryAgain = By.id("com.earlysalary.android:id/tvSubHeaderUploadNach");
public By submitNACH =By.id("com.earlysalary.android:id/tvSubHeaderUploadNach");
public By selectImage = By.xpath("(//android.widget.ImageView[@resource-id='com.google.android.documentsui:id/icon_thumb'])[2]");
public By autoDebitcontinueCTAbutton = By.id("com.earlysalary.android:id/btnContinueCta");
public By autoDebitPageSwipe= By.xpath("//androidx.recyclerview.widget.RecyclerView[@bounds='[0,78][720,1365]']");



//disbursement
public By disbursementdashboardCTA = By.id("com.earlysalary.android:id/btn_instant_cash_action");
public By chooseTenureCTA  = By.id("com.earlysalary.android:id/btn_choose_tenure");
public By tenurebox1 = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/mainView'])[1]");
public By tenurebox2 = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/mainView'])[2]");
public By applypromocode =By.id("com.earlysalary.android:id/txt_apply_promo_code");
public By promocodeCTA = By.id("com.earlysalary.android:id/btn_done");
public By loanAmountfield = By.id("com.earlysalary.android:id/edtAmount");
public By viewdetails = By.id("com.earlysalary.android:id/btn_setup_auto_debit");
public By infobutton = By.id("com.earlysalary.android:id/ivBpiInfo");
public By knowmoreText = By.id("com.earlysalary.android:id/txtAPRInfo");
public By checkboxdisbursement1 = By.xpath("(//android.widget.CheckBox[@resource-id='com.earlysalary.android:id/cbTerms'])[1]");
public By checkboxdisbursement2 = By.xpath("(//android.widget.CheckBox[@resource-id='com.earlysalary.android:id/cbTerms'])[2]");
public By checkboxcontent1 = By.xpath("(//android.widget.TextView[@resource-id='com.earlysalary.android:id/tvCbContent'])[1]");
public By checkboxcontent2 = By.xpath("(//android.widget.TextView[@resource-id='com.earlysalary.android:id/tvCbContent'])[2]");
public By confirmdisbursement = By.id("com.earlysalary.android:id/btnConfirm");
public By disbursementOTP =By.id("com.earlysalary.android:id/ed_otp");


/*Add up to ₹1.5 lacs hospitalization and 100% loan amount cover for just ₹183 with Fibe Ensure I accept Policy T&C & assignment declaration
 * 
 * I accept the loan agreement, CKYC T&C and KFS
 * 	
You are paying ₹1,541 on your loan as the overall cost. The Annual Percentage Rate on your loan is 46.07% Know more
*/



//Repayment 

public By repaynowbutton = By.id("com.earlysalary.android:id/btn_action");
public By repaybutton2=By.id("com.earlysalary.android:id/txt_repay_now");
public By backbuttonrepay = By.id("com.earlysalary.android:id/img_back");
public By dueamountbutton = By.id("com.earlysalary.android:id/btnPayNow");
public By paynowbutton = By.id("com.earlysalary.android:id/btnPayNow");
public By paynowbutton2 = By.id("com.earlysalary.android:id/tvPayNow");
public By viewDetails = By.id("com.earlysalary.android:id/btn_setup_auto_debit");
public By nextdueamount = By.id("com.earlysalary.android:id/clNextDueContainer");
public By totaloutstandingamount = By.id("com.earlysalary.android:id/clTotalOutstandingContainer");
public By nextDueDate = By.id("com.earlysalary.android:id/tvDueDateLabel");
public 	By loanName = By.id("com.earlysalary.android:id/tvLoanName");
public By statusAutoDebit = By.id("com.earlysalary.android:id/txt_status");
public By okaygotitforautodebitdrawer = By.id("com.earlysalary.android:id/btn_complete_application");
public By payEMIdueradiobutton= By.id("com.earlysalary.android:id/radioButton1");
public By closeLoan = By.id("com.earlysalary.android:id/radioButton2");
public By payanotheramount = By.id("com.earlysalary.android:id/radioButton3");
public By paynowbuttonindrawer = 	By.id("com.earlysalary.android:id/btn_done");
public By paysavedetails = By.id("com.earlysalary.android:id/btn_pay");
public By upiIDsaved = By.xpath("(//android.widget.RadioButton[@resource-id='com.earlysalary.android:id/rbOptions'])[1]");
public By upiIApps = By.xpath("(//android.widget.RadioButton[@resource-id='com.earlysalary.android:id/rbOptions'])[4]");
public By upiID = By.xpath("(//android.widget.RadioButton[@resource-id='com.earlysalary.android:id/rbOptions'])[5]");
public By InternetBanking   = By.xpath("(//android.widget.RadioButton[@resource-id='com.earlysalary.android:id/rbOptions'])[6]");
public By paySecurely = By.id("com.earlysalary.android:id/btnPayViaNet");
public By successRazorpay = By.xpath("//android.widget.Button[@text='Success']");
public By payanotheramounttextfield = By.id("com.earlysalary.android:id/textinput_placeholder");
public By googlePay = By.id("com.earlysalary.android:id/ivGooglePay");
public By phonePay = By.id("com.earlysalary.android:id/ivPhonePay");
public By payvianetbanking = By.id("com.earlysalary.android:id/btnPayViaNet");
public By upiIDtextfield = By.id("com.earlysalary.android:id/edt_cvv");
public By payviaUPI = By.id("com.earlysalary.android:id/btnPayUpi");


//LOHOLD

public By dashboardCTAlohold = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By welcomebackCTAlohold = By.id("com.earlysalary.android:id/btnGetStarted");
public By loholdCTA = By.id("com.earlysalary.android:id/btnConfirm");
public By electricityBill = By.id("com.earlysalary.android:id/btnElectricityBill");
public By clickcurrentadressproofdocumentphoto = By.id("com.earlysalary.android:id/viewMainClickNach");
public By switchCamera = By.id("com.sec.android.app.camera:id/switch_camera_button");
public By takePicture = By.id("com.sec.android.app.camera:id/normal_center_button");
public By okaybuttonlohold = By.id("com.sec.android.app.camera:id/okay");
public By submitphoto = By.id("com.earlysalary.android:id/btnSubmitPhoto");
public By uploadPassBook = By.id("com.earlysalary.android:id/viewUpload1");



//loan statement
public By loanStatement = By.xpath("//android.widget.TextView[@text='Loan statement']");
public By downloadandsendtoemail = By.id("com.earlysalary.android:id/btn_download_send");
public By loanStatus = By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/txt_loan_status']");
public By typeanddateofloan = By.xpath("//android.widget.ImageView[@resource-id='com.earlysalary.android:id/img_loan_state_calendar']");//select loan by providing index
public By settingsLoanStatement = By.id("com.earlysalary.android:id/img_loan_filter");
public By activeChip = By.id("com.earlysalary.android:id/chip_active");
public By closedChip = By.id("com.earlysalary.android:id/chip_closed");
public By pendingChip = By.id("com.earlysalary.android:id/chip_pending");
public By cashLoanCategory = By.id("com.earlysalary.android:id/chip_pending");
public By salaryLoanCategory = By.id("com.earlysalary.android:id/chip_salary_card_loans");
public By easyEMIs = By.id("com.earlysalary.android:id/chip_other_loans");
public By applyFilter =  By.id("com.earlysalary.android:id/btn_apply");
public  By clearAllfilter = By.id("com.earlysalary.android:id/btn_clear_all");
public By openLoanCard = By.xpath("(//android.widget.ImageView[@resource-id='com.earlysalary.android:id/img_loan_state_calendar'])[3]");
public By moredetailslink = By.id("com.earlysalary.android:id/txt_more_details");
//display in one page or one line
public By textLoandate = By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/txt_date']");
public By subtext = By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/txt_info']");
public By amount = By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/txt_amount']");
public By creditdebit = By.xpath("//android.widget.TextView[@resource-id='com.earlysalary.android:id/txt_credit_debit']");
public By loanID = By.id("com.earlysalary.android:id/txt_loan_id");
public By cancelLoan = By.id("com.earlysalary.android:id/tvCancelLoan");
public By loanDetailssinglecard = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.earlysalary.android:id/rv_loan_details']");
public By loanDetailsallcards = By.id("com.earlysalary.android:id/rv_loan_details");
public By forecloseLoan =By.id("com.earlysalary.android:id/btnForceCloseLoan");
public By selectloancancellationReason = By.xpath("(//android.widget.ImageView[@resource-id='com.earlysalary.android:id/rbOptions'])[1]");
public By cancelLoanbutton = By.id("com.earlysalary.android:id/btnCancelLoan");
public By continuetocancelloan = By.id("com.earlysalary.android:id/btnContinue");


//firstJobber
public By firstJobberCTA = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By welcomebackfirstjobberCTA = By.id("com.earlysalary.android:id/btnGetStarted");
public By uploadOfferLetter = By.id("com.earlysalary.android:id/btnConfirm");
public By uploadofferletterdialoguebox= By.id("com.earlysalary.android:id/viewUpload1");
public By uploadofferCTA = By.xpath("//android.widget.Button[@text='Upload offer/appointment letter']");
public By verifyEmailID = By.id("com.earlysalary.android:id/btnConfirm");
public By workemailfield = By.id("com.earlysalary.android:id/edtWorkEmail");
public By getOTPCTA = By.id("com.earlysalary.android:id/btnGetOtp");
public By workmailOTPfield = By.id("com.earlysalary.android:id/edtEmailOtp");
public By submitemailOTP = By.id("com.earlysalary.android:id/btnSubmit");
public By gotodashboard = By.id("com.earlysalary.android:id/btnConfirm");

//ITR
public By ITRCTA = By.id("com.earlysalary.android:id/btn_complete_personal_action");
public By welcomebackITR = By.id("com.earlysalary.android:id/btnGetStarted");
public By provideITRCTA = By.id("com.earlysalary.android:id/btnConfirm");
public By onlineMethodITR = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/viewMain'])[1]");
public By offlineMethodITR = By.xpath("(//android.view.ViewGroup[@resource-id='com.earlysalary.android:id/viewMain'])[2]");
public By uploadIITRdialogbox = By.id("com.earlysalary.android:id/viewUpload1");
public By submitITR = By.id("com.earlysalary.android:id/btnConfirm");


//Limit Enhancement

public By fibeCard = By.xpath("//androidx.cardview.widget.CardView[@resource-id='com.earlysalary.android:id/card_complete_profile']");
public By limitEnhancementCTA =By.id("com.earlysalary.android:id/btn_action");
public By limitenhancementbuttonsidemenu = By.xpath("//android.widget.TextView[@text='Upgrade your limit']");
public By submitBankstatementCTAlimitenhancement= By.id("com.earlysalary.android:id/btnContinueCta");


//refer and earn
public By referralCodeHyperlink = By.id("com.earlysalary.android:id/btnTextCta");
public By referraltextfield = By.id("com.earlysalary.android:id/edtRefererCode");
public By applyCode = By.id("com.earlysalary.android:id/btnContinue");
public By  okaygotitreferral= By.id("com.earlysalary.android:id/btn_done");
public By referralhyperlinkinwelcomescreen = By.id("com.earlysalary.android:id/btnHaveReferralCode");
public By referandearnsidemenu = By.id("com.earlysalary.android:id/txt_referral_history");
public By journeyStatus = By.id("com.earlysalary.android:id/cl_journey_status");
public By userJourney = By.id("com.earlysalary.android:id/rv_user_journey");
public By totalEarnings = By.id("com.earlysalary.android:id/img_top_bg");
public By editreferral = By.id("com.earlysalary.android:id/img_edit_referral");
public By editReferralCode =By.id("com.earlysalary.android:id/edittext_referral_code");
public By savereferralcode= By.id("com.earlysalary.android:id/btn_save_referral_code");







































































		





















































		
		






















}

