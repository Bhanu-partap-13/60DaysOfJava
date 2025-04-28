# CRUD Operations in Java - MCQs  

## Beginner-Friendly Questions  

1. **What does CRUD stand for?**  
    - [x] Create, Read, Update, Delete  
    - [ ] Create, Remove, Update, Delete  
    - [ ] Copy, Read, Update, Delete  
    - [ ] Create, Read, Undo, Delete  

2. **Which HTTP method is commonly used for the 'Create' operation in CRUD?**  
    - [ ] GET  
    - [x] POST  
    - [ ] PUT  
    - [ ] DELETE  

3. **Which CRUD operation is used to retrieve data from a database?**  
    - [ ] Create  
    - [x] Read  
    - [ ] Update  
    - [ ] Delete  

4. **What SQL command is used for the 'Update' operation in CRUD?**  
    - [ ] SELECT  
    - [ ] INSERT  
    - [x] UPDATE  
    - [ ] DELETE  

5. **Which CRUD operation is used to remove data from a database?**  
    - [ ] Create  
    - [ ] Read  
    - [ ] Update  
    - [x] Delete  

6. **Which Java library is commonly used for database connectivity in CRUD operations?**  
    - [ ] JUnit  
    - [x] JDBC  
    - [ ] Hibernate  
    - [ ] Maven  

7. **What is the primary purpose of CRUD operations?**  
    - [x] Managing data in a database  
    - [ ] Designing user interfaces  
    - [ ] Writing test cases  
    - [ ] Optimizing performance  

## Code-Based Questions  

1. **Which JDBC method is used to execute a SELECT query?**  
    - [ ] executeUpdate()  
    - [x] executeQuery()  
    - [ ] execute()  
    - [ ] executeBatch()  

2. **What is the correct way to insert data into a database using JDBC?**  
    ```java
    String query = "INSERT INTO users (name, age) VALUES (?, ?)";
    PreparedStatement stmt = connection.prepareStatement(query);
    stmt.setString(1, "John");
    stmt.setInt(2, 25);
    stmt.executeUpdate();
    ```  
    - [x] Correct  
    - [ ] Incorrect  

3. **Which SQL command is used to delete a record from a table?**  
    - [ ] REMOVE FROM table_name WHERE condition;  
    - [x] DELETE FROM table_name WHERE condition;  
    - [ ] DROP FROM table_name WHERE condition;  
    - [ ] TRUNCATE table_name;  

4. **What does the `ResultSet` object in JDBC represent?**  
    - [x] A table of data returned by a query  
    - [ ] A connection to the database  
    - [ ] A prepared SQL statement  
    - [ ] A transaction object  

5. **Which method is used to commit a transaction in JDBC?**  
    - [ ] rollback()  
    - [x] commit()  
    - [ ] savepoint()  
    - [ ] close()  

6. **What is the purpose of the `setAutoCommit(false)` method in JDBC?**  
    - [ ] Automatically commit after every query  
    - [x] Disable auto-commit mode for transactions  
    - [ ] Rollback changes automatically  
    - [ ] Close the database connection  

7. **Which exception is commonly thrown during database operations in Java?**  
    - [ ] IOException  
    - [x] SQLException  
    - [ ] NullPointerException  
    - [ ] ClassNotFoundException  


    ## Coding-Based Problems  

    ### 1. Insert Data into a Database  

    **Explain what you have to do in the question:**  
    Write a Java program to insert a record into a database table using JDBC. The program should take user input for the table fields and insert the data into the database.  

    **Topic Name:** Insert Operation in CRUD  

    **Input format:**  
    - The program should accept user input for the fields `name` (String) and `age` (Integer).  

    **Output format:**  
    - The program should display a success message if the record is inserted successfully.  

    **Example:**  

    | Input 1: | Output 1: |  
    | -------- | --------- |  
    | John, 25 | Record inserted successfully |  

    | Input 2: | Output 2: |  
    | Alice, 30 | Record inserted successfully |  

    **Solution:**  
    ```java
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.util.Scanner;

    public class InsertDataExample {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            String query = "INSERT INTO users (name, age) VALUES (?, ?)";

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = connection.prepareStatement(query)) {

                stmt.setString(1, name);
                stmt.setInt(2, age);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Record inserted successfully");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    ```

    ---

    ### 2. Update Data in a Database  

    **Explain what you have to do in the question:**  
    Write a Java program to update a record in a database table using JDBC. The program should take user input for the `id` of the record to update and the new `name` and `age` values.  

    **Topic Name:** Update Operation in CRUD  

    **Input format:**  
    - The program should accept user input for the fields `id` (Integer), `name` (String), and `age` (Integer).  

    **Output format:**  
    - The program should display a success message if the record is updated successfully.  

    **Example:**  

    | Input 1: | Output 1: |  
    | -------- | --------- |  
    | 1, John, 26 | Record updated successfully |  

    | Input 2: | Output 2: |  
    | 2, Alice, 31 | Record updated successfully |  

    **Solution:**  
    ```java
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.util.Scanner;

    public class UpdateDataExample {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID of the record to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter new name: ");
            String name = scanner.nextLine();
            System.out.print("Enter new age: ");
            int age = scanner.nextInt();

            String query = "UPDATE users SET name = ?, age = ? WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = connection.prepareStatement(query)) {

                stmt.setString(1, name);
                stmt.setInt(2, age);
                stmt.setInt(3, id);

                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Record updated successfully");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    ```

    ---

    ### 3. Delete Data from a Database  

    **Explain what you have to do in the question:**  
    Write a Java program to delete a record from a database table using JDBC. The program should take user input for the `id` of the record to delete.  

    **Topic Name:** Delete Operation in CRUD  

    **Input format:**  
    - The program should accept user input for the field `id` (Integer).  

    **Output format:**  
    - The program should display a success message if the record is deleted successfully.  

    **Example:**  

    | Input 1: | Output 1: |  
    | -------- | --------- |  
    | 1        | Record deleted successfully |  

    | Input 2: | Output 2: |  
    | 2        | Record deleted successfully |  

    **Solution:**  
    ```java
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.util.Scanner;

    public class DeleteDataExample {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID of the record to delete: ");
            int id = scanner.nextInt();

            String query = "DELETE FROM users WHERE id = ?";

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = connection.prepareStatement(query)) {

                stmt.setInt(1, id);

                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Record deleted successfully");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    ```