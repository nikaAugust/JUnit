import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MissedCalls {
    private NavigableMap<LocalDateTime, String> missedCalls = new TreeMap<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void myMissedCall(LocalDateTime time, String phoneNumber) throws InterruptedException {
        missedCalls.put(time, phoneNumber);
        Thread.sleep(1000);
    }

    public void printMissedCallsJournal(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            sb
                    .append(formatter.format(entry.getKey()))
                    .append(" ")
                    .append(phoneBook.findContactFromNumber(entry.getValue()))
                    .append("\n");
        }
        System.out.println(sb);
    }
}
