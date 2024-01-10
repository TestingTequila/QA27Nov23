package Session25;

public class FortisHospital extends Hospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation
{

    //USMedicalAssociation
    @Override
    public void cardioServices()
    {
        System.out.println("FH------cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH------neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH------physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FH-------EmergencyServices");
    }

    //UKMedicalAssociation
    @Override
    public void entServices() {
        System.out.println("FH----entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH----dentalServices");
    }

    //IndianMedicalAssociation
    @Override
    public void oncologyServices() {
        System.out.println("FH-------oncologyServices");
    }

    @Override
    public void gynicServices() {
        System.out.println("FH-------gynicServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("FH-------orthoServices");
    }

    //FortisHospitalServices
    public void medicalTrainingServices()
    {
        System.out.println("FH-------medicalTrainingServices");
    }

    public void medicalInsuranceServices()
    {
        System.out.println("FH-------medicalInsuranceServices");
    }

    @Override
    public void covidVaccination() {
        System.out.println("FH------covidVaccination");
    }

    @Override
    public void childCareServices() {
        System.out.println("FH-----childCareServices");
    }

    @Override
    public void pandemicServices()
    {
        System.out.println("FH----pandemicServices");
    }
}
