import java.util.List;
import java.util.Scanner;

public class ContactApp {
    private static ContactManager contactManager = new ContactManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to Contact Manager");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact by Phone Number");
            System.out.println("4. Find Contact by First Name");
            System.out.println("5. Find Contact by Last Name");
            System.out.println("6. Edit Contact");
            System.out.println("7. Display All Contacts");
            System.out.println("8. Exit");
            System.out.print("Please choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    removeContact();
                    break;
                case 3:
                    findContactByPhoneNumber();
                    break;
                case 4:
                    findContactByFirstName();
                    break;
                case 5:
                    findContactByLastName();
                    break;
                case 6:
                    editContact();
                    break;
                case 7:
                    displayAllContacts();
                    break;
                case 8:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        contactManager.addContact(new Contact(firstName, lastName, phoneNumber));
        System.out.println("Contact added successfully!");
    }

    private static void removeContact() {
        System.out.print("Enter phone number of the contact to remove: ");
        String phoneNumber = scanner.nextLine();
        contactManager.removeContact(phoneNumber);
        System.out.println("Contact removed successfully!");
    }

    private static void findContactByPhoneNumber() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = contactManager.findContactByPhoneNumber(phoneNumber);
        if (contact != null) {
            System.out.println("Contact found: " + contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void findContactByFirstName() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        List<Contact> contacts = contactManager.findContactByFirstName(firstName);
        if (!contacts.isEmpty()) {
            System.out.println("Contacts found:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts found with that first name.");
        }
    }

    private static void findContactByLastName() {
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        List<Contact> contacts = contactManager.findContactByLastName(lastName);
        if (!contacts.isEmpty()) {
            System.out.println("Contacts found:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        } else {
            System.out.println("No contacts found with that last name.");
        }
    }

    private static void editContact() {
        System.out.print("Enter phone number of the contact to edit: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter new first name: ");
        String newFirstName = scanner.nextLine();
        System.out.print("Enter new last name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Enter new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        contactManager.editContact(phoneNumber, newFirstName, newLastName, newPhoneNumber);
        System.out.println("Contact edited successfully!");
    }

    private static void displayAllContacts() {
        System.out.println("All Contacts:");
        contactManager.displayContacts();
    }
}
