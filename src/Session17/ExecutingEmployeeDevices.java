package Session17;

import java.util.Arrays;

public class ExecutingEmployeeDevices
{
    public static void main(String[] args) {
        EmployeeDeviceDetails edd = new EmployeeDeviceDetails();
        String[] devices= edd.getEmployeeDeviceDetails("Jason");
        System.out.println(Arrays.toString(devices));
    }
}
