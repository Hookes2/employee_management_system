public class DatabaseConnectionManager {

    public DatabaseConnectionManager() {
    }

    public DatabaseConnection getManagerInstance()
    {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        return databaseConnection;
    }

    public void connect()
    {
        System.out.println("Connecting to the database "+getManagerInstance());
    }

    public void getConnectionObject()
    {
        System.out.println("Getting database connection object"+getManagerInstance());
    }

    public void disconnect()
    {
        System.out.println("Disconnecting database connection "+getManagerInstance());
    }


}
