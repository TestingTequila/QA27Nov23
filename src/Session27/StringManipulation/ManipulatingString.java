package Session27.StringManipulation;

import java.util.Arrays;

public class ManipulatingString
{
    public static void main(String[] args) {

        String str= "Hi this is my java code and i am so happy";
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i', str.indexOf('i')+1));

        System.out.println(str.length()); // 41
        System.out.println(str.charAt(0)); // H
        System.out.println(str.charAt(12));// y
        System.out.println(str.charAt(39)); //p
        System.out.println(str.charAt(40)); //y
        //System.out.println(str.charAt(41)); // SIOB

        if(str.charAt(14)=='j')
        {
            System.out.println("Java is present");
        }
        else
        {
            System.out.println("Java is absent");
        }

        // indexOf
        System.out.println(str.indexOf('j'));
        System.out.println(str.indexOf('H'));

        if(str.indexOf("java")==14)
        {
            System.out.println("Java Exists ");
        }
        else
        {
            System.out.println("No Java");
        }

        String m1 = "Welcome Jason";
        if(m1.indexOf("admin")==8)
        {
            System.out.println("Admin login successful");
        }
        else
        {
            System.out.println("Not an admin login");
        }

        String test = "this is java program";
        System.out.println(test.toUpperCase().toLowerCase());

        String test1 = "I AM LEARNING JAVA";
        System.out.println(test1.toLowerCase().toUpperCase());

        String p = "       hello world        ----";
        System.out.println(p);
        System.out.println(p.trim());

        System.out.println(p.replace(" ", ""));

        String dob= "25-12-1994"; // 25/12/1994
        System.out.println(dob.replace("-", "/"));

        String s = "I hate Java";
        System.out.println(s.replace("hate", "love"));

        System.out.println("=======================================");
        System.out.println(str.contains("Python"));

        System.out.println("======split==================");

        String lang = "JAVA_PYTHON_C#_RUBY_JAVASCRIPT";
        System.out.println(lang.length());
        String[] s1 = lang.split("_");
        System.out.println(s1.length);
        System.out.println(Arrays.toString(s1));
        for(String st: s1)
        {
            if(st.equals("RUBY"))
            {
                System.out.println("Python exists");
                break;
            }
            else {
                System.out.println(st);
            }
        }

        String pop = "xXtestingxXseleniumXxXautomationXXxXTrainingX";
        String[] p1= pop.split("xX");
        System.out.println(p1.length);
        System.out.println(Arrays.toString(p1));

        String ss = "JanBaskTrainingByAshish";
        System.out.println(String.format("My course name is %s and this is amazing", ss));
        double d1 = 47.65734;
        double d2 = 40.65734;

        double sum = d1+d2;
        System.out.println(String.format("%.2f", sum));

        System.out.println(String.format("My answer is %.2f", d1));
    }
}
