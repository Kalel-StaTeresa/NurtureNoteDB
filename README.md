# NurtureNote
A Java-based health and fitness application that tracks user data, provides personalized fitness suggestions, and maintains historical records. The app connects to a MySQL database to store and retrieve user information, including profile data and activity logs.

### Features
1. View Profile: Displays the latest user profile with personal details and BMI.
2. Input Data: Allows users to enter their health information, calculates BMI, and saves it to the database.
3. View Suggestions: Provides fitness suggestions based on the user’s BMI (Underweight, Normal, or Overweight).
4. View History: Displays a history of all stored user data.
5. Track Activities: Users can track fitness activities with descriptions and dates.

### Database Design
The app uses a MySQL database with two main tables:
1. user_data: Stores user profile data (name, age, height, weight, BMI).
2. activity_data: Tracks activities performed by users with references to the user_data table through user_id.

### Technologies
- Java for the application logic
- MySQL for data storage
- JDBC for database interaction
- Polymorphism for dynamic fitness suggestions
