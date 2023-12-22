package Session17;

public class Students
{
    // WAP that gives me the marks of the student in final exam

    public  int getStudentMarks(String studentName)
    {
        int marks;

        if(studentName.equals("Jason"))
        {
            marks= 100;
        }
        else if (studentName.equals("Roger"))
        {
            marks= 90;
        } else if (studentName.equals("Tony"))
        {
            marks= 80;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks= 70;
        }
        else
        {
            marks= -1;
        }
        return marks;
    }
}
