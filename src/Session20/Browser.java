package Session20;

public class Browser
{

    private  void checkRAM()
    {
        System.out.println("checkRAM");
    }

    private   void checkVersion()
    {
        System.out.println("checkVersion");
    }

    private   void checkOS()
    {
        System.out.println("checkOS");
    }

    private   void checkCacheServices()
    {
        System.out.println("checkCacheServices");
    }

    public void launchBrowser(String browserName)
    {
        checkRAM();
        checkVersion();
        checkOS();
        checkCacheServices();
        System.out.println("Launch the " + browserName + " browser");
    }
}
