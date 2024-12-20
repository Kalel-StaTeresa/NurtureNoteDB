import java.util.ArrayList;
import java.util.List;

public class NormalWeightSuggestion extends SuggestionBase {
    @Override
    public List<String> getActivities() {
        List<String> activities = new ArrayList<>();
        activities.add("Maintain your fitness with a balanced diet and regular exercise.");
        activities.add("Incorporate aerobic activities like jogging, cycling, and swimming to keep your heart healthy.");
        activities.add("Include strength training exercises like weight lifting, lunges, and planks to build and maintain muscle.");
        activities.add("Ensure your diet is rich in fruits, vegetables, whole grains, and lean proteins.");
        activities.add("Stay active daily – aim for at least 30 minutes of moderate exercise.");
        activities.add("Stay hydrated and get adequate sleep to support recovery and energy levels.");
        activities.add("Consider joining fitness classes or sports activities to keep your routine fun and varied.");
        return activities;
    }
}
