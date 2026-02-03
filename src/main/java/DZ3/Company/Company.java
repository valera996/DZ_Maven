package DZ3.Company;

public class Company {
    static String companyName = "megafon";
    final int employeeID;
    String employeeName;

    public Company(String employeeName, int employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }



}
