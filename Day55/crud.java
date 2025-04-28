/*
 🧠 First — What is CRUD?

    -Create → Add data into the database

    -Read → Get data from the database

    -Update → Change data in the database

    -Delete → Remove data from the database

    -All using Java + JDBC (database connection).

⚙️ Basic Steps for JDBC:

    -Load MySQL JDBC Driver.

    -Connect to the Database.

    -Create a Statement.

    -Write SQL query.

    -Run the query.

    -Close the connection.

 */


 import java.sql.*;

public class crud {
    public static void main(String[] args) {
        try {
            // 1️. Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2️. Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/yourDatabaseName", 
                "username", 
                "password"
            );

            // 3️. Create Statement
            Statement stmt = con.createStatement();

            // 4️. Create (Insert Data)
            String insert = "INSERT INTO students VALUES (1, 'Alice', 20)";
            stmt.executeUpdate(insert);
            System.out.println("Data Inserted.");

            // 5️. Read (Select Data)
            String select = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(select);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }

            // 6️. Update (Change Data)
            String update = "UPDATE students SET age = 21 WHERE id = 1";
            stmt.executeUpdate(update);
            System.out.println("🔄 Data Updated.");

            // 7️. Delete (Remove Data)
            String delete = "DELETE FROM students WHERE id = 1";
            stmt.executeUpdate(delete);
            System.out.println("❌ Data Deleted.");

            // 8️. Close connection
            con.close();
            System.out.println("🔒 Connection Closed.");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
