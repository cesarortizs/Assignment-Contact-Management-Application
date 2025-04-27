package ContactManagementApplication;

public class ContactManager {
    public static void main(String[] args) {

        // Preventing duplicate contact types from being added.
        ContactDirectory cd = new ContactDirectory();

        String contactType1 = "Family";
        String contactType2 = "Work";
        String contactType3 = "Work";

        cd.addContactType(contactType1);
        cd.addContactType(contactType2);
        cd.addContactType(contactType3);

        System.out.println("\nThe contact types are:");
        cd.displayContactTypes();

        // Adding new contacts and displaying them.
        Contact contact1 = new Contact(1, "Caesar", 999444999, "cgos0202@gmail.com", "Work");
        Contact contact2 = new Contact(2, "Allison", 555444555, "allison21@gmail.com", "Family");
        Contact contact3 = new Contact(3, "Penelope", 777666777, "idk27@gmail.com", "Work");

        cd.addContact(contact1);
        cd.addContact(contact2);
        cd.addContact(contact3);

        System.out.println("\nThe contact list is:");
        cd.displayContacts();

        // Searching for contacts by name and displaying their information.
        System.out.println("\nThe result of your search is:");
        cd.searchContact("Penelope");

        // Updating a contact’s details and displaying the updated list.
        contact3.setName("Laura");
        contact3.setPhoneNumber(888555888);
        contact3.setEmail("laura33@gmail.com");
        cd.updateContactByName("Penelope", contact3);

        System.out.println("\nThe updated contact list is:");
        cd.displayContacts();

        // Sorting the list of contacts by name and displaying them in order.
        System.out.println("\nThe sorted contact list is:");
        cd.sortContactsAlphabetically();
        cd.displayContacts();
    }
}