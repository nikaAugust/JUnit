import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.myContact("Мама", "89781234567", "Семья", "Работа");
        phoneBook.myContact("Бабушка", "89782345678", "Семья", "Работа");
        phoneBook.myContact("Сестра", "89783456789", "Друзья", "Семья", "Братство кольца");
        phoneBook.myContact("Муж", "89784567890", "Семья");
        phoneBook.myContact("Владимир", "89784567891", "Друзья");

        MissedCalls missedCalls = new MissedCalls();

        missedCalls.myMissedCall(LocalDateTime.now(), "89784567890");
        missedCalls.myMissedCall(LocalDateTime.now(), "89782345678");
        missedCalls.myMissedCall(LocalDateTime.now(), "89784500000");
        missedCalls.myMissedCall(LocalDateTime.now(), "89783456789");
        missedCalls.myMissedCall(LocalDateTime.now(), "89783456789");
        missedCalls.myMissedCall(LocalDateTime.now(), "89785670007");

        missedCalls.printMissedCallsJournal(phoneBook);

    }
}