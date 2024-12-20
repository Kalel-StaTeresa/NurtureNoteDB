import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        this.scanner = new Scanner(System.in);
    }

    public void inputData() {
        try {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter your height in cm: ");
            double height = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter your weight in kg: ");
            double weight = Double.parseDouble(scanner.nextLine());

            User user = new User(name, age, height, weight);
            user.calculateBmi();
            user.saveData();
            System.out.println("Data saved successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers for age, height, and weight.");
        } catch (Exception e) {
            System.out.println("Error during input: " + e.getMessage());
        }
    }
}
