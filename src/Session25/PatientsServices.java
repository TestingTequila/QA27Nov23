package Session25;

public class PatientsServices
{
    public static void main(String[] args) {
        FortisHospital fh = new FortisHospital();
        fh.cardioServices();
        fh.dentalServices();
        fh.emergencyServices();
        fh.entServices();
        fh.medicalInsuranceServices();
        fh.medicalTrainingServices();
        fh.gynicServices();
        fh.physioServices();
        fh.oncologyServices();
        fh.medicalRD();
        fh.medicalNews();
        fh.covidVaccination();
        fh.childCareServices();
        fh.pandemicServices();

        //USMedicalAssociation usma = new USMedicalAssociation();
        System.out.println("=======TOP CASTING======USMedicalAssociation==========");

        USMedicalAssociation usma = new FortisHospital();
        usma.cardioServices();
        usma.neuroServices();
        usma.physioServices();
        usma.emergencyServices();
        usma.covidVaccination();
        usma.childCareServices();

        System.out.println("=======TOP CASTING======UKMedicalAssociation==========");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.dentalServices();
        ukma.entServices();
        ukma.emergencyServices();
        ukma.covidVaccination();
        ukma.childCareServices();



        System.out.println("=======TOP CASTING======IndianMedicalAssociation==========");
        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncologyServices();
        ima.orthoServices();
        ima.gynicServices();
        ima.emergencyServices();
        ima.covidVaccination();


        System.out.println("=====TOP CASTING======HOSPITAL CLASS=====================");
        Hospital hs = new FortisHospital();
        hs.medicalNews();
        hs.medicalRD();
        hs.emergencyServices();
        hs.covidVaccination();
        hs.childCareServices();
        hs.pandemicServices();


    }
}
