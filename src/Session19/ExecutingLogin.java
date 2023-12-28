package Session19;

public class ExecutingLogin
{
    public static void main(String[] args) {
        LoginPage lp = new LoginPage("test@janbask.com", "test@1234");
        if(lp.doLogin())
        {
            System.out.println("Display the Home Menu items");
        };
    }

}
