import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MissedCallsTest {

    @BeforeAll
    public static void started() {
        System.out.println("test started");
    }

    @AfterAll
    public static void finished() {
        System.out.println("test completed");
    }


    @Test
    void myMissedCall() {
        // arrange
        Contact sut = new Contact("Marta", "7978889900");

        MissedCalls missedCalls = new MissedCalls();
        try {
            missedCalls.myMissedCall(LocalDateTime.now(), "7978889900");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String expected = "Marta";
        // act
        String result = sut.getName();
        // assert
        assertEquals(expected, result);
    }
}