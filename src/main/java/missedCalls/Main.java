package missedCalls;

import java.util.Scanner;

public class Main {
    private static void addContact(Contacts contacts) {
        contacts.addContact("Петр", "Горький", "+7-777-77-71", "семья");
        contacts.addContact("Виктор", "Пушкин", "+7-777-77-72", "работа");
        contacts.addContact("Павел", "Толстой", "+7-777-77-73", "друзья");
        contacts.addContact("Анна", "Каренина", "+7-777-77-74", "соседи");
    }

    private static void deleteContact(Contacts contacts) {
        contacts.deleteContact("+7-777-77-72");
    }

    private static void searchContact(Contacts contacts) {
        contacts.searchContact("+7-777-77-72");
        contacts.searchContact("+7-777-77-78");
        contacts.searchContact("+7-777-77-74");
    }

    private static void addMissedCalls(MissedCalls missedCalls) {
        missedCalls.addMissedCals("+7-777-77-73");
        missedCalls.addMissedCals("+7-777-77-79");
    }

    private static String printMissedCalls(MissedCalls missedCalls, Contacts contacts) {
        return missedCalls.printMissedCalls(contacts);
    }

    private static void clearMissedCalls(MissedCalls missedCalls) {
        missedCalls.clearMissedCalls();
    }

    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Меню:\n" +
                    "1. Добавить контакт\n" +
                    "2. Удалить контакт\n" +
                    "3. Поиск контакта\n" +
                    "4. Добавить пропущенный вызов\n" +
                    "5. Вывести все пропушенные вызовы\n" +
                    "6. Очистить пропушенные вызовы\n" +
                    "7. Выход");
            System.out.println("Выберите пункт из меню (1 - 7): ");
            int input = scanner.nextInt();
            if (input == 7) break;
            switch (input) {
                case 1 : addContact(contacts);
                    break;
                case  2 : deleteContact(contacts);
                    break;
                case 3 : searchContact(contacts);
                    break;
                case 4 : addMissedCalls(missedCalls);
                    break;
                case 5 : System.out.println(printMissedCalls(missedCalls, contacts));
                    break;
                case 6 : clearMissedCalls(missedCalls);
                    break;
                default:
                    System.out.println("введен неверный номер выбора меню");
                    break;
            }
        }
    }
}
