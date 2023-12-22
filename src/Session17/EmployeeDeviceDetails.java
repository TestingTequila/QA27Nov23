package Session17;

public class EmployeeDeviceDetails {
    public String[] getEmployeeDeviceDetails(String empName) {
        String [] devices;
        if (empName.equals("Jason")) {
            devices = new String[]{"macbook pro", "ipad", "iph15"};
        }
        else if (empName.equals("Harry")) {
            devices = new String[]{"Windows10", "Samsung10"};
        }

        else if (empName.equals("Kerrie")) {
            devices = new String[]{"Windows10", "Samsung10", "iphone14"};
        }
        else {
            System.out.println("Employee name not found....");
            devices = new String[]{""};
        }
        return devices;
    }
}
