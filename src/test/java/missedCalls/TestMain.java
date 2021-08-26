package missedCalls;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @BeforeClass
    public Contacts setContacts() {
        Contacts contacts = new Contacts();
        contacts.addContact("Петр", "Иванов", "+7-777-77-71", "семья");
        return contacts;
    }

    @Test
    public void testSearchContact() {

        // given:
        final String argument = "+7-777-77-71";

        // when:
        boolean expected = setContacts().searchContact(argument);

        // then:
        Assertions.assertTrue(expected);
    }

    @Test
    public void testContains () {

        // given:
        final String argument = "+7-777-77-73";

        // when:
        boolean expected = setContacts().contains(argument);

        // then:
        Assertions.assertFalse(expected);
    }

}
