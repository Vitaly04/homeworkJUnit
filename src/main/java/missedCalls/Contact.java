package missedCalls;

import java.util.Objects;

public class Contact {
    String name;
    String surName;
    String phone;
    Enum Group;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPhone() {
        return phone;
    }

    public Contact(String name, String surName, String phone, Enum group) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        Group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public String toString() {
        return "имя: " + name + ", номер телефона: " + phone + "\n";
    }
}
