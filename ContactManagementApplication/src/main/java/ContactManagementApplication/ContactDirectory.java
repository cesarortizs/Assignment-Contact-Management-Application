package ContactManagementApplication;

import java.util.*;
import java.util.stream.Collectors;

public class ContactDirectory {
    private List<Contact> allContacts = new ArrayList<Contact>();
    private Set<String> contactTypes = new HashSet<String>();
    private Map<String, Contact> contactsLibrary = new HashMap<String, Contact>();

    public void addContact(Contact newContact)
    {
        if (!allContacts.contains(newContact))
        {
            allContacts.add(newContact);
            contactsLibrary.put(newContact.getName(), newContact);
        }

        else
        {
            System.out.println("The contact already exists");
        }
    }

    public void updateContact(Contact existingContact)
    {
        for(Contact c : allContacts)
        {
            if (c.getContactId() == existingContact.getContactId())
            {
                c.setName(existingContact.getName());
                c.setEmail(existingContact.getEmail());
                c.setPhoneNumber(existingContact.getPhoneNumber());
                c.setContactType(existingContact.getContactType());
            }
        }
    }

    public void displayContacts()
    {
        for(Contact c : allContacts)
        {
            System.out.println(c.toString());
        }
    }

    public void sortContactsAlphabetically()
    {
        allContacts = allContacts.stream()
                    .sorted(Comparator.comparing(Contact::getName))
                    .collect(Collectors.toList());
    }

    public void addContactType(String contactType)
    {
        contactTypes.add(contactType);
    }

    public void displayContactTypes()
    {
        for(String ct : contactTypes)
        {
            System.out.println(ct);
        }
    }

    public void searchContact(String contactName)
    {
        Contact existingContact = contactsLibrary.get(contactName);

        System.out.println(existingContact.toString());
    }

    public void updateContactByName(String contactName, Contact updatedContact)
    {
        Contact oldContact = contactsLibrary.get(contactName);

        oldContact.setName(updatedContact.getName());
        oldContact.setPhoneNumber(updatedContact.getPhoneNumber());
        oldContact.setEmail(updatedContact.getEmail());
        oldContact.setContactType(updatedContact.getContactType());
    }

    public List<Contact> getallContacts() {
        return allContacts;
    }

    public Set<String> getcontactTypes() {
        return contactTypes;
    }

    public Map<String, Contact> getContactsLibrary() {
        return contactsLibrary;
    }
}
