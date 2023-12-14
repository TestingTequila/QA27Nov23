package Session11;

public class BrowserType_Switch
{
    public static void main(String[] args) {
        String browserType= "Safari";
        switch (browserType)
        {
            case "Chrome":
                System.out.println("Execute Test case on Chrome browser");
                break;
            case "Firefox":
                System.out.println("Execute Test case on Firefox browser");
                break;
            case "Edge":
                System.out.println("Execute Test case on Edge browser");
                break;
            case "IE":
                System.out.println("Execute Test case on IE browser");
                break;
            default:
                System.out.println("Please provide the correct browser...");
                break;
            case "Safari":
                System.out.println("Execute Test case on safari browser");
                break;
        }
        Can i use equalsIgnoreCase function in this switch statement
    }
}
