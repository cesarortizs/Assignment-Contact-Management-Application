package ContactManagementApplication;

import java.util.*;
import java.util.stream.Collectors;

public class ContactDirectory {
    private List<Contact> allContacs = new ArrayList<Contact>();
    private Set<String> contacTypes = new HashSet<String>();
    private Map<String, Contact> contactsLibrary = new HashMap<String, Contact>();

    public void addContact(Contact newContact)
    {
        if (!allContacs.contains(newContact))
        {
            allContacs.add(newContact);
            contactsLibrary.put(newContact.getName(), newContact);
        }

        else
        {
            System.out.println("The contact already exists");
        }
    }

    public void updateContact(Contact existingContact)
    {
        for(Contact c : allContacs)
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
        for(Contact c : allContacs)
        {
            System.out.println(c.toString());
        }
    }

    public void sortContactsAlphabetically()
    {
        allContacs = allContacs.stream()
                    .sorted(Comparator.comparing(Contact::getName))
                    .collect(Collectors.toList());
    }

    public void addContactType(String contactType)
    {
        contacTypes.add(contactType);
    }

    public void displayContactTypes()
    {
        for(String ct : contacTypes)
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

    public List<Contact> getAllContacs() {
        return allContacs;
    }

    public Set<String> getContacTypes() {
        return contacTypes;
    }

    public Map<String, Contact> getContactsLibrary() {
        return contactsLibrary;
    }
}
