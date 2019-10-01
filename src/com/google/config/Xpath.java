package com.google.config;

import com.google.base.TestBase;

public class Xpath extends TestBase {

	public static final String browser="firefox";
	public static final String site="https://www.google.com/";
	
	public static final long implicitly_wait=20;
	public static final long pageload_timeout=20;
	
	public static final String search="/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input";
    public static final String googlesearch="/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]";
    public static final String luckybtn="/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[2]";
	public static final String signin="//*[@id=\"gb_70\"]";
	public static final String googleapp="/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[1]/div/a";
	
	public static final String account="//*[@id=\"gb192\"]";
	public static final String searchbtn="//span[text()=\"Search\"]";
	public static final String map="//span[text()=\"Maps\"]";
	public static final String youtube="//*[@id=\"gb36\"]/span[1]";
	public static final String playstore="//span[@class=\"gb_m\" and text()=\"Play\"]";
	public static final String news="//span[@style=\"background-position:0 -1173px\"]";
	public static final String gmail="//a[@class=\"gb_d\" and @id=\"gb23\"]";
	public static final String drive="//*[@id=\"gb49\"]/span[1]";
	public static final String calender="//span[text()=\"Calendar\"]";
	public static final String googleplus="//span[text()=\"Googleplus\"]";
	public static final String translate="//span[@class=\"gb_k\" and @style=\"background-position:0 -2553px\"]";
	public static final String photos="//span[text()=\"Photos\"]";
		
//----------------------------Account-------------------------------------
	
	public static final String googleAccountTxt ="//*[@id=\"sdgBod\"]";
	public static final String accountsigninbtn ="//*[@id=\"gb\"]/div[2]/div[3]/div/a";
	
	public static final String email = "//*[@id=\"identifierId\"]";
	public static final String pass = "//input[@type=\"password\"]";
	
	public static final String matchAccount = "//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/c-wiz/div/div[4]/div/div/header/h1";
	
//-----------------------------Search-----------------------------------
	
	
	public static final String SearchSignInbtn ="//a[@id=\"gb_70\"]";
	public static final String SearchSbtn ="//span[@class=\"gb_xa gbii\"]";
	public static final String mailidtxt ="//div[@class=\"gb_bb\"]";
	
//-----------------------------map------------------------------------
	
	
	public static final String clickAccount="//*[@id=\"sdgBod\"]/span[2]";
	public static final String serachgooglemap ="//div[@jstcache=\"109\" and @class=\"omnibox-singlebox-root omnibox-active\"]";
	public static final String horizontalmap ="//div[@class=\"app-horizontal-widget-holder noprint\"]";
	public static final String mapSignInBtn = "//a[@class=\"gb_Ud gb_1 gb_jb\"]";
	public static final String mailidTxt ="//*[@id=\"gb\"]/div/div/div/div[2]/div[2]/div[1]/div/div[2]";
	
//--------------------------------youtube------------------------------------------	
	public static final String youtubetext="//*[@id=\"logo-icon-container\"]";
	public static final String youtubesearchbox="//form[@id=\"search-form\"]";
	public static final String youtubeuploadbtn ="//form[@id=\"Upload\"]";
	public static final String youtubeSignInBtn = "//a[@class=\"gb_Ud gb_1 gb_jb\"]";
	public static final String youtubeSBtn = "";
//----------------------------------Playstore---------------------------------------

	
	public static final String playstoreimg="//img[@class=\"gb_la\"]";
	public static final String playsearchbox="//div[@id=\"gbfwa\"]";
	public static final String playcontent="//c-wiz[@class=\"Knqxbd tzLNed Mfkobe\"]";
	public static final String palyStoreSignInBtn ="//a[@id=\"gb_70\"]"; 
	public static final String palyStoresBtn = "//span[@class=\"gb_xa gbii\"]";
	public static final String palyStoremailidTxt="//div[@class=\"gb_bb\"]";
//-----------------------------------News---------------------------------
	public static final String googleNewstext="//div[@class=\"gb_7b cqGcc\"]";
	public static final String googleTopNews="//a[@class=\"SFllF KKjvXb\"]";
	public static final String NewsSignInBtn="//a[@class=\"gb_1 gb_2 gb_Ud gb_jb\"]";
	public static final String NewsSBtn="//span[@class=\"gb_xa gbii\"]";
	public static final String NewsemailidTxt ="//div[@class=\"gb_bb\"]";
	
	
//-------------------------------------Gmail-------------------------------
	public static final String gmailImg="/html/body/div[2]/div[1]/div[2]/div[2]/div/span";
	public static final String signinbtn="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a";
	public static final String createaccbtn="/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a";
	public static final String gmailSignInBtn="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a";
	public static final String gmailSBtn = "//span[@class=\"gb_xa gbii\"]";
	public static final String gmailmailidTxt ="//div[@class=\"gb_bb\"]";
	
	
	
	//-----------------------------------Drive----------------------------------
	public static final String googledrivetext="/html/body/span/header/div[1]/a/div";
	public static final String meetDrive="/html/body/span/header/nav/ul/li[1]/a";
	public static final String usingDrive="/html/body/span/header/nav/ul/li[2]/a";
	public static final String driveicon = "/html/body/section/div[2]/div/img";
	public static final String gotoDrive="/html/body/section/div[2]/div/a";
	public static final String DriveSignInBtn="";
	public static final String driveSBtn="//span[@class=\"gb_xa gbii\"]";
	public static final String drivemailidTxt ="//div[@class=\"gb_bb\"]";
	
//-----------------------------------Calender----------------------------
	public static final String CalenderSignInBtn="";
	public static final String CalenderSBtn="//span[@class=\"gb_xa gbii\"]";
	public static final String CalendermailidTxt ="//div[@class=\"gb_bb\"]";
	
	
	
	
	
//----------------------------------------GooglePlus------------------------	
	
	public static final String Googleplustext ="//span[text()=\"Google+\"]";
	public static final String GooglePlusSearchBox ="//span[text()=\"Search\"]";
	
	
//-----------------------------------Translate-----------------------------
	
	public static final String TranslateTxt ="//span[text()=\"Translate\"]";
	public static final String TranslateBtn ="//span[text()=\"Translate Button\"]";
	public static final String TranslateSignInBtn="/html/body/header/div[2]/div[3]/div[1]/a";
	public static final String TranslateSBtn="//span[@class=\"gb_xa gbii\"]";
	public static final String TranslatemailidTxt ="//div[@class=\"gb_bb\"]";
	
	
	
	
	
//-----------------------------------Photos---------------------------------
	public static final String PhotosTxt ="//*[@id=\"js-header\"]/a/img";
	public static final String GoToGooglePhotosBtn ="//*[@id=\"js-hero-btn\"]";
	public static final String PhotosSignInBtn="//a[@id=\"js-hero-btn\"]";
	public static final String PhotosSBtn="//span[@class=\"gb_xa gbii\"]";
	public static final String PhotosmailidTxt ="//div[@class=\"gb_bb\"]";
	
//----------------------------Hindi Lan------------------------------------
	
	public static final String HindiBtn="//*[@id=\"SIvCob\"]/a[1]";
	public static final String HindiSearch="//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]";
	public static final String HindiLuckyDay="//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]";
	public static final String HindiSignInBtn="//a[@id=\"gb_70\"]";
	
//---------------------------------07 assi---------------------------------

	public static final String searchName1="Amitabh Bachchan";
	public static final String wikipedia = "//*[@id=\"rhs_block\"]/div/div[1]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/span";
	
//------------------------------08 assi-----------------------------------
	
	public static final String navigateSite="https://www.google.co.in/intl/en/about/products/";
	
	public static final String WebSearch="//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Search\"]";
	public static final String googleChrome="//h3[@class=\"row-title-search-and-explore products-grid-item-title\" and text()=\"Chrome\"]";
	public static final String toolBar="//*[@id=\"zippy-1-content144\"]/div/ul/li[13]/a/j";
	public static final String bookMarks="//*[@id=\"zippy-1-content12\"]/div/ul/li[13]/a/j";
	public static final String  mobile="//*[@id=\"zippy-1-content134\"]/div/ul/li[13]/a/j";
	public static final String mapsforMobile="//*[@id=\"zippy-1-content111\"]/div/ul/li[13]/a/j";
	public static final String searchForMobiles="//*[@id=\"zippy-1-content134\"]/div/ul/li[13]/a/j";
	public static final String adWords="//*[@id=\"zippy-1-content001\"]/div/ul/li[13]/a/j";
	public static final String googleAppsForWork="//*[@id=\"zippy-1-content01\"]/div/ul/li[13]/a/j";
	public static final String googleMyBussiness="//h3[@class=\"row-title-grow-your-business products-grid-item-title\" and text()=\"Google My Business\"]";
	public static final String adSense="//h3[@class=\"row-title-grow-your-business products-grid-item-title\" and text()=\"AdSense\"]";
	public static final String adMob="//*[@id=\"zippy-2-content\"]/div/ul/li[1]/a/p";
	public static final String youTube ="//h3[@class=\"row-title-watch-and-play products-grid-item-title\" and text()=\"YouTube\"]";
	public static final String Books="//h3[@class=\"row-title-use-anywhere products-grid-item-title\" and text()=\"Chromebook\"]";
	public static final String ImageSearch="//*[@id=\"zippy-1-content981\"]/div/ul/li[13]/a/j";
	public static final String News="//*[@id=\"zippy-1-content\"]/div/ul/li[48]/a/p";
	public static final String videoSearch="//*[@id=\"zippy-1-content145\"]/div/ul/li[13]/a/j";
	public static final String picasa="//*[@id=\"zippy-1-content123\"]/div/ul/li[13]/a/j";
	public static final String maps="//*[@id=\"zippy-1-content\"]/div/ul/li[46]/a/p";
	public static final String earth="//*[@id=\"zippy-1-content\"]/div/ul/li[15]/a/p";
	public static final String panorania="//*[@id=\"zippy-1-content12\"]/div/ul/li[13]/a/j";
	public static final String customeSearch="//*[@id=\"zippy-1-content11\"]/div/ul/li[13]/a/j";
	public static final String scholar="//*[@id=\"zippy-1-content\"]/div/ul/li[52]/a/p";
	public static final String  trends="//*[@id=\"zippy-2-content\"]/div/ul/li[24]/a/p";
	public static final String Gmail="//*[@id=\"zippy-1-content\"]/div/ul/li[19]/a/p";
	public static final String Drive="//*[@id=\"zippy-1-content\"]/div/ul/li[14]/a/p";
	public static final String docs="//*[@id=\"zippy-1-content\"]/div/ul/li[12]/a/p";
	public static final String sheets="/html/body/main/div/section[3]/section[7]/div/ul[2]/li[2]/div/h3";
	public static final String slides="/html/body/main/div/section[3]/section[7]/div/ul[2]/li[3]/div/h3";
	public static final String forms="//*[@id=\"zippy-1-content\"]/div/ul/li[17]/a/p";
	public static final String drawings="//*[@id=\"zippy-1-content\"]/div/ul/li[13]/a/p";
	public static final String sales="//*[@id=\"zippy-1-content1\"]/div/ul/li[13]/a/j";
	public static final String Calender="//*[@id=\"zippy-1-content\"]/div/ul/li[3]/a/p";
	public static final String Translate="//*[@id=\"zippy-1-content\"]/div/ul/li[58]/a/p";
	public static final String googlecloudprint="//*[@id=\"zippy-1-content\"]/div/ul/li[23]/a/p";
	public static final String googlekeeps="/html/body/main/div/section[3]/section[6]/div/ul[2]/li[4]/div/h3";
	public static final String googlestore="//*[@id=\"zippy-1-content\"]/div/ul/li[40]/a/p";
	public static final String Googleplus="//*[@id=\"zippy-2-content\"]/div/ul/li[26]/a/p";
	public static final String blogger="//*[@id=\"zippy-2-content\"]/div/ul/li[6]/a/p";
	public static final String groups="//*[@id=\"zippy-1-content\"]/div/ul/li[31]/a/p";
	public static final String hangouts="//*[@id=\"zippy-1-content\"]/div/ul/li[44]/a/p";
	public static final String code="//*[@id=\"zippy-1-content61\"]/div/ul/li[13]/a/j";
		
	
//----------------------------------------09 assi--------------------------
	public static final String gmailNavigateSite="mail.google.com";
	
//-------------------------------------10 assi-----------------------------
	
	public static final String inboxNo = "//div[@class=\"bsU\"]";
	public static final String rightSideNo="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]";
	
//---------------------------------11 assi---------------------------------
	
	//	public static final String starred = "//span[@title=\"Starred\"]";
	public static final String starred = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div/div/div[2]";
	public static final String starredNo = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/span/div[1]/span/span[2]";
	
//-------------------------------- 13 assi------------------------------
	
	public static final String gmailComposeBtn = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div";
	public static final String composeDailogueBox = "/html/body/div[21]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr";
//---------------------------------------------14 Assi--------------------	

     public static final String sendMailTo = "//*[@id=\":f7\"]";
     public static final String sendMaiSubject = "//*[@id=\":ep\"]";
     public static final String sendMailTextArea = "//*[@id=\":fu\"]";
     public static final String sendBtn = "//*[@id=\":ef\"]";

//--------------------------------15 assi--------------------------------
     public static final String searchTextArea = "/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[2]/div[2]/form/div/table/tbody/tr/td/table/tbody/tr/td/div/input[1]";
     public static final String searchMailId = "";

     
//--------------------------------17 assi---------------------------------
     
     public static final String settingIcon = "//div[@id=\":1j\"]";
     public static final String settingTxt = "//div[@id=\"ms\"]";
     public static final String settingPage = "//*[@id=\":4\"]";
     
     
//----------------------------------18 assi-------------------------------
     
     public static final String createNewLabel = "//*[@id=\":d4\"]";
     public static final String newLabelTxt = "//*[@id=\":x9.na\"]";
     
     
//--------------------------------19 assi----------------------------------
    
     public static final String checkBox = "//div[@id=\":al\"]";
     public static final String moveToImg = "//*[@id=\":bv\"]";
     public static final String selectlabel = "//*[@id=\":yn\"]";
     public static final String labeltext = "//*[@id=\":fw\"]";
     
//-------------------------------20 assi ----------------------------------
     
     public static final String SBtn = "//span[@class=\"gb_ya gbii\"]";	
     public static final String SignOutBtn = "*[id=\"gb_71\"]";






}


