package Session20;

public class RegisterPage
{
    private  String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private String getAddress() {
        return address;
    }

    private String getDob() {
        return dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void PrintRegistrationDetails()
    {
        System.out.println("Name: " + getName() + " Age:" + getAge() + " Address:" + getAddress()+ " DOB:" + getDob());
    }

    private String address;
    private String dob;
}
