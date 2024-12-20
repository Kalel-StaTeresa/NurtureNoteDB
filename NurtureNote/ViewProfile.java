public class ViewProfile {
    public void viewProfile() {
        try {
            User user = new User();
            if (user.loadUserData()) {
                System.out.println("User Profile:");
                System.out.println("ID: " + user.getId());
                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());
                System.out.println("Height: " + user.getHeight() + " cm");
                System.out.println("Weight: " + user.getWeight() + " kg");
                System.out.println("BMI: " + user.getBmi());
            } else {
                System.out.println("No user data found.");
            }
        } catch (Exception e) {
            System.out.println("Error displaying profile: " + e.getMessage());
        }
    }
}
