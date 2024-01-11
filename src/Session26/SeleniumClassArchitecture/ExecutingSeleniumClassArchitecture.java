package Session26.SeleniumClassArchitecture;

public class ExecutingSeleniumClassArchitecture {

    public static void main(String[] args) {
        WebDriver driver;
        //ChromeDriver driver = new ChromeDriver();
        //ChromiumDriver driver = new ChromeDriver();
        //EdgeDriver driver = new EdgeDriver();
        //FirefoxDriver driver = new FirefoxDriver();
        //SafariDriver driver = new SafariDriver();
        //RemoteWebDriver driver= new ChromiumDriver();
//        WebDriver driver =new RemoteWebDriver();

        String browserType = "Edge";
        if(browserType.equals("Chrome"))
        {
            driver =new ChromeDriver();
        }
        else if (browserType.equals("Edge")) {
            driver =new ChromeDriver();
        }

        else if (browserType.equals("Firefox")) {
            driver =new FirefoxDriver();
        }
        else if (browserType.equals("Safari")) {
            driver =new SafariDriver();
        }
        else {
            driver = null;
        }

        String ulr=driver.get("www.google.com");
        System.out.println("Enter the url: " + ulr);
        String pageTitle =driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        driver.close();




    }
}
