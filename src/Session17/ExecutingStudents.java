package Session17;

public class ExecutingStudents
{
    public static void main(String[] args)
    {
        Students stud = new Students();
        int marks =stud.getStudentMarks("Mark");
        if(marks>0)
        {
            System.out.println(" Print the marksheet");
        }
        else
        {
            System.out.println("Student didn't do well....No mark sheet required");
        }
    }
}
