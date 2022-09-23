package Experiment_1;
import java.util.Arrays;
public class Main {
    public static String[] empHead = {"EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"};
    public static String[][] empData = new String[][] {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };
    public static String[] daHead = {"DesignationCode", "Designation", "DA"};
    public static String[][] daData = new String[][] {
            {"e", "Engineer", "20000"},
            {"c", "Consultant", "32000"},
            {"k", "Clerk", "12000"},
            {"r", "Receptionist", "15000"},
            {"m", "Manager", "40000"}
    };
    public static void main(String[] args) {
        try {

            String[] employee = getEmployee(Integer.parseInt(args[0]));
            System.out.println();
            String DesignationCode = employee[Arrays.asList(empHead).indexOf("DesignationCode")];
            String[] da = getDA(DesignationCode);
            String Designation = da[Arrays.asList(daHead).indexOf("Designation")];

            int Basic = Integer.parseInt(employee[Arrays.asList(empHead).indexOf("Basic")]);
            int HRA = Integer.parseInt(employee[Arrays.asList(empHead).indexOf("HRA")]);
            int IT = Integer.parseInt(employee[Arrays.asList(empHead).indexOf("IT")]);
            int DA = Integer.parseInt(da[Arrays.asList(daHead).indexOf("DA")]);
            int salary = Basic + HRA + DA - IT;


            System.out.println("Emp Name: "+ employee[1]);
            System.out.println("Department: " + employee[4]);
            System.out.println("Designation: " + Designation);
            System.out.println("Salary: " + salary);
        } catch (Exception e) {
            System.out.println("There is no employee with empid : " + args[0]);
        }
    }

    public static String[] getEmployee(int EmpNo) {  // ID of an employee passed as an argument
        int rowSize = empData.length;
        int colSize = empData[0].length;
        String[] employee = new String[colSize];

        for (int i = 0; i < rowSize; i++) {
            if (EmpNo == Integer.parseInt(empData[i][0])) {
                for (int j = 0; j < colSize; j++) {
                    employee[j] = empData[i][j];
                }
            }
        }
        return employee;
    }
    public static String[] getDA(String DesignationCode) {
        int rowSize = daData.length;
        int colSize = daData[0].length;
        String[] da = new String[colSize];

        for (int i = 0; i < rowSize; i++) {
            if (DesignationCode.equals(daData[i][0])) {
                for (int j = 0; j < colSize; j++) {
                    da[j] = daData[i][j];
                }
            }
        }
        return da;
    }
}