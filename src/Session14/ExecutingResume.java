package Session14;

public class ExecutingResume {
    public static void main(String[] args) {
        //NameOfTHeClassWhoseCopy/ObjectYouWantToCreate aliasName = new NameOfTHeClassWhoseCopy/ObjectYouWantToCreate();
        Resume harryResume = new Resume();
        harryResume.firstName = "Harry";
        harryResume.lastName = "Potter";
        harryResume.age = 26.5;
        harryResume.workExperience = 5;
        harryResume.isMarried = false;

        Resume kerrieResume= new Resume();
        kerrieResume.lastName="Kerrie";
        kerrieResume.lastName="Wright";
        kerrieResume.age=30;
        kerrieResume.workExperience=9;
        kerrieResume.isMarried=false;

        Resume benResume= new Resume();
        benResume.firstName="Ben";
        benResume.lastName="Fletcher";
        benResume.age=27;
        benResume.workExperience=6;
        benResume.isMarried=true;

       Resume joeResume = new Resume();
        joeResume.firstName="Joe";
        joeResume.lastName="Hill";
        joeResume.age=23;
        joeResume.workExperience=1;
        joeResume.isMarried=false;
        System.out.println(joeResume.age);
        System.out.println(joeResume.lastName);
//        joeResume =null;
//        System.out.println(joeResume.age);
//        System.out.println(joeResume.lastName);
        joeResume= new Resume();
        joeResume.age=70;
        joeResume.lastName="Clinton";
        System.out.println(joeResume.age);
        System.out.println(joeResume.lastName);

        new Resume().firstName="Tony";// No Reference Object
        new Resume().lastName="Pikhaver";
        new Resume().age=44;
        System.gc();


    }
}
