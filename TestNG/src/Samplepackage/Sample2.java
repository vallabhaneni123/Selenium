package Samplepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample2 {
	WebDriver d=new FirefoxDriver();
	@BeforeMethod 
	public void delaymethod()
	{
		System.out.println("Please wait");
	}
	@Test(priority=1)
	public void opengoogle()
	{
		d.get("https://www.google.com/");
		System.out.println("google site open successful");
	}
	@Test(priority=2)
	public void opengmail()
	{
		d.get("http://www.gmail.com/");
		System.out.println("gmail open successful");
	}
	@Test(priority=3)
	public void openfacebook()
	{
		d.get("www.facebook.com");
		System.out.println("facebook open successful");
	}

}
