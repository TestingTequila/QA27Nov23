package Session11;

public class ExamResults
{
    public static void main(String[] args) {
        int marks=80;
        if(marks>75)
        {
            System.out.println("The child has passed--Grade A");
            if(marks>85)
            {
                System.out.println("Child be given award by school");
                if(marks>95)
                {
                    System.out.println("The child will be given scholorship");
                    if(marks==100)
                    {
                        System.out.println("The child will be awarded by the Government");
                    }
                }
            }

        }
        else
        {
            System.out.println("The child has grade B");;
        }
    }

}
