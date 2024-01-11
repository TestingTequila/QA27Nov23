package Session26;

public interface USMedicalAssociation extends WHO, HGA {
    String MY_MESSAGE = "Hello Everyone";
    int MEETING_TIME = 10;

    public void cardioServices();

    public void neuroServices();

    public void physioServices();

    public void emergencyServices();

    public static void governmentApproval() {
        System.out.println("USMA----Govt. Approved Hospital");
    }

    default void defineRating()
    {
        System.out.println("");
    }
}
