import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @BeforeAll
    public static void started() {
        System.out.println("test started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("test completed");
    }

    @BeforeEach
    public void init() {
        System.out.println("test started");
    }

    @AfterEach
    public void finish() {
        System.out.println("test complete");
    }


    @org.junit.jupiter.api.Test
    void getName() {
        // arrange
        Contact sut = new Contact("Poli", "2030538903");
        String expected = "Poli";
        // act
        String result = sut.getName();
        // assert
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getPhoneNumber() {
        // arrange
        Contact sut = new Contact("Poli", "89781212121");
        String expected = "89781212121";
        // act
        String result = sut.getPhoneNumber();
        // assert
        assertEquals(expected, result);
    }
}
