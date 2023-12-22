package Session17;

public class Browser
{
    public  boolean launchBrowser(String browserName)
    {
        boolean flag;
        System.out.println(" Browser Name : " + browserName);
        switch (browserName)
        {
            case "Chrome":
                System.out.println("Chrome is Launched");
                flag= true;
                break;
            case "Firefox":
                System.out.println("Firefox is Launched");
                flag= true;
                break;
            case "Edge":
                System.out.println("Edge is Launched");
                flag= true;
                break;
            case "Safari":
                System.out.println("Safari is Launched");
                flag= true;
                break;
            default:
                System.out.println(browserName + " is an invalid browser name");
                flag=false;
                break;
        }
        return flag;
    }
}
