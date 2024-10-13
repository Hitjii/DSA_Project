
public class DisplayAllContacts {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        
        // Add some contacts for demonstration
        phonebook.addContact(new Contact("Josephine Kufuna", "0857763683"));
        phonebook.addContact(new Contact("Senia Shipepe", "0814616425"));
        
        displayAllContacts(phonebook);
    }

    public static void displayAllContacts(Phonebook phonebook) {
        System.out.println("All Contacts:");
        phonebook.displayAllContacts();
    }
}





