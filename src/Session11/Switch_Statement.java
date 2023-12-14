package Session11;

public class Switch_Statement
{
    public static void main(String[] args) {
        int num=500;
        switch (num)
        {
            case 60:
            case 70:
            case 100:
                System.out.println("The number is greater than 20");
                break;
            case 90:
                System.out.println("the number is 90");
                break;
            case 200:
                System.out.println("the number is 200");
                 break;
            default:
                System.out.println("No number matches...");
                break;
            case 300:
                System.out.println("the number is 300");
                break;
        }
    }
}
