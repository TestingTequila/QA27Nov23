package Session19;

public class LoginPage
{
    String userName;
    String password;

    public LoginPage(String userName, String password)
    {
        this.userName=userName;
        this.password=password;
    }

    public  boolean doLogin()
    {
        System.out.println("Entered username "+userName);
        System.out.println("Entered password "+password);
        System.out.println("Click on Login button");
        System.out.println(userName + " logged in  successfully");
        return true;
    }
}
