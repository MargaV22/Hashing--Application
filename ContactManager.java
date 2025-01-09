import java.util.HashMap;
import java.util.Scanner;

public class ContactsManager {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Contacts Manager!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. View All Contacts");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contacts.put(name, phone);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println("Phone Number: " + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name to update: ");
                    String updateName = scanner.nextLine();
                    if (contacts.containsKey(updateName)) {
                        System.out.print("Enter new phone number: ");
                        String newPhone = scanner.nextLine();
                        contacts.put(updateName, newPhone);
                        System.out.println("Contact updated successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (contacts.containsKey(deleteName)) {
                        contacts.remove(deleteName);
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("All Contacts:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        contacts.forEach((key, value) -> System.out.println(key + ": " + value));
                    }
                    break;
                case 6:
                    System.out.println("Exiting Contacts Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
