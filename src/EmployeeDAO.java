public class EmployeeDAO extends DatabaseConnectionManager{
    DatabaseConnectionManager databaseConnectionManager;

    public EmployeeDAO(DatabaseConnectionManager databaseConnectionManager) {
        this.databaseConnectionManager = databaseConnectionManager;
    }

    public void saveEmployee(Employee employee)
    {
        databaseConnectionManager.connect();
        System.out.println("Saving "+employee+" information to the database");
        databaseConnectionManager.disconnect();
    }

    public void deleteEmployee(Employee employee)
    {
        databaseConnectionManager.connect();
        System.out.println("Deleting "+employee+" information from the database");
        databaseConnectionManager.disconnect();
    }
}
