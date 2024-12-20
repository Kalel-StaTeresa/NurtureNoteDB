public class Main {
    public static void main(String[] args) {
        try {
            UserMenu menu = new UserMenu();
            menu.displayMenu();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
