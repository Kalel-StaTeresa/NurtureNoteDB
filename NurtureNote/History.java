import java.sql.*;

public class History {
    public void displayHistory() {
        String url = "jdbc:mysql://localhost:3306/nurturedata";
        String user = "root";
        String password = "dkst1010!";

        String query = "SELECT name, age, height, weight, bmi, input_date FROM user_data ORDER BY input_date DESC";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("User History:");
            System.out.printf("%-20s %-5s %-10s %-10s %-10s %-20s\n", "Name", "Age", "Height", "Weight", "BMI", "Date");

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                double height = rs.getDouble("height");
                double weight = rs.getDouble("weight");
                double bmi = rs.getDouble("bmi");
                String date = rs.getString("input_date");

                System.out.printf("%-20s %-5d %-10.2f %-10.2f %-10.2f %-20s\n", name, age, height, weight, bmi, date);
            }
        } catch (SQLException e) {
            System.out.println("Error displaying history: " + e.getMessage());
        }
    }
}
