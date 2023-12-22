package Session17;

public class ExecutingBrowser
{
    public static void main(String[] args) {
        Browser br = new Browser();
        if(br.launchBrowser("Ashish"))
        {
            System.out.println("Enter the url in the browser");
        }
        else
        {
            System.out.println("Cannot enter url as the Browser Type is invalid ");
        }
    }
}
