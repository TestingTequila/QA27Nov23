package Session17;

public class EmployeeDeviceDetails {
    public String[] getEmployeeDeviceDetails(String empName) {
        if (empName.equals("Jason")) {
            String[] devices = {"macbook pro", "ipad", "iph15"};
            return devices;
        }
        else if (empName.equals("Harry")) {
            String[] devices = {"Windows10", "Samsung10"};
            return devices;
        }

        else if (empName.equals("Kerrie")) {
            String[] devices = {"Windows10", "Samsung10", "iphone14"};
            return devices;
        }
        else
            System.out.println("Employee name not found....");
        return new String[0];
    }
}
