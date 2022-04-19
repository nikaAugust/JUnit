import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @BeforeAll
    public static void started() {
        System.out.println("test started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("test completed");
    }

    @Test
    void findContactFromNumber() {
        // arrange
        PhoneBook phoneBook = new PhoneBook();
        Contact user = new Contact("Poul", "89783232323");
        String expected = "89783232323";
        // act
        phoneBook.myContact("Poul", String.valueOf(user));
        String result = phoneBook.findContactFromNumber("89783232323");
        // assert
        assertEquals(expected, result);
    }
}