import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private final Map<String, List<Contact>> phoneBook = new HashMap<>();

    public void myContact(String name, String phoneNumber, String ... group) {
        for (String gr : group) {
            phoneBook.put(gr, new ArrayList<>());
            List<Contact> contactList = this.phoneBook.get(gr);
            contactList.add(new Contact(name, phoneNumber));
        }
    }

    public String findContactFromNumber(String number) {
        for (String key : phoneBook.keySet()) {
            List<Contact> contactList = phoneBook.get(key);
            for (Contact contact : contactList) {
                if (number.equals(contact.getPhoneNumber())) {
                    return contact.getName();
                }
            }
        }
        return number;
    }
}