package Session11;

public class BrowserLaunch
{
    public static void main(String[] args) {
        String browserType = "Chrome";
        if(browserType=="Safari")
        {
            System.out.println("Execute my test case on chrome browser");
        }
        else if(browserType=="Firefox")
        {
            System.out.println("Execute my test case on firefox browser");
        }
        else if(browserType=="IE")
        {
            System.out.println("Execute my test case on IE browser");
        }
        else if(browserType=="Edge")
        {
            System.out.println("Execute my test case on Edge browser");
        }

        else if(browserType=="Chrome")
        {
            System.out.println("Execute my test case on Edge browser");
        }
        else
        {
            System.out.println("Please provide correct browser name.....");
        }
    }
}
