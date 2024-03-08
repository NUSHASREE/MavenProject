package CRMLoginMain;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageFactor.CRMLoginpagefactory;
import pageFactor.CRMPageFactor;
import  pageFactor.CompanyPageFactory;
import  pageFactor.ContactPageFactory;
import  pageFactor.NewFramePageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
	 
	public class MainMethod {
		WebDriver driver;
	 
		@BeforeTest
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://classic.freecrm.com/register/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		@Test(priority=1)
		public void signup() {

	    	
			CRMPageFactor lp = new CRMPageFactor(driver);
			lp.edition().sendKeys("Free Edition");
			lp.FirstName().sendKeys("Usha sree");
			lp.LastName().sendKeys("Nandiamandalam");
			lp.email().sendKeys("iytyftu@gmail.com");
			lp.confirmEmail().sendKeys("iytyftu@gmail.com");
			lp.Username().sendKeys("Ushasree_16151");
			lp.password().sendKeys("Usha@1619");
			lp.ConfirmPassword().sendKeys("Usha@1619");
			lp.ClickAgreeterms().click();
			lp.clickSubmit().click();
			
			lp.companyName().sendKeys("Capgemini");
			lp.Phonenumber().sendKeys("6756534354");
			lp.FaxNumber().sendKeys("765465467");
			lp.Website().sendKeys("www.uygucv.com");
			lp.CompanyEmail().sendKeys("uvyccu@capgemini.com");
			lp.Address().sendKeys("karnataka,banguluru");
			lp.City().sendKeys("Banguluru");
			lp.State().sendKeys("Karnatala");
			lp.Postcode().sendKeys("3278468");
			lp.copyAddress().sendKeys("karnataka,banguluru");
			lp.clickContinue().click();
			
			lp.firstname().sendKeys("Usha sree");
			lp.lastname().sendKeys("Nandiamandalam");
			lp.email().sendKeys("iytyftu@gmail.com");
			lp.confirmemail().sendKeys("iytyftu@gmail.com");
			lp.username().sendKeys("Ushasree_16151");
			lp.Password().sendKeys("Usha@1619");
			lp.confirmpassword().sendKeys("Usha@1619");
			lp.CompleteRegistration().click();
			
		}
	 
		@Test(priority = 2)
		public void crmLogin() {
			CRMLoginpagefactory lp = new CRMLoginpagefactory(driver);	 
			lp.setUsername().sendKeys("Ushasree_16151");
			lp.setPassword().sendKeys("Usha@1619");
			lp.clickLogin().click();
	 
		}
	 
		@Test(priority = 3)
		public void Company() throws InterruptedException {
			WebElement innerframe = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
			driver.switchTo().frame(innerframe);
			Actions act = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//a[normalize-space()='Companies']"));
			WebElement MouseTop = driver.findElement(By.cssSelector("a[title='New Company']"));
			act.moveToElement(mouseHover).moveToElement(MouseTop).click().perform();
			Thread.sleep(2000);
		}
	 
		@Test(priority=4)
		public void Companydetails() {
			CompanyPageFactory cm = new CompanyPageFactory(driver);
			cm.setcompany().sendKeys("Capgemini");
			cm.setindustry().sendKeys("IT");
			cm.setannualrevenue().sendKeys("700000");
			cm.setnumofemployees().sendKeys("6000");
			cm.setstatus().sendKeys("Active");
			cm.setcategory().sendKeys("Client");
			cm.setpriority().sendKeys("low");
			cm.setsource().sendKeys("Ad");
			cm.setidentifier().sendKeys("Sha");
			cm.setvatnumber().sendKeys("12367");
			cm.setphone().sendKeys("8877765544");
			cm.setfax().sendKeys("1126667");
			cm.setwebsite().sendKeys("www.capgemini.com");
			cm.setemail().sendKeys("danda@gmail.com");
			cm.setsymbol().sendKeys("cap");
			cm.setclientlookup().sendKeys("sheki");
			cm.setaddresstitle().sendKeys("address");
			cm.setaddress().sendKeys("Andhra");
			cm.setcity().sendKeys("Ongole");
			cm.setstate().sendKeys("AP");
			cm.setpostcode().sendKeys("523211");
			cm.setcountry().sendKeys("India");
			cm.settags().sendKeys("Cap");
			cm.setservice().sendKeys("Have A Nice Day");
		}
	 
		@Test(priority=5)
		public void Contact() throws InterruptedException {
			Actions act = new Actions(driver);
			WebElement mouseHover = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
			WebElement MouseTop = driver.findElement(By.cssSelector("a[title='New Contact']"));
			act.moveToElement(mouseHover).moveToElement(MouseTop).click().perform();
			Thread.sleep(2000);
		}
	 
		@Test(priority=6)
		public void Contactdetails() {
			ContactPageFactory cp = new ContactPageFactory(driver);
			cp.settitle().sendKeys("Miss");
			cp.setfirstname().sendKeys("uydcvj");
			cp.setmiddlename().sendKeys("D");
			cp.setlastname().sendKeys("idpucbwi");
			cp.setsuffix().sendKeys("sr.");
			cp.setnickname().sendKeys("ucvuw");
			cp.setclientlookup().sendKeys("Accenture");
			cp.setcompanyposition().sendKeys("Analyst");
			cp.setdepartment().sendKeys("IT");
			cp.setcontactsupervisor().sendKeys("ecbiu");
			cp.setcontactassistant().sendKeys("D");
			cp.setcontactreference().sendKeys("Friend");
			cp.setcategory().sendKeys("abc");
			cp.setstatus().sendKeys("Inactive");
			cp.setphone().sendKeys("543352786");
			cp.setmobile().sendKeys("9278370917");
			cp.sethomephone().sendKeys("754635445");
			cp.setfax().sendKeys("998876");
			cp.setemail().sendKeys("hbcuu@gmail.com");
			cp.setemailalt().sendKeys("hbcuu@gmail.com");
			cp.setid().sendKeys("101");
			cp.setnetwork().sendKeys("Global");
			cp.setskype().sendKeys("shaD");
			cp.setbirthday().sendKeys("28-08-2001");
			cp.setidentifier().sendKeys("kjdhukd");
			cp.setaddresstitle().sendKeys("Home");
			cp.settype().sendKeys("Address");
			cp.setaddress().sendKeys("Andhra");
			cp.setcity().sendKeys("	Kadapa");
			cp.setstate().sendKeys("AP");
			cp.setpostcode().sendKeys("523211");
			cp.setcountry().sendKeys("India");
			cp.settags().sendKeys("FreeCrm Website");
		}
	 
		@Test(priority = 7)
		public void Form() throws InterruptedException {
			Actions act = new Actions(driver);
			WebElement mouseOver = driver.findElement(By.xpath("//a[normalize-space()='Forms']"));
			WebElement mouseTop = driver.findElement(By.xpath("//a[normalize-space()='New Form']"));
			act.moveToElement(mouseOver).moveToElement(mouseTop).click().perform();
			Thread.sleep(2000);
		}
	 
		@Test(priority=8)
		public void Formdetails() {
	 
			NewFramePageFactory fm = new NewFramePageFactory(driver);
			fm.settitle().sendKeys("Feedback Form");
			fm.setpages().sendKeys("7");
			fm.setreport_email().sendKeys("sufytv@gmail.com");
			fm.setwelcomemessage().sendKeys("Good Morning");
			fm.setConfirmationMessage().sendKeys("Good Morning ");
			driver.close();
		}

}
