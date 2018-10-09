import java.util.*;

public class Phonebook {
    private ArrayList<Person> contacts;
    
    public Phonebook() {
        this.contacts = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        Person contact = new Person(name, number);
        this.contacts.add(contact);
    }
    
    public void printAll() {
        for (Person contact : contacts) {
            System.out.println(contact);
        }
    }
    
    public String searchNumber(String name) {
        
        for (Person contact : contacts) {
            if (contact.getName().contains(name)) {
                return contact.getNumber();
            }
        }
        return "number not known";
    }
}
