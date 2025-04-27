package ContactManagementApplication;

public class Contact {
    private int contactId;
    private String name;
    private int phoneNumber;
    private String email;
    private String contactType;

    public Contact(int contactId, String name, int phoneNumber, String email, String contactType) {
        this.contactId = contactId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.contactType = contactType;
    }

    public int getContactId() {
        return contactId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", contactType='" + contactType + '\'' +
                '}';
    }
}
