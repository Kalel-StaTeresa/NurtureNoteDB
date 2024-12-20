// Updated User.java to use an SQL database instead of a text file

import java.sql.*;

public class User {
    private int id;
    private String name;
    private int age;
    private double height;
    private double weight;
    private double bmi;
    private String date;

    // Constructor for input data
    public User(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.date = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
    }

    // Default constructor for loading data
    public User() {}

    public void calculateBmi() {
        this.bmi = weight / Math.pow(height / 100, 2);
    }

    public void saveData() {
        String url = "jdbc:mysql://localhost:3306/nurturedata";
        String user = "root";
        String password = "dkst1010!"; 

        String query = "INSERT INTO user_data (name, age, height, weight, bmi, input_date) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setDouble(3, height);
            pstmt.setDouble(4, weight);
            pstmt.setDouble(5, bmi);
            pstmt.setString(6, date);

            pstmt.executeUpdate();
            System.out.println("Data saved successfully to the database!");

        } catch (SQLException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public boolean loadUserData() {
        String url = "jdbc:mysql://localhost:3306/nurturedata";
        String user = "root";
        String password = "dkst1010!";

        String query = "SELECT * FROM user_data ORDER BY input_date DESC LIMIT 1";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                this.id = rs.getInt("user_id"); // Retrieve user ID
                this.name = rs.getString("name");
                this.age = rs.getInt("age");
                this.height = rs.getDouble("height");
                this.weight = rs.getDouble("weight");
                this.bmi = rs.getDouble("bmi");
                this.date = rs.getString("input_date");
                return true;
            } else {
                System.out.println("No user data found in the database.");
            }
        } catch (SQLException e) {
            System.out.println("Error loading user data: " + e.getMessage());
        }
        return false;
    }

    // Getters
    public int getId() {
        return id; // New getter for ID
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }
} 