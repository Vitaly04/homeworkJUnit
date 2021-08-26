package missedCalls;

import missedCalls.Contact;
import missedCalls.Group;

import java.util.HashMap;
import java.util.Map;

public class Contacts {
    private Map<String, Contact> contactsStorage = new HashMap<>();
    private Group contactGroup;

    public void addContact(String name, String surName, String number, String group) {
        switch (group) {
            case "работа":
                contactGroup = Group.WORK;
                break;
            case "друзья":
                contactGroup = Group.FRIENDS;
                break;
            case "семья":
                contactGroup = Group.FAMILY;
                break;
            default:
                System.out.println("Введена неверная группа контактов");
        }
        Contact contact = new Contact(name, surName, number, contactGroup);
        contactsStorage.put(contact.getPhone(), contact);
        System.out.println(contact);
    }

    public void deleteContact(String numberPhone) {
        if (contactsStorage.containsKey(numberPhone)) {
            contactsStorage.remove(numberPhone);
        }
    }

    public boolean searchContact(String numberPhone) {
        boolean isSearchNumber = false;
        for (Map.Entry<String, Contact> contact : contactsStorage.entrySet()) {
            if(contact.getKey().contains(numberPhone)) {
                isSearchNumber = true;
                break;
            } else {
                isSearchNumber = false;
            }
        }
        if (isSearchNumber) {
            System.out.println("Контакт найден в списке");
        } else {
            System.out.println("Контакт не найден в списке");
        }
        return isSearchNumber;
    }

    public boolean contains(String phone) {
        return contactsStorage.containsKey(phone);
    }

    public Contact get(String phone) {
        return contactsStorage.get(phone);
    }
}