import java.util.ArrayList;
import java.util.List;

public class UnderweightSuggestion extends SuggestionBase {
    @Override
    public List<String> getActivities() {
        List<String> activities = new ArrayList<>();
        activities.add("Focus on weight gain with strength training and calorie-rich foods.");
        activities.add("Try resistance exercises like weight lifting, squats, and push-ups.");
        activities.add("Increase your caloric intake with nutrient-dense foods like nuts, avocados, and full-fat dairy.");
        activities.add("Eat small, frequent meals throughout the day to boost your calorie intake.");
        activities.add("Incorporate healthy fats like olive oil and coconut oil into your meals.");
        activities.add("Include protein-rich foods like lean meats, beans, and legumes to support muscle growth.");
        activities.add("Consult with a nutritionist to create a meal plan tailored to your needs.");
        return activities;
    }
}
