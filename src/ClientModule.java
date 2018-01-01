public class ClientModule {
    public static void main(String[] args)
    {
        Employee james = new Employee(1, "James", "Engineering", true);
        hireNewEmployee(james);
//        terminateEmployee(james);
        printEmployeeReport(james, FormatType.CSV);
    }

    public static void hireNewEmployee(Employee employee)
    {
        DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();
        EmployeeDAO employeeDAO = new EmployeeDAO(databaseConnectionManager);
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee)
    {
        DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager();
        EmployeeDAO employeeDAO = new EmployeeDAO(databaseConnectionManager);
        employeeDAO.deleteEmployee(employee);

    }

    public static void printEmployeeReport(Employee employee, FormatType formatType)
    {
        ReportFormatter reportFormatter = new ReportFormatter();
        reportFormatter.getFormattedValue(employee, formatType);
        System.out.println(reportFormatter.getFormattedValue(employee, formatType));
    }
}
