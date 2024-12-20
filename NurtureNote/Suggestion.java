import java.util.List;

public class Suggestion {
    public void showSuggestions() {
        try {
            User user = new User();
            if (user.loadUserData()) {
                double bmi = user.getBmi();
                
                // Use polymorphism to dynamically create the correct suggestion class
                SuggestionBase suggestion = getSuggestionBasedOnBmi(bmi);
                
                List<String> activities = suggestion.getActivities();
                System.out.println("Based on your BMI (" + bmi + "), here are some suggestions to improve or maintain your fitness:");
                for (String activity : activities) {
                    System.out.println("- " + activity);
                }
            } else {
                System.out.println("No user data found to give suggestions.");
            }
        } catch (Exception e) {
            System.out.println("Error displaying suggestions: " + e.getMessage());
        }
    }

    // Factory method to select the correct suggestion class based on BMI
    private SuggestionBase getSuggestionBasedOnBmi(double bmi) {
        if (bmi < 18.5) {
            return new UnderweightSuggestion();
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return new NormalWeightSuggestion();
        } else {
            return new OverweightSuggestion();
        }
    }
}
