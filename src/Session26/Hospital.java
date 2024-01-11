package Session26;

public class Hospital extends UHA implements WHO, HGA
{
    public void medicalRD()
    {
        System.out.println("Hospital----medicalRD");
    }

    public void medicalNews()
    {
        System.out.println("Hospital----medicalNews");
    }

    public void emergencyServices(){
        System.out.println("Hospital----emergencyServices");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Hospital----covidVaccination");
    }

    @Override
    public void childCareServices() {
        System.out.println("Hospital---childCareServices");
    }
}
