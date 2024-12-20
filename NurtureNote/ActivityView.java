import java.sql.*;

public class ActivityView {
    public void viewActivities(int userId) {
        String url = "jdbc:mysql://localhost:3306/nurturedata";
        String user = "root";
        String password = "dkst1010!";

        String query = "SELECT activity_description, activity_date FROM activity_data WHERE user_id = ? ORDER BY activity_date DESC";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("Activities for User ID: " + userId);
            System.out.printf("%-50s %-20s\n", "Activity Description", "Date");

            while (rs.next()) {
                String activity = rs.getString("activity_description");
                String date = rs.getString("activity_date");

                System.out.printf("%-50s %-20s\n", activity, date);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving activities: " + e.getMessage());
        }
    }
}
