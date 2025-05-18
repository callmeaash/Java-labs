import java.sql.*;

public class SimpleCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/company";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Connected to MySQL.");

            String insertSQL1 = "INSERT INTO employee (id, name, address, department) VALUES (101, 'Aashish', 'Kathmandu', 'HR')";
            String insertSQL2 = "INSERT INTO employee (id, name, address, department) VALUES (102, 'Anup', 'Pokhara', 'Finance')";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(insertSQL1);
                System.out.println("Inserted employee Aashish.");

                stmt.executeUpdate(insertSQL2);
                System.out.println("Inserted employee Anup.");
            }

            System.out.println("\nEmployee Table:");
            String selectSQL = "SELECT * FROM employee";
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(selectSQL)) {
                while (rs.next()) {
                    System.out.printf("%d | %s | %s | %s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("department"));
                }
            }

            String updateSQL = "UPDATE employee SET address = 'Nepal' WHERE id = 101";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(updateSQL);
                System.out.println("\nUpdated Aashish's address.");
            }

            String deleteSQL = "DELETE FROM employee WHERE id = 101";
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(deleteSQL);
                System.out.println("Deleted employee Aashish.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}