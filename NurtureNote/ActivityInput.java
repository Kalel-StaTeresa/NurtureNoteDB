import java.sql.*;
import java.util.Scanner;

public class ActivityInput {
    private Scanner scanner;

    public ActivityInput() {
        this.scanner = new Scanner(System.in);
    }

    public void inputActivity() {
        try {
            System.out.print("Enter User ID: ");
            int userId = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Activity Description: ");
            String activityDescription = scanner.nextLine();

            String date = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());

            String url = "jdbc:mysql://localhost:3306/nurturedata";
            String user = "root";
            String password = "dkst1010!";

            String query = "INSERT INTO activity_data (user_id, activity_description, activity_date) VALUES (?, ?, ?)";

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(query)) {

                pstmt.setInt(1, userId);
                pstmt.setString(2, activityDescription);
                pstmt.setString(3, date);

                pstmt.executeUpdate();
                System.out.println("Activity saved successfully!");

            } catch (SQLException e) {
                System.out.println("Error saving activity: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Error during input: " + e.getMessage());
        }
    }
}
