package Android;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Umang1 extends Umang {
	
	@Test
	 public void Sum() throws InterruptedException {
		 

		 
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/cb_i_agree")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/loginTxt")).click();
		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/mobile_num_input_fld")).sendKeys("9592787051");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/mpin_input_fld")).sendKeys("5555");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/login_btn")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/close_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/bannerImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/moreTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryTitleTxt")).click();
		 
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/categoryLay")).click();
		 driver.findElement(By.className("android.view.View")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/serviceImg")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.name("Register Complaint")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("Agree")).click();
		 driver.findElement(By.name("Complaint Type")).click();
		 driver.findElement(By.name("Complaint Type is required")).click();
		 driver.findElement(By.id("State")).click();
		 driver.findElement(By.name("Andaman Nicobar")).click();
		 driver.findElement(By.name("Purchase City")).click();
		 driver.findElement(By.name("Port Blair")).click();
		 driver.findElement(By.name("Industry")).click();
		 driver.findElement(By.name("Advertisements")).click();
		 driver.findElement(By.name("Category")).click();
		 driver.findElement(By.name("Advertisements - Others")).click();
		 driver.findElement(By.name("Company")).click();
		 driver.findElement(By.name("Other")).click();
		 driver.findElement(By.name("Other *")).sendKeys("abc");
		 driver.findElement(By.name("Nature of Complaint")).click();
		 driver.findElement(By.name("Fraudulent Issue")).click();
		 driver.findElement(By.name("Complaint Details *")).sendKeys("abc");
		 driver.findElement(By.name("Next")).click();
		 driver.findElement(By.name("Preview before Submit")).click();
		 driver.findElement(By.name("Submit")).click();
		 driver.findElement(By.name("OK")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/recent_drawer_img")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/home_bottom_btn")).click();
		 
		 
		 
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();	 
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_myprofile")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/generalLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/edit_profile_txt")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/change_pic_txt")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/dialog_gallery_txt")).click();
		 //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		 //driver.findElement(By.id("MENUID_SHUTTER")).click();
		 //driver.findElement(By.id("android:id/title")).click();
		 //driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'icon_mime')]")).click();
		// driver.findElement(By.id("com.android.documentsui:id/icon_mime")).click();
		// driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/crop_image_menu_crop")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_name_fld")).sendKeys("gurkirat");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_gender_fld")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/dialogMaleTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_dob_fld")).click();
		 driver.findElement(By.id("android:id/date_picker_header_year")).click();
		 driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(By.id("android:id/button1")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_edu_fld")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/txt_item")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_occu_lay_fld")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/txt_item")).click();
		 
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_state_fld")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/txt_item")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_distict_fld")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/txt_item")).click();
		 
		 
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/register_address_fld")).sendKeys("mohali");
		 
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/email_remove_action_txt")).click();
		 //driver.findElement(By.className("android.widget.LinearLayout")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/email_add_update_action_txt")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/email_address_input_fld")).sendKeys("guri@yopmail.com");
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/doneTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_aadhaar")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/link_aadhaar_plus_btn")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/aadhar_complete")).sendKeys("234778736108");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/aadhaarCheck")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 //driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/iv_back")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/iv_back")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_accounts")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/change_registered_mob_lay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/doneTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/alt_mobile_input_fld")).sendKeys("9592787051");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/iv_back")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/change_mpin_lay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/oldMpinEditComplete")).sendKeys("5555");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/newMpinEditComplete")).sendKeys("5555");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/confirmMpinEditComplete")).sendKeys("5555");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/iv_back")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/forgot_mpin_lay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/update_security_ques_lay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/setSecurityQuesTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/ques_lay1")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/radioBtn")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/ans_edit1")).sendKeys("chd");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/ques_lay2")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/radioBtn")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/ans_edit2")).sendKeys("black");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/next_txt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/pass_code_view")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/doneTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/socialMediaLay")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_service_directory")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/search_service_dir")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/et_search_directory")).sendKeys("digisevak");
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/tv_servicedir_title")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/visit_service_txt")).click();
		 driver.findElement(By.className("android.widget.Image")).click();
		 driver.findElement(By.className("android.widget.Button")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_trans_history")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/filterImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/sortAlphaLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/filterServiceLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/selectServiceLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/item_container")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/ll_apply_services")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/applyBtn")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_settings")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/defaultTabLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/radioBtn")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/toggleBannerImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/toggleBannerImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/notifLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/toggleNotificationImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/toggleNotificationImg")).click();
		 driver.findElement(By.id("android.widget.ImageButton")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/languageLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/languageLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_settings")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/languageLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/languageLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/okTxt")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/menuImg")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/layout_settings")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/fontSizeLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/smallRadio")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/fontSizeLay")).click();
		 driver.findElement(By.id("in.gov.umang.negd.g2c.staging:id/normalRadio")).click();
		 driver.findElement(By.className("android.widget.ImageButton")).click();
	     
		
}
}
