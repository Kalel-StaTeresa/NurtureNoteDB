import java.util.ArrayList;
import java.util.List;

public class OverweightSuggestion extends SuggestionBase {
    @Override
    public List<String> getActivities() {
        List<String> activities = new ArrayList<>();
        activities.add("Incorporate cardio exercises like running, walking, cycling, or brisk walking.");
        activities.add("Focus on a calorie-controlled diet with more fruits, vegetables, and lean proteins.");
        activities.add("Try high-intensity interval training (HIIT) for efficient fat burning and improved metabolism.");
        activities.add("Consider strength training to maintain muscle mass while losing weight.");
        activities.add("Avoid processed foods, sugary drinks, and high-fat snacks in your diet.");
        activities.add("Track your calories and portion sizes to ensure you're staying within a healthy range.");
        activities.add("Consult with a personal trainer or fitness coach to create a workout plan tailored to weight loss.");
        activities.add("Prioritize walking - aim for 10,000 steps per day to increase physical activity.");
        return activities;
    }
}
