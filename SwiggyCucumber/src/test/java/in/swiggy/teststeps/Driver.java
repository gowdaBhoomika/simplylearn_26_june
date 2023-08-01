package in.swiggy.teststeps;


	import org.openqa.selenium.chrome.ChromeDriver;

	import in.swiggyMain.pages.Food;
	import in.swiggyMain.pages.LandingPage;
	import in.swiggyMain.pages.Restaurant;
	import in.swiggyMain.pages.SignIn;

	public class Driver  extends Tools{
		
		protected static LandingPage landingpage;
		protected static Restaurant restaurant;
		protected static Food food;
		protected static SignIn signin;
		
		public static void init() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.swiggy.com/");
			landingpage = new LandingPage(driver);
			restaurant = new Restaurant(driver);
			food = new Food(driver);
			signin = new SignIn(driver);
		}

	}


