/*
Steps to Set Up MySQL:
1. **Create Database**:
   ```sql
   CREATE DATABASE school;
   ```
   
2. **Create a Table**:
   ```sql
   USE school;
   CREATE TABLE students (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       age INT
   );
   ```

3. **Insert Sample Records**:
   ```sql
   INSERT INTO students (name, age) VALUES ('John Doe', 20);
   INSERT INTO students (name, age) VALUES ('Jane Smith', 22);
   ```

*/

import java.sql.*;

public class DisplayRecords {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/school"; // Change to your database URL
        String username = "root"; // Change to your MySQL username
        String password = "password"; // Change to your MySQL password

        // JDBC connection and query execution
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // 1. Establish the connection
            connection = DriverManager.getConnection(url, username, password);

            // 2. Create a statement object
            statement = connection.createStatement();

            // 3. Execute SQL query to fetch all records from the students table
            String query = "SELECT * FROM students";
            resultSet = statement.executeQuery(query);

            // 4. Process the result set
            System.out.println("ID\tName\tAge");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Display the records
                System.out.println(id + "\t" + name + "\t" + age);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources to prevent memory leaks
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
